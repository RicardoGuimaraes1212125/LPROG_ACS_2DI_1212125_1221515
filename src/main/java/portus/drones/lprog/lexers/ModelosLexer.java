// Generated from Modelos.g4 by ANTLR 4.9.2
package portus.drones.lprog.lexers;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, STRING=24, 
		ID=25, NUM=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "STRING", "ID", 
			"NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'modelo'", "'{'", "'capacidade:'", "'kg'", "'autonomia:'", "'min'", 
			"'velocidade:'", "'cruzeiro:'", "'km/h'", "'subida:'", "'descida:'", 
			"'}'", "'sensores:'", "'certificacoes:'", "','", "'limites:'", "'restricoes:'", 
			"'max_horas_voo='", "'max_altitude='", "'min_bateria='", "'max_peso='", 
			"'voo_diurno'", "'voo_noturno'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "ID", "NUM", "WS"
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


	public ModelosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Modelos.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u010c\n\31\f\31\16\31\u010f\13\31"+
		"\3\31\3\31\3\32\3\32\7\32\u0115\n\32\f\32\16\32\u0118\13\32\3\33\6\33"+
		"\u011b\n\33\r\33\16\33\u011c\3\33\3\33\6\33\u0121\n\33\r\33\16\33\u0122"+
		"\5\33\u0125\n\33\3\34\6\34\u0128\n\34\r\34\16\34\u0129\3\34\3\34\2\2\35"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\7"+
		"\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5@\3\2\2\2\7B\3\2\2\2\tN\3\2\2\2\13Q\3\2\2\2\r\\\3\2\2\2\17`\3\2"+
		"\2\2\21l\3\2\2\2\23v\3\2\2\2\25{\3\2\2\2\27\u0083\3\2\2\2\31\u008c\3\2"+
		"\2\2\33\u008e\3\2\2\2\35\u0098\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2"+
		"#\u00b2\3\2\2\2%\u00be\3\2\2\2\'\u00cd\3\2\2\2)\u00db\3\2\2\2+\u00e8\3"+
		"\2\2\2-\u00f2\3\2\2\2/\u00fd\3\2\2\2\61\u0109\3\2\2\2\63\u0112\3\2\2\2"+
		"\65\u011a\3\2\2\2\67\u0127\3\2\2\29:\7o\2\2:;\7q\2\2;<\7f\2\2<=\7g\2\2"+
		"=>\7n\2\2>?\7q\2\2?\4\3\2\2\2@A\7}\2\2A\6\3\2\2\2BC\7e\2\2CD\7c\2\2DE"+
		"\7r\2\2EF\7c\2\2FG\7e\2\2GH\7k\2\2HI\7f\2\2IJ\7c\2\2JK\7f\2\2KL\7g\2\2"+
		"LM\7<\2\2M\b\3\2\2\2NO\7m\2\2OP\7i\2\2P\n\3\2\2\2QR\7c\2\2RS\7w\2\2ST"+
		"\7v\2\2TU\7q\2\2UV\7p\2\2VW\7q\2\2WX\7o\2\2XY\7k\2\2YZ\7c\2\2Z[\7<\2\2"+
		"[\f\3\2\2\2\\]\7o\2\2]^\7k\2\2^_\7p\2\2_\16\3\2\2\2`a\7x\2\2ab\7g\2\2"+
		"bc\7n\2\2cd\7q\2\2de\7e\2\2ef\7k\2\2fg\7f\2\2gh\7c\2\2hi\7f\2\2ij\7g\2"+
		"\2jk\7<\2\2k\20\3\2\2\2lm\7e\2\2mn\7t\2\2no\7w\2\2op\7|\2\2pq\7g\2\2q"+
		"r\7k\2\2rs\7t\2\2st\7q\2\2tu\7<\2\2u\22\3\2\2\2vw\7m\2\2wx\7o\2\2xy\7"+
		"\61\2\2yz\7j\2\2z\24\3\2\2\2{|\7u\2\2|}\7w\2\2}~\7d\2\2~\177\7k\2\2\177"+
		"\u0080\7f\2\2\u0080\u0081\7c\2\2\u0081\u0082\7<\2\2\u0082\26\3\2\2\2\u0083"+
		"\u0084\7f\2\2\u0084\u0085\7g\2\2\u0085\u0086\7u\2\2\u0086\u0087\7e\2\2"+
		"\u0087\u0088\7k\2\2\u0088\u0089\7f\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7<\2\2\u008b\30\3\2\2\2\u008c\u008d\7\177\2\2\u008d\32\3\2\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\u0092\7u\2\2"+
		"\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7<\2\2\u0097\34\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7v\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7h\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\u00a2\7e\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7u\2\2\u00a5\u00a6\7<\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7.\2\2\u00a8 "+
		"\3\2\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\u00b1\7<\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g"+
		"\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7<\2\2\u00bd$\3\2\2\2\u00be\u00bf\7o\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7z\2\2\u00c1\u00c2\7a\2\2\u00c2\u00c3\7j\2\2"+
		"\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7?\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7z\2\2\u00d0\u00d1\7a\2\2\u00d1\u00d2\7c\2\2"+
		"\u00d2\u00d3\7n\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7?\2\2\u00da(\3\2\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7a\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7?\2\2\u00e7*\3\2\2\2\u00e8\u00e9"+
		"\7o\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7z\2\2\u00eb\u00ec\7a\2\2\u00ec"+
		"\u00ed\7r\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7q\2\2"+
		"\u00f0\u00f1\7?\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7x\2\2\u00f3\u00f4\7q\2"+
		"\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7a\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8"+
		"\7k\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7x\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7a\2\2\u0101\u0102\7p\2\2\u0102\u0103\7q\2\2"+
		"\u0103\u0104\7v\2\2\u0104\u0105\7w\2\2\u0105\u0106\7t\2\2\u0106\u0107"+
		"\7p\2\2\u0107\u0108\7q\2\2\u0108\60\3\2\2\2\u0109\u010d\7$\2\2\u010a\u010c"+
		"\n\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7$"+
		"\2\2\u0111\62\3\2\2\2\u0112\u0116\t\3\2\2\u0113\u0115\t\4\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\64\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\t\5\2\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0124"+
		"\3\2\2\2\u011e\u0120\7\60\2\2\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0125\3\2\2\2\u0125\66\3\2\2\2\u0126"+
		"\u0128\t\6\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b\34\2\2\u012c"+
		"8\3\2\2\2\t\2\u010d\u0116\u011c\u0122\u0124\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}