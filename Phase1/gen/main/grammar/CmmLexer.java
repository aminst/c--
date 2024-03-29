// Generated from /home/fateme/fatemes/1400/compiler/ca/c--/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRUCT=1, MAIN=2, INT=3, BOOL=4, LIST=5, VOID=6, WHILE=7, DO=8, IF=9, 
		ELSE=10, RETURN=11, GET=12, SET=13, BEGIN=14, END=15, DISPLAY=16, APPEND=17, 
		SIZE=18, TRUE=19, FALSE=20, FPTR=21, NULL=22, LPAR=23, RPAR=24, LBRACKET=25, 
		RBRACKET=26, SEMICOLON=27, DOT=28, COMMA=29, SHARP=30, GT=31, LT=32, ASSIGN=33, 
		EQUAL=34, AESTRIK=35, DIVIDE=36, PLUS=37, MINUS=38, AND=39, OR=40, TILDE=41, 
		ARROW=42, IDENTIFIER=43, NUM=44, COMMENT=45, NEWLINE=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRUCT", "MAIN", "INT", "BOOL", "LIST", "VOID", "WHILE", "DO", "IF", 
			"ELSE", "RETURN", "GET", "SET", "BEGIN", "END", "DISPLAY", "APPEND", 
			"SIZE", "TRUE", "FALSE", "FPTR", "NULL", "LPAR", "RPAR", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "DOT", "COMMA", "SHARP", "GT", "LT", "ASSIGN", 
			"EQUAL", "AESTRIK", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "TILDE", 
			"ARROW", "IDENTIFIER", "NUM", "COMMENT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'main'", "'int'", "'bool'", "'list'", "'void'", "'while'", 
			"'do'", "'if'", "'else'", "'return'", "'get'", "'set'", "'begin'", "'end'", 
			"'display'", "'append'", "'size'", "'true'", "'false'", "'fptr'", "'null'", 
			"'('", "')'", "'['", "']'", "';'", "'.'", "','", "'#'", "'>'", "'<'", 
			"'='", "'=='", "'*'", "'/'", "'+'", "'-'", "'&'", "'|'", "'~'", "'->'", 
			null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRUCT", "MAIN", "INT", "BOOL", "LIST", "VOID", "WHILE", "DO", 
			"IF", "ELSE", "RETURN", "GET", "SET", "BEGIN", "END", "DISPLAY", "APPEND", 
			"SIZE", "TRUE", "FALSE", "FPTR", "NULL", "LPAR", "RPAR", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "DOT", "COMMA", "SHARP", "GT", "LT", "ASSIGN", 
			"EQUAL", "AESTRIK", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "TILDE", 
			"ARROW", "IDENTIFIER", "NUM", "COMMENT", "NEWLINE", "WS"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0122\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3+\3,\3,\7,\u0100\n,\f,\16,\u0103\13,\3-\3-\3-\7-\u0108"+
		"\n-\f-\16-\u010b\13-\5-\u010d\n-\3.\3.\3.\3.\7.\u0113\n.\f.\16.\u0116"+
		"\13.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\u0114\2\61\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\63"+
		";\3\2\62;\5\2\13\13\17\17\"\"\2\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5h\3\2\2\2\7m\3\2\2\2\tq\3"+
		"\2\2\2\13v\3\2\2\2\r{\3\2\2\2\17\u0080\3\2\2\2\21\u0086\3\2\2\2\23\u0089"+
		"\3\2\2\2\25\u008c\3\2\2\2\27\u0091\3\2\2\2\31\u0098\3\2\2\2\33\u009c\3"+
		"\2\2\2\35\u00a0\3\2\2\2\37\u00a6\3\2\2\2!\u00aa\3\2\2\2#\u00b2\3\2\2\2"+
		"%\u00b9\3\2\2\2\'\u00be\3\2\2\2)\u00c3\3\2\2\2+\u00c9\3\2\2\2-\u00ce\3"+
		"\2\2\2/\u00d3\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2"+
		"\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1\3\2\2\2?\u00e3"+
		"\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G\u00ec\3\2\2\2I"+
		"\u00ee\3\2\2\2K\u00f0\3\2\2\2M\u00f2\3\2\2\2O\u00f4\3\2\2\2Q\u00f6\3\2"+
		"\2\2S\u00f8\3\2\2\2U\u00fa\3\2\2\2W\u00fd\3\2\2\2Y\u010c\3\2\2\2[\u010e"+
		"\3\2\2\2]\u011c\3\2\2\2_\u011e\3\2\2\2ab\7u\2\2bc\7v\2\2cd\7t\2\2de\7"+
		"w\2\2ef\7e\2\2fg\7v\2\2g\4\3\2\2\2hi\7o\2\2ij\7c\2\2jk\7k\2\2kl\7p\2\2"+
		"l\6\3\2\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\b\3\2\2\2qr\7d\2\2rs\7q\2\2st"+
		"\7q\2\2tu\7n\2\2u\n\3\2\2\2vw\7n\2\2wx\7k\2\2xy\7u\2\2yz\7v\2\2z\f\3\2"+
		"\2\2{|\7x\2\2|}\7q\2\2}~\7k\2\2~\177\7f\2\2\177\16\3\2\2\2\u0080\u0081"+
		"\7y\2\2\u0081\u0082\7j\2\2\u0082\u0083\7k\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7g\2\2\u0085\20\3\2\2\2\u0086\u0087\7f\2\2\u0087\u0088\7q\2\2\u0088"+
		"\22\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\24\3\2\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2"+
		"\u0090\26\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7"+
		"v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2\u0097\30"+
		"\3\2\2\2\u0098\u0099\7i\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\u009f\7v\2\2\u009f"+
		"\34\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7i\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7f\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7f\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7n\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7{\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7c"+
		"\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7f\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7|\2\2\u00bc\u00bd\7g\2\2\u00bd&\3\2\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"(\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca"+
		"\u00cb\7r\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd,\3\2\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7n\2\2"+
		"\u00d2.\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7+\2\2"+
		"\u00d6\62\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7_\2"+
		"\2\u00da\66\3\2\2\2\u00db\u00dc\7=\2\2\u00dc8\3\2\2\2\u00dd\u00de\7\60"+
		"\2\2\u00de:\3\2\2\2\u00df\u00e0\7.\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7%\2"+
		"\2\u00e2>\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4@\3\2\2\2\u00e5\u00e6\7>\2\2"+
		"\u00e6B\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea"+
		"\u00eb\7?\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7,\2\2\u00edH\3\2\2\2\u00ee\u00ef"+
		"\7\61\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1L\3\2\2\2\u00f2\u00f3"+
		"\7/\2\2\u00f3N\3\2\2\2\u00f4\u00f5\7(\2\2\u00f5P\3\2\2\2\u00f6\u00f7\7"+
		"~\2\2\u00f7R\3\2\2\2\u00f8\u00f9\7\u0080\2\2\u00f9T\3\2\2\2\u00fa\u00fb"+
		"\7/\2\2\u00fb\u00fc\7@\2\2\u00fcV\3\2\2\2\u00fd\u0101\t\2\2\2\u00fe\u0100"+
		"\t\3\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102X\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010d\7\62\2\2"+
		"\u0105\u0109\t\4\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0105\3\2\2\2\u010dZ\3\2\2\2"+
		"\u010e\u010f\7\61\2\2\u010f\u0110\7,\2\2\u0110\u0114\3\2\2\2\u0111\u0113"+
		"\13\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118"+
		"\7,\2\2\u0118\u0119\7\61\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b.\2\2\u011b"+
		"\\\3\2\2\2\u011c\u011d\7\f\2\2\u011d^\3\2\2\2\u011e\u011f\t\6\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\b\60\2\2\u0121`\3\2\2\2\7\2\u0101\u0109\u010c"+
		"\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}