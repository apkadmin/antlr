// Generated from CustomLangParser.g4 by ANTLR 4.13.2

import {ParseTreeListener} from "antlr4";


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
 * This interface defines a complete listener for a parse tree produced by
 * `CustomLangParser`.
 */
export default class CustomLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `CustomLangParser.program`.
	 * @param ctx the parse tree
	 */
	enterProgram?: (ctx: ProgramContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.program`.
	 * @param ctx the parse tree
	 */
	exitProgram?: (ctx: ProgramContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.statements`.
	 * @param ctx the parse tree
	 */
	enterStatements?: (ctx: StatementsContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.statements`.
	 * @param ctx the parse tree
	 */
	exitStatements?: (ctx: StatementsContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.simple_stmts`.
	 * @param ctx the parse tree
	 */
	enterSimple_stmts?: (ctx: Simple_stmtsContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.simple_stmts`.
	 * @param ctx the parse tree
	 */
	exitSimple_stmts?: (ctx: Simple_stmtsContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.simple_stmt`.
	 * @param ctx the parse tree
	 */
	enterSimple_stmt?: (ctx: Simple_stmtContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.simple_stmt`.
	 * @param ctx the parse tree
	 */
	exitSimple_stmt?: (ctx: Simple_stmtContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.or_expression`.
	 * @param ctx the parse tree
	 */
	enterOr_expression?: (ctx: Or_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.or_expression`.
	 * @param ctx the parse tree
	 */
	exitOr_expression?: (ctx: Or_expressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.and_expression`.
	 * @param ctx the parse tree
	 */
	enterAnd_expression?: (ctx: And_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.and_expression`.
	 * @param ctx the parse tree
	 */
	exitAnd_expression?: (ctx: And_expressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.not_expression`.
	 * @param ctx the parse tree
	 */
	enterNot_expression?: (ctx: Not_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.not_expression`.
	 * @param ctx the parse tree
	 */
	exitNot_expression?: (ctx: Not_expressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.compound_stmt`.
	 * @param ctx the parse tree
	 */
	enterCompound_stmt?: (ctx: Compound_stmtContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.compound_stmt`.
	 * @param ctx the parse tree
	 */
	exitCompound_stmt?: (ctx: Compound_stmtContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.conditional_expression`.
	 * @param ctx the parse tree
	 */
	enterConditional_expression?: (ctx: Conditional_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.conditional_expression`.
	 * @param ctx the parse tree
	 */
	exitConditional_expression?: (ctx: Conditional_expressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.assignment`.
	 * @param ctx the parse tree
	 */
	enterAssignment?: (ctx: AssignmentContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.assignment`.
	 * @param ctx the parse tree
	 */
	exitAssignment?: (ctx: AssignmentContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.testlist_star_expr`.
	 * @param ctx the parse tree
	 */
	enterTestlist_star_expr?: (ctx: Testlist_star_exprContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.testlist_star_expr`.
	 * @param ctx the parse tree
	 */
	exitTestlist_star_expr?: (ctx: Testlist_star_exprContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.test`.
	 * @param ctx the parse tree
	 */
	enterTest?: (ctx: TestContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.test`.
	 * @param ctx the parse tree
	 */
	exitTest?: (ctx: TestContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.expressions`.
	 * @param ctx the parse tree
	 */
	enterExpressions?: (ctx: ExpressionsContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.expressions`.
	 * @param ctx the parse tree
	 */
	exitExpressions?: (ctx: ExpressionsContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.logical_test`.
	 * @param ctx the parse tree
	 */
	enterLogical_test?: (ctx: Logical_testContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.logical_test`.
	 * @param ctx the parse tree
	 */
	exitLogical_test?: (ctx: Logical_testContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.comparison`.
	 * @param ctx the parse tree
	 */
	enterComparison?: (ctx: ComparisonContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.comparison`.
	 * @param ctx the parse tree
	 */
	exitComparison?: (ctx: ComparisonContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.sum`.
	 * @param ctx the parse tree
	 */
	enterSum?: (ctx: SumContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.sum`.
	 * @param ctx the parse tree
	 */
	exitSum?: (ctx: SumContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.term`.
	 * @param ctx the parse tree
	 */
	enterTerm?: (ctx: TermContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.term`.
	 * @param ctx the parse tree
	 */
	exitTerm?: (ctx: TermContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.factor`.
	 * @param ctx the parse tree
	 */
	enterFactor?: (ctx: FactorContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.factor`.
	 * @param ctx the parse tree
	 */
	exitFactor?: (ctx: FactorContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.power`.
	 * @param ctx the parse tree
	 */
	enterPower?: (ctx: PowerContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.power`.
	 * @param ctx the parse tree
	 */
	exitPower?: (ctx: PowerContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.await_primary`.
	 * @param ctx the parse tree
	 */
	enterAwait_primary?: (ctx: Await_primaryContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.await_primary`.
	 * @param ctx the parse tree
	 */
	exitAwait_primary?: (ctx: Await_primaryContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.primary`.
	 * @param ctx the parse tree
	 */
	enterPrimary?: (ctx: PrimaryContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.primary`.
	 * @param ctx the parse tree
	 */
	exitPrimary?: (ctx: PrimaryContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.slices`.
	 * @param ctx the parse tree
	 */
	enterSlices?: (ctx: SlicesContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.slices`.
	 * @param ctx the parse tree
	 */
	exitSlices?: (ctx: SlicesContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.starred_expression`.
	 * @param ctx the parse tree
	 */
	enterStarred_expression?: (ctx: Starred_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.starred_expression`.
	 * @param ctx the parse tree
	 */
	exitStarred_expression?: (ctx: Starred_expressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.slice`.
	 * @param ctx the parse tree
	 */
	enterSlice?: (ctx: SliceContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.slice`.
	 * @param ctx the parse tree
	 */
	exitSlice?: (ctx: SliceContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.value`.
	 * @param ctx the parse tree
	 */
	enterValue?: (ctx: ValueContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.value`.
	 * @param ctx the parse tree
	 */
	exitValue?: (ctx: ValueContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.if_stmt`.
	 * @param ctx the parse tree
	 */
	enterIf_stmt?: (ctx: If_stmtContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.if_stmt`.
	 * @param ctx the parse tree
	 */
	exitIf_stmt?: (ctx: If_stmtContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.elif_stmt`.
	 * @param ctx the parse tree
	 */
	enterElif_stmt?: (ctx: Elif_stmtContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.elif_stmt`.
	 * @param ctx the parse tree
	 */
	exitElif_stmt?: (ctx: Elif_stmtContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.else_block`.
	 * @param ctx the parse tree
	 */
	enterElse_block?: (ctx: Else_blockContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.else_block`.
	 * @param ctx the parse tree
	 */
	exitElse_block?: (ctx: Else_blockContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.guard`.
	 * @param ctx the parse tree
	 */
	enterGuard?: (ctx: GuardContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.guard`.
	 * @param ctx the parse tree
	 */
	exitGuard?: (ctx: GuardContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.named_expression`.
	 * @param ctx the parse tree
	 */
	enterNamed_expression?: (ctx: Named_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.named_expression`.
	 * @param ctx the parse tree
	 */
	exitNamed_expression?: (ctx: Named_expressionContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.block`.
	 * @param ctx the parse tree
	 */
	enterBlock?: (ctx: BlockContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.block`.
	 * @param ctx the parse tree
	 */
	exitBlock?: (ctx: BlockContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.expr`.
	 * @param ctx the parse tree
	 */
	enterExpr?: (ctx: ExprContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.expr`.
	 * @param ctx the parse tree
	 */
	exitExpr?: (ctx: ExprContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.for_stmt`.
	 * @param ctx the parse tree
	 */
	enterFor_stmt?: (ctx: For_stmtContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.for_stmt`.
	 * @param ctx the parse tree
	 */
	exitFor_stmt?: (ctx: For_stmtContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.while_stmt`.
	 * @param ctx the parse tree
	 */
	enterWhile_stmt?: (ctx: While_stmtContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.while_stmt`.
	 * @param ctx the parse tree
	 */
	exitWhile_stmt?: (ctx: While_stmtContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.exprlist`.
	 * @param ctx the parse tree
	 */
	enterExprlist?: (ctx: ExprlistContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.exprlist`.
	 * @param ctx the parse tree
	 */
	exitExprlist?: (ctx: ExprlistContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.testlist`.
	 * @param ctx the parse tree
	 */
	enterTestlist?: (ctx: TestlistContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.testlist`.
	 * @param ctx the parse tree
	 */
	exitTestlist?: (ctx: TestlistContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.testlist_comp`.
	 * @param ctx the parse tree
	 */
	enterTestlist_comp?: (ctx: Testlist_compContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.testlist_comp`.
	 * @param ctx the parse tree
	 */
	exitTestlist_comp?: (ctx: Testlist_compContext) => void;
	/**
	 * Enter a parse tree produced by `CustomLangParser.star_expr`.
	 * @param ctx the parse tree
	 */
	enterStar_expr?: (ctx: Star_exprContext) => void;
	/**
	 * Exit a parse tree produced by `CustomLangParser.star_expr`.
	 * @param ctx the parse tree
	 */
	exitStar_expr?: (ctx: Star_exprContext) => void;
}

