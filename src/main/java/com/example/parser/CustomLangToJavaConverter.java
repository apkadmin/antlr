package com.example.parser;

import com.example.parser.CustomLangParser;
import com.example.parser.CustomLangParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.text.Normalizer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class CustomLangToJavaConverter extends CustomLangParserBaseVisitor<String> {

    // Đây là một Map để theo dõi indentation level
    private int indentLevel = 0;
    private static final String INDENT_STRING = "    "; // 4 spaces for Java indentation

    // Map để lưu trữ các biến đã khai báo và kiểu của chúng (đơn giản hóa)
    // Trong một trình biên dịch thực tế, bạn sẽ dùng Symbol Table với nhiều thông tin hơn
    private Map<String, String> declaredVariables = new HashMap<>();

    private String getIndent() {
        return INDENT_STRING.repeat(indentLevel);
    }

    // Helper method to determine a basic Java type from a CustomLang value
    private String determineJavaType(CustomLangParser.ValueContext valueCtx) {
        if (valueCtx.DECIMAL_INTEGER() != null || valueCtx.OCT_INTEGER() != null ||
                valueCtx.HEX_INTEGER() != null || valueCtx.BIN_INTEGER() != null) {
            return "int";
        } else if (valueCtx.FLOAT_NUMBER() != null) {
            return "double";
        } else if (valueCtx.STRING() != null) {
            return "String";
        } else if (valueCtx.OPEN_BRACK() != null && valueCtx.CLOSE_BRACK() != null) {
            // For lists, return a generic List. More specific type inference would be needed for real use.
            return "java.util.List<Object>";
        }
        return "Object"; // Default type
    }

    @Override
    public String visitProgram(CustomLangParser.ProgramContext ctx) {
        StringBuilder javaCode = new StringBuilder();
        indentLevel++; // Tăng indentation cho phần thân main

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof CustomLangParser.StatementContext) {
                javaCode.append(visit(child));
            } else if (child instanceof TerminalNode && ((TerminalNode) child).getSymbol().getType() == CustomLangParser.NEWLINE) {
                // Ignore NEWLINEs here as they are handled by block/statement logic
            }
        }
        indentLevel--; // Giảm indentation sau phần thân main
        return javaCode.toString();
    }

    @Override
    public String visitStatements(CustomLangParser.StatementsContext ctx) {
        StringBuilder javaCode = new StringBuilder();
        for (CustomLangParser.StatementContext stmtCtx : ctx.statement()) {
            javaCode.append(visit(stmtCtx));
        }
        return javaCode.toString();
    }

    @Override
    public String visitStatement(CustomLangParser.StatementContext ctx) {
        if (ctx.simple_stmts() != null) {
            return visit(ctx.simple_stmts());
        } else if (ctx.compound_stmt() != null) {
            return visit(ctx.compound_stmt());
        }
        return "";
    }

    @Override
    public String visitSimple_stmts(CustomLangParser.Simple_stmtsContext ctx) {
        StringBuilder javaCode = new StringBuilder();
        for (int i = 0; i < ctx.simple_stmt().size(); i++) {
            javaCode.append(getIndent()).append(visit(ctx.simple_stmt(i)));
            javaCode.append("\n");
        }
        return javaCode.toString();
    }

    @Override
    public String visitSimple_stmt(CustomLangParser.Simple_stmtContext ctx) {
        if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        }
        return visitChildren(ctx);
    }

    // --- Expressions ---

    @Override
    public String visitOr_expression(CustomLangParser.Or_expressionContext ctx) {
        if (ctx.OR() != null) {
            return visit(ctx.or_expression()) + " || " + visit(ctx.and_expression());
        }
        return visit(ctx.and_expression());
    }

    @Override
    public String visitAnd_expression(CustomLangParser.And_expressionContext ctx) {
        if (ctx.AND() != null) {
            return visit(ctx.and_expression()) + " && " + visit(ctx.not_expression());
        }
        return visit(ctx.not_expression());
    }

    @Override
    public String visitNot_expression(CustomLangParser.Not_expressionContext ctx) {
        if (ctx.NOT() != null) {
            return "!(" + visit(ctx.not_expression()) + ")";
        }
        return visit(ctx.comparison());
    }

    @Override
    public String visitComparison(CustomLangParser.ComparisonContext ctx) {
        // Đây là trường hợp so sánh giữa hai biểu thức, ví dụ: a == b, a < b
        if (ctx.comparison().size() > 1) {
            String left = convertVariable(visit(ctx.comparison(0)));
            String right = visit(ctx.comparison(1));
            String op = "";
            if (ctx.LESS_THAN() != null) op = "<";
            else if (ctx.GREATER_THAN() != null) op = ">";
                // Đã sửa ở đây: EQUALS (dấu =) sẽ được chuyển thành ==
            else if (ctx.EQUALS() != null) op = "==";
            else if (ctx.GT_EQ() != null) op = ">=";
            else if (ctx.LT_EQ() != null) op = "<=";
            else if (ctx.NOT_EQ_1() != null || ctx.NOT_EQ_2() != null) op = "!=";
            else if (ctx.IN() != null) {
                if (ctx.NOT() != null) {
                    return "!" + right + ".contains(" + left + ")";
                } else {
                    return right + ".contains(" + left + ")";
                }
            } else if (ctx.IS() != null) {
                if (ctx.NOT() != null) {
                    return left + " != " + right;
                } else {
                    return left + " == " + right;
                }
            }
            return "(" + left + " " + op + " " + right + ")";
        }
        // Đây là trường hợp chỉ có một biểu thức, không có toán tử so sánh
        // Ví dụ: `if (someBooleanVar)` hoặc `if (5)` (sẽ được đánh giá là true/false trong Python)
        return visit(ctx.expr());
    }
    @Override
    public String visitExpr(CustomLangParser.ExprContext ctx) {
//        if (ctx.value() != null) {
//            return visit(ctx.value());
//        } else if (ctx.IDENTIFIER() != null) {
//            return ctx.IDENTIFIER().getText().replace("`", "");
//        } else if (ctx.POWER() != null) {
//            return "Math.pow(" + visit(ctx.expr(0)) + ", " + visit(ctx.expr(1)) + ")";
//        } else if (ctx.ADD().size() > 0 || ctx.MINUS().size() > 0 || ctx.NOT_OP().size() > 0) {
//            String op = "";
//            if (ctx.ADD().size() > 0) op = "+";
//            else if (ctx.MINUS().size() > 0) op = "-";
//            else if (ctx.NOT_OP().size() > 0) op = "~";
//            return op + visit(ctx.expr(0));
//        } else if (ctx.STAR() != null || ctx.AT() != null || ctx.DIV() != null || ctx.MOD() != null || ctx.IDIV() != null) {
//            String op = "";
//            if (ctx.STAR() != null) op = "*";
//            else if (ctx.DIV() != null) op = "/";
//            else if (ctx.MOD() != null) op = "%";
//            else if (ctx.IDIV() != null) op = "/";
//            else if (ctx.AT() != null) return "/* matrix_mult(" + visit(ctx.expr(0)) + ", " + visit(ctx.expr(1)) + ") */";
//            return "(" + visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1)) + ")";
//        } else if (ctx.ADD().size() > 1 || ctx.MINUS().size() > 1) {
//            String op = "";
//            if (ctx.ADD().size() > 1) op = "+";
//            else if (ctx.MINUS().size() > 1) op = "-";
//            return "(" + visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1)) + ")";
//        } else if (ctx.LEFT_SHIFT() != null || ctx.RIGHT_SHIFT() != null) {
//            String op = "";
//            if (ctx.LEFT_SHIFT() != null) op = "<<";
//            else if (ctx.RIGHT_SHIFT() != null) op = ">>";
//            return "(" + visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1)) + ")";
//        } else if (ctx.AND_OP() != null) {
//            return "(" + visit(ctx.expr(0)) + " & " + visit(ctx.expr(1)) + ")";
//        } else if (ctx.XOR() != null) {
//            return "(" + visit(ctx.expr(0)) + " ^ " + visit(ctx.expr(1)) + ")";
//        } else if (ctx.OR_OP() != null) {
//            return "(" + visit(ctx.expr(0)) + " | " + visit(ctx.expr(1)) + ")";
//        }
        return visitChildren(ctx);
    }

    @Override
    public String visitSum(CustomLangParser.SumContext ctx) {
        if (ctx.term() != null && ctx.sum() == null) {
            return visit(ctx.term());
        }
        String left = visit(ctx.sum());
        String right = visit(ctx.term());
        String op = (ctx.ADD() != null) ? "+" : "-";
        return "(" + left + " " + op + " " + right + ")";
    }

    @Override
    public String visitTerm(CustomLangParser.TermContext ctx) {
        if (ctx.factor() != null && ctx.term() == null) {
            return visit(ctx.factor());
        }
        String left = visit(ctx.term());
        String right = visit(ctx.factor());
        String op;
        if (ctx.STAR() != null) op = "*";
        else if (ctx.DIV() != null) op = "/";
        else if (ctx.MOD() != null) op = "%";
        else if (ctx.IDIV() != null) op = "/";
        else if (ctx.AT() != null) return "/* matrix_mult(" + left + ", " + right + ") */";
        else op = "";
        return "(" + left + " " + op + " " + right + ")";
    }

    @Override
    public String visitFactor(CustomLangParser.FactorContext ctx) {
        if (ctx.power() != null) {
            return visit(ctx.power());
        }
        String op = "";
        if (ctx.ADD() != null) op = "+";
        else if (ctx.MINUS() != null) op = "-";
        else if (ctx.NOT_OP() != null) op = "~";
        return op + visit(ctx.factor());
    }

    @Override
    public String visitPower(CustomLangParser.PowerContext ctx) {
        String base = visit(ctx.await_primary());
        if (ctx.POWER() != null && ctx.factor() != null) {
            String exponent = visit(ctx.factor());
            return "Math.pow(" + base + ", " + exponent + ")";
        }
        return base;
    }

    @Override
    public String visitAwait_primary(CustomLangParser.Await_primaryContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public String visitPrimary(CustomLangParser.PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            if (ctx.primary() != null) {
                return visit(ctx.primary()) + "." + ctx.IDENTIFIER().getText().replace("`", "");
            }
            return ctx.IDENTIFIER().getText().replace("`", "");
        } else if (ctx.value() != null) {
            return visit(ctx.value());
        } else if (ctx.OPEN_BRACK() != null && ctx.CLOSE_BRACK() != null) {
            if (ctx.primary() != null) {
                return visit(ctx.primary()) + ".get(" + visit(ctx.slices()) + ")";
            } else {
                return "/* Indexed access on unknown primary: */" + visit(ctx.slices());
            }
        } else if (ctx.OPEN_BRACK() != null && ctx.CLOSE_BRACK() != null && ctx.value() != null) {
            return visit(ctx.value());
        }
        return "";
    }

    @Override
    public String visitSlices(CustomLangParser.SlicesContext ctx) {
        StringBuilder result = new StringBuilder();
        List<String> sliceParts = new ArrayList<>();

        if (ctx.slice() != null) {
            for (CustomLangParser.SliceContext sliceCtx : ctx.slice()) {
                sliceParts.add(visit(sliceCtx));
            }
        }
        if (ctx.starred_expression() != null) {
            for (CustomLangParser.Starred_expressionContext starredCtx : ctx.starred_expression()) {
                sliceParts.add(visit(starredCtx));
            }
        }

        boolean isRangeSlice = sliceParts.stream().anyMatch(s -> s.contains(":"));

        if (isRangeSlice) {
            return "/* custom_slice_helper(" + String.join(", ", sliceParts) + ") */";
        } else {
            return String.join(", ", sliceParts);
        }
    }

    @Override
    public String visitStarred_expression(CustomLangParser.Starred_expressionContext ctx) {
        return "/* unpack(" + visit(ctx.expression()) + ") */";
    }

    @Override
    public String visitSlice(CustomLangParser.SliceContext ctx) {
        if (ctx.named_expression() != null) {
            return visit(ctx.named_expression());
        }
        StringBuilder sliceComponents = new StringBuilder();
        if (ctx.expression().size() > 0 && ctx.expression(0) != null) {
            sliceComponents.append(visit(ctx.expression(0)));
        }
        if (ctx.COLON().size() > 0) {
            sliceComponents.append(":");
            if (ctx.expression().size() > 1 && ctx.expression(1) != null) {
                sliceComponents.append(visit(ctx.expression(1)));
            }
            if (ctx.COLON().size() > 1) {
                sliceComponents.append(":");
                if (ctx.expression().size() > 2 && ctx.expression(2) != null) {
                    sliceComponents.append(visit(ctx.expression(2)));
                }
            }
        }
        return sliceComponents.toString();
    }

    @Override
    public String visitValue(CustomLangParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        } else if (ctx.DECIMAL_INTEGER() != null) {
            return ctx.DECIMAL_INTEGER().getText();
        } else if (ctx.OCT_INTEGER() != null) {
            return String.valueOf(Integer.parseInt(ctx.OCT_INTEGER().getText().substring(2), 8));
        } else if (ctx.HEX_INTEGER() != null) {
            return ctx.HEX_INTEGER().getText();
        } else if (ctx.BIN_INTEGER() != null) {
            return String.valueOf(Integer.parseInt(ctx.BIN_INTEGER().getText().substring(2), 2));
        } else if (ctx.FLOAT_NUMBER() != null) {
            return ctx.FLOAT_NUMBER().getText();
        } else if (ctx.OPEN_BRACK() != null && ctx.CLOSE_BRACK() != null) {
            if (ctx.testlist_comp() != null) {
                return "java.util.Arrays.asList(" + visit(ctx.testlist_comp()) + ")";
            }
            return "new java.util.ArrayList<>()";
        }
        return "";
    }

    @Override
    public String visitTestlist_star_expr(CustomLangParser.Testlist_star_exprContext ctx) {
        return ctx.test().stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitTest(CustomLangParser.TestContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText().replace("`", "");
        } else if (ctx.value() != null) {
            return visit(ctx.value());
        }
        return "";
    }

    @Override
    public String visitExpressions(CustomLangParser.ExpressionsContext ctx) {
        return ctx.expression().stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitExpression(CustomLangParser.ExpressionContext ctx) {
        // expression : logical_test (IF logical_test ELSE expression)? ;
        // If there's an IF and ELSE, it's a ternary operator.
        if (ctx.IF() != null && ctx.ELSE() != null) {
            // We need to ensure that the necessary logical_test contexts exist for the ternary operation.
            // logical_test(0) is the value if true
            // logical_test(1) is the condition
            // expression() is the value if false
            if (ctx.logical_test().size() >= 2 && ctx.expression() != null) { // Check for null instead of size for ctx.expression()
                String valueIfTrue = visit(ctx.logical_test(0));
                String condition = visit(ctx.logical_test(1));
                String valueIfFalse = visit(ctx.expression()); // Corrected: Directly call visit on the context object

                return "(" + condition + " ? " + valueIfTrue + " : " + valueIfFalse + ")";
            }
            // If the structure isn't fully formed for a ternary (e.g., missing else expression),
            // we might want to log an error or fall back to the first logical_test.
            // For now, it will fall through to the default return.
        }
        // Otherwise, it's just a simple logical_test (or a more complex one handled by logical_test itself)
        // Always return the first logical_test. If it's a simple expression, there's only one.
        // If it's a ternary that wasn't fully formed (e.g., missing ELSE part), this will return the first part.
        return visit(ctx.logical_test(0));
    }


    @Override
    public String visitLogical_test(CustomLangParser.Logical_testContext ctx) {
        if (ctx.comparison() != null) {
            return visit(ctx.comparison());
        } else if (ctx.NOT() != null) {
            return "!(" + visit(ctx.logical_test(0)) + ")";
        } else if (ctx.AND() != null) {
            return "(" + visit(ctx.logical_test(0)) + " && " + visit(ctx.logical_test(1)) + ")";
        } else if (ctx.OR() != null) {
            return "(" + visit(ctx.logical_test(0)) + " || " + visit(ctx.logical_test(1)) + ")";
        }
        return "";
    }


    // --- Compound Statements ---

    @Override
    public String visitCompound_stmt(CustomLangParser.Compound_stmtContext ctx) {
        if (ctx.if_stmt() != null) {
            return visit(ctx.if_stmt());
        } else if (ctx.for_stmt() != null) {
            return visit(ctx.for_stmt());
        } else if (ctx.while_stmt() != null) {
            return visit(ctx.while_stmt());
        }
        return "";
    }

    @Override
    public String visitIf_stmt(CustomLangParser.If_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder(getIndent());
        javaCode.append("if (").append(visit(ctx.named_expression())).append(") {\n");
        indentLevel++;
        javaCode.append(visit(ctx.block())); // Use block(0) for the 'if' block
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.elif_stmt() != null) {
            javaCode.append(" else ").append(visit(ctx.elif_stmt()));
        } else if (ctx.else_block() != null) {
            javaCode.append(" else {\n");
            indentLevel++;
            javaCode.append(visit(ctx.else_block()));
            indentLevel--;
            javaCode.append(getIndent()).append("}");
        }
        javaCode.append("\n");
        return javaCode.toString();
    }

    @Override
    public String visitElif_stmt(CustomLangParser.Elif_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder("if (").append(visit(ctx.named_expression())).append(") {\n");
        indentLevel++;
        javaCode.append(visit(ctx.block())); // Use block(0) for the 'elif' block
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.elif_stmt() != null) {
            javaCode.append(" else ").append(visit(ctx.elif_stmt()));
        } else if (ctx.else_block() != null) {
            javaCode.append(" else {\n");
            indentLevel++;
            javaCode.append(visit(ctx.else_block()));
            indentLevel--;
            javaCode.append(getIndent()).append("}");
        }
        return javaCode.toString();
    }

    @Override
    public String visitElse_block(CustomLangParser.Else_blockContext ctx) {
        return visit(ctx.block()); // Use block(0) for the 'else' block
    }

    @Override
    public String visitFor_stmt(CustomLangParser.For_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder(getIndent());
        String loopVar = visit(ctx.exprlist());
        String iterable = visit(ctx.testlist());

        javaCode.append("for (Object ").append(convertVariable(loopVar)).append(" : ").append(convertVariable(iterable)).append(") {\n");
        indentLevel++;
        javaCode.append(visit(ctx.block(0))); // Use block(0) for the loop body
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.ELSE() != null && ctx.block().size() > 1) {
            javaCode.append(" // Python's 'else' block for for loop (executes if loop completes normally)\n");
            javaCode.append(getIndent()).append("/* Complex conversion for Python's for-else block */\n");
        }
        javaCode.append("\n");
        return javaCode.toString();
    }

    @Override
    public String visitWhile_stmt(CustomLangParser.While_stmtContext ctx) {
        StringBuilder javaCode = new StringBuilder(getIndent());
        javaCode.append("while (").append(visit(ctx.named_expression())).append(") {\n");
        indentLevel++;
        javaCode.append(visit(ctx.block())); // Use block(0) for the loop body
        indentLevel--;
        javaCode.append(getIndent()).append("}");

        if (ctx.else_block() != null) {
            javaCode.append(" // Python's 'else' block for while loop (executes if loop completes normally)\n");
            javaCode.append(getIndent()).append("/* Complex conversion for Python's while-else block */\n");
        }
        javaCode.append("\n");
        return javaCode.toString();
    }

    @Override
    public String visitBlock(CustomLangParser.BlockContext ctx) {
        StringBuilder javaCode = new StringBuilder();
        if (ctx.NEWLINE() != null && ctx.INDENT() != null && ctx.DEDENT() != null) {
            javaCode.append(visit(ctx.statements()));
        } else if (ctx.simple_stmts() != null) {
            javaCode.append(visit(ctx.simple_stmts()));
        }
        return javaCode.toString();
    }


    // --- Assignment and Variable Handling ---
    @Override
    public String visitAssignment(CustomLangParser.AssignmentContext ctx) {
        StringBuilder javaCode = new StringBuilder();

        String ultimateRHSValue = visit(ctx.testlist_star_expr(ctx.testlist_star_expr().size() - 1));
        String ultimateRHSType = "Object";
        if (ctx.testlist_star_expr(ctx.testlist_star_expr().size() - 1).test().size() == 1 &&
                ctx.testlist_star_expr(ctx.testlist_star_expr().size() - 1).test(0).value() != null) {
            ultimateRHSType = determineJavaType(ctx.testlist_star_expr(ctx.testlist_star_expr().size() - 1).test(0).value());
        }

        for (int i = ctx.testlist_star_expr().size() - 2; i >= 0; i--) {
            String currentLHS = convertVariable(visit(ctx.testlist_star_expr(i)));

            String typeToDeclare = ultimateRHSType;

            if (!declaredVariables.containsKey(currentLHS)) {
                javaCode.insert(0, typeToDeclare + " ");
                declaredVariables.put(currentLHS, typeToDeclare);
            }
            javaCode.append(currentLHS).append(" = ").append(ultimateRHSValue).append(";\n");

            ultimateRHSValue = currentLHS;
            ultimateRHSType = declaredVariables.get(currentLHS);
        }

        return javaCode.toString().trim();
    }


