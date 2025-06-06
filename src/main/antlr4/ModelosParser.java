// Generated from Modelos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, STRING=24, 
		ID=25, NUM=26, WS=27;
	public static final int
		RULE_modelo = 0, RULE_certificacao = 1, RULE_sensores = 2, RULE_sensor = 3, 
		RULE_limites_operacionais = 4, RULE_limite = 5, RULE_restricoes = 6, RULE_restricao = 7, 
		RULE_modelos = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"modelo", "certificacao", "sensores", "sensor", "limites_operacionais", 
			"limite", "restricoes", "restricao", "modelos"
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

	@Override
	public String getGrammarFileName() { return "Modelos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModeloContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ModelosParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(ModelosParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ModelosParser.NUM, i);
		}
		public SensoresContext sensores() {
			return getRuleContext(SensoresContext.class,0);
		}
		public List<CertificacaoContext> certificacao() {
			return getRuleContexts(CertificacaoContext.class);
		}
		public CertificacaoContext certificacao(int i) {
			return getRuleContext(CertificacaoContext.class,i);
		}
		public Limites_operacionaisContext limites_operacionais() {
			return getRuleContext(Limites_operacionaisContext.class,0);
		}
		public RestricoesContext restricoes() {
			return getRuleContext(RestricoesContext.class,0);
		}
		public ModeloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterModelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitModelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitModelo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeloContext modelo() throws RecognitionException {
		ModeloContext _localctx = new ModeloContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modelo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(STRING);
			setState(20);
			match(T__1);
			setState(21);
			match(T__2);
			setState(22);
			match(NUM);
			setState(23);
			match(T__3);
			setState(24);
			match(T__4);
			setState(25);
			match(NUM);
			setState(26);
			match(T__5);
			setState(27);
			match(T__6);
			setState(28);
			match(T__1);
			setState(29);
			match(T__7);
			setState(30);
			match(NUM);
			setState(31);
			match(T__8);
			setState(32);
			match(T__9);
			setState(33);
			match(NUM);
			setState(34);
			match(T__8);
			setState(35);
			match(T__10);
			setState(36);
			match(NUM);
			setState(37);
			match(T__8);
			setState(38);
			match(T__11);
			setState(39);
			match(T__12);
			setState(40);
			sensores();
			setState(41);
			match(T__13);
			setState(42);
			certificacao();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(43);
				match(T__14);
				setState(44);
				certificacao();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__15);
			setState(51);
			limites_operacionais();
			setState(52);
			match(T__16);
			setState(53);
			restricoes();
			setState(54);
			match(T__11);
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

	public static class CertificacaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ModelosParser.ID, 0); }
		public CertificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterCertificacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitCertificacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitCertificacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertificacaoContext certificacao() throws RecognitionException {
		CertificacaoContext _localctx = new CertificacaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_certificacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
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

	public static class SensoresContext extends ParserRuleContext {
		public List<SensorContext> sensor() {
			return getRuleContexts(SensorContext.class);
		}
		public SensorContext sensor(int i) {
			return getRuleContext(SensorContext.class,i);
		}
		public SensoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterSensores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitSensores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitSensores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensoresContext sensores() throws RecognitionException {
		SensoresContext _localctx = new SensoresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sensores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			sensor();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(59);
				match(T__14);
				setState(60);
				sensor();
				}
				}
				setState(65);
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

	public static class SensorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ModelosParser.ID, 0); }
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitSensor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitSensor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
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

	public static class Limites_operacionaisContext extends ParserRuleContext {
		public List<LimiteContext> limite() {
			return getRuleContexts(LimiteContext.class);
		}
		public LimiteContext limite(int i) {
			return getRuleContext(LimiteContext.class,i);
		}
		public Limites_operacionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limites_operacionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterLimites_operacionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitLimites_operacionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitLimites_operacionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limites_operacionaisContext limites_operacionais() throws RecognitionException {
		Limites_operacionaisContext _localctx = new Limites_operacionaisContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limites_operacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			limite();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(69);
				match(T__14);
				setState(70);
				limite();
				}
				}
				setState(75);
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

	public static class LimiteContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ModelosParser.NUM, 0); }
		public LimiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterLimite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitLimite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitLimite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimiteContext limite() throws RecognitionException {
		LimiteContext _localctx = new LimiteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limite);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__17);
				setState(77);
				match(NUM);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__18);
				setState(79);
				match(NUM);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T__19);
				setState(81);
				match(NUM);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(T__20);
				setState(83);
				match(NUM);
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

	public static class RestricoesContext extends ParserRuleContext {
		public List<RestricaoContext> restricao() {
			return getRuleContexts(RestricaoContext.class);
		}
		public RestricaoContext restricao(int i) {
			return getRuleContext(RestricaoContext.class,i);
		}
		public RestricoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterRestricoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitRestricoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitRestricoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestricoesContext restricoes() throws RecognitionException {
		RestricoesContext _localctx = new RestricoesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_restricoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			restricao();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(87);
				match(T__14);
				setState(88);
				restricao();
				}
				}
				setState(93);
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

	public static class RestricaoContext extends ParserRuleContext {
		public RestricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterRestricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitRestricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitRestricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestricaoContext restricao() throws RecognitionException {
		RestricaoContext _localctx = new RestricaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_restricao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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

	public static class ModelosContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ModelosParser.EOF, 0); }
		public List<ModeloContext> modelo() {
			return getRuleContexts(ModeloContext.class);
		}
		public ModeloContext modelo(int i) {
			return getRuleContext(ModeloContext.class,i);
		}
		public ModelosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).enterModelos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelosListener ) ((ModelosListener)listener).exitModelos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModelosVisitor ) return ((ModelosVisitor<? extends T>)visitor).visitModelos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelosContext modelos() throws RecognitionException {
		ModelosContext _localctx = new ModelosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modelos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(96);
				modelo();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\5\3\5\3\6\3\6\3"+
		"\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7W\n\7\3"+
		"\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\t\3\t\3\n\7\nd\n\n\f\n\16\ng\13"+
		"\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\30\31\2i\2\24\3\2\2"+
		"\2\4:\3\2\2\2\6<\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2"+
		"\20`\3\2\2\2\22e\3\2\2\2\24\25\7\3\2\2\25\26\7\32\2\2\26\27\7\4\2\2\27"+
		"\30\7\5\2\2\30\31\7\34\2\2\31\32\7\6\2\2\32\33\7\7\2\2\33\34\7\34\2\2"+
		"\34\35\7\b\2\2\35\36\7\t\2\2\36\37\7\4\2\2\37 \7\n\2\2 !\7\34\2\2!\"\7"+
		"\13\2\2\"#\7\f\2\2#$\7\34\2\2$%\7\13\2\2%&\7\r\2\2&\'\7\34\2\2\'(\7\13"+
		"\2\2()\7\16\2\2)*\7\17\2\2*+\5\6\4\2+,\7\20\2\2,\61\5\4\3\2-.\7\21\2\2"+
		".\60\5\4\3\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3"+
		"\2\2\2\63\61\3\2\2\2\64\65\7\22\2\2\65\66\5\n\6\2\66\67\7\23\2\2\678\5"+
		"\16\b\289\7\16\2\29\3\3\2\2\2:;\7\33\2\2;\5\3\2\2\2<A\5\b\5\2=>\7\21\2"+
		"\2>@\5\b\5\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2"+
		"\2\2DE\7\33\2\2E\t\3\2\2\2FK\5\f\7\2GH\7\21\2\2HJ\5\f\7\2IG\3\2\2\2JM"+
		"\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2MK\3\2\2\2NO\7\24\2\2OW\7\34\2"+
		"\2PQ\7\25\2\2QW\7\34\2\2RS\7\26\2\2SW\7\34\2\2TU\7\27\2\2UW\7\34\2\2V"+
		"N\3\2\2\2VP\3\2\2\2VR\3\2\2\2VT\3\2\2\2W\r\3\2\2\2X]\5\20\t\2YZ\7\21\2"+
		"\2Z\\\5\20\t\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_]"+
		"\3\2\2\2`a\t\2\2\2a\21\3\2\2\2bd\5\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\2\2\3i\23\3\2\2\2\b\61AKV]e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}