// Generated from CustomLangParser.g4 by ANTLR 4.13.2
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols

import {
	ATN,
	ATNDeserializer, DecisionState, DFA, FailedPredicateException,
	RecognitionException, NoViableAltException, BailErrorStrategy,
	Parser, ParserATNSimulator,
	RuleContext, ParserRuleContext, PredictionMode, PredictionContextCache,
	TerminalNode, RuleNode,
	Token, TokenStream,
	Interval, IntervalSet
} from 'antlr4';
import CustomLangParserListener from "./CustomLangParserListener.js";
import CustomLangParserVisitor from "./CustomLangParserVisitor.js";

// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;

export default class CustomLangParser extends Parser {
	public static readonly INDENT = 1;
	public static readonly DEDENT = 2;
	public static readonly DEF = 3;
	public static readonly RETURN = 4;
	public static readonly RAISE = 5;
	public static readonly FROM = 6;
	public static readonly IMPORT = 7;
	public static readonly NONLOCAL = 8;
	public static readonly AS = 9;
	public static readonly GLOBAL = 10;
	public static readonly ASSERT = 11;
	public static readonly IF = 12;
	public static readonly ELIF = 13;
	public static readonly ELSE = 14;
	public static readonly WHILE = 15;
	public static readonly FOR = 16;
	public static readonly IN = 17;
	public static readonly TRY = 18;
	public static readonly NONE = 19;
	public static readonly FINALLY = 20;
	public static readonly WITH = 21;
	public static readonly EXCEPT = 22;
	public static readonly LAMBDA = 23;
	public static readonly OR = 24;
	public static readonly AND = 25;
	public static readonly NOT = 26;
	public static readonly IS = 27;
	public static readonly CLASS = 28;
	public static readonly YIELD = 29;
	public static readonly DEL = 30;
	public static readonly PASS = 31;
	public static readonly CONTINUE = 32;
	public static readonly BREAK = 33;
	public static readonly ASYNC = 34;
	public static readonly AWAIT = 35;
	public static readonly PRINT = 36;
	public static readonly EXEC = 37;
	public static readonly TRUE = 38;
	public static readonly FALSE = 39;
	public static readonly DOT = 40;
	public static readonly ELLIPSIS = 41;
	public static readonly REVERSE_QUOTE = 42;
	public static readonly STAR = 43;
	public static readonly COMMA = 44;
	public static readonly COLON = 45;
	public static readonly SEMI_COLON = 46;
	public static readonly POWER = 47;
	public static readonly ASSIGN = 48;
	public static readonly OR_OP = 49;
	public static readonly XOR = 50;
	public static readonly AND_OP = 51;
	public static readonly LEFT_SHIFT = 52;
	public static readonly RIGHT_SHIFT = 53;
	public static readonly ADD = 54;
	public static readonly MINUS = 55;
	public static readonly DIV = 56;
	public static readonly MOD = 57;
	public static readonly IDIV = 58;
	public static readonly NOT_OP = 59;
	public static readonly LESS_THAN = 60;
	public static readonly GREATER_THAN = 61;
	public static readonly EQUALS = 62;
	public static readonly GT_EQ = 63;
	public static readonly LT_EQ = 64;
	public static readonly NOT_EQ_1 = 65;
	public static readonly NOT_EQ_2 = 66;
	public static readonly AT = 67;
	public static readonly ARROW = 68;
	public static readonly ADD_ASSIGN = 69;
	public static readonly SUB_ASSIGN = 70;
	public static readonly MULT_ASSIGN = 71;
	public static readonly AT_ASSIGN = 72;
	public static readonly DIV_ASSIGN = 73;
	public static readonly MOD_ASSIGN = 74;
	public static readonly AND_ASSIGN = 75;
	public static readonly OR_ASSIGN = 76;
	public static readonly XOR_ASSIGN = 77;
	public static readonly LEFT_SHIFT_ASSIGN = 78;
	public static readonly RIGHT_SHIFT_ASSIGN = 79;
	public static readonly POWER_ASSIGN = 80;
	public static readonly IDIV_ASSIGN = 81;
	public static readonly COLONEQUAL = 82;
	public static readonly OPEN_BRACK = 83;
	public static readonly CLOSE_BRACK = 84;
	public static readonly STRING = 85;
	public static readonly DECIMAL_INTEGER = 86;
	public static readonly OCT_INTEGER = 87;
	public static readonly HEX_INTEGER = 88;
	public static readonly BIN_INTEGER = 89;
	public static readonly FLOAT_NUMBER = 90;
	public static readonly LINE_JOIN = 91;
	public static readonly NEWLINE = 92;
	public static readonly WS = 93;
	public static readonly COMMENT = 94;
	public static readonly IDENTIFIER = 95;
	public static readonly LEFT_PAREN = 96;
	public static readonly RIGHT_PAREN = 97;
	public static override readonly EOF = Token.EOF;
	public static readonly RULE_program = 0;
	public static readonly RULE_statements = 1;
	public static readonly RULE_statement = 2;
	public static readonly RULE_simple_stmts = 3;
	public static readonly RULE_simple_stmt = 4;
	public static readonly RULE_or_expression = 5;
	public static readonly RULE_and_expression = 6;
	public static readonly RULE_not_expression = 7;
	public static readonly RULE_compound_stmt = 8;
	public static readonly RULE_conditional_expression = 9;
	public static readonly RULE_assignment = 10;
	public static readonly RULE_testlist_star_expr = 11;
	public static readonly RULE_test = 12;
	public static readonly RULE_expressions = 13;
	public static readonly RULE_expression = 14;
	public static readonly RULE_logical_test = 15;
	public static readonly RULE_comparison = 16;
	public static readonly RULE_sum = 17;
	public static readonly RULE_term = 18;
	public static readonly RULE_factor = 19;
	public static readonly RULE_power = 20;
	public static readonly RULE_await_primary = 21;
	public static readonly RULE_primary = 22;
	public static readonly RULE_slices = 23;
	public static readonly RULE_starred_expression = 24;
	public static readonly RULE_slice = 25;
	public static readonly RULE_value = 26;
	public static readonly RULE_if_stmt = 27;
	public static readonly RULE_elif_stmt = 28;
	public static readonly RULE_else_block = 29;
	public static readonly RULE_guard = 30;
	public static readonly RULE_named_expression = 31;
	public static readonly RULE_block = 32;
	public static readonly RULE_expr = 33;
	public static readonly RULE_for_stmt = 34;
	public static readonly RULE_while_stmt = 35;
	public static readonly RULE_exprlist = 36;
	public static readonly RULE_testlist = 37;
	public static readonly RULE_testlist_comp = 38;
	public static readonly RULE_star_expr = 39;
	public static readonly literalNames: (string | null)[] = [ null, null, 
                                                            null, "'def'", 
                                                            "'return'", 
                                                            "'raise'", "'from'", 
                                                            "'import'", 
                                                            "'nonlocal'", 
                                                            "'as'", "'global'", 
                                                            "'assert'", 
                                                            "'N\\u1EBFu'", 
                                                            "'Ng\\u01B0\\u1EE3c l\\u1EA1i n\\u1EBFu'", 
                                                            "'Ng\\u01B0\\u1EE3c l\\u1EA1i'", 
                                                            "'L\\u1EB7p'", 
                                                            "'Duy\\u1EC7t'", 
                                                            "'trong'", "'try'", 
                                                            "'None'", "'finally'", 
                                                            "'with'", "'except'", 
                                                            "'lambda'", 
                                                            "'or'", "'and'", 
                                                            "'not'", "'is'", 
                                                            "'class'", "'yield'", 
                                                            "'del'", "'pass'", 
                                                            "'continue'", 
                                                            "'break'", "'async'", 
                                                            "'await'", "'print'", 
                                                            "'exec'", "'True'", 
                                                            "'False'", "'.'", 
                                                            "'...'", "'`'", 
                                                            "'*'", "','", 
                                                            "':'", "';'", 
                                                            "'**'", "'='", 
                                                            "'|'", "'^'", 
                                                            "'&'", "'<<'", 
                                                            "'>>'", "'+'", 
                                                            "'-'", "'/'", 
                                                            "'%'", "'//'", 
                                                            "'~'", "'<'", 
                                                            "'>'", "'=='", 
                                                            "'>='", "'<='", 
                                                            "'<>'", "'!='", 
                                                            "'@'", "'->'", 
                                                            "'+='", "'-='", 
                                                            "'*='", "'@='", 
                                                            "'/='", "'%='", 
                                                            "'&='", "'|='", 
                                                            "'^='", "'<<='", 
                                                            "'>>='", "'**='", 
                                                            "'//='", "':='", 
                                                            "'['", "']'", 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, "'('", 
                                                            "')'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "INDENT", 
                                                             "DEDENT", "DEF", 
                                                             "RETURN", "RAISE", 
                                                             "FROM", "IMPORT", 
                                                             "NONLOCAL", 
                                                             "AS", "GLOBAL", 
                                                             "ASSERT", "IF", 
                                                             "ELIF", "ELSE", 
                                                             "WHILE", "FOR", 
                                                             "IN", "TRY", 
                                                             "NONE", "FINALLY", 
                                                             "WITH", "EXCEPT", 
                                                             "LAMBDA", "OR", 
                                                             "AND", "NOT", 
                                                             "IS", "CLASS", 
                                                             "YIELD", "DEL", 
                                                             "PASS", "CONTINUE", 
                                                             "BREAK", "ASYNC", 
                                                             "AWAIT", "PRINT", 
                                                             "EXEC", "TRUE", 
                                                             "FALSE", "DOT", 
                                                             "ELLIPSIS", 
                                                             "REVERSE_QUOTE", 
                                                             "STAR", "COMMA", 
                                                             "COLON", "SEMI_COLON", 
                                                             "POWER", "ASSIGN", 
                                                             "OR_OP", "XOR", 
                                                             "AND_OP", "LEFT_SHIFT", 
                                                             "RIGHT_SHIFT", 
                                                             "ADD", "MINUS", 
                                                             "DIV", "MOD", 
                                                             "IDIV", "NOT_OP", 
                                                             "LESS_THAN", 
                                                             "GREATER_THAN", 
                                                             "EQUALS", "GT_EQ", 
                                                             "LT_EQ", "NOT_EQ_1", 
                                                             "NOT_EQ_2", 
                                                             "AT", "ARROW", 
                                                             "ADD_ASSIGN", 
                                                             "SUB_ASSIGN", 
                                                             "MULT_ASSIGN", 
                                                             "AT_ASSIGN", 
                                                             "DIV_ASSIGN", 
                                                             "MOD_ASSIGN", 
                                                             "AND_ASSIGN", 
                                                             "OR_ASSIGN", 
                                                             "XOR_ASSIGN", 
                                                             "LEFT_SHIFT_ASSIGN", 
                                                             "RIGHT_SHIFT_ASSIGN", 
                                                             "POWER_ASSIGN", 
                                                             "IDIV_ASSIGN", 
                                                             "COLONEQUAL", 
                                                             "OPEN_BRACK", 
                                                             "CLOSE_BRACK", 
                                                             "STRING", "DECIMAL_INTEGER", 
                                                             "OCT_INTEGER", 
                                                             "HEX_INTEGER", 
                                                             "BIN_INTEGER", 
                                                             "FLOAT_NUMBER", 
                                                             "LINE_JOIN", 
                                                             "NEWLINE", 
                                                             "WS", "COMMENT", 
                                                             "IDENTIFIER", 
                                                             "LEFT_PAREN", 
                                                             "RIGHT_PAREN" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "statements", "statement", "simple_stmts", "simple_stmt", "or_expression", 
		"and_expression", "not_expression", "compound_stmt", "conditional_expression", 
		"assignment", "testlist_star_expr", "test", "expressions", "expression", 
		"logical_test", "comparison", "sum", "term", "factor", "power", "await_primary", 
		"primary", "slices", "starred_expression", "slice", "value", "if_stmt", 
		"elif_stmt", "else_block", "guard", "named_expression", "block", "expr", 
		"for_stmt", "while_stmt", "exprlist", "testlist", "testlist_comp", "star_expr",
	];
	public get grammarFileName(): string { return "CustomLangParser.g4"; }
	public get literalNames(): (string | null)[] { return CustomLangParser.literalNames; }
	public get symbolicNames(): (string | null)[] { return CustomLangParser.symbolicNames; }
	public get ruleNames(): string[] { return CustomLangParser.ruleNames; }
	public get serializedATN(): number[] { return CustomLangParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(this, CustomLangParser._ATN, CustomLangParser.DecisionsToDFA, new PredictionContextCache());
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let localctx: ProgramContext = new ProgramContext(this, this._ctx, this.state);
		this.enterRule(localctx, 0, CustomLangParser.RULE_program);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 82;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				this.state = 82;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 92:
					{
					this.state = 80;
					this.match(CustomLangParser.NEWLINE);
					}
					break;
				case 12:
				case 15:
				case 16:
				case 43:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 83:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 90:
				case 95:
					{
					this.state = 81;
					this.statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				this.state = 84;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (((((_la - 12)) & ~0x1F) === 0 && ((1 << (_la - 12)) & 2147483673) !== 0) || ((((_la - 69)) & ~0x1F) === 0 && ((1 << (_la - 69)) & 79650815) !== 0));
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public statements(): StatementsContext {
		let localctx: StatementsContext = new StatementsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 2, CustomLangParser.RULE_statements);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 87;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 86;
				this.statement();
				}
				}
				this.state = 89;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (((((_la - 12)) & ~0x1F) === 0 && ((1 << (_la - 12)) & 2147483673) !== 0) || ((((_la - 69)) & ~0x1F) === 0 && ((1 << (_la - 69)) & 71262207) !== 0));
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let localctx: StatementContext = new StatementContext(this, this._ctx, this.state);
		this.enterRule(localctx, 4, CustomLangParser.RULE_statement);
		try {
			this.state = 93;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 43:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 95:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 91;
				this.simple_stmts();
				}
				break;
			case 12:
			case 15:
			case 16:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 92;
				this.compound_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public simple_stmts(): Simple_stmtsContext {
		let localctx: Simple_stmtsContext = new Simple_stmtsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 6, CustomLangParser.RULE_simple_stmts);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 95;
			this.simple_stmt();
			this.state = 100;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 96;
					this.match(CustomLangParser.SEMI_COLON);
					this.state = 97;
					this.simple_stmt();
					}
					}
				}
				this.state = 102;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
			}
			this.state = 104;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===46) {
				{
				this.state = 103;
				this.match(CustomLangParser.SEMI_COLON);
				}
			}

			this.state = 106;
			_la = this._input.LA(1);
			if(!(_la===-1 || _la===92)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public simple_stmt(): Simple_stmtContext {
		let localctx: Simple_stmtContext = new Simple_stmtContext(this, this._ctx, this.state);
		this.enterRule(localctx, 8, CustomLangParser.RULE_simple_stmt);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 108;
			this.assignment();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public or_expression(): Or_expressionContext;
	public or_expression(_p: number): Or_expressionContext;
	// @RuleVersion(0)
	public or_expression(_p?: number): Or_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: Or_expressionContext = new Or_expressionContext(this, this._ctx, _parentState);
		let _prevctx: Or_expressionContext = localctx;
		let _startState: number = 10;
		this.enterRecursionRule(localctx, 10, CustomLangParser.RULE_or_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			{
			this.state = 111;
			this.and_expression(0);
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 118;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 6, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					{
					localctx = new Or_expressionContext(this, _parentctx, _parentState);
					this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_or_expression);
					this.state = 113;
					if (!(this.precpred(this._ctx, 2))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
					}
					this.state = 114;
					this.match(CustomLangParser.OR);
					this.state = 115;
					this.and_expression(0);
					}
					}
				}
				this.state = 120;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 6, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}

	public and_expression(): And_expressionContext;
	public and_expression(_p: number): And_expressionContext;
	// @RuleVersion(0)
	public and_expression(_p?: number): And_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: And_expressionContext = new And_expressionContext(this, this._ctx, _parentState);
		let _prevctx: And_expressionContext = localctx;
		let _startState: number = 12;
		this.enterRecursionRule(localctx, 12, CustomLangParser.RULE_and_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			{
			this.state = 122;
			this.not_expression();
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 129;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 7, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					{
					localctx = new And_expressionContext(this, _parentctx, _parentState);
					this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_and_expression);
					this.state = 124;
					if (!(this.precpred(this._ctx, 2))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
					}
					this.state = 125;
					this.match(CustomLangParser.AND);
					this.state = 126;
					this.not_expression();
					}
					}
				}
				this.state = 131;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 7, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}
	// @RuleVersion(0)
	public not_expression(): Not_expressionContext {
		let localctx: Not_expressionContext = new Not_expressionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 14, CustomLangParser.RULE_not_expression);
		try {
			this.state = 135;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 26:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 132;
				this.match(CustomLangParser.NOT);
				this.state = 133;
				this.not_expression();
				}
				break;
			case 54:
			case 55:
			case 59:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 95:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 134;
				this.comparison(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public compound_stmt(): Compound_stmtContext {
		let localctx: Compound_stmtContext = new Compound_stmtContext(this, this._ctx, this.state);
		this.enterRule(localctx, 16, CustomLangParser.RULE_compound_stmt);
		try {
			this.state = 140;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 12:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 137;
				this.if_stmt();
				}
				break;
			case 16:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 138;
				this.for_stmt();
				}
				break;
			case 15:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 139;
				this.while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public conditional_expression(): Conditional_expressionContext {
		let localctx: Conditional_expressionContext = new Conditional_expressionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 18, CustomLangParser.RULE_conditional_expression);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 142;
			this.comparison(0);
			this.state = 148;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 10, this._ctx) ) {
			case 1:
				{
				this.state = 143;
				this.match(CustomLangParser.IF);
				this.state = 144;
				this.comparison(0);
				this.state = 145;
				this.match(CustomLangParser.ELSE);
				this.state = 146;
				this.conditional_expression();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public assignment(): AssignmentContext {
		let localctx: AssignmentContext = new AssignmentContext(this, this._ctx, this.state);
		this.enterRule(localctx, 20, CustomLangParser.RULE_assignment);
		let _la: number;
		try {
			this.state = 162;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 43:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 95:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 150;
				this.testlist_star_expr();
				{
				this.state = 151;
				this.match(CustomLangParser.ASSIGN);
				{
				this.state = 152;
				this.testlist_star_expr();
				this.state = 157;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===48) {
					{
					{
					this.state = 153;
					this.match(CustomLangParser.ASSIGN);
					this.state = 154;
					this.testlist_star_expr();
					}
					}
					this.state = 159;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				}
				}
				break;
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 160;
				localctx._op = this._input.LT(1);
				_la = this._input.LA(1);
				if(!(((((_la - 69)) & ~0x1F) === 0 && ((1 << (_la - 69)) & 8191) !== 0))) {
				    localctx._op = this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				{
				this.state = 161;
				this.testlist();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public testlist_star_expr(): Testlist_star_exprContext {
		let localctx: Testlist_star_exprContext = new Testlist_star_exprContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, CustomLangParser.RULE_testlist_star_expr);
		try {
			let _alt: number;
			this.state = 179;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 16, this._ctx) ) {
			case 1:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 170;
				this._errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						this.state = 166;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case 83:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 90:
						case 95:
							{
							this.state = 164;
							this.test();
							}
							break;
						case 43:
							{
							this.state = 165;
							this.star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						this.state = 168;
						this.match(CustomLangParser.COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 172;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 14, this._ctx);
				} while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER);
				this.state = 176;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 83:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 90:
				case 95:
					{
					this.state = 174;
					this.test();
					}
					break;
				case 43:
					{
					this.state = 175;
					this.star_expr();
					}
					break;
				case -1:
				case 46:
				case 48:
				case 92:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 178;
				this.testlist();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public test(): TestContext {
		let localctx: TestContext = new TestContext(this, this._ctx, this.state);
		this.enterRule(localctx, 24, CustomLangParser.RULE_test);
		try {
			this.state = 183;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 95:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 181;
				this.match(CustomLangParser.IDENTIFIER);
				}
				break;
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 182;
				this.value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public expressions(): ExpressionsContext {
		let localctx: ExpressionsContext = new ExpressionsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 26, CustomLangParser.RULE_expressions);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 185;
			this.expression();
			this.state = 190;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 18, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 186;
					this.match(CustomLangParser.COMMA);
					this.state = 187;
					this.expression();
					}
					}
				}
				this.state = 192;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 18, this._ctx);
			}
			this.state = 194;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===44) {
				{
				this.state = 193;
				this.match(CustomLangParser.COMMA);
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public expression(): ExpressionContext {
		let localctx: ExpressionContext = new ExpressionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 28, CustomLangParser.RULE_expression);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 196;
			this.logical_test(0);
			this.state = 202;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===12) {
				{
				this.state = 197;
				this.match(CustomLangParser.IF);
				this.state = 198;
				this.logical_test(0);
				this.state = 199;
				this.match(CustomLangParser.ELSE);
				this.state = 200;
				this.expression();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public logical_test(): Logical_testContext;
	public logical_test(_p: number): Logical_testContext;
	// @RuleVersion(0)
	public logical_test(_p?: number): Logical_testContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: Logical_testContext = new Logical_testContext(this, this._ctx, _parentState);
		let _prevctx: Logical_testContext = localctx;
		let _startState: number = 30;
		this.enterRecursionRule(localctx, 30, CustomLangParser.RULE_logical_test, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 208;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 54:
			case 55:
			case 59:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 95:
				{
				this.state = 205;
				this.comparison(0);
				}
				break;
			case 26:
				{
				this.state = 206;
				this.match(CustomLangParser.NOT);
				this.state = 207;
				this.logical_test(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 218;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 23, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					this.state = 216;
					this._errHandler.sync(this);
					switch ( this._interp.adaptivePredict(this._input, 22, this._ctx) ) {
					case 1:
						{
						localctx = new Logical_testContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_logical_test);
						this.state = 210;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 211;
						localctx._op = this.match(CustomLangParser.AND);
						this.state = 212;
						this.logical_test(3);
						}
						break;
					case 2:
						{
						localctx = new Logical_testContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_logical_test);
						this.state = 213;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 214;
						localctx._op = this.match(CustomLangParser.OR);
						this.state = 215;
						this.logical_test(2);
						}
						break;
					}
					}
				}
				this.state = 220;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 23, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}

	public comparison(): ComparisonContext;
	public comparison(_p: number): ComparisonContext;
	// @RuleVersion(0)
	public comparison(_p?: number): ComparisonContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: ComparisonContext = new ComparisonContext(this, this._ctx, _parentState);
		let _prevctx: ComparisonContext = localctx;
		let _startState: number = 32;
		this.enterRecursionRule(localctx, 32, CustomLangParser.RULE_comparison, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			{
			this.state = 222;
			this.expr(0);
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 245;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 27, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					{
					localctx = new ComparisonContext(this, _parentctx, _parentState);
					this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_comparison);
					this.state = 224;
					if (!(this.precpred(this._ctx, 2))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
					}
					this.state = 240;
					this._errHandler.sync(this);
					switch (this._input.LA(1)) {
					case 60:
						{
						this.state = 225;
						this.match(CustomLangParser.LESS_THAN);
						}
						break;
					case 61:
						{
						this.state = 226;
						this.match(CustomLangParser.GREATER_THAN);
						}
						break;
					case 62:
						{
						this.state = 227;
						this.match(CustomLangParser.EQUALS);
						}
						break;
					case 63:
						{
						this.state = 228;
						this.match(CustomLangParser.GT_EQ);
						}
						break;
					case 64:
						{
						this.state = 229;
						this.match(CustomLangParser.LT_EQ);
						}
						break;
					case 65:
						{
						this.state = 230;
						this.match(CustomLangParser.NOT_EQ_1);
						}
						break;
					case 66:
						{
						this.state = 231;
						this.match(CustomLangParser.NOT_EQ_2);
						}
						break;
					case 17:
					case 26:
						{
						this.state = 233;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la===26) {
							{
							this.state = 232;
							localctx._optional = this.match(CustomLangParser.NOT);
							}
						}

						this.state = 235;
						this.match(CustomLangParser.IN);
						}
						break;
					case 27:
						{
						this.state = 236;
						this.match(CustomLangParser.IS);
						this.state = 238;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la===26) {
							{
							this.state = 237;
							localctx._optional = this.match(CustomLangParser.NOT);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					this.state = 242;
					this.comparison(3);
					}
					}
				}
				this.state = 247;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 27, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}

	public sum(): SumContext;
	public sum(_p: number): SumContext;
	// @RuleVersion(0)
	public sum(_p?: number): SumContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: SumContext = new SumContext(this, this._ctx, _parentState);
		let _prevctx: SumContext = localctx;
		let _startState: number = 34;
		this.enterRecursionRule(localctx, 34, CustomLangParser.RULE_sum, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			{
			this.state = 249;
			this.term(0);
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 256;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 28, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					{
					localctx = new SumContext(this, _parentctx, _parentState);
					this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_sum);
					this.state = 251;
					if (!(this.precpred(this._ctx, 2))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
					}
					this.state = 252;
					_la = this._input.LA(1);
					if(!(_la===54 || _la===55)) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					this.state = 253;
					this.term(0);
					}
					}
				}
				this.state = 258;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 28, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}

	public term(): TermContext;
	public term(_p: number): TermContext;
	// @RuleVersion(0)
	public term(_p?: number): TermContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: TermContext = new TermContext(this, this._ctx, _parentState);
		let _prevctx: TermContext = localctx;
		let _startState: number = 36;
		this.enterRecursionRule(localctx, 36, CustomLangParser.RULE_term, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			{
			this.state = 260;
			this.factor();
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 267;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 29, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					{
					localctx = new TermContext(this, _parentctx, _parentState);
					this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_term);
					this.state = 262;
					if (!(this.precpred(this._ctx, 2))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
					}
					this.state = 263;
					_la = this._input.LA(1);
					if(!(((((_la - 43)) & ~0x1F) === 0 && ((1 << (_la - 43)) & 16834561) !== 0))) {
					this._errHandler.recoverInline(this);
					}
					else {
						this._errHandler.reportMatch(this);
					    this.consume();
					}
					this.state = 264;
					this.factor();
					}
					}
				}
				this.state = 269;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 29, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}
	// @RuleVersion(0)
	public factor(): FactorContext {
		let localctx: FactorContext = new FactorContext(this, this._ctx, this.state);
		this.enterRule(localctx, 38, CustomLangParser.RULE_factor);
		try {
			this.state = 277;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 54:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 270;
				this.match(CustomLangParser.ADD);
				this.state = 271;
				this.factor();
				}
				break;
			case 55:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 272;
				this.match(CustomLangParser.MINUS);
				this.state = 273;
				this.factor();
				}
				break;
			case 59:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 274;
				this.match(CustomLangParser.NOT_OP);
				this.state = 275;
				this.factor();
				}
				break;
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 276;
				this.power();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public power(): PowerContext {
		let localctx: PowerContext = new PowerContext(this, this._ctx, this.state);
		this.enterRule(localctx, 40, CustomLangParser.RULE_power);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 279;
			this.await_primary();
			this.state = 282;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 31, this._ctx) ) {
			case 1:
				{
				this.state = 280;
				this.match(CustomLangParser.POWER);
				this.state = 281;
				this.factor();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public await_primary(): Await_primaryContext {
		let localctx: Await_primaryContext = new Await_primaryContext(this, this._ctx, this.state);
		this.enterRule(localctx, 42, CustomLangParser.RULE_await_primary);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 284;
			this.primary(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public primary(): PrimaryContext;
	public primary(_p: number): PrimaryContext;
	// @RuleVersion(0)
	public primary(_p?: number): PrimaryContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: PrimaryContext = new PrimaryContext(this, this._ctx, _parentState);
		let _prevctx: PrimaryContext = localctx;
		let _startState: number = 44;
		this.enterRecursionRule(localctx, 44, CustomLangParser.RULE_primary, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 292;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 32, this._ctx) ) {
			case 1:
				{
				this.state = 287;
				this.value();
				}
				break;
			case 2:
				{
				this.state = 288;
				this.match(CustomLangParser.OPEN_BRACK);
				this.state = 289;
				this.slices();
				this.state = 290;
				this.match(CustomLangParser.CLOSE_BRACK);
				}
				break;
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 298;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 33, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					{
					localctx = new PrimaryContext(this, _parentctx, _parentState);
					this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_primary);
					this.state = 294;
					if (!(this.precpred(this._ctx, 3))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
					}
					{
					this.state = 295;
					this.match(CustomLangParser.IDENTIFIER);
					}
					}
					}
				}
				this.state = 300;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 33, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}
	// @RuleVersion(0)
	public slices(): SlicesContext {
		let localctx: SlicesContext = new SlicesContext(this, this._ctx, this.state);
		this.enterRule(localctx, 46, CustomLangParser.RULE_slices);
		let _la: number;
		try {
			let _alt: number;
			this.state = 319;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 38, this._ctx) ) {
			case 1:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 301;
				this.slice();
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 304;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 26:
				case 45:
				case 54:
				case 55:
				case 59:
				case 83:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 90:
				case 95:
					{
					this.state = 302;
					this.slice();
					}
					break;
				case 43:
					{
					this.state = 303;
					this.starred_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				this.state = 313;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 36, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 306;
						this.match(CustomLangParser.COMMA);
						this.state = 309;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case 26:
						case 45:
						case 54:
						case 55:
						case 59:
						case 83:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 90:
						case 95:
							{
							this.state = 307;
							this.slice();
							}
							break;
						case 43:
							{
							this.state = 308;
							this.starred_expression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
					}
					this.state = 315;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 36, this._ctx);
				}
				this.state = 317;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===44) {
					{
					this.state = 316;
					this.match(CustomLangParser.COMMA);
					}
				}

				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public starred_expression(): Starred_expressionContext {
		let localctx: Starred_expressionContext = new Starred_expressionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 48, CustomLangParser.RULE_starred_expression);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 321;
			this.match(CustomLangParser.STAR);
			this.state = 322;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public slice(): SliceContext {
		let localctx: SliceContext = new SliceContext(this, this._ctx, this.state);
		this.enterRule(localctx, 50, CustomLangParser.RULE_slice);
		let _la: number;
		try {
			this.state = 338;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 43, this._ctx) ) {
			case 1:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 325;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===26 || ((((_la - 54)) & ~0x1F) === 0 && ((1 << (_la - 54)) & 2684354595) !== 0) || ((((_la - 86)) & ~0x1F) === 0 && ((1 << (_la - 86)) & 543) !== 0)) {
					{
					this.state = 324;
					this.expression();
					}
				}

				this.state = 327;
				this.match(CustomLangParser.COLON);
				this.state = 329;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===26 || ((((_la - 54)) & ~0x1F) === 0 && ((1 << (_la - 54)) & 2684354595) !== 0) || ((((_la - 86)) & ~0x1F) === 0 && ((1 << (_la - 86)) & 543) !== 0)) {
					{
					this.state = 328;
					this.expression();
					}
				}

				this.state = 335;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===45) {
					{
					this.state = 331;
					this.match(CustomLangParser.COLON);
					this.state = 333;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la===26 || ((((_la - 54)) & ~0x1F) === 0 && ((1 << (_la - 54)) & 2684354595) !== 0) || ((((_la - 86)) & ~0x1F) === 0 && ((1 << (_la - 86)) & 543) !== 0)) {
						{
						this.state = 332;
						this.expression();
						}
					}

					}
				}

				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 337;
				this.named_expression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public value(): ValueContext {
		let localctx: ValueContext = new ValueContext(this, this._ctx, this.state);
		this.enterRule(localctx, 52, CustomLangParser.RULE_value);
		let _la: number;
		try {
			this.state = 351;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 85:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 340;
				this.match(CustomLangParser.STRING);
				}
				break;
			case 86:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 341;
				this.match(CustomLangParser.DECIMAL_INTEGER);
				}
				break;
			case 87:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 342;
				this.match(CustomLangParser.OCT_INTEGER);
				}
				break;
			case 88:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 343;
				this.match(CustomLangParser.HEX_INTEGER);
				}
				break;
			case 89:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 344;
				this.match(CustomLangParser.BIN_INTEGER);
				}
				break;
			case 90:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 345;
				this.match(CustomLangParser.FLOAT_NUMBER);
				}
				break;
			case 83:
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 346;
				this.match(CustomLangParser.OPEN_BRACK);
				this.state = 348;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===43 || ((((_la - 83)) & ~0x1F) === 0 && ((1 << (_la - 83)) & 4349) !== 0)) {
					{
					this.state = 347;
					this.testlist_comp();
					}
				}

				this.state = 350;
				this.match(CustomLangParser.CLOSE_BRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public if_stmt(): If_stmtContext {
		let localctx: If_stmtContext = new If_stmtContext(this, this._ctx, this.state);
		this.enterRule(localctx, 54, CustomLangParser.RULE_if_stmt);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 353;
			this.match(CustomLangParser.IF);
			this.state = 354;
			this.named_expression();
			this.state = 355;
			this.match(CustomLangParser.COLON);
			this.state = 356;
			this.block();
			this.state = 361;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 13:
				{
				this.state = 357;
				this.elif_stmt();
				}
				break;
			case -1:
			case 2:
			case 12:
			case 14:
			case 15:
			case 16:
			case 43:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 92:
			case 95:
				{
				this.state = 359;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===14) {
					{
					this.state = 358;
					this.else_block();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public elif_stmt(): Elif_stmtContext {
		let localctx: Elif_stmtContext = new Elif_stmtContext(this, this._ctx, this.state);
		this.enterRule(localctx, 56, CustomLangParser.RULE_elif_stmt);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 363;
			this.match(CustomLangParser.ELIF);
			this.state = 364;
			this.named_expression();
			this.state = 365;
			this.match(CustomLangParser.COLON);
			this.state = 366;
			this.block();
			this.state = 371;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 13:
				{
				this.state = 367;
				this.elif_stmt();
				}
				break;
			case -1:
			case 2:
			case 12:
			case 14:
			case 15:
			case 16:
			case 43:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 92:
			case 95:
				{
				this.state = 369;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===14) {
					{
					this.state = 368;
					this.else_block();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public else_block(): Else_blockContext {
		let localctx: Else_blockContext = new Else_blockContext(this, this._ctx, this.state);
		this.enterRule(localctx, 58, CustomLangParser.RULE_else_block);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 373;
			this.match(CustomLangParser.ELSE);
			this.state = 374;
			this.match(CustomLangParser.COLON);
			this.state = 375;
			this.block();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public guard(): GuardContext {
		let localctx: GuardContext = new GuardContext(this, this._ctx, this.state);
		this.enterRule(localctx, 60, CustomLangParser.RULE_guard);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 377;
			this.match(CustomLangParser.IF);
			this.state = 378;
			this.named_expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public named_expression(): Named_expressionContext {
		let localctx: Named_expressionContext = new Named_expressionContext(this, this._ctx, this.state);
		this.enterRule(localctx, 62, CustomLangParser.RULE_named_expression);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 380;
			this.expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public block(): BlockContext {
		let localctx: BlockContext = new BlockContext(this, this._ctx, this.state);
		this.enterRule(localctx, 64, CustomLangParser.RULE_block);
		try {
			this.state = 388;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 92:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 382;
				this.match(CustomLangParser.NEWLINE);
				this.state = 383;
				this.match(CustomLangParser.INDENT);
				this.state = 384;
				this.statements();
				this.state = 385;
				this.match(CustomLangParser.DEDENT);
				}
				break;
			case 43:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 95:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 387;
				this.simple_stmts();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public expr(): ExprContext;
	public expr(_p: number): ExprContext;
	// @RuleVersion(0)
	public expr(_p?: number): ExprContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: ExprContext = new ExprContext(this, this._ctx, _parentState);
		let _prevctx: ExprContext = localctx;
		let _startState: number = 66;
		this.enterRecursionRule(localctx, 66, CustomLangParser.RULE_expr, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 395;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
				{
				this.state = 391;
				this.value();
				}
				break;
			case 54:
			case 55:
			case 59:
				{
				this.state = 392;
				localctx._op = this._input.LT(1);
				_la = this._input.LA(1);
				if(!(((((_la - 54)) & ~0x1F) === 0 && ((1 << (_la - 54)) & 35) !== 0))) {
				    localctx._op = this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 393;
				this.expr(8);
				}
				break;
			case 95:
				{
				this.state = 394;
				this.match(CustomLangParser.IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 417;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 53, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					this.state = 415;
					this._errHandler.sync(this);
					switch ( this._interp.adaptivePredict(this._input, 52, this._ctx) ) {
					case 1:
						{
						localctx = new ExprContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_expr);
						this.state = 397;
						if (!(this.precpred(this._ctx, 7))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 7)");
						}
						this.state = 398;
						localctx._op = this._input.LT(1);
						_la = this._input.LA(1);
						if(!(((((_la - 43)) & ~0x1F) === 0 && ((1 << (_la - 43)) & 16834561) !== 0))) {
						    localctx._op = this._errHandler.recoverInline(this);
						}
						else {
							this._errHandler.reportMatch(this);
						    this.consume();
						}
						this.state = 399;
						this.expr(8);
						}
						break;
					case 2:
						{
						localctx = new ExprContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_expr);
						this.state = 400;
						if (!(this.precpred(this._ctx, 6))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 6)");
						}
						this.state = 401;
						localctx._op = this._input.LT(1);
						_la = this._input.LA(1);
						if(!(_la===54 || _la===55)) {
						    localctx._op = this._errHandler.recoverInline(this);
						}
						else {
							this._errHandler.reportMatch(this);
						    this.consume();
						}
						this.state = 402;
						this.expr(7);
						}
						break;
					case 3:
						{
						localctx = new ExprContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_expr);
						this.state = 403;
						if (!(this.precpred(this._ctx, 5))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 5)");
						}
						this.state = 404;
						localctx._op = this._input.LT(1);
						_la = this._input.LA(1);
						if(!(_la===52 || _la===53)) {
						    localctx._op = this._errHandler.recoverInline(this);
						}
						else {
							this._errHandler.reportMatch(this);
						    this.consume();
						}
						this.state = 405;
						this.expr(6);
						}
						break;
					case 4:
						{
						localctx = new ExprContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_expr);
						this.state = 406;
						if (!(this.precpred(this._ctx, 4))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 4)");
						}
						this.state = 407;
						localctx._op = this.match(CustomLangParser.AND_OP);
						this.state = 408;
						this.expr(5);
						}
						break;
					case 5:
						{
						localctx = new ExprContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_expr);
						this.state = 409;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 410;
						localctx._op = this.match(CustomLangParser.XOR);
						this.state = 411;
						this.expr(4);
						}
						break;
					case 6:
						{
						localctx = new ExprContext(this, _parentctx, _parentState);
						this.pushNewRecursionContext(localctx, _startState, CustomLangParser.RULE_expr);
						this.state = 412;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 413;
						localctx._op = this.match(CustomLangParser.OR_OP);
						this.state = 414;
						this.expr(3);
						}
						break;
					}
					}
				}
				this.state = 419;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 53, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}
	// @RuleVersion(0)
	public for_stmt(): For_stmtContext {
		let localctx: For_stmtContext = new For_stmtContext(this, this._ctx, this.state);
		this.enterRule(localctx, 68, CustomLangParser.RULE_for_stmt);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 420;
			this.match(CustomLangParser.FOR);
			this.state = 421;
			this.exprlist();
			this.state = 422;
			this.match(CustomLangParser.IN);
			this.state = 423;
			this.testlist();
			this.state = 424;
			this.match(CustomLangParser.COLON);
			this.state = 425;
			this.block();
			this.state = 429;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===14) {
				{
				this.state = 426;
				this.match(CustomLangParser.ELSE);
				this.state = 427;
				this.match(CustomLangParser.COLON);
				this.state = 428;
				this.block();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public while_stmt(): While_stmtContext {
		let localctx: While_stmtContext = new While_stmtContext(this, this._ctx, this.state);
		this.enterRule(localctx, 70, CustomLangParser.RULE_while_stmt);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 431;
			this.match(CustomLangParser.WHILE);
			this.state = 432;
			this.named_expression();
			this.state = 433;
			this.match(CustomLangParser.COLON);
			this.state = 434;
			this.block();
			this.state = 436;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===14) {
				{
				this.state = 435;
				this.else_block();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public exprlist(): ExprlistContext {
		let localctx: ExprlistContext = new ExprlistContext(this, this._ctx, this.state);
		this.enterRule(localctx, 72, CustomLangParser.RULE_exprlist);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 438;
			this.expr(0);
			this.state = 443;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 56, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 439;
					this.match(CustomLangParser.COMMA);
					this.state = 440;
					this.expr(0);
					}
					}
				}
				this.state = 445;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 56, this._ctx);
			}
			this.state = 447;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===44) {
				{
				this.state = 446;
				this.match(CustomLangParser.COMMA);
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public testlist(): TestlistContext {
		let localctx: TestlistContext = new TestlistContext(this, this._ctx, this.state);
		this.enterRule(localctx, 74, CustomLangParser.RULE_testlist);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 449;
			this.test();
			this.state = 454;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 58, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 450;
					this.match(CustomLangParser.COMMA);
					this.state = 451;
					this.test();
					}
					}
				}
				this.state = 456;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 58, this._ctx);
			}
			this.state = 458;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la===44) {
				{
				this.state = 457;
				this.match(CustomLangParser.COMMA);
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public testlist_comp(): Testlist_compContext {
		let localctx: Testlist_compContext = new Testlist_compContext(this, this._ctx, this.state);
		this.enterRule(localctx, 76, CustomLangParser.RULE_testlist_comp);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 462;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 83:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 95:
				{
				this.state = 460;
				this.test();
				}
				break;
			case 43:
				{
				this.state = 461;
				this.star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 478;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 16:
				{
				this.state = 464;
				this.for_stmt();
				}
				break;
			case 44:
			case 84:
				{
				this.state = 472;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 62, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 465;
						this.match(CustomLangParser.COMMA);
						this.state = 468;
						this._errHandler.sync(this);
						switch (this._input.LA(1)) {
						case 83:
						case 85:
						case 86:
						case 87:
						case 88:
						case 89:
						case 90:
						case 95:
							{
							this.state = 466;
							this.test();
							}
							break;
						case 43:
							{
							this.state = 467;
							this.star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
					}
					this.state = 474;
					this._errHandler.sync(this);
					_alt = this._interp.adaptivePredict(this._input, 62, this._ctx);
				}
				this.state = 476;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===44) {
					{
					this.state = 475;
					this.match(CustomLangParser.COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public star_expr(): Star_exprContext {
		let localctx: Star_exprContext = new Star_exprContext(this, this._ctx, this.state);
		this.enterRule(localctx, 78, CustomLangParser.RULE_star_expr);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 480;
			this.match(CustomLangParser.STAR);
			this.state = 481;
			this.expr(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public sempred(localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 5:
			return this.or_expression_sempred(localctx as Or_expressionContext, predIndex);
		case 6:
			return this.and_expression_sempred(localctx as And_expressionContext, predIndex);
		case 15:
			return this.logical_test_sempred(localctx as Logical_testContext, predIndex);
		case 16:
			return this.comparison_sempred(localctx as ComparisonContext, predIndex);
		case 17:
			return this.sum_sempred(localctx as SumContext, predIndex);
		case 18:
			return this.term_sempred(localctx as TermContext, predIndex);
		case 22:
			return this.primary_sempred(localctx as PrimaryContext, predIndex);
		case 33:
			return this.expr_sempred(localctx as ExprContext, predIndex);
		}
		return true;
	}
	private or_expression_sempred(localctx: Or_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}
	private and_expression_sempred(localctx: And_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 1:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}
	private logical_test_sempred(localctx: Logical_testContext, predIndex: number): boolean {
		switch (predIndex) {
		case 2:
			return this.precpred(this._ctx, 2);
		case 3:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private comparison_sempred(localctx: ComparisonContext, predIndex: number): boolean {
		switch (predIndex) {
		case 4:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}
	private sum_sempred(localctx: SumContext, predIndex: number): boolean {
		switch (predIndex) {
		case 5:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}
	private term_sempred(localctx: TermContext, predIndex: number): boolean {
		switch (predIndex) {
		case 6:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}
	private primary_sempred(localctx: PrimaryContext, predIndex: number): boolean {
		switch (predIndex) {
		case 7:
			return this.precpred(this._ctx, 3);
		}
		return true;
	}
	private expr_sempred(localctx: ExprContext, predIndex: number): boolean {
		switch (predIndex) {
		case 8:
			return this.precpred(this._ctx, 7);
		case 9:
			return this.precpred(this._ctx, 6);
		case 10:
			return this.precpred(this._ctx, 5);
		case 11:
			return this.precpred(this._ctx, 4);
		case 12:
			return this.precpred(this._ctx, 3);
		case 13:
			return this.precpred(this._ctx, 2);
		}
		return true;
	}

	public static readonly _serializedATN: number[] = [4,1,97,484,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,
	10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,
	7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,
	24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,
	2,32,7,32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
	39,7,39,1,0,1,0,4,0,83,8,0,11,0,12,0,84,1,1,4,1,88,8,1,11,1,12,1,89,1,2,
	1,2,3,2,94,8,2,1,3,1,3,1,3,5,3,99,8,3,10,3,12,3,102,9,3,1,3,3,3,105,8,3,
	1,3,1,3,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,5,5,117,8,5,10,5,12,5,120,9,5,1,
	6,1,6,1,6,1,6,1,6,1,6,5,6,128,8,6,10,6,12,6,131,9,6,1,7,1,7,1,7,3,7,136,
	8,7,1,8,1,8,1,8,3,8,141,8,8,1,9,1,9,1,9,1,9,1,9,1,9,3,9,149,8,9,1,10,1,
	10,1,10,1,10,1,10,5,10,156,8,10,10,10,12,10,159,9,10,1,10,1,10,3,10,163,
	8,10,1,11,1,11,3,11,167,8,11,1,11,1,11,4,11,171,8,11,11,11,12,11,172,1,
	11,1,11,3,11,177,8,11,1,11,3,11,180,8,11,1,12,1,12,3,12,184,8,12,1,13,1,
	13,1,13,5,13,189,8,13,10,13,12,13,192,9,13,1,13,3,13,195,8,13,1,14,1,14,
	1,14,1,14,1,14,1,14,3,14,203,8,14,1,15,1,15,1,15,1,15,3,15,209,8,15,1,15,
	1,15,1,15,1,15,1,15,1,15,5,15,217,8,15,10,15,12,15,220,9,15,1,16,1,16,1,
	16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,3,16,234,8,16,1,16,1,16,
	1,16,3,16,239,8,16,3,16,241,8,16,1,16,5,16,244,8,16,10,16,12,16,247,9,16,
	1,17,1,17,1,17,1,17,1,17,1,17,5,17,255,8,17,10,17,12,17,258,9,17,1,18,1,
	18,1,18,1,18,1,18,1,18,5,18,266,8,18,10,18,12,18,269,9,18,1,19,1,19,1,19,
	1,19,1,19,1,19,1,19,3,19,278,8,19,1,20,1,20,1,20,3,20,283,8,20,1,21,1,21,
	1,22,1,22,1,22,1,22,1,22,1,22,3,22,293,8,22,1,22,1,22,5,22,297,8,22,10,
	22,12,22,300,9,22,1,23,1,23,1,23,3,23,305,8,23,1,23,1,23,1,23,3,23,310,
	8,23,5,23,312,8,23,10,23,12,23,315,9,23,1,23,3,23,318,8,23,3,23,320,8,23,
	1,24,1,24,1,24,1,25,3,25,326,8,25,1,25,1,25,3,25,330,8,25,1,25,1,25,3,25,
	334,8,25,3,25,336,8,25,1,25,3,25,339,8,25,1,26,1,26,1,26,1,26,1,26,1,26,
	1,26,1,26,3,26,349,8,26,1,26,3,26,352,8,26,1,27,1,27,1,27,1,27,1,27,1,27,
	3,27,360,8,27,3,27,362,8,27,1,28,1,28,1,28,1,28,1,28,1,28,3,28,370,8,28,
	3,28,372,8,28,1,29,1,29,1,29,1,29,1,30,1,30,1,30,1,31,1,31,1,32,1,32,1,
	32,1,32,1,32,1,32,3,32,389,8,32,1,33,1,33,1,33,1,33,1,33,3,33,396,8,33,
	1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,
	33,1,33,1,33,1,33,5,33,416,8,33,10,33,12,33,419,9,33,1,34,1,34,1,34,1,34,
	1,34,1,34,1,34,1,34,1,34,3,34,430,8,34,1,35,1,35,1,35,1,35,1,35,3,35,437,
	8,35,1,36,1,36,1,36,5,36,442,8,36,10,36,12,36,445,9,36,1,36,3,36,448,8,
	36,1,37,1,37,1,37,5,37,453,8,37,10,37,12,37,456,9,37,1,37,3,37,459,8,37,
	1,38,1,38,3,38,463,8,38,1,38,1,38,1,38,1,38,3,38,469,8,38,5,38,471,8,38,
	10,38,12,38,474,9,38,1,38,3,38,477,8,38,3,38,479,8,38,1,39,1,39,1,39,1,
	39,0,8,10,12,30,32,34,36,44,66,40,0,2,4,6,8,10,12,14,16,18,20,22,24,26,
	28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,
	76,78,0,6,1,1,92,92,1,0,69,81,1,0,54,55,3,0,43,43,56,58,67,67,2,0,54,55,
	59,59,1,0,52,53,529,0,82,1,0,0,0,2,87,1,0,0,0,4,93,1,0,0,0,6,95,1,0,0,0,
	8,108,1,0,0,0,10,110,1,0,0,0,12,121,1,0,0,0,14,135,1,0,0,0,16,140,1,0,0,
	0,18,142,1,0,0,0,20,162,1,0,0,0,22,179,1,0,0,0,24,183,1,0,0,0,26,185,1,
	0,0,0,28,196,1,0,0,0,30,208,1,0,0,0,32,221,1,0,0,0,34,248,1,0,0,0,36,259,
	1,0,0,0,38,277,1,0,0,0,40,279,1,0,0,0,42,284,1,0,0,0,44,292,1,0,0,0,46,
	319,1,0,0,0,48,321,1,0,0,0,50,338,1,0,0,0,52,351,1,0,0,0,54,353,1,0,0,0,
	56,363,1,0,0,0,58,373,1,0,0,0,60,377,1,0,0,0,62,380,1,0,0,0,64,388,1,0,
	0,0,66,395,1,0,0,0,68,420,1,0,0,0,70,431,1,0,0,0,72,438,1,0,0,0,74,449,
	1,0,0,0,76,462,1,0,0,0,78,480,1,0,0,0,80,83,5,92,0,0,81,83,3,4,2,0,82,80,
	1,0,0,0,82,81,1,0,0,0,83,84,1,0,0,0,84,82,1,0,0,0,84,85,1,0,0,0,85,1,1,
	0,0,0,86,88,3,4,2,0,87,86,1,0,0,0,88,89,1,0,0,0,89,87,1,0,0,0,89,90,1,0,
	0,0,90,3,1,0,0,0,91,94,3,6,3,0,92,94,3,16,8,0,93,91,1,0,0,0,93,92,1,0,0,
	0,94,5,1,0,0,0,95,100,3,8,4,0,96,97,5,46,0,0,97,99,3,8,4,0,98,96,1,0,0,
	0,99,102,1,0,0,0,100,98,1,0,0,0,100,101,1,0,0,0,101,104,1,0,0,0,102,100,
	1,0,0,0,103,105,5,46,0,0,104,103,1,0,0,0,104,105,1,0,0,0,105,106,1,0,0,
	0,106,107,7,0,0,0,107,7,1,0,0,0,108,109,3,20,10,0,109,9,1,0,0,0,110,111,
	6,5,-1,0,111,112,3,12,6,0,112,118,1,0,0,0,113,114,10,2,0,0,114,115,5,24,
	0,0,115,117,3,12,6,0,116,113,1,0,0,0,117,120,1,0,0,0,118,116,1,0,0,0,118,
	119,1,0,0,0,119,11,1,0,0,0,120,118,1,0,0,0,121,122,6,6,-1,0,122,123,3,14,
	7,0,123,129,1,0,0,0,124,125,10,2,0,0,125,126,5,25,0,0,126,128,3,14,7,0,
	127,124,1,0,0,0,128,131,1,0,0,0,129,127,1,0,0,0,129,130,1,0,0,0,130,13,
	1,0,0,0,131,129,1,0,0,0,132,133,5,26,0,0,133,136,3,14,7,0,134,136,3,32,
	16,0,135,132,1,0,0,0,135,134,1,0,0,0,136,15,1,0,0,0,137,141,3,54,27,0,138,
	141,3,68,34,0,139,141,3,70,35,0,140,137,1,0,0,0,140,138,1,0,0,0,140,139,
	1,0,0,0,141,17,1,0,0,0,142,148,3,32,16,0,143,144,5,12,0,0,144,145,3,32,
	16,0,145,146,5,14,0,0,146,147,3,18,9,0,147,149,1,0,0,0,148,143,1,0,0,0,
	148,149,1,0,0,0,149,19,1,0,0,0,150,151,3,22,11,0,151,152,5,48,0,0,152,157,
	3,22,11,0,153,154,5,48,0,0,154,156,3,22,11,0,155,153,1,0,0,0,156,159,1,
	0,0,0,157,155,1,0,0,0,157,158,1,0,0,0,158,163,1,0,0,0,159,157,1,0,0,0,160,
	161,7,1,0,0,161,163,3,74,37,0,162,150,1,0,0,0,162,160,1,0,0,0,163,21,1,
	0,0,0,164,167,3,24,12,0,165,167,3,78,39,0,166,164,1,0,0,0,166,165,1,0,0,
	0,167,168,1,0,0,0,168,169,5,44,0,0,169,171,1,0,0,0,170,166,1,0,0,0,171,
	172,1,0,0,0,172,170,1,0,0,0,172,173,1,0,0,0,173,176,1,0,0,0,174,177,3,24,
	12,0,175,177,3,78,39,0,176,174,1,0,0,0,176,175,1,0,0,0,176,177,1,0,0,0,
	177,180,1,0,0,0,178,180,3,74,37,0,179,170,1,0,0,0,179,178,1,0,0,0,180,23,
	1,0,0,0,181,184,5,95,0,0,182,184,3,52,26,0,183,181,1,0,0,0,183,182,1,0,
	0,0,184,25,1,0,0,0,185,190,3,28,14,0,186,187,5,44,0,0,187,189,3,28,14,0,
	188,186,1,0,0,0,189,192,1,0,0,0,190,188,1,0,0,0,190,191,1,0,0,0,191,194,
	1,0,0,0,192,190,1,0,0,0,193,195,5,44,0,0,194,193,1,0,0,0,194,195,1,0,0,
	0,195,27,1,0,0,0,196,202,3,30,15,0,197,198,5,12,0,0,198,199,3,30,15,0,199,
	200,5,14,0,0,200,201,3,28,14,0,201,203,1,0,0,0,202,197,1,0,0,0,202,203,
	1,0,0,0,203,29,1,0,0,0,204,205,6,15,-1,0,205,209,3,32,16,0,206,207,5,26,
	0,0,207,209,3,30,15,3,208,204,1,0,0,0,208,206,1,0,0,0,209,218,1,0,0,0,210,
	211,10,2,0,0,211,212,5,25,0,0,212,217,3,30,15,3,213,214,10,1,0,0,214,215,
	5,24,0,0,215,217,3,30,15,2,216,210,1,0,0,0,216,213,1,0,0,0,217,220,1,0,
	0,0,218,216,1,0,0,0,218,219,1,0,0,0,219,31,1,0,0,0,220,218,1,0,0,0,221,
	222,6,16,-1,0,222,223,3,66,33,0,223,245,1,0,0,0,224,240,10,2,0,0,225,241,
	5,60,0,0,226,241,5,61,0,0,227,241,5,62,0,0,228,241,5,63,0,0,229,241,5,64,
	0,0,230,241,5,65,0,0,231,241,5,66,0,0,232,234,5,26,0,0,233,232,1,0,0,0,
	233,234,1,0,0,0,234,235,1,0,0,0,235,241,5,17,0,0,236,238,5,27,0,0,237,239,
	5,26,0,0,238,237,1,0,0,0,238,239,1,0,0,0,239,241,1,0,0,0,240,225,1,0,0,
	0,240,226,1,0,0,0,240,227,1,0,0,0,240,228,1,0,0,0,240,229,1,0,0,0,240,230,
	1,0,0,0,240,231,1,0,0,0,240,233,1,0,0,0,240,236,1,0,0,0,241,242,1,0,0,0,
	242,244,3,32,16,3,243,224,1,0,0,0,244,247,1,0,0,0,245,243,1,0,0,0,245,246,
	1,0,0,0,246,33,1,0,0,0,247,245,1,0,0,0,248,249,6,17,-1,0,249,250,3,36,18,
	0,250,256,1,0,0,0,251,252,10,2,0,0,252,253,7,2,0,0,253,255,3,36,18,0,254,
	251,1,0,0,0,255,258,1,0,0,0,256,254,1,0,0,0,256,257,1,0,0,0,257,35,1,0,
	0,0,258,256,1,0,0,0,259,260,6,18,-1,0,260,261,3,38,19,0,261,267,1,0,0,0,
	262,263,10,2,0,0,263,264,7,3,0,0,264,266,3,38,19,0,265,262,1,0,0,0,266,
	269,1,0,0,0,267,265,1,0,0,0,267,268,1,0,0,0,268,37,1,0,0,0,269,267,1,0,
	0,0,270,271,5,54,0,0,271,278,3,38,19,0,272,273,5,55,0,0,273,278,3,38,19,
	0,274,275,5,59,0,0,275,278,3,38,19,0,276,278,3,40,20,0,277,270,1,0,0,0,
	277,272,1,0,0,0,277,274,1,0,0,0,277,276,1,0,0,0,278,39,1,0,0,0,279,282,
	3,42,21,0,280,281,5,47,0,0,281,283,3,38,19,0,282,280,1,0,0,0,282,283,1,
	0,0,0,283,41,1,0,0,0,284,285,3,44,22,0,285,43,1,0,0,0,286,287,6,22,-1,0,
	287,293,3,52,26,0,288,289,5,83,0,0,289,290,3,46,23,0,290,291,5,84,0,0,291,
	293,1,0,0,0,292,286,1,0,0,0,292,288,1,0,0,0,293,298,1,0,0,0,294,295,10,
	3,0,0,295,297,5,95,0,0,296,294,1,0,0,0,297,300,1,0,0,0,298,296,1,0,0,0,
	298,299,1,0,0,0,299,45,1,0,0,0,300,298,1,0,0,0,301,320,3,50,25,0,302,305,
	3,50,25,0,303,305,3,48,24,0,304,302,1,0,0,0,304,303,1,0,0,0,305,313,1,0,
	0,0,306,309,5,44,0,0,307,310,3,50,25,0,308,310,3,48,24,0,309,307,1,0,0,
	0,309,308,1,0,0,0,310,312,1,0,0,0,311,306,1,0,0,0,312,315,1,0,0,0,313,311,
	1,0,0,0,313,314,1,0,0,0,314,317,1,0,0,0,315,313,1,0,0,0,316,318,5,44,0,
	0,317,316,1,0,0,0,317,318,1,0,0,0,318,320,1,0,0,0,319,301,1,0,0,0,319,304,
	1,0,0,0,320,47,1,0,0,0,321,322,5,43,0,0,322,323,3,28,14,0,323,49,1,0,0,
	0,324,326,3,28,14,0,325,324,1,0,0,0,325,326,1,0,0,0,326,327,1,0,0,0,327,
	329,5,45,0,0,328,330,3,28,14,0,329,328,1,0,0,0,329,330,1,0,0,0,330,335,
	1,0,0,0,331,333,5,45,0,0,332,334,3,28,14,0,333,332,1,0,0,0,333,334,1,0,
	0,0,334,336,1,0,0,0,335,331,1,0,0,0,335,336,1,0,0,0,336,339,1,0,0,0,337,
	339,3,62,31,0,338,325,1,0,0,0,338,337,1,0,0,0,339,51,1,0,0,0,340,352,5,
	85,0,0,341,352,5,86,0,0,342,352,5,87,0,0,343,352,5,88,0,0,344,352,5,89,
	0,0,345,352,5,90,0,0,346,348,5,83,0,0,347,349,3,76,38,0,348,347,1,0,0,0,
	348,349,1,0,0,0,349,350,1,0,0,0,350,352,5,84,0,0,351,340,1,0,0,0,351,341,
	1,0,0,0,351,342,1,0,0,0,351,343,1,0,0,0,351,344,1,0,0,0,351,345,1,0,0,0,
	351,346,1,0,0,0,352,53,1,0,0,0,353,354,5,12,0,0,354,355,3,62,31,0,355,356,
	5,45,0,0,356,361,3,64,32,0,357,362,3,56,28,0,358,360,3,58,29,0,359,358,
	1,0,0,0,359,360,1,0,0,0,360,362,1,0,0,0,361,357,1,0,0,0,361,359,1,0,0,0,
	362,55,1,0,0,0,363,364,5,13,0,0,364,365,3,62,31,0,365,366,5,45,0,0,366,
	371,3,64,32,0,367,372,3,56,28,0,368,370,3,58,29,0,369,368,1,0,0,0,369,370,
	1,0,0,0,370,372,1,0,0,0,371,367,1,0,0,0,371,369,1,0,0,0,372,57,1,0,0,0,
	373,374,5,14,0,0,374,375,5,45,0,0,375,376,3,64,32,0,376,59,1,0,0,0,377,
	378,5,12,0,0,378,379,3,62,31,0,379,61,1,0,0,0,380,381,3,28,14,0,381,63,
	1,0,0,0,382,383,5,92,0,0,383,384,5,1,0,0,384,385,3,2,1,0,385,386,5,2,0,
	0,386,389,1,0,0,0,387,389,3,6,3,0,388,382,1,0,0,0,388,387,1,0,0,0,389,65,
	1,0,0,0,390,391,6,33,-1,0,391,396,3,52,26,0,392,393,7,4,0,0,393,396,3,66,
	33,8,394,396,5,95,0,0,395,390,1,0,0,0,395,392,1,0,0,0,395,394,1,0,0,0,396,
	417,1,0,0,0,397,398,10,7,0,0,398,399,7,3,0,0,399,416,3,66,33,8,400,401,
	10,6,0,0,401,402,7,2,0,0,402,416,3,66,33,7,403,404,10,5,0,0,404,405,7,5,
	0,0,405,416,3,66,33,6,406,407,10,4,0,0,407,408,5,51,0,0,408,416,3,66,33,
	5,409,410,10,3,0,0,410,411,5,50,0,0,411,416,3,66,33,4,412,413,10,2,0,0,
	413,414,5,49,0,0,414,416,3,66,33,3,415,397,1,0,0,0,415,400,1,0,0,0,415,
	403,1,0,0,0,415,406,1,0,0,0,415,409,1,0,0,0,415,412,1,0,0,0,416,419,1,0,
	0,0,417,415,1,0,0,0,417,418,1,0,0,0,418,67,1,0,0,0,419,417,1,0,0,0,420,
	421,5,16,0,0,421,422,3,72,36,0,422,423,5,17,0,0,423,424,3,74,37,0,424,425,
	5,45,0,0,425,429,3,64,32,0,426,427,5,14,0,0,427,428,5,45,0,0,428,430,3,
	64,32,0,429,426,1,0,0,0,429,430,1,0,0,0,430,69,1,0,0,0,431,432,5,15,0,0,
	432,433,3,62,31,0,433,434,5,45,0,0,434,436,3,64,32,0,435,437,3,58,29,0,
	436,435,1,0,0,0,436,437,1,0,0,0,437,71,1,0,0,0,438,443,3,66,33,0,439,440,
	5,44,0,0,440,442,3,66,33,0,441,439,1,0,0,0,442,445,1,0,0,0,443,441,1,0,
	0,0,443,444,1,0,0,0,444,447,1,0,0,0,445,443,1,0,0,0,446,448,5,44,0,0,447,
	446,1,0,0,0,447,448,1,0,0,0,448,73,1,0,0,0,449,454,3,24,12,0,450,451,5,
	44,0,0,451,453,3,24,12,0,452,450,1,0,0,0,453,456,1,0,0,0,454,452,1,0,0,
	0,454,455,1,0,0,0,455,458,1,0,0,0,456,454,1,0,0,0,457,459,5,44,0,0,458,
	457,1,0,0,0,458,459,1,0,0,0,459,75,1,0,0,0,460,463,3,24,12,0,461,463,3,
	78,39,0,462,460,1,0,0,0,462,461,1,0,0,0,463,478,1,0,0,0,464,479,3,68,34,
	0,465,468,5,44,0,0,466,469,3,24,12,0,467,469,3,78,39,0,468,466,1,0,0,0,
	468,467,1,0,0,0,469,471,1,0,0,0,470,465,1,0,0,0,471,474,1,0,0,0,472,470,
	1,0,0,0,472,473,1,0,0,0,473,476,1,0,0,0,474,472,1,0,0,0,475,477,5,44,0,
	0,476,475,1,0,0,0,476,477,1,0,0,0,477,479,1,0,0,0,478,464,1,0,0,0,478,472,
	1,0,0,0,479,77,1,0,0,0,480,481,5,43,0,0,481,482,3,66,33,0,482,79,1,0,0,
	0,65,82,84,89,93,100,104,118,129,135,140,148,157,162,166,172,176,179,183,
	190,194,202,208,216,218,233,238,240,245,256,267,277,282,292,298,304,309,
	313,317,319,325,329,333,335,338,348,351,359,361,369,371,388,395,415,417,
	429,436,443,447,454,458,462,468,472,476,478];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!CustomLangParser.__ATN) {
			CustomLangParser.__ATN = new ATNDeserializer().deserialize(CustomLangParser._serializedATN);
		}

		return CustomLangParser.__ATN;
	}


	static DecisionsToDFA = CustomLangParser._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );

}

export class ProgramContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public NEWLINE_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.NEWLINE);
	}
	public NEWLINE(i: number): TerminalNode {
		return this.getToken(CustomLangParser.NEWLINE, i);
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_program;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterProgram) {
	 		listener.enterProgram(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitProgram) {
	 		listener.exitProgram(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitProgram) {
			return visitor.visitProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementsContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public statement_list(): StatementContext[] {
		return this.getTypedRuleContexts(StatementContext) as StatementContext[];
	}
	public statement(i: number): StatementContext {
		return this.getTypedRuleContext(StatementContext, i) as StatementContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_statements;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterStatements) {
	 		listener.enterStatements(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitStatements) {
	 		listener.exitStatements(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitStatements) {
			return visitor.visitStatements(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public simple_stmts(): Simple_stmtsContext {
		return this.getTypedRuleContext(Simple_stmtsContext, 0) as Simple_stmtsContext;
	}
	public compound_stmt(): Compound_stmtContext {
		return this.getTypedRuleContext(Compound_stmtContext, 0) as Compound_stmtContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_statement;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterStatement) {
	 		listener.enterStatement(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitStatement) {
	 		listener.exitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitStatement) {
			return visitor.visitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Simple_stmtsContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public simple_stmt_list(): Simple_stmtContext[] {
		return this.getTypedRuleContexts(Simple_stmtContext) as Simple_stmtContext[];
	}
	public simple_stmt(i: number): Simple_stmtContext {
		return this.getTypedRuleContext(Simple_stmtContext, i) as Simple_stmtContext;
	}
	public NEWLINE(): TerminalNode {
		return this.getToken(CustomLangParser.NEWLINE, 0);
	}
	public EOF(): TerminalNode {
		return this.getToken(CustomLangParser.EOF, 0);
	}
	public SEMI_COLON_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.SEMI_COLON);
	}
	public SEMI_COLON(i: number): TerminalNode {
		return this.getToken(CustomLangParser.SEMI_COLON, i);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_simple_stmts;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterSimple_stmts) {
	 		listener.enterSimple_stmts(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitSimple_stmts) {
	 		listener.exitSimple_stmts(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitSimple_stmts) {
			return visitor.visitSimple_stmts(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Simple_stmtContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public assignment(): AssignmentContext {
		return this.getTypedRuleContext(AssignmentContext, 0) as AssignmentContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_simple_stmt;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterSimple_stmt) {
	 		listener.enterSimple_stmt(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitSimple_stmt) {
	 		listener.exitSimple_stmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitSimple_stmt) {
			return visitor.visitSimple_stmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Or_expressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public and_expression(): And_expressionContext {
		return this.getTypedRuleContext(And_expressionContext, 0) as And_expressionContext;
	}
	public or_expression(): Or_expressionContext {
		return this.getTypedRuleContext(Or_expressionContext, 0) as Or_expressionContext;
	}
	public OR(): TerminalNode {
		return this.getToken(CustomLangParser.OR, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_or_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterOr_expression) {
	 		listener.enterOr_expression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitOr_expression) {
	 		listener.exitOr_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitOr_expression) {
			return visitor.visitOr_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class And_expressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public not_expression(): Not_expressionContext {
		return this.getTypedRuleContext(Not_expressionContext, 0) as Not_expressionContext;
	}
	public and_expression(): And_expressionContext {
		return this.getTypedRuleContext(And_expressionContext, 0) as And_expressionContext;
	}
	public AND(): TerminalNode {
		return this.getToken(CustomLangParser.AND, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_and_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterAnd_expression) {
	 		listener.enterAnd_expression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitAnd_expression) {
	 		listener.exitAnd_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitAnd_expression) {
			return visitor.visitAnd_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Not_expressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public NOT(): TerminalNode {
		return this.getToken(CustomLangParser.NOT, 0);
	}
	public not_expression(): Not_expressionContext {
		return this.getTypedRuleContext(Not_expressionContext, 0) as Not_expressionContext;
	}
	public comparison(): ComparisonContext {
		return this.getTypedRuleContext(ComparisonContext, 0) as ComparisonContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_not_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterNot_expression) {
	 		listener.enterNot_expression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitNot_expression) {
	 		listener.exitNot_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitNot_expression) {
			return visitor.visitNot_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Compound_stmtContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public if_stmt(): If_stmtContext {
		return this.getTypedRuleContext(If_stmtContext, 0) as If_stmtContext;
	}
	public for_stmt(): For_stmtContext {
		return this.getTypedRuleContext(For_stmtContext, 0) as For_stmtContext;
	}
	public while_stmt(): While_stmtContext {
		return this.getTypedRuleContext(While_stmtContext, 0) as While_stmtContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_compound_stmt;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterCompound_stmt) {
	 		listener.enterCompound_stmt(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitCompound_stmt) {
	 		listener.exitCompound_stmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitCompound_stmt) {
			return visitor.visitCompound_stmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Conditional_expressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public comparison_list(): ComparisonContext[] {
		return this.getTypedRuleContexts(ComparisonContext) as ComparisonContext[];
	}
	public comparison(i: number): ComparisonContext {
		return this.getTypedRuleContext(ComparisonContext, i) as ComparisonContext;
	}
	public IF(): TerminalNode {
		return this.getToken(CustomLangParser.IF, 0);
	}
	public ELSE(): TerminalNode {
		return this.getToken(CustomLangParser.ELSE, 0);
	}
	public conditional_expression(): Conditional_expressionContext {
		return this.getTypedRuleContext(Conditional_expressionContext, 0) as Conditional_expressionContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_conditional_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterConditional_expression) {
	 		listener.enterConditional_expression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitConditional_expression) {
	 		listener.exitConditional_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitConditional_expression) {
			return visitor.visitConditional_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignmentContext extends ParserRuleContext {
	public _op!: Token;
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public testlist_star_expr_list(): Testlist_star_exprContext[] {
		return this.getTypedRuleContexts(Testlist_star_exprContext) as Testlist_star_exprContext[];
	}
	public testlist_star_expr(i: number): Testlist_star_exprContext {
		return this.getTypedRuleContext(Testlist_star_exprContext, i) as Testlist_star_exprContext;
	}
	public ASSIGN_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.ASSIGN);
	}
	public ASSIGN(i: number): TerminalNode {
		return this.getToken(CustomLangParser.ASSIGN, i);
	}
	public ADD_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.ADD_ASSIGN, 0);
	}
	public SUB_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.SUB_ASSIGN, 0);
	}
	public MULT_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.MULT_ASSIGN, 0);
	}
	public AT_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.AT_ASSIGN, 0);
	}
	public DIV_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.DIV_ASSIGN, 0);
	}
	public MOD_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.MOD_ASSIGN, 0);
	}
	public AND_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.AND_ASSIGN, 0);
	}
	public OR_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.OR_ASSIGN, 0);
	}
	public XOR_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.XOR_ASSIGN, 0);
	}
	public LEFT_SHIFT_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.LEFT_SHIFT_ASSIGN, 0);
	}
	public RIGHT_SHIFT_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.RIGHT_SHIFT_ASSIGN, 0);
	}
	public POWER_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.POWER_ASSIGN, 0);
	}
	public IDIV_ASSIGN(): TerminalNode {
		return this.getToken(CustomLangParser.IDIV_ASSIGN, 0);
	}
	public testlist(): TestlistContext {
		return this.getTypedRuleContext(TestlistContext, 0) as TestlistContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_assignment;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterAssignment) {
	 		listener.enterAssignment(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitAssignment) {
	 		listener.exitAssignment(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitAssignment) {
			return visitor.visitAssignment(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Testlist_star_exprContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COMMA, i);
	}
	public test_list(): TestContext[] {
		return this.getTypedRuleContexts(TestContext) as TestContext[];
	}
	public test(i: number): TestContext {
		return this.getTypedRuleContext(TestContext, i) as TestContext;
	}
	public star_expr_list(): Star_exprContext[] {
		return this.getTypedRuleContexts(Star_exprContext) as Star_exprContext[];
	}
	public star_expr(i: number): Star_exprContext {
		return this.getTypedRuleContext(Star_exprContext, i) as Star_exprContext;
	}
	public testlist(): TestlistContext {
		return this.getTypedRuleContext(TestlistContext, 0) as TestlistContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_testlist_star_expr;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterTestlist_star_expr) {
	 		listener.enterTestlist_star_expr(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitTestlist_star_expr) {
	 		listener.exitTestlist_star_expr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitTestlist_star_expr) {
			return visitor.visitTestlist_star_expr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TestContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public IDENTIFIER(): TerminalNode {
		return this.getToken(CustomLangParser.IDENTIFIER, 0);
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_test;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterTest) {
	 		listener.enterTest(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitTest) {
	 		listener.exitTest(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitTest) {
			return visitor.visitTest(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionsContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COMMA, i);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_expressions;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterExpressions) {
	 		listener.enterExpressions(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitExpressions) {
	 		listener.exitExpressions(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitExpressions) {
			return visitor.visitExpressions(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public logical_test_list(): Logical_testContext[] {
		return this.getTypedRuleContexts(Logical_testContext) as Logical_testContext[];
	}
	public logical_test(i: number): Logical_testContext {
		return this.getTypedRuleContext(Logical_testContext, i) as Logical_testContext;
	}
	public IF(): TerminalNode {
		return this.getToken(CustomLangParser.IF, 0);
	}
	public ELSE(): TerminalNode {
		return this.getToken(CustomLangParser.ELSE, 0);
	}
	public expression(): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, 0) as ExpressionContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterExpression) {
	 		listener.enterExpression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitExpression) {
	 		listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Logical_testContext extends ParserRuleContext {
	public _op!: Token;
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public comparison(): ComparisonContext {
		return this.getTypedRuleContext(ComparisonContext, 0) as ComparisonContext;
	}
	public NOT(): TerminalNode {
		return this.getToken(CustomLangParser.NOT, 0);
	}
	public logical_test_list(): Logical_testContext[] {
		return this.getTypedRuleContexts(Logical_testContext) as Logical_testContext[];
	}
	public logical_test(i: number): Logical_testContext {
		return this.getTypedRuleContext(Logical_testContext, i) as Logical_testContext;
	}
	public AND(): TerminalNode {
		return this.getToken(CustomLangParser.AND, 0);
	}
	public OR(): TerminalNode {
		return this.getToken(CustomLangParser.OR, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_logical_test;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterLogical_test) {
	 		listener.enterLogical_test(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitLogical_test) {
	 		listener.exitLogical_test(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitLogical_test) {
			return visitor.visitLogical_test(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ComparisonContext extends ParserRuleContext {
	public _optional!: Token;
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public expr(): ExprContext {
		return this.getTypedRuleContext(ExprContext, 0) as ExprContext;
	}
	public comparison_list(): ComparisonContext[] {
		return this.getTypedRuleContexts(ComparisonContext) as ComparisonContext[];
	}
	public comparison(i: number): ComparisonContext {
		return this.getTypedRuleContext(ComparisonContext, i) as ComparisonContext;
	}
	public LESS_THAN(): TerminalNode {
		return this.getToken(CustomLangParser.LESS_THAN, 0);
	}
	public GREATER_THAN(): TerminalNode {
		return this.getToken(CustomLangParser.GREATER_THAN, 0);
	}
	public EQUALS(): TerminalNode {
		return this.getToken(CustomLangParser.EQUALS, 0);
	}
	public GT_EQ(): TerminalNode {
		return this.getToken(CustomLangParser.GT_EQ, 0);
	}
	public LT_EQ(): TerminalNode {
		return this.getToken(CustomLangParser.LT_EQ, 0);
	}
	public NOT_EQ_1(): TerminalNode {
		return this.getToken(CustomLangParser.NOT_EQ_1, 0);
	}
	public NOT_EQ_2(): TerminalNode {
		return this.getToken(CustomLangParser.NOT_EQ_2, 0);
	}
	public IN(): TerminalNode {
		return this.getToken(CustomLangParser.IN, 0);
	}
	public IS(): TerminalNode {
		return this.getToken(CustomLangParser.IS, 0);
	}
	public NOT(): TerminalNode {
		return this.getToken(CustomLangParser.NOT, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_comparison;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterComparison) {
	 		listener.enterComparison(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitComparison) {
	 		listener.exitComparison(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitComparison) {
			return visitor.visitComparison(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SumContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public term(): TermContext {
		return this.getTypedRuleContext(TermContext, 0) as TermContext;
	}
	public sum(): SumContext {
		return this.getTypedRuleContext(SumContext, 0) as SumContext;
	}
	public ADD(): TerminalNode {
		return this.getToken(CustomLangParser.ADD, 0);
	}
	public MINUS(): TerminalNode {
		return this.getToken(CustomLangParser.MINUS, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_sum;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterSum) {
	 		listener.enterSum(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitSum) {
	 		listener.exitSum(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitSum) {
			return visitor.visitSum(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TermContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public factor(): FactorContext {
		return this.getTypedRuleContext(FactorContext, 0) as FactorContext;
	}
	public term(): TermContext {
		return this.getTypedRuleContext(TermContext, 0) as TermContext;
	}
	public STAR(): TerminalNode {
		return this.getToken(CustomLangParser.STAR, 0);
	}
	public DIV(): TerminalNode {
		return this.getToken(CustomLangParser.DIV, 0);
	}
	public MOD(): TerminalNode {
		return this.getToken(CustomLangParser.MOD, 0);
	}
	public IDIV(): TerminalNode {
		return this.getToken(CustomLangParser.IDIV, 0);
	}
	public AT(): TerminalNode {
		return this.getToken(CustomLangParser.AT, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_term;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterTerm) {
	 		listener.enterTerm(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitTerm) {
	 		listener.exitTerm(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitTerm) {
			return visitor.visitTerm(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FactorContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public ADD(): TerminalNode {
		return this.getToken(CustomLangParser.ADD, 0);
	}
	public factor(): FactorContext {
		return this.getTypedRuleContext(FactorContext, 0) as FactorContext;
	}
	public MINUS(): TerminalNode {
		return this.getToken(CustomLangParser.MINUS, 0);
	}
	public NOT_OP(): TerminalNode {
		return this.getToken(CustomLangParser.NOT_OP, 0);
	}
	public power(): PowerContext {
		return this.getTypedRuleContext(PowerContext, 0) as PowerContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_factor;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterFactor) {
	 		listener.enterFactor(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitFactor) {
	 		listener.exitFactor(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitFactor) {
			return visitor.visitFactor(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PowerContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public await_primary(): Await_primaryContext {
		return this.getTypedRuleContext(Await_primaryContext, 0) as Await_primaryContext;
	}
	public POWER(): TerminalNode {
		return this.getToken(CustomLangParser.POWER, 0);
	}
	public factor(): FactorContext {
		return this.getTypedRuleContext(FactorContext, 0) as FactorContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_power;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterPower) {
	 		listener.enterPower(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitPower) {
	 		listener.exitPower(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitPower) {
			return visitor.visitPower(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Await_primaryContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public primary(): PrimaryContext {
		return this.getTypedRuleContext(PrimaryContext, 0) as PrimaryContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_await_primary;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterAwait_primary) {
	 		listener.enterAwait_primary(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitAwait_primary) {
	 		listener.exitAwait_primary(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitAwait_primary) {
			return visitor.visitAwait_primary(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrimaryContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public OPEN_BRACK(): TerminalNode {
		return this.getToken(CustomLangParser.OPEN_BRACK, 0);
	}
	public slices(): SlicesContext {
		return this.getTypedRuleContext(SlicesContext, 0) as SlicesContext;
	}
	public CLOSE_BRACK(): TerminalNode {
		return this.getToken(CustomLangParser.CLOSE_BRACK, 0);
	}
	public primary(): PrimaryContext {
		return this.getTypedRuleContext(PrimaryContext, 0) as PrimaryContext;
	}
	public IDENTIFIER(): TerminalNode {
		return this.getToken(CustomLangParser.IDENTIFIER, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_primary;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterPrimary) {
	 		listener.enterPrimary(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitPrimary) {
	 		listener.exitPrimary(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitPrimary) {
			return visitor.visitPrimary(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SlicesContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public slice_list(): SliceContext[] {
		return this.getTypedRuleContexts(SliceContext) as SliceContext[];
	}
	public slice(i: number): SliceContext {
		return this.getTypedRuleContext(SliceContext, i) as SliceContext;
	}
	public starred_expression_list(): Starred_expressionContext[] {
		return this.getTypedRuleContexts(Starred_expressionContext) as Starred_expressionContext[];
	}
	public starred_expression(i: number): Starred_expressionContext {
		return this.getTypedRuleContext(Starred_expressionContext, i) as Starred_expressionContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COMMA, i);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_slices;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterSlices) {
	 		listener.enterSlices(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitSlices) {
	 		listener.exitSlices(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitSlices) {
			return visitor.visitSlices(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Starred_expressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public STAR(): TerminalNode {
		return this.getToken(CustomLangParser.STAR, 0);
	}
	public expression(): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, 0) as ExpressionContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_starred_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterStarred_expression) {
	 		listener.enterStarred_expression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitStarred_expression) {
	 		listener.exitStarred_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitStarred_expression) {
			return visitor.visitStarred_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SliceContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public COLON_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COLON);
	}
	public COLON(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COLON, i);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	public named_expression(): Named_expressionContext {
		return this.getTypedRuleContext(Named_expressionContext, 0) as Named_expressionContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_slice;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterSlice) {
	 		listener.enterSlice(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitSlice) {
	 		listener.exitSlice(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitSlice) {
			return visitor.visitSlice(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ValueContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public STRING(): TerminalNode {
		return this.getToken(CustomLangParser.STRING, 0);
	}
	public DECIMAL_INTEGER(): TerminalNode {
		return this.getToken(CustomLangParser.DECIMAL_INTEGER, 0);
	}
	public OCT_INTEGER(): TerminalNode {
		return this.getToken(CustomLangParser.OCT_INTEGER, 0);
	}
	public HEX_INTEGER(): TerminalNode {
		return this.getToken(CustomLangParser.HEX_INTEGER, 0);
	}
	public BIN_INTEGER(): TerminalNode {
		return this.getToken(CustomLangParser.BIN_INTEGER, 0);
	}
	public FLOAT_NUMBER(): TerminalNode {
		return this.getToken(CustomLangParser.FLOAT_NUMBER, 0);
	}
	public OPEN_BRACK(): TerminalNode {
		return this.getToken(CustomLangParser.OPEN_BRACK, 0);
	}
	public CLOSE_BRACK(): TerminalNode {
		return this.getToken(CustomLangParser.CLOSE_BRACK, 0);
	}
	public testlist_comp(): Testlist_compContext {
		return this.getTypedRuleContext(Testlist_compContext, 0) as Testlist_compContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_value;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterValue) {
	 		listener.enterValue(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitValue) {
	 		listener.exitValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitValue) {
			return visitor.visitValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class If_stmtContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public IF(): TerminalNode {
		return this.getToken(CustomLangParser.IF, 0);
	}
	public named_expression(): Named_expressionContext {
		return this.getTypedRuleContext(Named_expressionContext, 0) as Named_expressionContext;
	}
	public COLON(): TerminalNode {
		return this.getToken(CustomLangParser.COLON, 0);
	}
	public block(): BlockContext {
		return this.getTypedRuleContext(BlockContext, 0) as BlockContext;
	}
	public elif_stmt(): Elif_stmtContext {
		return this.getTypedRuleContext(Elif_stmtContext, 0) as Elif_stmtContext;
	}
	public else_block(): Else_blockContext {
		return this.getTypedRuleContext(Else_blockContext, 0) as Else_blockContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_if_stmt;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterIf_stmt) {
	 		listener.enterIf_stmt(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitIf_stmt) {
	 		listener.exitIf_stmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitIf_stmt) {
			return visitor.visitIf_stmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Elif_stmtContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public ELIF(): TerminalNode {
		return this.getToken(CustomLangParser.ELIF, 0);
	}
	public named_expression(): Named_expressionContext {
		return this.getTypedRuleContext(Named_expressionContext, 0) as Named_expressionContext;
	}
	public COLON(): TerminalNode {
		return this.getToken(CustomLangParser.COLON, 0);
	}
	public block(): BlockContext {
		return this.getTypedRuleContext(BlockContext, 0) as BlockContext;
	}
	public elif_stmt(): Elif_stmtContext {
		return this.getTypedRuleContext(Elif_stmtContext, 0) as Elif_stmtContext;
	}
	public else_block(): Else_blockContext {
		return this.getTypedRuleContext(Else_blockContext, 0) as Else_blockContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_elif_stmt;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterElif_stmt) {
	 		listener.enterElif_stmt(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitElif_stmt) {
	 		listener.exitElif_stmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitElif_stmt) {
			return visitor.visitElif_stmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Else_blockContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public ELSE(): TerminalNode {
		return this.getToken(CustomLangParser.ELSE, 0);
	}
	public COLON(): TerminalNode {
		return this.getToken(CustomLangParser.COLON, 0);
	}
	public block(): BlockContext {
		return this.getTypedRuleContext(BlockContext, 0) as BlockContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_else_block;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterElse_block) {
	 		listener.enterElse_block(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitElse_block) {
	 		listener.exitElse_block(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitElse_block) {
			return visitor.visitElse_block(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GuardContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public IF(): TerminalNode {
		return this.getToken(CustomLangParser.IF, 0);
	}
	public named_expression(): Named_expressionContext {
		return this.getTypedRuleContext(Named_expressionContext, 0) as Named_expressionContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_guard;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterGuard) {
	 		listener.enterGuard(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitGuard) {
	 		listener.exitGuard(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitGuard) {
			return visitor.visitGuard(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Named_expressionContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public expression(): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, 0) as ExpressionContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_named_expression;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterNamed_expression) {
	 		listener.enterNamed_expression(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitNamed_expression) {
	 		listener.exitNamed_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitNamed_expression) {
			return visitor.visitNamed_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BlockContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public NEWLINE(): TerminalNode {
		return this.getToken(CustomLangParser.NEWLINE, 0);
	}
	public INDENT(): TerminalNode {
		return this.getToken(CustomLangParser.INDENT, 0);
	}
	public statements(): StatementsContext {
		return this.getTypedRuleContext(StatementsContext, 0) as StatementsContext;
	}
	public DEDENT(): TerminalNode {
		return this.getToken(CustomLangParser.DEDENT, 0);
	}
	public simple_stmts(): Simple_stmtsContext {
		return this.getTypedRuleContext(Simple_stmtsContext, 0) as Simple_stmtsContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_block;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterBlock) {
	 		listener.enterBlock(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitBlock) {
	 		listener.exitBlock(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitBlock) {
			return visitor.visitBlock(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExprContext extends ParserRuleContext {
	public _op!: Token;
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public value(): ValueContext {
		return this.getTypedRuleContext(ValueContext, 0) as ValueContext;
	}
	public expr_list(): ExprContext[] {
		return this.getTypedRuleContexts(ExprContext) as ExprContext[];
	}
	public expr(i: number): ExprContext {
		return this.getTypedRuleContext(ExprContext, i) as ExprContext;
	}
	public ADD(): TerminalNode {
		return this.getToken(CustomLangParser.ADD, 0);
	}
	public MINUS(): TerminalNode {
		return this.getToken(CustomLangParser.MINUS, 0);
	}
	public NOT_OP(): TerminalNode {
		return this.getToken(CustomLangParser.NOT_OP, 0);
	}
	public IDENTIFIER(): TerminalNode {
		return this.getToken(CustomLangParser.IDENTIFIER, 0);
	}
	public STAR(): TerminalNode {
		return this.getToken(CustomLangParser.STAR, 0);
	}
	public DIV(): TerminalNode {
		return this.getToken(CustomLangParser.DIV, 0);
	}
	public MOD(): TerminalNode {
		return this.getToken(CustomLangParser.MOD, 0);
	}
	public IDIV(): TerminalNode {
		return this.getToken(CustomLangParser.IDIV, 0);
	}
	public AT(): TerminalNode {
		return this.getToken(CustomLangParser.AT, 0);
	}
	public LEFT_SHIFT(): TerminalNode {
		return this.getToken(CustomLangParser.LEFT_SHIFT, 0);
	}
	public RIGHT_SHIFT(): TerminalNode {
		return this.getToken(CustomLangParser.RIGHT_SHIFT, 0);
	}
	public AND_OP(): TerminalNode {
		return this.getToken(CustomLangParser.AND_OP, 0);
	}
	public XOR(): TerminalNode {
		return this.getToken(CustomLangParser.XOR, 0);
	}
	public OR_OP(): TerminalNode {
		return this.getToken(CustomLangParser.OR_OP, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_expr;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterExpr) {
	 		listener.enterExpr(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitExpr) {
	 		listener.exitExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitExpr) {
			return visitor.visitExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class For_stmtContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public FOR(): TerminalNode {
		return this.getToken(CustomLangParser.FOR, 0);
	}
	public exprlist(): ExprlistContext {
		return this.getTypedRuleContext(ExprlistContext, 0) as ExprlistContext;
	}
	public IN(): TerminalNode {
		return this.getToken(CustomLangParser.IN, 0);
	}
	public testlist(): TestlistContext {
		return this.getTypedRuleContext(TestlistContext, 0) as TestlistContext;
	}
	public COLON_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COLON);
	}
	public COLON(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COLON, i);
	}
	public block_list(): BlockContext[] {
		return this.getTypedRuleContexts(BlockContext) as BlockContext[];
	}
	public block(i: number): BlockContext {
		return this.getTypedRuleContext(BlockContext, i) as BlockContext;
	}
	public ELSE(): TerminalNode {
		return this.getToken(CustomLangParser.ELSE, 0);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_for_stmt;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterFor_stmt) {
	 		listener.enterFor_stmt(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitFor_stmt) {
	 		listener.exitFor_stmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitFor_stmt) {
			return visitor.visitFor_stmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class While_stmtContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public WHILE(): TerminalNode {
		return this.getToken(CustomLangParser.WHILE, 0);
	}
	public named_expression(): Named_expressionContext {
		return this.getTypedRuleContext(Named_expressionContext, 0) as Named_expressionContext;
	}
	public COLON(): TerminalNode {
		return this.getToken(CustomLangParser.COLON, 0);
	}
	public block(): BlockContext {
		return this.getTypedRuleContext(BlockContext, 0) as BlockContext;
	}
	public else_block(): Else_blockContext {
		return this.getTypedRuleContext(Else_blockContext, 0) as Else_blockContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_while_stmt;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterWhile_stmt) {
	 		listener.enterWhile_stmt(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitWhile_stmt) {
	 		listener.exitWhile_stmt(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitWhile_stmt) {
			return visitor.visitWhile_stmt(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExprlistContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public expr_list(): ExprContext[] {
		return this.getTypedRuleContexts(ExprContext) as ExprContext[];
	}
	public expr(i: number): ExprContext {
		return this.getTypedRuleContext(ExprContext, i) as ExprContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COMMA, i);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_exprlist;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterExprlist) {
	 		listener.enterExprlist(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitExprlist) {
	 		listener.exitExprlist(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitExprlist) {
			return visitor.visitExprlist(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TestlistContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public test_list(): TestContext[] {
		return this.getTypedRuleContexts(TestContext) as TestContext[];
	}
	public test(i: number): TestContext {
		return this.getTypedRuleContext(TestContext, i) as TestContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COMMA, i);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_testlist;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterTestlist) {
	 		listener.enterTestlist(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitTestlist) {
	 		listener.exitTestlist(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitTestlist) {
			return visitor.visitTestlist(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Testlist_compContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public test_list(): TestContext[] {
		return this.getTypedRuleContexts(TestContext) as TestContext[];
	}
	public test(i: number): TestContext {
		return this.getTypedRuleContext(TestContext, i) as TestContext;
	}
	public star_expr_list(): Star_exprContext[] {
		return this.getTypedRuleContexts(Star_exprContext) as Star_exprContext[];
	}
	public star_expr(i: number): Star_exprContext {
		return this.getTypedRuleContext(Star_exprContext, i) as Star_exprContext;
	}
	public for_stmt(): For_stmtContext {
		return this.getTypedRuleContext(For_stmtContext, 0) as For_stmtContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(CustomLangParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(CustomLangParser.COMMA, i);
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_testlist_comp;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterTestlist_comp) {
	 		listener.enterTestlist_comp(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitTestlist_comp) {
	 		listener.exitTestlist_comp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitTestlist_comp) {
			return visitor.visitTestlist_comp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Star_exprContext extends ParserRuleContext {
	constructor(parser?: CustomLangParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public STAR(): TerminalNode {
		return this.getToken(CustomLangParser.STAR, 0);
	}
	public expr(): ExprContext {
		return this.getTypedRuleContext(ExprContext, 0) as ExprContext;
	}
    public get ruleIndex(): number {
    	return CustomLangParser.RULE_star_expr;
	}
	public enterRule(listener: CustomLangParserListener): void {
	    if(listener.enterStar_expr) {
	 		listener.enterStar_expr(this);
		}
	}
	public exitRule(listener: CustomLangParserListener): void {
	    if(listener.exitStar_expr) {
	 		listener.exitStar_expr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: CustomLangParserVisitor<Result>): Result {
		if (visitor.visitStar_expr) {
			return visitor.visitStar_expr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