//    @Override
//    public String visitAssignment_expression(CustomLangParser.Assignment_expressionContext ctx) {
//        String identifier = ctx.IDENTIFIER().getText().replace("`", "");
//        String expression = visit(ctx.expression());
//        String type = "Object"; // Default type if unable to infer
//
//        // Attempt to infer type from the expression
//        CustomLangParser.ValueContext valueFromExpr = findValueContextInExpression(ctx.expression());
//        if (valueFromExpr != null) {
//            type = determineJavaType(valueFromExpr);
//        }
//        // Alternative for more robust type inference:
//        // You might need a more sophisticated type inference system
//        // that analyzes the `expression` more deeply (e.g., if it's a math operation,
//        // or a function call, etc.) to determine its resulting type.
//        // For now, if we can't find a direct value, we default to Object.
//
//
//        if (!declaredVariables.containsKey(identifier)) {
//            declaredVariables.put(identifier, type);
//            return type + " " + identifier + " = " + expression;
//        } else {
//            return identifier + " = " + expression;
//        }
//    }
    // Helper method to get the value context from an expression, if it ultimately resolves to a value.
    // This is a simplified approach. A full type inference system would be more complex.
    private CustomLangParser.ValueContext findValueContextInExpression(CustomLangParser.ExpressionContext exprCtx) {
        if (exprCtx == null) {
            return null;
        }
        // If the expression is a direct value
        if (exprCtx.logical_test() != null && exprCtx.logical_test(0).comparison() != null &&
                exprCtx.logical_test(0).comparison().expr() != null &&
                exprCtx.logical_test(0).comparison().expr().value() != null) {
            return exprCtx.logical_test(0).comparison().expr().value();
        }
        // Add more cases here if expression can directly contain other types that map to Java primitives
        // e.g., if exprCtx directly contains a number or string literal
        return null;
    }
    @Override
    public String visitNamed_expression(CustomLangParser.Named_expressionContext ctx) {
//        if (ctx.assignment_expression() != null) {
//            return visit(ctx.assignment_expression());
//        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
//        }
//        return "";
    }

    @Override
    public String visitGuard(CustomLangParser.GuardContext ctx) {
        return getIndent() + "if (" + visit(ctx.named_expression()) + ") {\n" + getIndent() + "    // Guard condition met\n" + getIndent() + "}\n";
    }

    @Override
    public String visitExprlist(CustomLangParser.ExprlistContext ctx) {
        return ctx.expr().stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitTestlist(CustomLangParser.TestlistContext ctx) {
        return ctx.test().stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitTestlist_comp(CustomLangParser.Testlist_compContext ctx) {
        StringBuilder elements = new StringBuilder();
        if (ctx.test() != null && !ctx.test().isEmpty()) {
            elements.append(ctx.test().stream().map(this::visit).collect(Collectors.joining(", ")));
        }
        if (ctx.star_expr() != null && !ctx.star_expr().isEmpty()) {
            if (elements.length() > 0) {
                elements.append(", ");
            }
            elements.append(ctx.star_expr().stream().map(this::visit).collect(Collectors.joining(", ")));
        }
        if (ctx.for_stmt() != null && !ctx.for_stmt().isEmpty()) {
            return "/* list_comprehension_conversion(" + elements.toString() + ") */";
        }
        return elements.toString();
    }

    public String convertVariable(String variable){
       String nomalizer = Normalizer.normalize(variable.replaceAll(" ", "_"), Normalizer.Form.NFD);

       return  nomalizer.replaceAll("\\p{M}", "").replace("Đ","D");
    }
}