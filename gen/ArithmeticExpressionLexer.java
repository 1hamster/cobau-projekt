// Generated from C:/Users/Leo/IdeaProjects/cobau-projekt/grammar\ArithmeticExpression.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
			null, "'\"'", "'true'", "'false'", "'and'", "'or'", "'var'", "'print'", 
			"'if'", "'else'", "'while'", "';'", "'('", "')'", "'{'", "'}'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'!'"
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
		"\u0004\u0000\u001f\u00b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000fx\b\u000f"+
		"\n\u000f\f\u000f{\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"\u0080\b\u0010\u000b\u0010\f\u0010\u0081\u0001\u0010\u0001\u0010\u0004"+
		"\u0010\u0086\b\u0010\u000b\u0010\f\u0010\u0087\u0003\u0010\u008a\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u008e\b\u0011\n\u0011\f\u0011\u0091"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u00b3\b\u001e\n\u001e\f\u001e"+
		"\u00b6\t\u001e\u0001\u00b4\u0000\u001f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f\u0001\u0000\u0004\u0002\u0000\"\"^^\u0001\u0000"+
		"09\u0002\u0000AZaz\u0003\u000009AZaz\u00bc\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?"+
		"\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005F\u0001\u0000"+
		"\u0000\u0000\u0007L\u0001\u0000\u0000\u0000\tP\u0001\u0000\u0000\u0000"+
		"\u000bS\u0001\u0000\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000f]\u0001"+
		"\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000"+
		"\u0000\u0015k\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019"+
		"o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001ds\u0001"+
		"\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!\u007f\u0001\u0000\u0000"+
		"\u0000#\u008b\u0001\u0000\u0000\u0000%\u0092\u0001\u0000\u0000\u0000\'"+
		"\u0094\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000+\u0098\u0001"+
		"\u0000\u0000\u0000-\u009a\u0001\u0000\u0000\u0000/\u009c\u0001\u0000\u0000"+
		"\u00001\u009f\u0001\u0000\u0000\u00003\u00a2\u0001\u0000\u0000\u00005"+
		"\u00a4\u0001\u0000\u0000\u00007\u00a6\u0001\u0000\u0000\u00009\u00a9\u0001"+
		"\u0000\u0000\u0000;\u00ac\u0001\u0000\u0000\u0000=\u00ae\u0001\u0000\u0000"+
		"\u0000?@\u0005\"\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005t\u0000"+
		"\u0000BC\u0005r\u0000\u0000CD\u0005u\u0000\u0000DE\u0005e\u0000\u0000"+
		"E\u0004\u0001\u0000\u0000\u0000FG\u0005f\u0000\u0000GH\u0005a\u0000\u0000"+
		"HI\u0005l\u0000\u0000IJ\u0005s\u0000\u0000JK\u0005e\u0000\u0000K\u0006"+
		"\u0001\u0000\u0000\u0000LM\u0005a\u0000\u0000MN\u0005n\u0000\u0000NO\u0005"+
		"d\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005"+
		"r\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005v\u0000\u0000TU\u0005"+
		"a\u0000\u0000UV\u0005r\u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005"+
		"p\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000"+
		"\u0000[\\\u0005t\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005i"+
		"\u0000\u0000^_\u0005f\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`a\u0005"+
		"e\u0000\u0000ab\u0005l\u0000\u0000bc\u0005s\u0000\u0000cd\u0005e\u0000"+
		"\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0005w\u0000\u0000fg\u0005h\u0000"+
		"\u0000gh\u0005i\u0000\u0000hi\u0005l\u0000\u0000ij\u0005e\u0000\u0000"+
		"j\u0014\u0001\u0000\u0000\u0000kl\u0005;\u0000\u0000l\u0016\u0001\u0000"+
		"\u0000\u0000mn\u0005(\u0000\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005"+
		")\u0000\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005{\u0000\u0000r\u001c"+
		"\u0001\u0000\u0000\u0000st\u0005}\u0000\u0000t\u001e\u0001\u0000\u0000"+
		"\u0000uy\u0005\"\u0000\u0000vx\u0007\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005"+
		"\"\u0000\u0000} \u0001\u0000\u0000\u0000~\u0080\u0007\u0001\u0000\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0089\u0001\u0000\u0000\u0000\u0083\u0085\u0005.\u0000\u0000\u0084\u0086"+
		"\u0007\u0001\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0083"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\"\u0001"+
		"\u0000\u0000\u0000\u008b\u008f\u0007\u0002\u0000\u0000\u008c\u008e\u0007"+
		"\u0003\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005+\u0000\u0000\u0093&\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005-\u0000\u0000\u0095(\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005*\u0000\u0000\u0097*\u0001\u0000\u0000\u0000\u0098\u0099\u0005/"+
		"\u0000\u0000\u0099,\u0001\u0000\u0000\u0000\u009a\u009b\u0005=\u0000\u0000"+
		"\u009b.\u0001\u0000\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d\u009e"+
		"\u0005=\u0000\u0000\u009e0\u0001\u0000\u0000\u0000\u009f\u00a0\u0005!"+
		"\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a12\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005>\u0000\u0000\u00a34\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005<\u0000\u0000\u00a56\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005>"+
		"\u0000\u0000\u00a7\u00a8\u0005=\u0000\u0000\u00a88\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005<\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab:"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad<\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b0\u0005/\u0000\u0000"+
		"\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b3\t\u0000\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5"+
		">\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u0007\u0000"+
		"y\u0081\u0087\u0089\u008f\u00b4\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}