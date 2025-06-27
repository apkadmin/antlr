// Generated from CustomLangParser.g4 by ANTLR 4.13.2
package com.example.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CustomLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CustomLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CustomLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(CustomLangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CustomLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#simple_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmts(CustomLangParser.Simple_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(CustomLangParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(CustomLangParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(CustomLangParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#not_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expression(CustomLangParser.Not_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(CustomLangParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(CustomLangParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CustomLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(CustomLangParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(CustomLangParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(CustomLangParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CustomLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#logical_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_test(CustomLangParser.Logical_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CustomLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(CustomLangParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CustomLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CustomLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CustomLangParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#await_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwait_primary(CustomLangParser.Await_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CustomLangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#slices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlices(CustomLangParser.SlicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#starred_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarred_expression(CustomLangParser.Starred_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(CustomLangParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CustomLangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CustomLangParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#elif_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_stmt(CustomLangParser.Elif_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(CustomLangParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(CustomLangParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#named_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_expression(CustomLangParser.Named_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CustomLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CustomLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(CustomLangParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CustomLangParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(CustomLangParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(CustomLangParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(CustomLangParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomLangParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(CustomLangParser.Star_exprContext ctx);
}