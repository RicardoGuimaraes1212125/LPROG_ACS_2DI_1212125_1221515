// Generated from Drones.g4 by ANTLR 4.9.2
package portus.drones.lprog.lexers;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DronesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, DATA=38, STRING=39, 
		ID=40, NUM=41, WS=42;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "DATA", "STRING", "ID", "NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'drone'", "'{'", "'numero_serie:'", "'modelo:'", "'peso_base:'", 
			"'kg'", "'bateria_atual:'", "'%'", "'estado:'", "'horas_voo:'", "'ultima_manutencao:'", 
			"'proxima_manutencao:'", "'}'", "'ativo'", "'manutencao'", "'inativo'", 
			"'em_missao'", "'modelo'", "'capacidade:'", "'autonomia:'", "'min'", 
			"'velocidade:'", "'cruzeiro:'", "'km/h'", "'subida:'", "'descida:'", 
			"'sensores:'", "'certificacoes:'", "','", "'limites:'", "'restricoes:'", 
			"'max_horas_voo='", "'max_altitude='", "'min_bateria='", "'max_peso='", 
			"'voo_diurno'", "'voo_noturno'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DATA", "STRING", "ID", "NUM", "WS"
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


	public DronesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Drones.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u01f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u01c6\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d1"+
		"\n\'\3(\3(\7(\u01d5\n(\f(\16(\u01d8\13(\3(\3(\3)\3)\7)\u01de\n)\f)\16"+
		")\u01e1\13)\3*\6*\u01e4\n*\r*\16*\u01e5\3*\3*\6*\u01ea\n*\r*\16*\u01eb"+
		"\5*\u01ee\n*\3+\6+\u01f1\n+\r+\16+\u01f2\3+\3+\2\2,\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,\3\2\n\3\2\62;\3\2\63;\3\2\62\64\3\2\63\64\5\2\f\f\17\17$$\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u01ff\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2"+
		"\2\5]\3\2\2\2\7_\3\2\2\2\tm\3\2\2\2\13u\3\2\2\2\r\u0080\3\2\2\2\17\u0083"+
		"\3\2\2\2\21\u0092\3\2\2\2\23\u0094\3\2\2\2\25\u009c\3\2\2\2\27\u00a7\3"+
		"\2\2\2\31\u00ba\3\2\2\2\33\u00ce\3\2\2\2\35\u00d0\3\2\2\2\37\u00d6\3\2"+
		"\2\2!\u00e1\3\2\2\2#\u00e9\3\2\2\2%\u00f3\3\2\2\2\'\u00fa\3\2\2\2)\u0106"+
		"\3\2\2\2+\u0111\3\2\2\2-\u0115\3\2\2\2/\u0121\3\2\2\2\61\u012b\3\2\2\2"+
		"\63\u0130\3\2\2\2\65\u0138\3\2\2\2\67\u0141\3\2\2\29\u014b\3\2\2\2;\u015a"+
		"\3\2\2\2=\u015c\3\2\2\2?\u0165\3\2\2\2A\u0171\3\2\2\2C\u0180\3\2\2\2E"+
		"\u018e\3\2\2\2G\u019b\3\2\2\2I\u01a5\3\2\2\2K\u01b0\3\2\2\2M\u01bc\3\2"+
		"\2\2O\u01d2\3\2\2\2Q\u01db\3\2\2\2S\u01e3\3\2\2\2U\u01f0\3\2\2\2WX\7f"+
		"\2\2XY\7t\2\2YZ\7q\2\2Z[\7p\2\2[\\\7g\2\2\\\4\3\2\2\2]^\7}\2\2^\6\3\2"+
		"\2\2_`\7p\2\2`a\7w\2\2ab\7o\2\2bc\7g\2\2cd\7t\2\2de\7q\2\2ef\7a\2\2fg"+
		"\7u\2\2gh\7g\2\2hi\7t\2\2ij\7k\2\2jk\7g\2\2kl\7<\2\2l\b\3\2\2\2mn\7o\2"+
		"\2no\7q\2\2op\7f\2\2pq\7g\2\2qr\7n\2\2rs\7q\2\2st\7<\2\2t\n\3\2\2\2uv"+
		"\7r\2\2vw\7g\2\2wx\7u\2\2xy\7q\2\2yz\7a\2\2z{\7d\2\2{|\7c\2\2|}\7u\2\2"+
		"}~\7g\2\2~\177\7<\2\2\177\f\3\2\2\2\u0080\u0081\7m\2\2\u0081\u0082\7i"+
		"\2\2\u0082\16\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7a\2\2\u008b\u008c\7c\2\2\u008c\u008d\7v\2\2"+
		"\u008d\u008e\7w\2\2\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7<\2\2\u0091\20\3\2\2\2\u0092\u0093\7\'\2\2\u0093\22\3\2\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7u\2\2\u0096\u0097\7v\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7f\2\2\u0099\u009a\7q\2\2\u009a\u009b\7<\2\2\u009b\24\3\2\2\2\u009c"+
		"\u009d\7j\2\2\u009d\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7u\2\2\u00a1\u00a2\7a\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4"+
		"\7q\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7<\2\2\u00a6\26\3\2\2\2\u00a7\u00a8"+
		"\7w\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7o\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7a\2\2\u00ae\u00af\7o\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7<\2\2\u00b9\30\3\2\2\2\u00ba"+
		"\u00bb\7r\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7z\2\2"+
		"\u00be\u00bf\7k\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7a\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2"+
		"\u00c9\u00ca\7e\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd"+
		"\7<\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7\177\2\2\u00cf\34\3\2\2\2\u00d0"+
		"\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7x\2\2"+
		"\u00d4\u00d5\7q\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7"+
		"c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7v\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7x\2\2"+
		"\u00e7\u00e8\7q\2\2\u00e8\"\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7o"+
		"\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef"+
		"\7u\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"$\3\2\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2\2\u00f9&\3\2\2\2\u00fa"+
		"\u00fb\7e\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7c\2\2"+
		"\u00fe\u00ff\7e\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7f\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7f\2\2\u0103\u0104\7g\2\2\u0104\u0105\7<\2\2\u0105"+
		"(\3\2\2\2\u0106\u0107\7c\2\2\u0107\u0108\7w\2\2\u0108\u0109\7v\2\2\u0109"+
		"\u010a\7q\2\2\u010a\u010b\7p\2\2\u010b\u010c\7q\2\2\u010c\u010d\7o\2\2"+
		"\u010d\u010e\7k\2\2\u010e\u010f\7c\2\2\u010f\u0110\7<\2\2\u0110*\3\2\2"+
		"\2\u0111\u0112\7o\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114,\3\2"+
		"\2\2\u0115\u0116\7x\2\2\u0116\u0117\7g\2\2\u0117\u0118\7n\2\2\u0118\u0119"+
		"\7q\2\2\u0119\u011a\7e\2\2\u011a\u011b\7k\2\2\u011b\u011c\7f\2\2\u011c"+
		"\u011d\7c\2\2\u011d\u011e\7f\2\2\u011e\u011f\7g\2\2\u011f\u0120\7<\2\2"+
		"\u0120.\3\2\2\2\u0121\u0122\7e\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2"+
		"\2\u0124\u0125\7|\2\2\u0125\u0126\7g\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7t\2\2\u0128\u0129\7q\2\2\u0129\u012a\7<\2\2\u012a\60\3\2\2\2\u012b\u012c"+
		"\7m\2\2\u012c\u012d\7o\2\2\u012d\u012e\7\61\2\2\u012e\u012f\7j\2\2\u012f"+
		"\62\3\2\2\2\u0130\u0131\7u\2\2\u0131\u0132\7w\2\2\u0132\u0133\7d\2\2\u0133"+
		"\u0134\7k\2\2\u0134\u0135\7f\2\2\u0135\u0136\7c\2\2\u0136\u0137\7<\2\2"+
		"\u0137\64\3\2\2\2\u0138\u0139\7f\2\2\u0139\u013a\7g\2\2\u013a\u013b\7"+
		"u\2\2\u013b\u013c\7e\2\2\u013c\u013d\7k\2\2\u013d\u013e\7f\2\2\u013e\u013f"+
		"\7c\2\2\u013f\u0140\7<\2\2\u0140\66\3\2\2\2\u0141\u0142\7u\2\2\u0142\u0143"+
		"\7g\2\2\u0143\u0144\7p\2\2\u0144\u0145\7u\2\2\u0145\u0146\7q\2\2\u0146"+
		"\u0147\7t\2\2\u0147\u0148\7g\2\2\u0148\u0149\7u\2\2\u0149\u014a\7<\2\2"+
		"\u014a8\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7g\2\2\u014d\u014e\7t\2"+
		"\2\u014e\u014f\7v\2\2\u014f\u0150\7k\2\2\u0150\u0151\7h\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7e\2\2\u0153\u0154\7c\2\2\u0154\u0155\7e\2\2\u0155"+
		"\u0156\7q\2\2\u0156\u0157\7g\2\2\u0157\u0158\7u\2\2\u0158\u0159\7<\2\2"+
		"\u0159:\3\2\2\2\u015a\u015b\7.\2\2\u015b<\3\2\2\2\u015c\u015d\7n\2\2\u015d"+
		"\u015e\7k\2\2\u015e\u015f\7o\2\2\u015f\u0160\7k\2\2\u0160\u0161\7v\2\2"+
		"\u0161\u0162\7g\2\2\u0162\u0163\7u\2\2\u0163\u0164\7<\2\2\u0164>\3\2\2"+
		"\2\u0165\u0166\7t\2\2\u0166\u0167\7g\2\2\u0167\u0168\7u\2\2\u0168\u0169"+
		"\7v\2\2\u0169\u016a\7t\2\2\u016a\u016b\7k\2\2\u016b\u016c\7e\2\2\u016c"+
		"\u016d\7q\2\2\u016d\u016e\7g\2\2\u016e\u016f\7u\2\2\u016f\u0170\7<\2\2"+
		"\u0170@\3\2\2\2\u0171\u0172\7o\2\2\u0172\u0173\7c\2\2\u0173\u0174\7z\2"+
		"\2\u0174\u0175\7a\2\2\u0175\u0176\7j\2\2\u0176\u0177\7q\2\2\u0177\u0178"+
		"\7t\2\2\u0178\u0179\7c\2\2\u0179\u017a\7u\2\2\u017a\u017b\7a\2\2\u017b"+
		"\u017c\7x\2\2\u017c\u017d\7q\2\2\u017d\u017e\7q\2\2\u017e\u017f\7?\2\2"+
		"\u017fB\3\2\2\2\u0180\u0181\7o\2\2\u0181\u0182\7c\2\2\u0182\u0183\7z\2"+
		"\2\u0183\u0184\7a\2\2\u0184\u0185\7c\2\2\u0185\u0186\7n\2\2\u0186\u0187"+
		"\7v\2\2\u0187\u0188\7k\2\2\u0188\u0189\7v\2\2\u0189\u018a\7w\2\2\u018a"+
		"\u018b\7f\2\2\u018b\u018c\7g\2\2\u018c\u018d\7?\2\2\u018dD\3\2\2\2\u018e"+
		"\u018f\7o\2\2\u018f\u0190\7k\2\2\u0190\u0191\7p\2\2\u0191\u0192\7a\2\2"+
		"\u0192\u0193\7d\2\2\u0193\u0194\7c\2\2\u0194\u0195\7v\2\2\u0195\u0196"+
		"\7g\2\2\u0196\u0197\7t\2\2\u0197\u0198\7k\2\2\u0198\u0199\7c\2\2\u0199"+
		"\u019a\7?\2\2\u019aF\3\2\2\2\u019b\u019c\7o\2\2\u019c\u019d\7c\2\2\u019d"+
		"\u019e\7z\2\2\u019e\u019f\7a\2\2\u019f\u01a0\7r\2\2\u01a0\u01a1\7g\2\2"+
		"\u01a1\u01a2\7u\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7?\2\2\u01a4H\3\2\2"+
		"\2\u01a5\u01a6\7x\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9"+
		"\7a\2\2\u01a9\u01aa\7f\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7w\2\2\u01ac"+
		"\u01ad\7t\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7q\2\2\u01afJ\3\2\2\2\u01b0"+
		"\u01b1\7x\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7q\2\2\u01b3\u01b4\7a\2\2"+
		"\u01b4\u01b5\7p\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8"+
		"\7w\2\2\u01b8\u01b9\7t\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7q\2\2\u01bb"+
		"L\3\2\2\2\u01bc\u01bd\t\2\2\2\u01bd\u01be\t\2\2\2\u01be\u01bf\t\2\2\2"+
		"\u01bf\u01c0\t\2\2\2\u01c0\u01c5\7/\2\2\u01c1\u01c2\7\62\2\2\u01c2\u01c6"+
		"\t\3\2\2\u01c3\u01c4\7\63\2\2\u01c4\u01c6\t\4\2\2\u01c5\u01c1\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01d0\7/\2\2\u01c8\u01c9"+
		"\7\62\2\2\u01c9\u01d1\t\3\2\2\u01ca\u01cb\t\5\2\2\u01cb\u01d1\t\2\2\2"+
		"\u01cc\u01cd\7\65\2\2\u01cd\u01d1\7\62\2\2\u01ce\u01cf\7\65\2\2\u01cf"+
		"\u01d1\7\63\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cc\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d1N\3\2\2\2\u01d2\u01d6\7$\2\2\u01d3\u01d5"+
		"\n\6\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7$"+
		"\2\2\u01daP\3\2\2\2\u01db\u01df\t\7\2\2\u01dc\u01de\t\b\2\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"R\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\t\2\2\2\u01e3\u01e2\3\2\2\2"+
		"\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ed"+
		"\3\2\2\2\u01e7\u01e9\7\60\2\2\u01e8\u01ea\t\2\2\2\u01e9\u01e8\3\2\2\2"+
		"\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee"+
		"\3\2\2\2\u01ed\u01e7\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeT\3\2\2\2\u01ef"+
		"\u01f1\t\t\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\b+\2\2\u01f5"+
		"V\3\2\2\2\13\2\u01c5\u01d0\u01d6\u01df\u01e5\u01eb\u01ed\u01f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}