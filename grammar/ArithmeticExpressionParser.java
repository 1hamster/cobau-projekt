// Generated from ArithmeticExpression.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, AND=4, OR=5, VAR=6, PRINT=7, IF=8, ELSE=9, WHILE=10, 
		SEMICOLON=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, STRING=16, NUMBER=17, 
		IDENTIFIER=18, PLUS=19, MINUS=20, ASTERIKS=21, FSLASH=22, ASSIGN=23, EQUAL=24, 
		NOTEQUAL=25, GREATER=26, LESSER=27, GEQUAL=28, LEQUAL=29, NOT=30, COMMENT=31;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDecl = 2, RULE_statement = 3, 
		RULE_exprStmt = 4, RULE_ifStmt = 5, RULE_printStmt = 6, RULE_whileStmt = 7, 
		RULE_block = 8, RULE_expression = 9, RULE_assignment = 10, RULE_logic_or = 11, 
		RULE_logic_and = 12, RULE_equality = 13, RULE_comparison = 14, RULE_term = 15, 
		RULE_factor = 16, RULE_unary = 17, RULE_primary = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "varDecl", "statement", "exprStmt", "ifStmt", 
			"printStmt", "whileStmt", "block", "expression", "assignment", "logic_or", 
			"logic_and", "equality", "comparison", "term", "factor", "unary", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'true'", "'false'", "'and'", "' or'", "'var'", "'print'", 
			"'if'", "'else'", "'while'", "';'", "'('", "')'", "'{'", "'}'", null, 
			null, null, "' + '", "'-'", "'*'", "'/'", "' = '", "' == '", "'!='", 
			"'>'", "' < '", "'>='", "'<='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TRUE", "FALSE", "AND", "OR", "VAR", "PRINT", "IF", "ELSE", 
			"WHILE", "SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "STRING", 
			"NUMBER", "IDENTIFIER", "PLUS", "MINUS", "ASTERIKS", "FSLASH", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "GREATER", "LESSER", "GEQUAL", "LEQUAL", "NOT", 
			"COMMENT"
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
	public String getGrammarFileName() { return "ArithmeticExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArithmeticExpressionParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1075271116L) != 0)) {
				{
				{
				setState(38);
				declaration();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
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
	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				varDecl();
				}
				break;
			case TRUE:
			case FALSE:
			case PRINT:
			case IF:
			case WHILE:
			case LPAREN:
			case LBRACE:
			case STRING:
			case NUMBER:
			case IDENTIFIER:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				statement();
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
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ArithmeticExpressionParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArithmeticExpressionParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ArithmeticExpressionParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(ArithmeticExpressionParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(VAR);
			setState(51);
			match(IDENTIFIER);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(52);
				match(ASSIGN);
				setState(53);
				expression();
				}
			}

			setState(56);
			match(SEMICOLON);
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
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LPAREN:
			case STRING:
			case NUMBER:
			case IDENTIFIER:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				exprStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				ifStmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				printStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				whileStmt();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				block();
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ArithmeticExpressionParser.SEMICOLON, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitExprStmt(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			expression();
			setState(66);
			match(SEMICOLON);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ArithmeticExpressionParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ArithmeticExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArithmeticExpressionParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArithmeticExpressionParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IF);
			setState(69);
			match(LPAREN);
			setState(70);
			expression();
			setState(71);
			match(RPAREN);
			setState(72);
			statement();
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(73);
				match(ELSE);
				setState(74);
				statement();
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
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ArithmeticExpressionParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ArithmeticExpressionParser.SEMICOLON, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PRINT);
			setState(78);
			match(T__0);
			setState(79);
			expression();
			setState(80);
			match(T__0);
			setState(81);
			match(SEMICOLON);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ArithmeticExpressionParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ArithmeticExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArithmeticExpressionParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			match(LPAREN);
			setState(85);
			expression();
			setState(86);
			match(RPAREN);
			setState(87);
			statement();
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
		public TerminalNode LBRACE() { return getToken(ArithmeticExpressionParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ArithmeticExpressionParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LBRACE);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1075271116L) != 0)) {
				{
				{
				setState(90);
				declaration();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(RBRACE);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArithmeticExpressionParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ArithmeticExpressionParser.ASSIGN, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Logic_orContext logic_or() {
			return getRuleContext(Logic_orContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(IDENTIFIER);
				setState(101);
				match(ASSIGN);
				setState(102);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				logic_or();
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
	public static class Logic_orContext extends ParserRuleContext {
		public List<Logic_andContext> logic_and() {
			return getRuleContexts(Logic_andContext.class);
		}
		public Logic_andContext logic_and(int i) {
			return getRuleContext(Logic_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ArithmeticExpressionParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ArithmeticExpressionParser.OR, i);
		}
		public Logic_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterLogic_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitLogic_or(this);
		}
	}

	public final Logic_orContext logic_or() throws RecognitionException {
		Logic_orContext _localctx = new Logic_orContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logic_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			logic_and();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(107);
				match(OR);
				setState(108);
				logic_and();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Logic_andContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ArithmeticExpressionParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ArithmeticExpressionParser.AND, i);
		}
		public Logic_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterLogic_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitLogic_and(this);
		}
	}

	public final Logic_andContext logic_and() throws RecognitionException {
		Logic_andContext _localctx = new Logic_andContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logic_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			equality();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(115);
				match(AND);
				setState(116);
				equality();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class EqualityContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(ArithmeticExpressionParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(ArithmeticExpressionParser.NOTEQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ArithmeticExpressionParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ArithmeticExpressionParser.EQUAL, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			comparison();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				comparison();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> GREATER() { return getTokens(ArithmeticExpressionParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(ArithmeticExpressionParser.GREATER, i);
		}
		public List<TerminalNode> GEQUAL() { return getTokens(ArithmeticExpressionParser.GEQUAL); }
		public TerminalNode GEQUAL(int i) {
			return getToken(ArithmeticExpressionParser.GEQUAL, i);
		}
		public List<TerminalNode> LESSER() { return getTokens(ArithmeticExpressionParser.LESSER); }
		public TerminalNode LESSER(int i) {
			return getToken(ArithmeticExpressionParser.LESSER, i);
		}
		public List<TerminalNode> LEQUAL() { return getTokens(ArithmeticExpressionParser.LEQUAL); }
		public TerminalNode LEQUAL(int i) {
			return getToken(ArithmeticExpressionParser.LEQUAL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			term();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				term();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ArithmeticExpressionParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ArithmeticExpressionParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ArithmeticExpressionParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ArithmeticExpressionParser.PLUS, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			factor();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				factor();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FactorContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> FSLASH() { return getTokens(ArithmeticExpressionParser.FSLASH); }
		public TerminalNode FSLASH(int i) {
			return getToken(ArithmeticExpressionParser.FSLASH, i);
		}
		public List<TerminalNode> ASTERIKS() { return getTokens(ArithmeticExpressionParser.ASTERIKS); }
		public TerminalNode ASTERIKS(int i) {
			return getToken(ArithmeticExpressionParser.ASTERIKS, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			unary();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERIKS || _la==FSLASH) {
				{
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==ASTERIKS || _la==FSLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				unary();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ArithmeticExpressionParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(ArithmeticExpressionParser.MINUS, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				unary();
				}
				break;
			case TRUE:
			case FALSE:
			case LPAREN:
			case STRING:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ArithmeticExpressionParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ArithmeticExpressionParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(ArithmeticExpressionParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ArithmeticExpressionParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(ArithmeticExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArithmeticExpressionParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArithmeticExpressionParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(FALSE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(LPAREN);
				setState(164);
				expression();
				setState(165);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\\\b\b\n\b\f\b_"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\ni\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bn\b\u000b\n\u000b"+
		"\f\u000bq\t\u000b\u0001\f\u0001\f\u0001\f\u0005\fv\b\f\n\f\f\fy\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r~\b\r\n\r\f\r\u0081\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0086\b\u000e\n\u000e\f\u000e\u0089\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u008e\b\u000f\n\u000f\f\u000f"+
		"\u0091\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0096\b"+
		"\u0010\n\u0010\f\u0010\u0099\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u009e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00a9\b\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005"+
		"\u0001\u0000\u0018\u0019\u0001\u0000\u001a\u001d\u0001\u0000\u0013\u0014"+
		"\u0001\u0000\u0015\u0016\u0002\u0000\u0014\u0014\u001e\u001e\u00ad\u0000"+
		")\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001"+
		"\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000"+
		"\u0000\nD\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eS\u0001"+
		"\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000"+
		"\u0000\u0014h\u0001\u0000\u0000\u0000\u0016j\u0001\u0000\u0000\u0000\u0018"+
		"r\u0001\u0000\u0000\u0000\u001az\u0001\u0000\u0000\u0000\u001c\u0082\u0001"+
		"\u0000\u0000\u0000\u001e\u008a\u0001\u0000\u0000\u0000 \u0092\u0001\u0000"+
		"\u0000\u0000\"\u009d\u0001\u0000\u0000\u0000$\u00a8\u0001\u0000\u0000"+
		"\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001"+
		"-\u0001\u0001\u0000\u0000\u0000.1\u0003\u0004\u0002\u0000/1\u0003\u0006"+
		"\u0003\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003"+
		"\u0001\u0000\u0000\u000023\u0005\u0006\u0000\u000036\u0005\u0012\u0000"+
		"\u000045\u0005\u0017\u0000\u000057\u0003\u0012\t\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\u000b"+
		"\u0000\u00009\u0005\u0001\u0000\u0000\u0000:@\u0003\b\u0004\u0000;@\u0003"+
		"\n\u0005\u0000<@\u0003\f\u0006\u0000=@\u0003\u000e\u0007\u0000>@\u0003"+
		"\u0010\b\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@\u0007\u0001\u0000\u0000\u0000AB\u0003\u0012\t\u0000BC\u0005\u000b\u0000"+
		"\u0000C\t\u0001\u0000\u0000\u0000DE\u0005\b\u0000\u0000EF\u0005\f\u0000"+
		"\u0000FG\u0003\u0012\t\u0000GH\u0005\r\u0000\u0000HK\u0003\u0006\u0003"+
		"\u0000IJ\u0005\t\u0000\u0000JL\u0003\u0006\u0003\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0007\u0000\u0000NO\u0005\u0001\u0000\u0000OP\u0003\u0012\t\u0000PQ\u0005"+
		"\u0001\u0000\u0000QR\u0005\u000b\u0000\u0000R\r\u0001\u0000\u0000\u0000"+
		"ST\u0005\n\u0000\u0000TU\u0005\f\u0000\u0000UV\u0003\u0012\t\u0000VW\u0005"+
		"\r\u0000\u0000WX\u0003\u0006\u0003\u0000X\u000f\u0001\u0000\u0000\u0000"+
		"Y]\u0005\u000e\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005"+
		"\u000f\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0003\u0014\n\u0000"+
		"c\u0013\u0001\u0000\u0000\u0000de\u0005\u0012\u0000\u0000ef\u0005\u0017"+
		"\u0000\u0000fi\u0003\u0014\n\u0000gi\u0003\u0016\u000b\u0000hd\u0001\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0015\u0001\u0000\u0000\u0000"+
		"jo\u0003\u0018\f\u0000kl\u0005\u0005\u0000\u0000ln\u0003\u0018\f\u0000"+
		"mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u0017\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rw\u0003\u001a\r\u0000st\u0005\u0004\u0000\u0000tv\u0003"+
		"\u001a\r\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0019\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z\u007f\u0003\u001c\u000e\u0000{|\u0007"+
		"\u0000\u0000\u0000|~\u0003\u001c\u000e\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u001b\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u001e\u000f\u0000\u0083\u0084"+
		"\u0007\u0001\u0000\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u001d"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008f"+
		"\u0003 \u0010\u0000\u008b\u008c\u0007\u0002\u0000\u0000\u008c\u008e\u0003"+
		" \u0010\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u001f\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0097\u0003\"\u0011\u0000\u0093\u0094\u0007\u0003\u0000"+
		"\u0000\u0094\u0096\u0003\"\u0011\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098!\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0004\u0000\u0000\u009b"+
		"\u009e\u0003\"\u0011\u0000\u009c\u009e\u0003$\u0012\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e#\u0001"+
		"\u0000\u0000\u0000\u009f\u00a9\u0005\u0002\u0000\u0000\u00a0\u00a9\u0005"+
		"\u0003\u0000\u0000\u00a1\u00a9\u0005\u0011\u0000\u0000\u00a2\u00a9\u0005"+
		"\u0010\u0000\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00a5\u0003\u0012"+
		"\t\u0000\u00a5\u00a6\u0005\r\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0005\u0012\u0000\u0000\u00a8\u009f\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9%\u0001\u0000\u0000\u0000"+
		"\u000f)06?K]how\u007f\u0087\u008f\u0097\u009d\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}