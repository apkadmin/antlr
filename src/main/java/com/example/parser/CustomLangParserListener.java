// Generated from CustomLangParser.g4 by ANTLR 4.13.2
package com.example.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomLangParser}.
 */
public interface CustomLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CustomLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CustomLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CustomLangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CustomLangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CustomLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CustomLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmts(CustomLangParser.Simple_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmts(CustomLangParser.Simple_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(CustomLangParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(CustomLangParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(CustomLangParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(CustomLangParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(CustomLangParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(CustomLangParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_expression(CustomLangParser.Not_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_expression(CustomLangParser.Not_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CustomLangParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CustomLangParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(CustomLangParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(CustomLangParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CustomLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CustomLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(CustomLangParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(CustomLangParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(CustomLangParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(CustomLangParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(CustomLangParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(CustomLangParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CustomLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CustomLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#logical_test}.
	 * @param ctx the parse tree
	 */
	void enterLogical_test(CustomLangParser.Logical_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#logical_test}.
	 * @param ctx the parse tree
	 */
	void exitLogical_test(CustomLangParser.Logical_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CustomLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CustomLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(CustomLangParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(CustomLangParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CustomLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CustomLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CustomLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CustomLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(CustomLangParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(CustomLangParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#await_primary}.
	 * @param ctx the parse tree
	 */
	void enterAwait_primary(CustomLangParser.Await_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#await_primary}.
	 * @param ctx the parse tree
	 */
	void exitAwait_primary(CustomLangParser.Await_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CustomLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CustomLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#slices}.
	 * @param ctx the parse tree
	 */
	void enterSlices(CustomLangParser.SlicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#slices}.
	 * @param ctx the parse tree
	 */
	void exitSlices(CustomLangParser.SlicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#starred_expression}.
	 * @param ctx the parse tree
	 */
	void enterStarred_expression(CustomLangParser.Starred_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#starred_expression}.
	 * @param ctx the parse tree
	 */
	void exitStarred_expression(CustomLangParser.Starred_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(CustomLangParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(CustomLangParser.SliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CustomLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CustomLangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CustomLangParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CustomLangParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(CustomLangParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(CustomLangParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(CustomLangParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(CustomLangParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(CustomLangParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(CustomLangParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#named_expression}.
	 * @param ctx the parse tree
	 */
	void enterNamed_expression(CustomLangParser.Named_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#named_expression}.
	 * @param ctx the parse tree
	 */
	void exitNamed_expression(CustomLangParser.Named_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CustomLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CustomLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CustomLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CustomLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(CustomLangParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(CustomLangParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CustomLangParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CustomLangParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(CustomLangParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(CustomLangParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(CustomLangParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(CustomLangParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(CustomLangParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(CustomLangParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLangParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(CustomLangParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLangParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(CustomLangParser.Star_exprContext ctx);
}