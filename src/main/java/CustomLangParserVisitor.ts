// Generated from CustomLangParser.g4 by ANTLR 4.13.2

import {ParseTreeVisitor} from 'antlr4';


import { ProgramContext } from "./CustomLangParser.js";
import { StatementsContext } from "./CustomLangParser.js";
import { StatementContext } from "./CustomLangParser.js";
import { Simple_stmtsContext } from "./CustomLangParser.js";
import { Simple_stmtContext } from "./CustomLangParser.js";
import { Or_expressionContext } from "./CustomLangParser.js";
import { And_expressionContext } from "./CustomLangParser.js";
import { Not_expressionContext } from "./CustomLangParser.js";
import { Compound_stmtContext } from "./CustomLangParser.js";
import { Conditional_expressionContext } from "./CustomLangParser.js";
import { AssignmentContext } from "./CustomLangParser.js";
import { Testlist_star_exprContext } from "./CustomLangParser.js";
import { TestContext } from "./CustomLangParser.js";
import { ExpressionsContext } from "./CustomLangParser.js";
import { ExpressionContext } from "./CustomLangParser.js";
import { Logical_testContext } from "./CustomLangParser.js";
import { ComparisonContext } from "./CustomLangParser.js";
import { SumContext } from "./CustomLangParser.js";
import { TermContext } from "./CustomLangParser.js";
import { FactorContext } from "./CustomLangParser.js";
import { PowerContext } from "./CustomLangParser.js";
import { Await_primaryContext } from "./CustomLangParser.js";
import { PrimaryContext } from "./CustomLangParser.js";
import { SlicesContext } from "./CustomLangParser.js";
import { Starred_expressionContext } from "./CustomLangParser.js";
import { SliceContext } from "./CustomLangParser.js";
import { ValueContext } from "./CustomLangParser.js";
import { If_stmtContext } from "./CustomLangParser.js";
import { Elif_stmtContext } from "./CustomLangParser.js";
import { Else_blockContext } from "./CustomLangParser.js";
import { GuardContext } from "./CustomLangParser.js";
import { Named_expressionContext } from "./CustomLangParser.js";
import { BlockContext } from "./CustomLangParser.js";
import { ExprContext } from "./CustomLangParser.js";
import { For_stmtContext } from "./CustomLangParser.js";
import { While_stmtContext } from "./CustomLangParser.js";
import { ExprlistContext } from "./CustomLangParser.js";
import { TestlistContext } from "./CustomLangParser.js";
import { Testlist_compContext } from "./CustomLangParser.js";
import { Star_exprContext } from "./CustomLangParser.js";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `CustomLangParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export default class CustomLangParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `CustomLangParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.statements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatements?: (ctx: StatementsContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.simple_stmts`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimple_stmts?: (ctx: Simple_stmtsContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.simple_stmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSimple_stmt?: (ctx: Simple_stmtContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.or_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitOr_expression?: (ctx: Or_expressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.and_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAnd_expression?: (ctx: And_expressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.not_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNot_expression?: (ctx: Not_expressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.compound_stmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCompound_stmt?: (ctx: Compound_stmtContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.conditional_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConditional_expression?: (ctx: Conditional_expressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.assignment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignment?: (ctx: AssignmentContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.testlist_star_expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTestlist_star_expr?: (ctx: Testlist_star_exprContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.test`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTest?: (ctx: TestContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.expressions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpressions?: (ctx: ExpressionsContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.logical_test`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogical_test?: (ctx: Logical_testContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.comparison`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitComparison?: (ctx: ComparisonContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.sum`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSum?: (ctx: SumContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.term`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTerm?: (ctx: TermContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.factor`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFactor?: (ctx: FactorContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.power`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPower?: (ctx: PowerContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.await_primary`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAwait_primary?: (ctx: Await_primaryContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.primary`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrimary?: (ctx: PrimaryContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.slices`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSlices?: (ctx: SlicesContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.starred_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStarred_expression?: (ctx: Starred_expressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.slice`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSlice?: (ctx: SliceContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.value`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitValue?: (ctx: ValueContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.if_stmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIf_stmt?: (ctx: If_stmtContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.elif_stmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElif_stmt?: (ctx: Elif_stmtContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.else_block`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitElse_block?: (ctx: Else_blockContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.guard`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGuard?: (ctx: GuardContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.named_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitNamed_expression?: (ctx: Named_expressionContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.block`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBlock?: (ctx: BlockContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpr?: (ctx: ExprContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.for_stmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFor_stmt?: (ctx: For_stmtContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.while_stmt`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitWhile_stmt?: (ctx: While_stmtContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.exprlist`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExprlist?: (ctx: ExprlistContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.testlist`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTestlist?: (ctx: TestlistContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.testlist_comp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTestlist_comp?: (ctx: Testlist_compContext) => Result;
	/**
	 * Visit a parse tree produced by `CustomLangParser.star_expr`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStar_expr?: (ctx: Star_exprContext) => Result;
}

