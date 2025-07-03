package com.example.parser;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomLangToJavaConverter extends CustomLangParserBaseVisitor<String> {

    // Keep track of indentation for pretty printing generated Java code
    private int indentLevel = 0;
    private final String INDENT_STEP = "    "; // 4 spaces

    private String getIndent() {
        return INDENT_STEP.repeat(indentLevel);
    }

    @Override
    public String visitProgram(CustomLangParser.ProgramContext ctx) {
        StringBuilder javaCode = new StringBuilder();
        javaCode.append("public class ConvertedProgram {\n");
        javaCode.append(INDENT_STEP).append("public static void main(String[] args) {\n");
        indentLevel++; // Indent for main method body

        // Visit each statement or newline in the program
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof CustomLangParser.StatementContext) {
                javaCode.append(getIndent()).append(visit(ctx.getChild(i))).append("\n");
            }
            // We can ignore NEWLINE tokens here, as we add newlines with each statement
        }

        indentLevel--; // Dedent from main method body
        javaCode.append(INDENT_STEP).append("}\n");
        javaCode.append("}\n");
        return javaCode.toString();
    }

    @Override
    public String visitStatement(CustomLangParser.StatementContext ctx) {
        if (ctx.simple_stmts() != null) {
            return visitSimple_stmts(ctx.simple_stmts());
        } else if (ctx.compound_stmt() != null) {
            return visitCompound_stmt(ctx.compound_stmt());
        }
        return ""; // Should not happen
    }

    @Override
    public String visitSimple_stmts(CustomLangParser.Simple_stmtsContext ctx) {
        // Handle multiple simple statements separated by semicolons
        return ctx.simple_stmt().stream()
                .map(this::visitSimple_stmt)
                .collect(Collectors.joining(";\n" + getIndent())) + ";"; // Add semicolon at the end
    }

    @Override
    public String visitSimple_stmt(CustomLangParser.Simple_stmtContext ctx) {
        if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        }
        return "";
    }

    @Override
    public String visitAssignment(CustomLangParser.AssignmentContext ctx) {
        StringBuilder javaCode = new StringBuilder();

        // Handle the left-hand side (LHS) - Ensure it's sanitized
        String lhsRaw = visitTestlist_star_expr(ctx.testlist_star_expr(0));
        // If LHS is a single identifier, sanitize it directly.
        // If it's a comma-separated list, each part needs sanitization later.
        String lhsSanitized = lhsRaw.contains(",") ? lhsRaw : sanitizeIdentifier(lhsRaw);


        // Get the right-hand side (RHS) context
        CustomLangParser.Testlist_star_exprContext rhsCtx = null;
        if (ctx.ASSIGN() != null && ctx.testlist_star_expr().size() > 1) {
            rhsCtx = ctx.testlist_star_expr(1); // For single or chained assignment
        } else if (ctx.op != null) {
            String op = ctx.op.getText();
            String rhs = visitTestlist(ctx.testlist());
            javaCode.append(lhsSanitized).append(" ").append(op).append(" ").append(rhs);
            return javaCode.toString();
        }

        if (rhsCtx != null) {
            String rhs = visitTestlist_star_expr(rhsCtx);

            boolean lhsIsMulti = lhsSanitized.contains("new Object[]{"); // Check if LHS was generated as a collection
            boolean rhsIsMulti = rhs.contains("new Object[]{"); // Check if RHS was generated as a collection

            if (lhsIsMulti && rhsIsMulti) {
                // Multi-assignment (a, b = 1, 2)
                // This is still highly simplified.
                // It assumes the LHS was something like `new Object[]{var1, var2}`
                // and RHS was `new Object[]{val1, val2}`.
                // We need to extract the var names from LHS and values from RHS.

                // Example: Extract `var1, var2` from `new Object[]{var1, var2}`
                String lhsVarsString = lhsSanitized.substring(lhsSanitized.indexOf("{") + 1, lhsSanitized.lastIndexOf("}"));
                String[] lhsVars = lhsVarsString.split(",\\s*");

                // Example: Extract `val1, val2` from `new Object[]{val1, val2}`
                String rhsValuesString = rhs.substring(rhs.indexOf("{") + 1, rhs.lastIndexOf("}"));
                String[] rhsValues = rhsValuesString.split(",\\s*");


                if (lhsVars.length == rhsValues.length) {
                    for (int i = 0; i < lhsVars.length; i++) {
                        javaCode.append("Object ").append(lhsVars[i].trim()).append(" = ").append(rhsValues[i].trim()).append(";\n").append(getIndent());
                    }
                    javaCode.setLength(javaCode.length() - getIndent().length());
                } else {
                    javaCode.append("/* WARNING: Python-style multi-assignment with unequal elements or unpacking. Manual conversion needed. */\n");
                    javaCode.append(getIndent()).append("Object[] ").append(lhsSanitized).append(" = ").append(rhs).append(";");
                }

            } else {
                // Simple assignment (e.g., x = 10)
                javaCode.append("Object ").append(lhsSanitized).append(" = ").append(rhs);
            }
        }
        return javaCode.toString();
    }

    @Override
    public String visitTestlist_star_expr(CustomLangParser.Testlist_star_exprContext ctx) {
        List<String> elements = new ArrayList<>();
        // Iterate through children to preserve order and handle types
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof CustomLangParser.TestContext) {
                elements.add(visitTest((CustomLangParser.TestContext) child));
            } else if (child instanceof CustomLangParser.Star_exprContext) {
                elements.add("/*UNPACKED_EXPR*/" + visitStar_expr((CustomLangParser.Star_exprContext) child));
            } else if (child instanceof TerminalNode) {
                TerminalNode terminalNode = (TerminalNode) child;
                if (terminalNode.getSymbol().getType() == CustomLangParser.COMMA) {
                    // Commas are used for joining, so don't add them as elements.
                    continue;
                }
                // Handle the case where the whole context is just a testlist (no explicit commas in the rule for this alternative)
                if (terminalNode.getSymbol().getType() == CustomLangParser.IDENTIFIER ||
                        terminalNode.getSymbol().getType() == CustomLangParser.STRING ||
                        terminalNode.getSymbol().getType() == CustomLangParser.DECIMAL_INTEGER ||
                        terminalNode.getSymbol().getType() == CustomLangParser.FLOAT_NUMBER) {
                    // This is a single terminal node like an IDENTIFIER directly under testlist_star_expr
                    elements.add(terminalNode.getText());
                }
            } else if (child instanceof CustomLangParser.TestlistContext) {
                // This branch handles the alternative rule `| testlist`
                elements.add(visitTestlist((CustomLangParser.TestlistContext) child));
            }
        }

        // If there's more than one distinct element (excluding internal commas),
        // or if it's a testlist (which implicitly means multiple values),
        // wrap it as a Java array.
        // A single identifier like `x` should not become `new Object[]{x}`.
        if (ctx.test().size() > 1 || ctx.star_expr().size() > 0 || ctx.COMMA().size() > 0) {
            // This indicates a comma-separated list or contains a star_expr
            return "new Object[]{" + elements.stream().filter(s -> !s.equals(",")).collect(Collectors.joining(", ")) + "}";
        } else if (ctx.test().size() == 1) {
            // Single test (e.g., `x` or `10`)
            return visitTest(ctx.test(0));
        } else if (ctx.testlist() != null) {
            // If it explicitly matched the 'testlist' alternative
            return visitTestlist(ctx.testlist());
        }
        return ""; // Should not happen for a valid testlist_star_expr
    }

    @Override
    public String visitTest(CustomLangParser.TestContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            return sanitizeIdentifier(ctx.IDENTIFIER().getText());
        } else if (ctx.value() != null) {
            return visitValue(ctx.value());
        }
        return "";
    }

    @Override
    public String visitValue(CustomLangParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            return ctx.STRING().getText(); // Return string literal as is
        } else if (ctx.DECIMAL_INTEGER() != null) {
            return ctx.DECIMAL_INTEGER().getText();
        } else if (ctx.OCT_INTEGER() != null) {
            return "0" + ctx.OCT_INTEGER().getText(); // Java's octal literal starts with 0
        } else if (ctx.HEX_INTEGER() != null) {
            return ctx.HEX_INTEGER().getText();
        } else if (ctx.BIN_INTEGER() != null) {
            return "0b" + ctx.BIN_INTEGER().getText().substring(2); // Java binary literal
        } else if (ctx.FLOAT_NUMBER() != null) {
            return ctx.FLOAT_NUMBER().getText();
        } else if (ctx.OPEN_BRACK() != null && ctx.CLOSE_BRACK() != null) {
            // For now, treat [testlist_comp?] as a placeholder for array/list initialization.
            // A full implementation would need to determine the type and create a proper Java array or List.
            String elements = ctx.testlist_comp() != null ? visitTestlist_comp(ctx.testlist_comp()) : "";
            return "new Object[]{" + elements + "}"; // Placeholder for list/array
        }
        return "";
    }

    @Override
    public String visitCompound_stmt(CustomLangParser.Compound_stmtContext ctx) {
        if (ctx.if_stmt() != null) {
            return visitIf_stmt(ctx.if_stmt());
        } else if (ctx.for_stmt() != null) {
            return visitFor_stmt(ctx.for_stmt());
        } else if (ctx.while_stmt() != null) {
            return visitWhile_stmt(ctx.while_stmt());
        }
        return "";
    }

    @Override
    public String visitIf_stmt(CustomLangParser.If_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder("if (");
        javaCode.append(visitNamed_expression(ctx.named_expression())).append(") {\n");

        indentLevel++;
        javaCode.append(getIndent()).append(visitBlock(ctx.block()));
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.elif_stmt() != null) {
            javaCode.append(" ").append(visitElif_stmt(ctx.elif_stmt()));
        } else if (ctx.else_block() != null) {
            javaCode.append(" ").append(visitElse_block(ctx.else_block()));
        }
        return javaCode.toString();
    }

    @Override
    public String visitElif_stmt(CustomLangParser.Elif_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder("else if (");
        javaCode.append(visitNamed_expression(ctx.named_expression())).append(") {\n");

        indentLevel++;
        javaCode.append(getIndent()).append(visitBlock(ctx.block()));
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.elif_stmt() != null) {
            javaCode.append(" ").append(visitElif_stmt(ctx.elif_stmt()));
        } else if (ctx.else_block() != null) {
            javaCode.append(" ").append(visitElse_block(ctx.else_block()));
        }
        return javaCode.toString();
    }

    @Override
    public String visitElse_block(CustomLangParser.Else_blockContext ctx) {
        StringBuilder javaCode = new StringBuilder("else {\n");
        indentLevel++;
        javaCode.append(getIndent()).append(visitBlock(ctx.block()));
        indentLevel--;
        javaCode.append(getIndent()).append("}");
        return javaCode.toString();
    }

    @Override
    public String visitBlock(CustomLangParser.BlockContext ctx) {
        if (ctx.NEWLINE() != null && ctx.INDENT() != null && ctx.DEDENT() != null) {
            // Block with indentation
            StringBuilder blockContent = new StringBuilder();
            indentLevel++;
            blockContent.append(visitStatements(ctx.statements()));
            indentLevel--;
            return blockContent.toString();
        } else if (ctx.simple_stmts() != null) {
            // Single line block
            return visitSimple_stmts(ctx.simple_stmts());
        }
        return "";
    }

    @Override
    public String visitStatements(CustomLangParser.StatementsContext ctx) {
        // Convert all statements within a block, adding indentation and newlines
        return ctx.statement().stream()
                .map(stmtCtx -> getIndent() + visit(stmtCtx))
                .collect(Collectors.joining("\n"));
    }

    @Override
    public String visitFor_stmt(CustomLangParser.For_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder("for (Object "); // Assuming Object for iteration variable for simplicity
        javaCode.append(visitExprlist(ctx.exprlist()));
        javaCode.append(" : ").append(visitTestlist(ctx.testlist())); // This will require converting CustomLang's `in` to Java's enhanced for loop iterable
        javaCode.append(") {\n");

        indentLevel++;
        javaCode.append(getIndent()).append(visitBlock(ctx.block(0)));
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.ELSE() != null) {
            // Java does not have a direct equivalent for 'for-else'.
            // This would require more complex logic, potentially a flag or a break statement check.
            // For now, we'll omit or add a comment.
            javaCode.append(" /* CustomLang 'for-else' block, no direct Java equivalent. */");
            // Optionally, you could throw an error or log a warning for features not directly translatable.
        }
        return javaCode.toString();
    }

    @Override
    public String visitWhile_stmt(CustomLangParser.While_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder("while (");
        javaCode.append(visitNamed_expression(ctx.named_expression())).append(") {\n");

        indentLevel++;
        javaCode.append(getIndent()).append(visitBlock(ctx.block()));
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.else_block() != null) {
            // Similar to for-else, while-else has no direct Java equivalent.
            javaCode.append(" /* CustomLang 'while-else' block, no direct Java equivalent. */");
        }
        return javaCode.toString();
    }

    @Override
    public String visitNamed_expression(CustomLangParser.Named_expressionContext ctx) {
        return visitExpression(ctx.expression());
    }

    @Override
    public String visitExpression(CustomLangParser.ExpressionContext ctx) {
        if (ctx.logical_test() != null) {
            return visitLogical_test(ctx.logical_test(0));
        } else if (ctx.IF() != null && ctx.ELSE() != null) {
            // Ternary operator: condition ? true_expr : false_expr
            return visitLogical_test(ctx.logical_test(0)) + " ? "
                    + visitLogical_test(ctx.logical_test(1)) + " : "
                    + visitExpression(ctx.expression());
        }
        return "";
    }

    @Override
    public String visitLogical_test(CustomLangParser.Logical_testContext ctx) {
        if (ctx.comparison() != null) {
            return visitComparison(ctx.comparison());
        } else if (ctx.NOT() != null) {
            return "!" + visitLogical_test(ctx.logical_test(0));
        } else if (ctx.AND() != null) {
            return visitLogical_test(ctx.logical_test(0)) + " && " + visitLogical_test(ctx.logical_test(1));
        } else if (ctx.OR() != null) {
            return visitLogical_test(ctx.logical_test(0)) + " || " + visitLogical_test(ctx.logical_test(1));
        }
        return "";
    }

    @Override
    public String visitComparison(CustomLangParser.ComparisonContext ctx) {
        if (ctx.expr() != null) {
            return visitExpr(ctx.expr());
        } else if (ctx.comparison() != null && ctx.comparison().size() == 2) {
            String left = visitComparison(ctx.comparison(0));
            String right = visitComparison(ctx.comparison(1));
            String operator = "";

            if (ctx.LESS_THAN() != null) operator = "<";
            else if (ctx.GREATER_THAN() != null) operator = ">";
            else if (ctx.EQUALS() != null) operator = "==";
            else if (ctx.GT_EQ() != null) operator = ">=";
            else if (ctx.LT_EQ() != null) operator = "<=";
            else if (ctx.NOT_EQ_1() != null || ctx.NOT_EQ_2() != null) operator = "!=";
            else if (ctx.IN() != null) {
                // 'in' operator will need special handling, e.g., list.contains(element)
                // For now, a simplified conversion
                operator = ".contains("; // Will need manual closing parenthesis for 'right'
                return right + operator + left + ")"; // Assuming 'left in right' -> right.contains(left)
            } else if (ctx.IS() != null) {
                // 'is' operator usually for identity, converts to == for primitives, .equals() for objects (or reference check)
                if (ctx.NOT() != null) {
                    operator = "!="; // is not
                } else {
                    operator = "=="; // is
                }
            }
            return left + " " + operator + " " + right;
        }
        return "";
    }

    @Override
    public String visitExpr(CustomLangParser.ExprContext ctx) {
        if (ctx.value() != null) {
            return visitValue(ctx.value());
        } else if (ctx.op != null) {
            String op = ctx.op.getText();
            List<CustomLangParser.ExprContext> exprs = ctx.expr();

            if (exprs.size() == 1) { // Unary operators
                return op + visitExpr(exprs.get(0));
            } else if (exprs.size() == 2) { // Binary operators
                String left = visitExpr(exprs.get(0));
                String right = visitExpr(exprs.get(1));

                // Handle specific operators if needed, otherwise generic
                if (op.equals("AND")) return left + " && " + right; // Example
                if (op.equals("OR")) return left + " || " + right; // Example
                if (op.equals("NOT_OP")) return "~" + right; // Bitwise NOT is unary
                if (op.equals("*")) return left + " * " + right; // Direct multiplication
                if (op.equals("/")) return left + " / " + right; // Direct division
                // ... handle other operators as needed
                return left + " " + op + " " + right; // Default for others
            }
        } else if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        return "";
    }

    // You would continue to implement visit methods for all other rules
    // For example:
    @Override
    public String visitOr_expression(CustomLangParser.Or_expressionContext ctx) {
        if (ctx.or_expression() != null) {
            return visitOr_expression(ctx.or_expression()) + " || " + visitAnd_expression(ctx.and_expression());
        }
        return visitAnd_expression(ctx.and_expression());
    }

    @Override
    public String visitAnd_expression(CustomLangParser.And_expressionContext ctx) {
        if (ctx.and_expression() != null) {
            return visitAnd_expression(ctx.and_expression()) + " && " + visitNot_expression(ctx.not_expression());
        }
        return visitNot_expression(ctx.not_expression());
    }

    @Override
    public String visitNot_expression(CustomLangParser.Not_expressionContext ctx) {
        if (ctx.NOT() != null) {
            return "!" + visitNot_expression(ctx.not_expression());
        }
        return visitComparison(ctx.comparison());
    }

    @Override
    public String visitSum(CustomLangParser.SumContext ctx) {
        if (ctx.sum() != null) {
            String op = "";
            if (ctx.ADD() != null) op = "+";
            else if (ctx.MINUS() != null) op = "-";
            return visitSum(ctx.sum()) + " " + op + " " + visitTerm(ctx.term());
        }
        return visitTerm(ctx.term());
    }

    @Override
    public String visitTerm(CustomLangParser.TermContext ctx) {
        if (ctx.term() != null) {
            String op = "";
            if (ctx.STAR() != null) op = "*";
            else if (ctx.DIV() != null) op = "/";
            else if (ctx.MOD() != null) op = "%";
            else if (ctx.IDIV() != null) op = "/"; // Integer division in Java for integers
            else if (ctx.AT() != null) op = "/* @ operator (matrix multiplication) needs library for Java */ * "; // No direct equivalent in Java
            return visitTerm(ctx.term()) + " " + op + " " + visitFactor(ctx.factor());
        }
        return visitFactor(ctx.factor());
    }

    @Override
    public String visitFactor(CustomLangParser.FactorContext ctx) {
        if (ctx.ADD() != null) {
            return "+" + visitFactor(ctx.factor());
        } else if (ctx.MINUS() != null) {
            return "-" + visitFactor(ctx.factor());
        } else if (ctx.NOT_OP() != null) {
            return "~" + visitFactor(ctx.factor()); // Bitwise NOT
        }
        return visitPower(ctx.power());
    }

    @Override
    public String visitPower(CustomLangParser.PowerContext ctx) {
        String primary = visitAwait_primary(ctx.await_primary());
        if (ctx.POWER() != null) {
            // Java does not have a native '**' operator. Use Math.pow().
            return "Math.pow(" + primary + ", " + visitFactor(ctx.factor()) + ")";
        }
        return primary;
    }

    @Override
    public String visitAwait_primary(CustomLangParser.Await_primaryContext ctx) {
        // 'await' keyword needs to be handled in a context-aware way for Java's async (CompletableFuture, etc.)
        // For simple conversion, just visit the primary.
        return visitPrimary(ctx.primary());
    }

    @Override
    public String visitPrimary(CustomLangParser.PrimaryContext ctx) {
        if (ctx.value() != null) {
            return visitValue(ctx.value());
        } else if (ctx.IDENTIFIER() != null) {
            // This rule is `primary (IDENTIFIER)`. This implies method calls or member access.
            // A more robust implementation would need to differentiate between `obj.method()` and `obj.field`.
            // For simplicity, assuming a chained identifier access.
            if (ctx.primary() != null) {
                return visitPrimary(ctx.primary()) + "." + ctx.IDENTIFIER().getText();
            }
            return ctx.IDENTIFIER().getText(); // This shouldn't be reached if primary is always present.
        } else if (ctx.OPEN_BRACK() != null && ctx.CLOSE_BRACK() != null && ctx.slices() != null) {
            // Array/List indexing or slicing
            // Java arrays/Lists don't support Python-style slicing directly.
            // This would require custom helper methods in Java.
            return visitPrimary(ctx.primary()) + "[" + visitSlices(ctx.slices()) + "]"; // Simplified
        }
        return "";
    }

    @Override
    public String visitSlices(CustomLangParser.SlicesContext ctx) {
        // This is complex. Python slicing `[start:end:step]` has no direct Java equivalent.
        // For simplicity, we'll just join the expressions, treating them as indices for now.
        // A proper converter would need helper functions to replicate Python slicing.
        return ctx.children.stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitSlice(CustomLangParser.SliceContext ctx) {
        // For slice (e.g., `a:b:c`), we'll just return the parts.
        // A full implementation requires runtime support in the Java target.
        List<String> parts = new ArrayList<>();
        if (ctx.expression().size() > 0 && ctx.expression(0) != null) {
            parts.add(visitExpression(ctx.expression(0)));
        }
        if (ctx.expression().size() > 1 && ctx.expression(1) != null) {
            parts.add(visitExpression(ctx.expression(1)));
        }
        if (ctx.expression().size() > 2 && ctx.expression(2) != null) {
            parts.add(visitExpression(ctx.expression(2)));
        }
        return String.join(":", parts); // Just re-join the parts as-is for now
    }

    @Override
    public String visitStarred_expression(CustomLangParser.Starred_expressionContext ctx) {
        // Starred expressions (*expr) used for unpacking. No direct Java equivalent.
        // This would require manual unpacking into arrays or collections.
        return "/* Unpacked: */ " + visitExpression(ctx.expression());
    }

    @Override
    public String visitExprlist(CustomLangParser.ExprlistContext ctx) {
        return ctx.expr().stream()
                .map(this::visitExpr)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitTestlist(CustomLangParser.TestlistContext ctx) {
        return ctx.test().stream()
                .map(this::visitTest)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitTestlist_comp(CustomLangParser.Testlist_compContext ctx) {
        return ctx.children.stream()
                .filter(node -> node instanceof CustomLangParser.TestContext || node instanceof CustomLangParser.Star_exprContext || node instanceof CustomLangParser.For_stmtContext)
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    // Default visit method - for rules not explicitly handled, just visit children
    @Override
    protected String defaultResult() {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null || aggregate.isEmpty()) {
            return nextResult;
        }
        if (nextResult == null || nextResult.isEmpty()) {
            return aggregate;
        }
        // This default aggregation might need to be adjusted based on the specific rule.
        // For example, for a list of statements, you'd want newlines. For expressions, spaces.
        return aggregate + nextResult;
    }

    // Helper for terminal nodes if needed
    @Override
    public String visitTerminal(TerminalNode node) {
        // You can customize how terminal nodes are handled.
        // For most cases, we just want their text content.
        return node.getText();
    }

    // Inside CustomLangToJavaConverter class
    private String sanitizeIdentifier(String customLangIdentifier) {
        // Remove backticks
        if (customLangIdentifier.startsWith("`") && customLangIdentifier.endsWith("`")) {
            customLangIdentifier = customLangIdentifier.substring(1, customLangIdentifier.length() - 1);
        }
        // Replace spaces with underscores
        customLangIdentifier = customLangIdentifier.replace(" ", "_");
        // You might also need to handle other special characters or convert Vietnamese diacritics
        // For simplicity, let's just replace spaces.
        return customLangIdentifier;
    }
}