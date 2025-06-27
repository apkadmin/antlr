//package com.example.parser;
//
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class CustomLangeExecutorVisitor extends CustomLangParserBaseVisitor<Object> {
//
//
//        // A simple symbol table to store variable names and their values
//        // In a real-world scenario, you might want more sophisticated scoping (local/global).
//        private Map<String, Object> variables = new HashMap<>();
//
//    public Map<String, Object> getVariables() {
//        return variables;
//    }
//
//    /**
//         * Main entry point for execution. Visits the entire program tree.
//         * @param tree The root of the parse tree.
//         * @return The result of the program execution (often null for a script).
//         */
//        @Override
//        public Object visitProgram(CustomLangParser.ProgramContext ctx) {
//            // Visit each statement in the program
//            // 'super.visitProgram(ctx)' would visit all children automatically
//            // but explicit loop gives more control if you need to handle things between statements.
//            for (CustomLangParser.StatementContext stmtCtx : ctx.statement()) {
//                if (stmtCtx != null) { // Add a null check here just in case, for debugging
//                    visit(stmtCtx);
//                } else {
//                    System.err.println("Lỗi: StatementContext là NULL trong visitProgram.");
//                }
//            }
//            return null; // A program typically doesn't return a value
//        }
//
//        /**
//         * Handles a single statement.
//         * @param ctx The context for the statement rule.
//         * @return The result of the statement (often null).
//         */
//        @Override
//        public Object visitStatement(CustomLangParser.StatementContext ctx) {
//            // A statement typically contains simple_stmts
//            // You might want to add error handling or more specific logic here
//            if (ctx.simple_stmts() != null) {
//                return visit(ctx.simple_stmts());
//            }
//            // Check if if_stmt exists (as you recently added it to 'statement' rule)
//            else if (ctx.compound_stmt() != null) { // <--- MAKE SURE YOU HAVE THIS BRANCH
//                return visit(ctx.compound_stmt());
//            }
//            // Add checks for other statement types as you add them
//            else {
//                System.err.println("Lỗi: Không tìm thấy loại statement nào hợp lệ trong visitStatement.");
//                return null; // Or throw an exception
//            }
//        }
//
//        /**
//         * Handles a sequence of simple statements separated by semicolons.
//         * @param ctx The context for the simple_stmts rule.
//         * @return The result of the last simple statement, or null.
//         */
//        @Override
//        public Object visitSimple_stmts(CustomLangParser.Simple_stmtsContext ctx) {
//            Object lastResult = null;
//            for (CustomLangParser.Simple_stmtContext simpleStmtCtx : ctx.simple_stmt()) {
//                lastResult = visit(simpleStmtCtx); // Execute each simple statement
//            }
//            return lastResult; // Return the result of the last statement, if any
//        }
//
//        /**
//         * Handles a single simple statement. In your current grammar, this is an assignment.
//         * @param ctx The context for the simple_stmt rule.
//         * @return The result of the simple statement (e.g., null for assignment).
//         */
//        @Override
//        public Object visitSimple_stmt(CustomLangParser.Simple_stmtContext ctx) {
//            // Currently, simple_stmt only leads to 'assignment'.
//            // Expand this if you add other simple statements (e.g., print, pass).
//            if(ctx.assignment() != null) {
//                return visit(ctx.assignment());
//            }
//return null;
//        }
//
//        /**
//         * Handles assignment operations.
//         * Syntax: testlist_star_expr = testlist_star_expr [= testlist_star_expr]*
//         * @param ctx The context for the assignment rule.
//         * @return Null, as assignments typically don't return a value.
//         */
//        @Override
//        public Object visitAssignment(CustomLangParser.AssignmentContext ctx) {
//            // This rule handles chained assignments (e.g., a = b = 10)
//            // We need to work from right to left to evaluate the value first.
//
//            // Get the value from the rightmost expression first
//            // The last testlist_star_expr is the actual value being assigned.
//            // If it's 'a = b = 10', then '10' is ctx.testlist_star_expr(2)
//            // If it's 'x = 10', then '10' is ctx.testlist_star_expr(1)
//            Object assignedValue = visit(ctx.testlist_star_expr(ctx.testlist_star_expr().size() - 1));
//
//            // Iterate through all left-hand sides from right to left
//            // For 'a = b = 10', this would process 'b' then 'a'.
//            for (int i = ctx.testlist_star_expr().size() - 2; i >= 0; i--) {
//                CustomLangParser.Testlist_star_exprContext lhsCtx = ctx.testlist_star_expr(i);
//
//                // Assuming simple assignment where LHS is a single identifier (for now)
//                // This needs to be expanded if you have tuple unpacking like 'a,b = 1,2'
//                if (lhsCtx.test().size() == 1 && lhsCtx.test(0).IDENTIFIER() != null) {
//                    String varNameWithBackticks = lhsCtx.test(0).IDENTIFIER().getText();
//                    String varName = varNameWithBackticks.substring(1, varNameWithBackticks.length() - 1); // Remove backticks
//
//                    variables.put(varName, assignedValue); // Store the value
//                    System.out.println("Gán biến '" + varName + "' giá trị: " + assignedValue);
//                } else {
//                    // Handle complex LHS like 'a,b' = ... or expressions on LHS (if allowed)
//                    System.err.println("Error: Complex left-hand side not yet supported in assignment.");
//                }
//            }
//
//            return null; // Assignment itself doesn't yield a value
//        }
//
//        /**
//         * Handles a list of test expressions (e.g., for tuple unpacking or RHS of assignment).
//         * For now, assumes a single test expression for simplicity.
//         * @param ctx The context for the testlist_star_expr rule.
//         * @return The value of the first test expression in the list.
//         */
//        @Override
//        public Object visitTestlist_star_expr(CustomLangParser.Testlist_star_exprContext ctx) {
//            // If it's a single value (e.g., '10' in 'x = 10'), it will have one 'test'.
//            // If it's a tuple (e.g., '1,2' in 'a,b = 1,2'), it will have multiple 'test' rules.
//            if (ctx.test().size() == 1) {
//                return visit(ctx.test(0)); // Visit the single test
//            } else if (ctx.test().size() > 1) {
//                // Handle multiple values, e.g., for tuple assignment: a, b = 1, 2
//                // You might return a List or Array here.
//                System.out.println("Multiple values in testlist_star_expr detected. Returning as a List.");
//                java.util.List<Object> values = new java.util.ArrayList<>();
//                for (CustomLangParser.TestContext testCtx : ctx.test()) {
//                    values.add(visit(testCtx));
//                }
//                return values;
//            }
//            return null; // Should not happen for a valid testlist_star_expr
//        }
//
//        /**
//         * Handles a single test expression, which can be an IDENTIFIER or a VALUE.
//         * @param ctx The context for the test rule.
//         * @return The value associated with the test.
//         */
//        @Override
//        public Object visitTest(CustomLangParser.TestContext ctx) {
//            if (ctx.IDENTIFIER() != null) {
//                // If it's an identifier (e.g., 'b' in 'a = b')
//                String idNameWithBackticks = ctx.IDENTIFIER().getText();
//                String idName = idNameWithBackticks.substring(1, idNameWithBackticks.length() - 1);
//                // Look up the value from the symbol table
//                if (variables.containsKey(idName)) {
//                    return variables.get(idName);
//                } else {
//                    System.err.println("Lỗi: Biến '" + idName + "' chưa được khai báo.");
//                    return null; // Or throw a runtime exception
//                }
//            } else if (ctx.value() != null) {
//                // If it's a literal value (e.g., 5, "hello", 3.14)
//                return visit(ctx.value());
//            }
//            return null; // Should not be reached for valid input
//        }
//
//        /**
//         * Handles the 'value' rule, converting literal tokens to their Java types.
//         * @param ctx The context for the value rule.
//         * @return The Java object representing the literal value.
//         */
//        @Override
//        public Object visitValue(CustomLangParser.ValueContext ctx) {
//            if (ctx.DECIMAL_INTEGER() != null) {
//                return Integer.parseInt(ctx.DECIMAL_INTEGER().getText());
//            } else if (ctx.OCT_INTEGER() != null) {
//                return Integer.parseInt(ctx.OCT_INTEGER().getText().substring(2), 8);
//            } else if (ctx.HEX_INTEGER() != null) {
//                return Integer.parseInt(ctx.HEX_INTEGER().getText().substring(2), 16);
//            } else if (ctx.BIN_INTEGER() != null) {
//                return Integer.parseInt(ctx.BIN_INTEGER().getText().substring(2), 2);
//            } else if (ctx.FLOAT_NUMBER() != null) {
//                return Double.parseDouble(ctx.FLOAT_NUMBER().getText());
//            } else if (ctx.STRING() != null) {
//                // Basic unquoting: remove first and last character (the quotes)
//                String text = ctx.STRING().getText();
//                return text.substring(1, text.length() - 1);
//            }
//            return null; // Should cover all literal types you define in 'value'
//        }
//
//    @Override
//    public Object visitCompound_stmt(CustomLangParser.Compound_stmtContext ctx) {
//        return super.visitCompound_stmt(ctx);
//    }
//    @Override
//    public Object visitIf_stmt(CustomLangParser.If_stmtContext ctx) {
//        // 1. Evaluate the condition (named_expression)
//        Object conditionResult = visit(ctx.named_expression());
//
//        // Convert conditionResult to a boolean.
//        // This is a crucial step for your language's semantics.
//        // For simplicity, we'll treat non-null, non-zero numbers, and True as true.
//        boolean condition = isTruthy(conditionResult);
//
//        if (condition) {
//            // 2. If condition is true, execute the 'if' block
//            visit(ctx.block());
//        } else {
//            // 3. If condition is false, check for elif or else blocks
//            if (ctx.elif_stmt() != null) {
//                // Visit the first elif block (this handles chaining due to grammar structure)
//                visit(ctx.elif_stmt());
//            } else if (ctx.else_block() != null) {
//                // Visit the else block
//                visit(ctx.else_block());
//            }
//        }
//        return null;
//    }
//
//    /**
//     * Executes an 'elif' statement.
//     * @param ctx The context for the elif_stmt rule.
//     * @return Null.
//     */
//    @Override
//    public Object visitElif_stmt(CustomLangParser.Elif_stmtContext ctx) {
//        // Similar to visitIf_stmt, evaluate its condition
//        Object conditionResult = visit(ctx.named_expression());
//        boolean condition = isTruthy(conditionResult);
//
//        if (condition) {
//            // If elif condition is true, execute its block
//            visit(ctx.block());
//        } else {
//            // If elif condition is false, check for further elif or else blocks
//            if (ctx.elif_stmt() != null) { // This handles subsequent elifs
//                visit(ctx.elif_stmt());
//            } else if (ctx.else_block() != null) {
//                visit(ctx.else_block());
//            }
//        }
//        return null;
//    }
//
//    /**
//     * Executes an 'else' block.
//     * @param ctx The context for the else_block rule.
//     * @return Null.
//     */
//    @Override
//    public Object visitElse_block(CustomLangParser.Else_blockContext ctx) {
//        // Execute the block associated with the else statement
//        visit(ctx.block());
//        return null;
//    }
//
//    /**
//     * Executes a block of statements.
//     * @param ctx The context for the block rule.
//     * @return Null.
//     */
//    @Override
//    public Object visitBlock(CustomLangParser.BlockContext ctx) {
//        if (ctx.statements() != null) { // Block has indented statements (NEWLINE INDENT statements DEDENT)
//            return visit(ctx.statements()); // This will call visitStatements
//        } else if (ctx.simple_stmts() != null) { // Block has simple_stmts (on the same line)
//            return visit(ctx.simple_stmts());
//        }
//        return null;
//    }
//
//    /**
//     * Handles a list of statements within a block.
//     * @param ctx The context for the statements rule.
//     * @return Null.
//     */
//    @Override
//    public Object visitStatements(CustomLangParser.StatementsContext ctx) {
//        Object lastResult = null;
//        for (CustomLangParser.StatementContext stmtCtx : ctx.statement()) {
//            lastResult = visit(stmtCtx); // Execute each statement in the block
//        }
//        return lastResult; // Return the result of the last statement, if needed
//    }
//
//    /**
//     * Determines the "truthiness" of an object, similar to Python.
//     * @param obj The object to check.
//     * @return True if the object is considered "truthy", false otherwise.
//     */
//    private boolean isTruthy(Object obj) {
//        if (obj == null) {
//            return false; // null is falsey
//        }
//        if (obj instanceof Boolean) {
//            return (Boolean) obj;
//        }
//        if (obj instanceof Number) {
//            // Treat 0 as falsey, any other number as truthy
//            return ((Number) obj).doubleValue() != 0.0;
//        }
//        if (obj instanceof String) {
//            // Treat empty string as falsey, non-empty as truthy
//            return !((String) obj).isEmpty();
//        }
//        // You can add more types as needed (e.g., lists, maps)
//        return true; // Default: anything else is truthy
//    }
//
//
//
//
//
//}
