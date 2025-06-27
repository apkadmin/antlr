// Generated from CustomLangParser.g4 by ANTLR 4.13.2
package com.example.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CustomLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, DEF=3, RETURN=4, RAISE=5, FROM=6, IMPORT=7, NONLOCAL=8, 
		AS=9, GLOBAL=10, ASSERT=11, IF=12, ELIF=13, ELSE=14, WHILE=15, FOR=16, 
		IN=17, TRY=18, NONE=19, FINALLY=20, WITH=21, EXCEPT=22, LAMBDA=23, OR=24, 
		AND=25, NOT=26, IS=27, CLASS=28, YIELD=29, DEL=30, PASS=31, CONTINUE=32, 
		BREAK=33, ASYNC=34, AWAIT=35, PRINT=36, EXEC=37, TRUE=38, FALSE=39, DOT=40, 
		ELLIPSIS=41, REVERSE_QUOTE=42, STAR=43, COMMA=44, COLON=45, SEMI_COLON=46, 
		POWER=47, ASSIGN=48, OR_OP=49, XOR=50, AND_OP=51, LEFT_SHIFT=52, RIGHT_SHIFT=53, 
		ADD=54, MINUS=55, DIV=56, MOD=57, IDIV=58, NOT_OP=59, LESS_THAN=60, GREATER_THAN=61, 
		EQUALS=62, GT_EQ=63, LT_EQ=64, NOT_EQ_1=65, NOT_EQ_2=66, AT=67, ARROW=68, 
		ADD_ASSIGN=69, SUB_ASSIGN=70, MULT_ASSIGN=71, AT_ASSIGN=72, DIV_ASSIGN=73, 
		MOD_ASSIGN=74, AND_ASSIGN=75, OR_ASSIGN=76, XOR_ASSIGN=77, LEFT_SHIFT_ASSIGN=78, 
		RIGHT_SHIFT_ASSIGN=79, POWER_ASSIGN=80, IDIV_ASSIGN=81, COLONEQUAL=82, 
		OPEN_BRACK=83, CLOSE_BRACK=84, STRING=85, DECIMAL_INTEGER=86, OCT_INTEGER=87, 
		HEX_INTEGER=88, BIN_INTEGER=89, FLOAT_NUMBER=90, LINE_JOIN=91, NEWLINE=92, 
		WS=93, COMMENT=94, IDENTIFIER=95, LEFT_PAREN=96, RIGHT_PAREN=97;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_simple_stmts = 3, 
		RULE_simple_stmt = 4, RULE_or_expression = 5, RULE_and_expression = 6, 
		RULE_not_expression = 7, RULE_compound_stmt = 8, RULE_conditional_expression = 9, 
		RULE_assignment = 10, RULE_testlist_star_expr = 11, RULE_test = 12, RULE_expressions = 13, 
		RULE_expression = 14, RULE_logical_test = 15, RULE_comparison = 16, RULE_sum = 17, 
		RULE_term = 18, RULE_factor = 19, RULE_power = 20, RULE_await_primary = 21, 
		RULE_primary = 22, RULE_slices = 23, RULE_starred_expression = 24, RULE_slice = 25, 
		RULE_value = 26, RULE_if_stmt = 27, RULE_elif_stmt = 28, RULE_else_block = 29, 
		RULE_guard = 30, RULE_named_expression = 31, RULE_block = 32, RULE_expr = 33, 
		RULE_for_stmt = 34, RULE_while_stmt = 35, RULE_exprlist = 36, RULE_testlist = 37, 
		RULE_testlist_comp = 38, RULE_star_expr = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "simple_stmts", "simple_stmt", 
			"or_expression", "and_expression", "not_expression", "compound_stmt", 
			"conditional_expression", "assignment", "testlist_star_expr", "test", 
			"expressions", "expression", "logical_test", "comparison", "sum", "term", 
			"factor", "power", "await_primary", "primary", "slices", "starred_expression", 
			"slice", "value", "if_stmt", "elif_stmt", "else_block", "guard", "named_expression", 
			"block", "expr", "for_stmt", "while_stmt", "exprlist", "testlist", "testlist_comp", 
			"star_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'def'", "'return'", "'raise'", "'from'", "'import'", 
			"'nonlocal'", "'as'", "'global'", "'assert'", "'N\\u1EBFu'", "'Ng\\u01B0\\u1EE3c l\\u1EA1i n\\u1EBFu'", 
			"'Ng\\u01B0\\u1EE3c l\\u1EA1i'", "'L\\u1EB7p'", "'Duy\\u1EC7t'", "'trong'", 
			"'try'", "'None'", "'finally'", "'with'", "'except'", "'lambda'", "'or'", 
			"'and'", "'not'", "'is'", "'class'", "'yield'", "'del'", "'pass'", "'continue'", 
			"'break'", "'async'", "'await'", "'print'", "'exec'", "'True'", "'False'", 
			"'.'", "'...'", "'`'", "'*'", "','", "':'", "';'", "'**'", "'='", "'|'", 
			"'^'", "'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", "'%'", "'//'", "'~'", 
			"'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'@'", "'->'", 
			"'+='", "'-='", "'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'**='", "'//='", "':='", "'['", "']'", null, null, 
			null, null, null, null, null, null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "DEF", "RETURN", "RAISE", "FROM", "IMPORT", 
			"NONLOCAL", "AS", "GLOBAL", "ASSERT", "IF", "ELIF", "ELSE", "WHILE", 
			"FOR", "IN", "TRY", "NONE", "FINALLY", "WITH", "EXCEPT", "LAMBDA", "OR", 
			"AND", "NOT", "IS", "CLASS", "YIELD", "DEL", "PASS", "CONTINUE", "BREAK", 
			"ASYNC", "AWAIT", "PRINT", "EXEC", "TRUE", "FALSE", "DOT", "ELLIPSIS", 
			"REVERSE_QUOTE", "STAR", "COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", 
			"OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS", 
			"DIV", "MOD", "IDIV", "NOT_OP", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"POWER_ASSIGN", "IDIV_ASSIGN", "COLONEQUAL", "OPEN_BRACK", "CLOSE_BRACK", 
			"STRING", "DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", 
			"FLOAT_NUMBER", "LINE_JOIN", "NEWLINE", "WS", "COMMENT", "IDENTIFIER", 
			"LEFT_PAREN", "RIGHT_PAREN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CustomLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CustomLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CustomLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CustomLangParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(80);
					match(NEWLINE);
					}
					break;
				case IF:
				case WHILE:
				case FOR:
				case STAR:
				case ADD_ASSIGN:
				case SUB_ASSIGN:
				case MULT_ASSIGN:
				case AT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case OR_ASSIGN:
				case XOR_ASSIGN:
				case LEFT_SHIFT_ASSIGN:
				case RIGHT_SHIFT_ASSIGN:
				case POWER_ASSIGN:
				case IDIV_ASSIGN:
				case OPEN_BRACK:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case FLOAT_NUMBER:
				case IDENTIFIER:
					{
					setState(81);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093124608L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 79650815L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093124608L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 71262207L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				simple_stmts();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				compound_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtsContext extends ParserRuleContext {
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(CustomLangParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(CustomLangParser.EOF, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(CustomLangParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(CustomLangParser.SEMI_COLON, i);
		}
		public Simple_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterSimple_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitSimple_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitSimple_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtsContext simple_stmts() throws RecognitionException {
		Simple_stmtsContext _localctx = new Simple_stmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			simple_stmt();
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(SEMI_COLON);
					setState(97);
					simple_stmt();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(103);
				match(SEMI_COLON);
				}
			}

			setState(106);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(CustomLangParser.OR, 0); }
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		return or_expression(0);
	}

	private Or_expressionContext or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, _parentState);
		Or_expressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_or_expression);
					setState(113);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(114);
					match(OR);
					setState(115);
					and_expression(0);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_expressionContext extends ParserRuleContext {
		public Not_expressionContext not_expression() {
			return getRuleContext(Not_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CustomLangParser.AND, 0); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		return and_expression(0);
	}

	private And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState);
		And_expressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(122);
			not_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(124);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(125);
					match(AND);
					setState(126);
					not_expression();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Not_expressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CustomLangParser.NOT, 0); }
		public Not_expressionContext not_expression() {
			return getRuleContext(Not_expressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterNot_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitNot_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitNot_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_expressionContext not_expression() throws RecognitionException {
		Not_expressionContext _localctx = new Not_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_not_expression);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(NOT);
				setState(133);
				not_expression();
				}
				break;
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				comparison(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_stmt);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				if_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				for_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public TerminalNode IF() { return getToken(CustomLangParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(CustomLangParser.ELSE, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			comparison(0);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143);
				match(IF);
				setState(144);
				comparison(0);
				setState(145);
				match(ELSE);
				setState(146);
				conditional_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token op;
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CustomLangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CustomLangParser.ASSIGN, i);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(CustomLangParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(CustomLangParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(CustomLangParser.MULT_ASSIGN, 0); }
		public TerminalNode AT_ASSIGN() { return getToken(CustomLangParser.AT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CustomLangParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CustomLangParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(CustomLangParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(CustomLangParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(CustomLangParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(CustomLangParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(CustomLangParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(CustomLangParser.POWER_ASSIGN, 0); }
		public TerminalNode IDIV_ASSIGN() { return getToken(CustomLangParser.IDIV_ASSIGN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				testlist_star_expr();
				{
				setState(151);
				match(ASSIGN);
				{
				setState(152);
				testlist_star_expr();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(153);
					match(ASSIGN);
					setState(154);
					testlist_star_expr();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				}
				break;
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 8191L) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(161);
				testlist();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(CustomLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomLangParser.COMMA, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitTestlist_star_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_testlist_star_expr);
		try {
			int _alt;
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(166);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_BRACK:
						case STRING:
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
						case FLOAT_NUMBER:
						case IDENTIFIER:
							{
							setState(164);
							test();
							}
							break;
						case STAR:
							{
							setState(165);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(168);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(172); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACK:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case FLOAT_NUMBER:
				case IDENTIFIER:
					{
					setState(174);
					test();
					}
					break;
				case STAR:
					{
					setState(175);
					star_expr();
					}
					break;
				case EOF:
				case SEMI_COLON:
				case ASSIGN:
				case NEWLINE:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				testlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CustomLangParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_test);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(IDENTIFIER);
				}
				break;
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomLangParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expression();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					expression();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(193);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Logical_testContext> logical_test() {
			return getRuleContexts(Logical_testContext.class);
		}
		public Logical_testContext logical_test(int i) {
			return getRuleContext(Logical_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(CustomLangParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(CustomLangParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			logical_test(0);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(197);
				match(IF);
				setState(198);
				logical_test(0);
				setState(199);
				match(ELSE);
				setState(200);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_testContext extends ParserRuleContext {
		public Token op;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CustomLangParser.NOT, 0); }
		public List<Logical_testContext> logical_test() {
			return getRuleContexts(Logical_testContext.class);
		}
		public Logical_testContext logical_test(int i) {
			return getRuleContext(Logical_testContext.class,i);
		}
		public TerminalNode AND() { return getToken(CustomLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(CustomLangParser.OR, 0); }
		public Logical_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterLogical_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitLogical_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitLogical_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_testContext logical_test() throws RecognitionException {
		return logical_test(0);
	}

	private Logical_testContext logical_test(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_testContext _localctx = new Logical_testContext(_ctx, _parentState);
		Logical_testContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logical_test, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IDENTIFIER:
				{
				setState(205);
				comparison(0);
				}
				break;
			case NOT:
				{
				setState(206);
				match(NOT);
				setState(207);
				logical_test(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_testContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_test);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						((Logical_testContext)_localctx).op = match(AND);
						setState(212);
						logical_test(3);
						}
						break;
					case 2:
						{
						_localctx = new Logical_testContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_test);
						setState(213);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(214);
						((Logical_testContext)_localctx).op = match(OR);
						setState(215);
						logical_test(2);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public Token optional;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(CustomLangParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CustomLangParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(CustomLangParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(CustomLangParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(CustomLangParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(CustomLangParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(CustomLangParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(CustomLangParser.IN, 0); }
		public TerminalNode IS() { return getToken(CustomLangParser.IS, 0); }
		public TerminalNode NOT() { return getToken(CustomLangParser.NOT, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		return comparison(0);
	}

	private ComparisonContext comparison(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonContext _localctx = new ComparisonContext(_ctx, _parentState);
		ComparisonContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_comparison, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparison);
					setState(224);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(240);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(225);
						match(LESS_THAN);
						}
						break;
					case GREATER_THAN:
						{
						setState(226);
						match(GREATER_THAN);
						}
						break;
					case EQUALS:
						{
						setState(227);
						match(EQUALS);
						}
						break;
					case GT_EQ:
						{
						setState(228);
						match(GT_EQ);
						}
						break;
					case LT_EQ:
						{
						setState(229);
						match(LT_EQ);
						}
						break;
					case NOT_EQ_1:
						{
						setState(230);
						match(NOT_EQ_1);
						}
						break;
					case NOT_EQ_2:
						{
						setState(231);
						match(NOT_EQ_2);
						}
						break;
					case IN:
					case NOT:
						{
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(232);
							((ComparisonContext)_localctx).optional = match(NOT);
							}
						}

						setState(235);
						match(IN);
						}
						break;
					case IS:
						{
						setState(236);
						match(IS);
						setState(238);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(237);
							((ComparisonContext)_localctx).optional = match(NOT);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(242);
					comparison(3);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CustomLangParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(CustomLangParser.MINUS, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_sum, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sum);
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(253);
					term(0);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode STAR() { return getToken(CustomLangParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(CustomLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CustomLangParser.MOD, 0); }
		public TerminalNode IDIV() { return getToken(CustomLangParser.IDIV, 0); }
		public TerminalNode AT() { return getToken(CustomLangParser.AT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263);
					_la = _input.LA(1);
					if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 16834561L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(264);
					factor();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CustomLangParser.ADD, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CustomLangParser.MINUS, 0); }
		public TerminalNode NOT_OP() { return getToken(CustomLangParser.NOT_OP, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(ADD);
				setState(271);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(MINUS);
				setState(273);
				factor();
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(NOT_OP);
				setState(275);
				factor();
				}
				break;
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				power();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public Await_primaryContext await_primary() {
			return getRuleContext(Await_primaryContext.class,0);
		}
		public TerminalNode POWER() { return getToken(CustomLangParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			await_primary();
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(280);
				match(POWER);
				setState(281);
				factor();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Await_primaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Await_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_await_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterAwait_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitAwait_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitAwait_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Await_primaryContext await_primary() throws RecognitionException {
		Await_primaryContext _localctx = new Await_primaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_await_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			primary(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(CustomLangParser.OPEN_BRACK, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(CustomLangParser.CLOSE_BRACK, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CustomLangParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_primary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(287);
				value();
				}
				break;
			case 2:
				{
				setState(288);
				match(OPEN_BRACK);
				setState(289);
				slices();
				setState(290);
				match(CLOSE_BRACK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primary);
					setState(294);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					{
					setState(295);
					match(IDENTIFIER);
					}
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlicesContext extends ParserRuleContext {
		public List<SliceContext> slice() {
			return getRuleContexts(SliceContext.class);
		}
		public SliceContext slice(int i) {
			return getRuleContext(SliceContext.class,i);
		}
		public List<Starred_expressionContext> starred_expression() {
			return getRuleContexts(Starred_expressionContext.class);
		}
		public Starred_expressionContext starred_expression(int i) {
			return getRuleContext(Starred_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomLangParser.COMMA, i);
		}
		public SlicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterSlices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitSlices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitSlices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicesContext slices() throws RecognitionException {
		SlicesContext _localctx = new SlicesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_slices);
		int _la;
		try {
			int _alt;
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				slice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case COLON:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACK:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case FLOAT_NUMBER:
				case IDENTIFIER:
					{
					setState(302);
					slice();
					}
					break;
				case STAR:
					{
					setState(303);
					starred_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(COMMA);
						setState(309);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NOT:
						case COLON:
						case ADD:
						case MINUS:
						case NOT_OP:
						case OPEN_BRACK:
						case STRING:
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
						case FLOAT_NUMBER:
						case IDENTIFIER:
							{
							setState(307);
							slice();
							}
							break;
						case STAR:
							{
							setState(308);
							starred_expression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(316);
					match(COMMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Starred_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CustomLangParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Starred_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starred_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterStarred_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitStarred_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitStarred_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Starred_expressionContext starred_expression() throws RecognitionException {
		Starred_expressionContext _localctx = new Starred_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_starred_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(STAR);
			setState(322);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SliceContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CustomLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CustomLangParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_slice);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947898978304L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 4349L) != 0)) {
					{
					setState(324);
					expression();
					}
				}

				setState(327);
				match(COLON);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947898978304L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 4349L) != 0)) {
					{
					setState(328);
					expression();
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(331);
					match(COLON);
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947898978304L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 4349L) != 0)) {
						{
						setState(332);
						expression();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				named_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CustomLangParser.STRING, 0); }
		public TerminalNode DECIMAL_INTEGER() { return getToken(CustomLangParser.DECIMAL_INTEGER, 0); }
		public TerminalNode OCT_INTEGER() { return getToken(CustomLangParser.OCT_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(CustomLangParser.HEX_INTEGER, 0); }
		public TerminalNode BIN_INTEGER() { return getToken(CustomLangParser.BIN_INTEGER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(CustomLangParser.FLOAT_NUMBER, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(CustomLangParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(CustomLangParser.CLOSE_BRACK, 0); }
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(STRING);
				}
				break;
			case DECIMAL_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(DECIMAL_INTEGER);
				}
				break;
			case OCT_INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(OCT_INTEGER);
				}
				break;
			case HEX_INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				match(HEX_INTEGER);
				}
				break;
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(BIN_INTEGER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				match(FLOAT_NUMBER);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(OPEN_BRACK);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 4781776069197825L) != 0)) {
					{
					setState(347);
					testlist_comp();
					}
				}

				setState(350);
				match(CLOSE_BRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CustomLangParser.IF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CustomLangParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(IF);
			setState(354);
			named_expression();
			setState(355);
			match(COLON);
			setState(356);
			block();
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(357);
				elif_stmt();
				}
				break;
			case EOF:
			case DEDENT:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case STAR:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case NEWLINE:
			case IDENTIFIER:
				{
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(358);
					else_block();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_stmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(CustomLangParser.ELIF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CustomLangParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterElif_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitElif_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitElif_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elif_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ELIF);
			setState(364);
			named_expression();
			setState(365);
			match(COLON);
			setState(366);
			block();
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(367);
				elif_stmt();
				}
				break;
			case EOF:
			case DEDENT:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case STAR:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case NEWLINE:
			case IDENTIFIER:
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(368);
					else_block();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CustomLangParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(CustomLangParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ELSE);
			setState(374);
			match(COLON);
			setState(375);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CustomLangParser.IF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(IF);
			setState(378);
			named_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterNamed_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitNamed_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitNamed_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_expressionContext named_expression() throws RecognitionException {
		Named_expressionContext _localctx = new Named_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_named_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CustomLangParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(CustomLangParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(CustomLangParser.DEDENT, 0); }
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(NEWLINE);
				setState(383);
				match(INDENT);
				setState(384);
				statements();
				setState(385);
				match(DEDENT);
				}
				break;
			case STAR:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				simple_stmts();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CustomLangParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(CustomLangParser.MINUS, 0); }
		public TerminalNode NOT_OP() { return getToken(CustomLangParser.NOT_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CustomLangParser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(CustomLangParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(CustomLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CustomLangParser.MOD, 0); }
		public TerminalNode IDIV() { return getToken(CustomLangParser.IDIV, 0); }
		public TerminalNode AT() { return getToken(CustomLangParser.AT, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(CustomLangParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(CustomLangParser.RIGHT_SHIFT, 0); }
		public TerminalNode AND_OP() { return getToken(CustomLangParser.AND_OP, 0); }
		public TerminalNode XOR() { return getToken(CustomLangParser.XOR, 0); }
		public TerminalNode OR_OP() { return getToken(CustomLangParser.OR_OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
				{
				setState(391);
				value();
				}
				break;
			case ADD:
			case MINUS:
			case NOT_OP:
				{
				setState(392);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947831869440L) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(393);
				expr(8);
				}
				break;
			case IDENTIFIER:
				{
				setState(394);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(397);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(398);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 16834561L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(399);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(400);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(401);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(402);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(403);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(404);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(405);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(406);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(407);
						((ExprContext)_localctx).op = match(AND_OP);
						setState(408);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(409);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(410);
						((ExprContext)_localctx).op = match(XOR);
						setState(411);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(412);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(413);
						((ExprContext)_localctx).op = match(OR_OP);
						setState(414);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CustomLangParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(CustomLangParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(CustomLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CustomLangParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CustomLangParser.ELSE, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(FOR);
			setState(421);
			exprlist();
			setState(422);
			match(IN);
			setState(423);
			testlist();
			setState(424);
			match(COLON);
			setState(425);
			block();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(426);
				match(ELSE);
				setState(427);
				match(COLON);
				setState(428);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CustomLangParser.WHILE, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CustomLangParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(WHILE);
			setState(432);
			named_expression();
			setState(433);
			match(COLON);
			setState(434);
			block();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(435);
				else_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomLangParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			expr(0);
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					match(COMMA);
					setState(440);
					expr(0);
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(446);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomLangParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitTestlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			test();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					match(COMMA);
					setState(451);
					test();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(457);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CustomLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CustomLangParser.COMMA, i);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterTestlist_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitTestlist_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACK:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IDENTIFIER:
				{
				setState(460);
				test();
				}
				break;
			case STAR:
				{
				setState(461);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(464);
				for_stmt();
				}
				break;
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						match(COMMA);
						setState(468);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_BRACK:
						case STRING:
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
						case FLOAT_NUMBER:
						case IDENTIFIER:
							{
							setState(466);
							test();
							}
							break;
						case STAR:
							{
							setState(467);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(475);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CustomLangParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomLangParserListener ) ((CustomLangParserListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomLangParserVisitor ) return ((CustomLangParserVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(STAR);
			setState(481);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return or_expression_sempred((Or_expressionContext)_localctx, predIndex);
		case 6:
			return and_expression_sempred((And_expressionContext)_localctx, predIndex);
		case 15:
			return logical_test_sempred((Logical_testContext)_localctx, predIndex);
		case 16:
			return comparison_sempred((ComparisonContext)_localctx, predIndex);
		case 17:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 18:
			return term_sempred((TermContext)_localctx, predIndex);
		case 22:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean or_expression_sempred(Or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logical_test_sempred(Logical_testContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparison_sempred(ComparisonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001a\u01e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0004\u0000S\b\u0000\u000b\u0000\f\u0000T\u0001\u0001"+
		"\u0004\u0001X\b\u0001\u000b\u0001\f\u0001Y\u0001\u0002\u0001\u0002\u0003"+
		"\u0002^\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003"+
		"\n\u0003\f\u0003f\t\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005"+
		"x\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006\f\u0006\u0083\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0088\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008d\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009c"+
		"\b\n\n\n\f\n\u009f\t\n\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a7\b\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00ab"+
		"\b\u000b\u000b\u000b\f\u000b\u00ac\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b1\b\u000b\u0001\u000b\u0003\u000b\u00b4\b\u000b\u0001\f\u0001\f\u0003"+
		"\f\u00b8\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00bd\b\r\n\r\f\r\u00c0\t"+
		"\r\u0001\r\u0003\r\u00c3\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cb\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d1\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d9"+
		"\b\u000f\n\u000f\f\u000f\u00dc\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ea\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00ef\b\u0010\u0003\u0010\u00f1\b"+
		"\u0010\u0001\u0010\u0005\u0010\u00f4\b\u0010\n\u0010\f\u0010\u00f7\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00ff\b\u0011\n\u0011\f\u0011\u0102\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u010a"+
		"\b\u0012\n\u0012\f\u0012\u010d\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0116\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u011b\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0125\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0129\b\u0016\n\u0016\f\u0016\u012c\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0131\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0136\b\u0017\u0005\u0017\u0138\b\u0017\n\u0017\f\u0017\u013b\t"+
		"\u0017\u0001\u0017\u0003\u0017\u013e\b\u0017\u0003\u0017\u0140\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003\u0019\u0146\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u014a\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u014e\b\u0019\u0003\u0019\u0150\b\u0019\u0001\u0019\u0003"+
		"\u0019\u0153\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u015d\b\u001a\u0001"+
		"\u001a\u0003\u001a\u0160\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0168\b\u001b\u0003\u001b\u016a"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0172\b\u001c\u0003\u001c\u0174\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0185\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u018c\b!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01a0\b!\n!\f!\u01a3"+
		"\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01ae\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01b5\b"+
		"#\u0001$\u0001$\u0001$\u0005$\u01ba\b$\n$\f$\u01bd\t$\u0001$\u0003$\u01c0"+
		"\b$\u0001%\u0001%\u0001%\u0005%\u01c5\b%\n%\f%\u01c8\t%\u0001%\u0003%"+
		"\u01cb\b%\u0001&\u0001&\u0003&\u01cf\b&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u01d5\b&\u0005&\u01d7\b&\n&\f&\u01da\t&\u0001&\u0003&\u01dd\b&\u0003"+
		"&\u01df\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0000\b\n\f\u001e \"$,B(\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0006\u0001\u0001\\\\\u0001\u0000"+
		"EQ\u0001\u000067\u0003\u0000++8:CC\u0002\u000067;;\u0001\u000045\u0211"+
		"\u0000R\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004]"+
		"\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\bl\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e"+
		"\u0087\u0001\u0000\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012"+
		"\u008e\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016"+
		"\u00b3\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000\u0000\u001a"+
		"\u00b9\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000\u0000\u001e"+
		"\u00d0\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\"\u00f8"+
		"\u0001\u0000\u0000\u0000$\u0103\u0001\u0000\u0000\u0000&\u0115\u0001\u0000"+
		"\u0000\u0000(\u0117\u0001\u0000\u0000\u0000*\u011c\u0001\u0000\u0000\u0000"+
		",\u0124\u0001\u0000\u0000\u0000.\u013f\u0001\u0000\u0000\u00000\u0141"+
		"\u0001\u0000\u0000\u00002\u0152\u0001\u0000\u0000\u00004\u015f\u0001\u0000"+
		"\u0000\u00006\u0161\u0001\u0000\u0000\u00008\u016b\u0001\u0000\u0000\u0000"+
		":\u0175\u0001\u0000\u0000\u0000<\u0179\u0001\u0000\u0000\u0000>\u017c"+
		"\u0001\u0000\u0000\u0000@\u0184\u0001\u0000\u0000\u0000B\u018b\u0001\u0000"+
		"\u0000\u0000D\u01a4\u0001\u0000\u0000\u0000F\u01af\u0001\u0000\u0000\u0000"+
		"H\u01b6\u0001\u0000\u0000\u0000J\u01c1\u0001\u0000\u0000\u0000L\u01ce"+
		"\u0001\u0000\u0000\u0000N\u01e0\u0001\u0000\u0000\u0000PS\u0005\\\u0000"+
		"\u0000QS\u0003\u0004\u0002\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\u0001\u0001\u0000\u0000\u0000VX\u0003\u0004\u0002"+
		"\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000"+
		"[^\u0003\u0006\u0003\u0000\\^\u0003\u0010\b\u0000][\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_d\u0003"+
		"\b\u0004\u0000`a\u0005.\u0000\u0000ac\u0003\b\u0004\u0000b`\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gi\u0005.\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000\u0000k\u0007\u0001\u0000"+
		"\u0000\u0000lm\u0003\u0014\n\u0000m\t\u0001\u0000\u0000\u0000no\u0006"+
		"\u0005\uffff\uffff\u0000op\u0003\f\u0006\u0000pv\u0001\u0000\u0000\u0000"+
		"qr\n\u0002\u0000\u0000rs\u0005\u0018\u0000\u0000su\u0003\f\u0006\u0000"+
		"tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0006\u0006\uffff\uffff\u0000z{\u0003\u000e\u0007"+
		"\u0000{\u0081\u0001\u0000\u0000\u0000|}\n\u0002\u0000\u0000}~\u0005\u0019"+
		"\u0000\u0000~\u0080\u0003\u000e\u0007\u0000\u007f|\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001a\u0000\u0000\u0085"+
		"\u0088\u0003\u000e\u0007\u0000\u0086\u0088\u0003 \u0010\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u000f"+
		"\u0001\u0000\u0000\u0000\u0089\u008d\u00036\u001b\u0000\u008a\u008d\u0003"+
		"D\"\u0000\u008b\u008d\u0003F#\u0000\u008c\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u0094\u0003 \u0010\u0000\u008f"+
		"\u0090\u0005\f\u0000\u0000\u0090\u0091\u0003 \u0010\u0000\u0091\u0092"+
		"\u0005\u000e\u0000\u0000\u0092\u0093\u0003\u0012\t\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0097\u0003"+
		"\u0016\u000b\u0000\u0097\u0098\u00050\u0000\u0000\u0098\u009d\u0003\u0016"+
		"\u000b\u0000\u0099\u009a\u00050\u0000\u0000\u009a\u009c\u0003\u0016\u000b"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0007\u0001\u0000\u0000\u00a1\u00a3\u0003J%\u0000\u00a2"+
		"\u0096\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u0015\u0001\u0000\u0000\u0000\u00a4\u00a7\u0003\u0018\f\u0000\u00a5\u00a7"+
		"\u0003N\'\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		",\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0003\u0018\f\u0000\u00af\u00b1\u0003N\'\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0003J%\u0000\u00b3\u00aa\u0001\u0000\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u0017\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0005_\u0000\u0000\u00b6\u00b8\u00034\u001a\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u0019\u0001\u0000"+
		"\u0000\u0000\u00b9\u00be\u0003\u001c\u000e\u0000\u00ba\u00bb\u0005,\u0000"+
		"\u0000\u00bb\u00bd\u0003\u001c\u000e\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005,\u0000\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00ca\u0003\u001e\u000f\u0000"+
		"\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7"+
		"\u00c8\u0005\u000e\u0000\u0000\u00c8\u00c9\u0003\u001c\u000e\u0000\u00c9"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0006\u000f\uffff\uffff\u0000\u00cd\u00d1\u0003 \u0010\u0000\u00ce"+
		"\u00cf\u0005\u001a\u0000\u0000\u00cf\u00d1\u0003\u001e\u000f\u0003\u00d0"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1"+
		"\u00da\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0002\u0000\u0000\u00d3\u00d4"+
		"\u0005\u0019\u0000\u0000\u00d4\u00d9\u0003\u001e\u000f\u0003\u00d5\u00d6"+
		"\n\u0001\u0000\u0000\u00d6\u00d7\u0005\u0018\u0000\u0000\u00d7\u00d9\u0003"+
		"\u001e\u000f\u0002\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u001f\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0006"+
		"\u0010\uffff\uffff\u0000\u00de\u00df\u0003B!\u0000\u00df\u00f5\u0001\u0000"+
		"\u0000\u0000\u00e0\u00f0\n\u0002\u0000\u0000\u00e1\u00f1\u0005<\u0000"+
		"\u0000\u00e2\u00f1\u0005=\u0000\u0000\u00e3\u00f1\u0005>\u0000\u0000\u00e4"+
		"\u00f1\u0005?\u0000\u0000\u00e5\u00f1\u0005@\u0000\u0000\u00e6\u00f1\u0005"+
		"A\u0000\u0000\u00e7\u00f1\u0005B\u0000\u0000\u00e8\u00ea\u0005\u001a\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f1\u0005\u0011\u0000"+
		"\u0000\u00ec\u00ee\u0005\u001b\u0000\u0000\u00ed\u00ef\u0005\u001a\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e2\u0001\u0000\u0000\u0000\u00f0\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e4\u0001\u0000\u0000\u0000\u00f0\u00e5\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e6\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e9\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0003 \u0010\u0003"+
		"\u00f3\u00e0\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6!\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0006\u0011\uffff\uffff\u0000\u00f9\u00fa\u0003$\u0012\u0000\u00fa"+
		"\u0100\u0001\u0000\u0000\u0000\u00fb\u00fc\n\u0002\u0000\u0000\u00fc\u00fd"+
		"\u0007\u0002\u0000\u0000\u00fd\u00ff\u0003$\u0012\u0000\u00fe\u00fb\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101#\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0006\u0012"+
		"\uffff\uffff\u0000\u0104\u0105\u0003&\u0013\u0000\u0105\u010b\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\n\u0002\u0000\u0000\u0107\u0108\u0007\u0003\u0000"+
		"\u0000\u0108\u010a\u0003&\u0013\u0000\u0109\u0106\u0001\u0000\u0000\u0000"+
		"\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c%\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u00056\u0000\u0000\u010f\u0116"+
		"\u0003&\u0013\u0000\u0110\u0111\u00057\u0000\u0000\u0111\u0116\u0003&"+
		"\u0013\u0000\u0112\u0113\u0005;\u0000\u0000\u0113\u0116\u0003&\u0013\u0000"+
		"\u0114\u0116\u0003(\u0014\u0000\u0115\u010e\u0001\u0000\u0000\u0000\u0115"+
		"\u0110\u0001\u0000\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\'\u0001\u0000\u0000\u0000\u0117\u011a"+
		"\u0003*\u0015\u0000\u0118\u0119\u0005/\u0000\u0000\u0119\u011b\u0003&"+
		"\u0013\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b)\u0001\u0000\u0000\u0000\u011c\u011d\u0003,\u0016\u0000"+
		"\u011d+\u0001\u0000\u0000\u0000\u011e\u011f\u0006\u0016\uffff\uffff\u0000"+
		"\u011f\u0125\u00034\u001a\u0000\u0120\u0121\u0005S\u0000\u0000\u0121\u0122"+
		"\u0003.\u0017\u0000\u0122\u0123\u0005T\u0000\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000"+
		"\u0000\u0000\u0125\u012a\u0001\u0000\u0000\u0000\u0126\u0127\n\u0003\u0000"+
		"\u0000\u0127\u0129\u0005_\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b-\u0001\u0000\u0000\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012d\u0140\u00032\u0019\u0000\u012e\u0131"+
		"\u00032\u0019\u0000\u012f\u0131\u00030\u0018\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0139\u0001\u0000"+
		"\u0000\u0000\u0132\u0135\u0005,\u0000\u0000\u0133\u0136\u00032\u0019\u0000"+
		"\u0134\u0136\u00030\u0018\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0132\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0005,\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u012d"+
		"\u0001\u0000\u0000\u0000\u013f\u0130\u0001\u0000\u0000\u0000\u0140/\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005+\u0000\u0000\u0142\u0143\u0003\u001c"+
		"\u000e\u0000\u01431\u0001\u0000\u0000\u0000\u0144\u0146\u0003\u001c\u000e"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0005-\u0000\u0000"+
		"\u0148\u014a\u0003\u001c\u000e\u0000\u0149\u0148\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014f\u0001\u0000\u0000\u0000"+
		"\u014b\u014d\u0005-\u0000\u0000\u014c\u014e\u0003\u001c\u000e\u0000\u014d"+
		"\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u014b\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151"+
		"\u0153\u0003>\u001f\u0000\u0152\u0145\u0001\u0000\u0000\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u01533\u0001\u0000\u0000\u0000\u0154\u0160\u0005"+
		"U\u0000\u0000\u0155\u0160\u0005V\u0000\u0000\u0156\u0160\u0005W\u0000"+
		"\u0000\u0157\u0160\u0005X\u0000\u0000\u0158\u0160\u0005Y\u0000\u0000\u0159"+
		"\u0160\u0005Z\u0000\u0000\u015a\u015c\u0005S\u0000\u0000\u015b\u015d\u0003"+
		"L&\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0005T\u0000\u0000"+
		"\u015f\u0154\u0001\u0000\u0000\u0000\u015f\u0155\u0001\u0000\u0000\u0000"+
		"\u015f\u0156\u0001\u0000\u0000\u0000\u015f\u0157\u0001\u0000\u0000\u0000"+
		"\u015f\u0158\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000\u0000"+
		"\u015f\u015a\u0001\u0000\u0000\u0000\u01605\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005\f\u0000\u0000\u0162\u0163\u0003>\u001f\u0000\u0163\u0164"+
		"\u0005-\u0000\u0000\u0164\u0169\u0003@ \u0000\u0165\u016a\u00038\u001c"+
		"\u0000\u0166\u0168\u0003:\u001d\u0000\u0167\u0166\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000"+
		"\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u016a7\u0001\u0000\u0000\u0000\u016b\u016c\u0005\r\u0000\u0000\u016c"+
		"\u016d\u0003>\u001f\u0000\u016d\u016e\u0005-\u0000\u0000\u016e\u0173\u0003"+
		"@ \u0000\u016f\u0174\u00038\u001c\u0000\u0170\u0172\u0003:\u001d\u0000"+
		"\u0171\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u016f\u0001\u0000\u0000\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u01749\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0005\u000e\u0000\u0000\u0176\u0177\u0005-\u0000\u0000\u0177\u0178"+
		"\u0003@ \u0000\u0178;\u0001\u0000\u0000\u0000\u0179\u017a\u0005\f\u0000"+
		"\u0000\u017a\u017b\u0003>\u001f\u0000\u017b=\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0003\u001c\u000e\u0000\u017d?\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0005\\\u0000\u0000\u017f\u0180\u0005\u0001\u0000\u0000\u0180\u0181\u0003"+
		"\u0002\u0001\u0000\u0181\u0182\u0005\u0002\u0000\u0000\u0182\u0185\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0003\u0006\u0003\u0000\u0184\u017e\u0001"+
		"\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185A\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0006!\uffff\uffff\u0000\u0187\u018c\u00034\u001a"+
		"\u0000\u0188\u0189\u0007\u0004\u0000\u0000\u0189\u018c\u0003B!\b\u018a"+
		"\u018c\u0005_\u0000\u0000\u018b\u0186\u0001\u0000\u0000\u0000\u018b\u0188"+
		"\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u01a1"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\n\u0007\u0000\u0000\u018e\u018f\u0007"+
		"\u0003\u0000\u0000\u018f\u01a0\u0003B!\b\u0190\u0191\n\u0006\u0000\u0000"+
		"\u0191\u0192\u0007\u0002\u0000\u0000\u0192\u01a0\u0003B!\u0007\u0193\u0194"+
		"\n\u0005\u0000\u0000\u0194\u0195\u0007\u0005\u0000\u0000\u0195\u01a0\u0003"+
		"B!\u0006\u0196\u0197\n\u0004\u0000\u0000\u0197\u0198\u00053\u0000\u0000"+
		"\u0198\u01a0\u0003B!\u0005\u0199\u019a\n\u0003\u0000\u0000\u019a\u019b"+
		"\u00052\u0000\u0000\u019b\u01a0\u0003B!\u0004\u019c\u019d\n\u0002\u0000"+
		"\u0000\u019d\u019e\u00051\u0000\u0000\u019e\u01a0\u0003B!\u0003\u019f"+
		"\u018d\u0001\u0000\u0000\u0000\u019f\u0190\u0001\u0000\u0000\u0000\u019f"+
		"\u0193\u0001\u0000\u0000\u0000\u019f\u0196\u0001\u0000\u0000\u0000\u019f"+
		"\u0199\u0001\u0000\u0000\u0000\u019f\u019c\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2C\u0001\u0000\u0000\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0010\u0000\u0000\u01a5\u01a6"+
		"\u0003H$\u0000\u01a6\u01a7\u0005\u0011\u0000\u0000\u01a7\u01a8\u0003J"+
		"%\u0000\u01a8\u01a9\u0005-\u0000\u0000\u01a9\u01ad\u0003@ \u0000\u01aa"+
		"\u01ab\u0005\u000e\u0000\u0000\u01ab\u01ac\u0005-\u0000\u0000\u01ac\u01ae"+
		"\u0003@ \u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01aeE\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u000f\u0000"+
		"\u0000\u01b0\u01b1\u0003>\u001f\u0000\u01b1\u01b2\u0005-\u0000\u0000\u01b2"+
		"\u01b4\u0003@ \u0000\u01b3\u01b5\u0003:\u001d\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5G\u0001\u0000"+
		"\u0000\u0000\u01b6\u01bb\u0003B!\u0000\u01b7\u01b8\u0005,\u0000\u0000"+
		"\u01b8\u01ba\u0003B!\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01be\u01c0\u0005,\u0000\u0000\u01bf\u01be\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0I\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c6\u0003\u0018\f\u0000\u01c2\u01c3\u0005,\u0000"+
		"\u0000\u01c3\u01c5\u0003\u0018\f\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cb\u0005,\u0000\u0000\u01ca"+
		"\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"K\u0001\u0000\u0000\u0000\u01cc\u01cf\u0003\u0018\f\u0000\u01cd\u01cf"+
		"\u0003N\'\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cf\u01de\u0001\u0000\u0000\u0000\u01d0\u01df\u0003"+
		"D\"\u0000\u01d1\u01d4\u0005,\u0000\u0000\u01d2\u01d5\u0003\u0018\f\u0000"+
		"\u01d3\u01d5\u0003N\'\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01dd\u0005,\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01d0"+
		"\u0001\u0000\u0000\u0000\u01de\u01d8\u0001\u0000\u0000\u0000\u01dfM\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0005+\u0000\u0000\u01e1\u01e2\u0003B!"+
		"\u0000\u01e2O\u0001\u0000\u0000\u0000ARTY]dhv\u0081\u0087\u008c\u0094"+
		"\u009d\u00a2\u00a6\u00ac\u00b0\u00b3\u00b7\u00be\u00c2\u00ca\u00d0\u00d8"+
		"\u00da\u00e9\u00ee\u00f0\u00f5\u0100\u010b\u0115\u011a\u0124\u012a\u0130"+
		"\u0135\u0139\u013d\u013f\u0145\u0149\u014d\u014f\u0152\u015c\u015f\u0167"+
		"\u0169\u0171\u0173\u0184\u018b\u019f\u01a1\u01ad\u01b4\u01bb\u01bf\u01c6"+
		"\u01ca\u01ce\u01d4\u01d8\u01dc\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}