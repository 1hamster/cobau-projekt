// Generated from ArithmeticExpression.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, AND=4, OR=5, VAR=6, PRINT=7, IF=8, ELSE=9, WHILE=10, 
		SEMICOLON=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, STRING=16, NUMBER=17, 
		IDENTIFIER=18, PLUS=19, MINUS=20, ASTERIKS=21, FSLASH=22, ASSIGN=23, EQUAL=24, 
		NOTEQUAL=25, GREATER=26, LESSER=27, GEQUAL=28, LEQUAL=29, NOT=30, COMMENT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TRUE", "FALSE", "AND", "OR", "VAR", "PRINT", "IF", "ELSE", "WHILE", 
			"SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "STRING", "NUMBER", 
			"IDENTIFIER", "PLUS", "MINUS", "ASTERIKS", "FSLASH", "ASSIGN", "EQUAL", 
			"NOTEQUAL", "GREATER", "LESSER", "GEQUAL", "LEQUAL", "NOT", "COMMENT"
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


	public ArithmeticExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithmeticExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00c0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000fy\b\u000f\n\u000f\f\u000f|\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0004\u0010\u0081\b\u0010\u000b\u0010\f\u0010\u0082\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u0087\b\u0010\u000b\u0010\f\u0010\u0088\u0003"+
		"\u0010\u008b\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u008f\b\u0011"+
		"\n\u0011\f\u0011\u0092\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u00bc\b\u001e\n\u001e\f\u001e\u00bf\t\u001e\u0001\u00bd"+
		"\u0000\u001f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f\u0001"+
		"\u0000\u0004\u0002\u0000\"\"^^\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u00c5\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003"+
		"A\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007L\u0001"+
		"\u0000\u0000\u0000\tP\u0001\u0000\u0000\u0000\u000bT\u0001\u0000\u0000"+
		"\u0000\rX\u0001\u0000\u0000\u0000\u000f^\u0001\u0000\u0000\u0000\u0011"+
		"a\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015l\u0001"+
		"\u0000\u0000\u0000\u0017n\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000"+
		"\u0000\u001br\u0001\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001f"+
		"v\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#\u008c\u0001"+
		"\u0000\u0000\u0000%\u0093\u0001\u0000\u0000\u0000\'\u0097\u0001\u0000"+
		"\u0000\u0000)\u0099\u0001\u0000\u0000\u0000+\u009b\u0001\u0000\u0000\u0000"+
		"-\u009d\u0001\u0000\u0000\u0000/\u00a1\u0001\u0000\u0000\u00001\u00a6"+
		"\u0001\u0000\u0000\u00003\u00a9\u0001\u0000\u0000\u00005\u00ab\u0001\u0000"+
		"\u0000\u00007\u00af\u0001\u0000\u0000\u00009\u00b2\u0001\u0000\u0000\u0000"+
		";\u00b5\u0001\u0000\u0000\u0000=\u00b7\u0001\u0000\u0000\u0000?@\u0005"+
		"\"\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005t\u0000\u0000BC\u0005"+
		"r\u0000\u0000CD\u0005u\u0000\u0000DE\u0005e\u0000\u0000E\u0004\u0001\u0000"+
		"\u0000\u0000FG\u0005f\u0000\u0000GH\u0005a\u0000\u0000HI\u0005l\u0000"+
		"\u0000IJ\u0005s\u0000\u0000JK\u0005e\u0000\u0000K\u0006\u0001\u0000\u0000"+
		"\u0000LM\u0005a\u0000\u0000MN\u0005n\u0000\u0000NO\u0005d\u0000\u0000"+
		"O\b\u0001\u0000\u0000\u0000PQ\u0005 \u0000\u0000QR\u0005o\u0000\u0000"+
		"RS\u0005r\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005v\u0000\u0000"+
		"UV\u0005a\u0000\u0000VW\u0005r\u0000\u0000W\f\u0001\u0000\u0000\u0000"+
		"XY\u0005p\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005"+
		"n\u0000\u0000\\]\u0005t\u0000\u0000]\u000e\u0001\u0000\u0000\u0000^_\u0005"+
		"i\u0000\u0000_`\u0005f\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005"+
		"e\u0000\u0000bc\u0005l\u0000\u0000cd\u0005s\u0000\u0000de\u0005e\u0000"+
		"\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005w\u0000\u0000gh\u0005h\u0000"+
		"\u0000hi\u0005i\u0000\u0000ij\u0005l\u0000\u0000jk\u0005e\u0000\u0000"+
		"k\u0014\u0001\u0000\u0000\u0000lm\u0005;\u0000\u0000m\u0016\u0001\u0000"+
		"\u0000\u0000no\u0005(\u0000\u0000o\u0018\u0001\u0000\u0000\u0000pq\u0005"+
		")\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005{\u0000\u0000s\u001c"+
		"\u0001\u0000\u0000\u0000tu\u0005}\u0000\u0000u\u001e\u0001\u0000\u0000"+
		"\u0000vz\u0005\"\u0000\u0000wy\u0007\u0000\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"\"\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u008a\u0001\u0000\u0000\u0000\u0084\u0086\u0005.\u0000\u0000"+
		"\u0085\u0087\u0007\u0001\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\"\u0001\u0000\u0000\u0000\u008c\u0090\u0007\u0002\u0000\u0000\u008d"+
		"\u008f\u0007\u0003\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091$\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005 \u0000\u0000\u0094\u0095\u0005"+
		"+\u0000\u0000\u0095\u0096\u0005 \u0000\u0000\u0096&\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005-\u0000\u0000\u0098(\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005*\u0000\u0000\u009a*\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"/\u0000\u0000\u009c,\u0001\u0000\u0000\u0000\u009d\u009e\u0005 \u0000"+
		"\u0000\u009e\u009f\u0005=\u0000\u0000\u009f\u00a0\u0005 \u0000\u0000\u00a0"+
		".\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2\u00a3\u0005"+
		"=\u0000\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4\u00a5\u0005 \u0000"+
		"\u0000\u00a50\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005!\u0000\u0000\u00a7"+
		"\u00a8\u0005=\u0000\u0000\u00a82\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		">\u0000\u0000\u00aa4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005 \u0000"+
		"\u0000\u00ac\u00ad\u0005<\u0000\u0000\u00ad\u00ae\u0005 \u0000\u0000\u00ae"+
		"6\u0001\u0000\u0000\u0000\u00af\u00b0\u0005>\u0000\u0000\u00b0\u00b1\u0005"+
		"=\u0000\u0000\u00b18\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005<\u0000"+
		"\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b4:\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005!\u0000\u0000\u00b6<\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"/\u0000\u0000\u00b8\u00b9\u0005/\u0000\u0000\u00b9\u00bd\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\t\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be>\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u0007\u0000z\u0082\u0088\u008a\u0090\u00bd"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}