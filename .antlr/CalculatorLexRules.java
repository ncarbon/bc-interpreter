// Generated from /Users/natalycarbonell/Documents/cop4020/Project2/CalculatorLexRules.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, AND=2, OR=3, GT=4, GE=5, LT=6, LE=7, EQ=8, IF=9, ELSE=10, WHILE=11, 
		FOR=12, DEFINE=13, RETURN=14, SQRT=15, READ=16, PRINT=17, SINE=18, COSINE=19, 
		LOG=20, EXP=21, COMMA=22, ID=23, LPAREN=24, RPAREN=25, LCUR=26, RCUR=27, 
		SEMI=28, PLUS=29, MINUS=30, MUL=31, DIV=32, MOD=33, PP=34, MM=35, ASS=36, 
		ASSADD=37, ASSMIN=38, ASSPROD=39, ASSDIV=40, ASSMOD=41, INTEGER_NUM=42, 
		DOUBLE_NUM=43, NEWLINE=44, WS=45, BlockComment=46, LineComment=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NOT", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "IF", "ELSE", "WHILE", 
		"FOR", "DEFINE", "RETURN", "SQRT", "READ", "PRINT", "SINE", "COSINE", 
		"LOG", "EXP", "COMMA", "ID", "LPAREN", "RPAREN", "LCUR", "RCUR", "SEMI", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "PP", "MM", "ASS", "ASSADD", "ASSMIN", 
		"ASSPROD", "ASSDIV", "ASSMOD", "INTEGER_NUM", "DOUBLE_NUM", "DIGIT", "NEWLINE", 
		"WS", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", "'=='", "'if'", 
		"'else'", "'while'", "'for'", "'define'", "'return'", "'sqrt'", "'read'", 
		"'print'", "'s'", "'c'", "'l'", "'e'", "','", null, "'('", "')'", "'{'", 
		"'}'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'='", 
		"'+='", "'-='", "'*='", "'/='", "'%='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOT", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "IF", "ELSE", 
		"WHILE", "FOR", "DEFINE", "RETURN", "SQRT", "READ", "PRINT", "SINE", "COSINE", 
		"LOG", "EXP", "COMMA", "ID", "LPAREN", "RPAREN", "LCUR", "RCUR", "SEMI", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "PP", "MM", "ASS", "ASSADD", "ASSMIN", 
		"ASSPROD", "ASSDIV", "ASSMOD", "INTEGER_NUM", "DOUBLE_NUM", "NEWLINE", 
		"WS", "BlockComment", "LineComment"
	};
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


	public CalculatorLexRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorLexRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u00b4"+
		"\n\30\r\30\16\30\u00b5\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3-\6"+
		"-\u00ea\n-\r-\16-\u00eb\3.\5.\u00ef\n.\3.\3.\3/\6/\u00f4\n/\r/\16/\u00f5"+
		"\3/\3/\3\60\3\60\3\60\3\60\7\60\u00fe\n\60\f\60\16\60\u0101\13\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u010c\n\61\f\61\16\61\u010f"+
		"\13\61\3\61\3\61\3\u00ff\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/_\60"+
		"a\61\3\2\6\4\2C\\c|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\2\u0116\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2"+
		"\5e\3\2\2\2\7h\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21"+
		"u\3\2\2\2\23x\3\2\2\2\25{\3\2\2\2\27\u0080\3\2\2\2\31\u0086\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u0091\3\2\2\2\37\u0098\3\2\2\2!\u009d\3\2\2\2#\u00a2"+
		"\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac\3\2\2\2+\u00ae\3\2\2\2"+
		"-\u00b0\3\2\2\2/\u00b3\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb"+
		"\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2"+
		"?\u00c5\3\2\2\2A\u00c7\3\2\2\2C\u00c9\3\2\2\2E\u00cb\3\2\2\2G\u00ce\3"+
		"\2\2\2I\u00d1\3\2\2\2K\u00d3\3\2\2\2M\u00d6\3\2\2\2O\u00d9\3\2\2\2Q\u00dc"+
		"\3\2\2\2S\u00df\3\2\2\2U\u00e2\3\2\2\2W\u00e4\3\2\2\2Y\u00e9\3\2\2\2["+
		"\u00ee\3\2\2\2]\u00f3\3\2\2\2_\u00f9\3\2\2\2a\u0107\3\2\2\2cd\7#\2\2d"+
		"\4\3\2\2\2ef\7(\2\2fg\7(\2\2g\6\3\2\2\2hi\7~\2\2ij\7~\2\2j\b\3\2\2\2k"+
		"l\7@\2\2l\n\3\2\2\2mn\7@\2\2no\7?\2\2o\f\3\2\2\2pq\7>\2\2q\16\3\2\2\2"+
		"rs\7>\2\2st\7?\2\2t\20\3\2\2\2uv\7?\2\2vw\7?\2\2w\22\3\2\2\2xy\7k\2\2"+
		"yz\7h\2\2z\24\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2\177\26\3"+
		"\2\2\2\u0080\u0081\7y\2\2\u0081\u0082\7j\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085\30\3\2\2\2\u0086\u0087\7h\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089\32\3\2\2\2\u008a\u008b\7f\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7h\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2"+
		"\u008f\u0090\7g\2\2\u0090\34\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7"+
		"g\2\2\u0093\u0094\7v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097"+
		"\7p\2\2\u0097\36\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7s\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7v\2\2\u009c \3\2\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\"\3\2\2\2\u00a2\u00a3"+
		"\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9&\3\2\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7n\2\2\u00ad*\3\2\2\2\u00ae\u00af\7"+
		"g\2\2\u00af,\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1.\3\2\2\2\u00b2\u00b4\t\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\62\3\2\2\2\u00b9"+
		"\u00ba\7+\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc\66\3\2\2\2\u00bd"+
		"\u00be\7\177\2\2\u00be8\3\2\2\2\u00bf\u00c0\7=\2\2\u00c0:\3\2\2\2\u00c1"+
		"\u00c2\7-\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4>\3\2\2\2\u00c5\u00c6"+
		"\7,\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8B\3\2\2\2\u00c9\u00ca"+
		"\7\'\2\2\u00caD\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\7-\2\2\u00cdF\3"+
		"\2\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d0\7/\2\2\u00d0H\3\2\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\7?\2\2\u00d5L\3"+
		"\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\7?\2\2\u00d8N\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da\u00db\7?\2\2\u00dbP\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de"+
		"\7?\2\2\u00deR\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0\u00e1\7?\2\2\u00e1T\3"+
		"\2\2\2\u00e2\u00e3\5Y-\2\u00e3V\3\2\2\2\u00e4\u00e5\5Y-\2\u00e5\u00e6"+
		"\7\60\2\2\u00e6\u00e7\5Y-\2\u00e7X\3\2\2\2\u00e8\u00ea\t\3\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"Z\3\2\2\2\u00ed\u00ef\7\17\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\f\2\2\u00f1\\\3\2\2\2\u00f2\u00f4\t"+
		"\4\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b/\2\2\u00f8^\3\2\2\2\u00f9"+
		"\u00fa\7\61\2\2\u00fa\u00fb\7,\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\13"+
		"\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7,"+
		"\2\2\u0103\u0104\7\61\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\60\2\2\u0106"+
		"`\3\2\2\2\u0107\u0108\7\61\2\2\u0108\u0109\7\61\2\2\u0109\u010d\3\2\2"+
		"\2\u010a\u010c\n\5\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\b\61\2\2\u0111b\3\2\2\2\t\2\u00b5\u00eb\u00ee\u00f5\u00ff\u010d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}