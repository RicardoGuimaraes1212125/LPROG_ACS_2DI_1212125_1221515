// Generated from Drones.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DronesParser extends Parser {
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
	public static final int
		RULE_drone = 0, RULE_estado = 1, RULE_modelo = 2, RULE_certificacao = 3, 
		RULE_sensores = 4, RULE_sensor = 5, RULE_limites_operacionais = 6, RULE_limite = 7, 
		RULE_restricoes = 8, RULE_restricao = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"drone", "estado", "modelo", "certificacao", "sensores", "sensor", "limites_operacionais", 
			"limite", "restricoes", "restricao"
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

	@Override
	public String getGrammarFileName() { return "Drones.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DronesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DroneContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(DronesParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DronesParser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(DronesParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(DronesParser.NUM, i);
		}
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public List<TerminalNode> DATA() { return getTokens(DronesParser.DATA); }
		public TerminalNode DATA(int i) {
			return getToken(DronesParser.DATA, i);
		}
		public DroneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterDrone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitDrone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitDrone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DroneContext drone() throws RecognitionException {
		DroneContext _localctx = new DroneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_drone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(STRING);
			setState(22);
			match(T__1);
			setState(23);
			match(T__2);
			setState(24);
			match(NUM);
			setState(25);
			match(T__3);
			setState(26);
			match(STRING);
			setState(27);
			match(T__4);
			setState(28);
			match(NUM);
			setState(29);
			match(T__5);
			setState(30);
			match(T__6);
			setState(31);
			match(NUM);
			setState(32);
			match(T__7);
			setState(33);
			match(T__8);
			setState(34);
			estado();
			setState(35);
			match(T__9);
			setState(36);
			match(NUM);
			setState(37);
			match(T__10);
			setState(38);
			match(DATA);
			setState(39);
			match(T__11);
			setState(40);
			match(DATA);
			setState(41);
			match(T__12);
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

	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitEstado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitEstado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ModeloContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DronesParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(DronesParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(DronesParser.NUM, i);
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
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterModelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitModelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitModelo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeloContext modelo() throws RecognitionException {
		ModeloContext _localctx = new ModeloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__17);
			setState(46);
			match(STRING);
			setState(47);
			match(T__1);
			setState(48);
			match(T__18);
			setState(49);
			match(NUM);
			setState(50);
			match(T__5);
			setState(51);
			match(T__19);
			setState(52);
			match(NUM);
			setState(53);
			match(T__20);
			setState(54);
			match(T__21);
			setState(55);
			match(T__1);
			setState(56);
			match(T__22);
			setState(57);
			match(NUM);
			setState(58);
			match(T__23);
			setState(59);
			match(T__24);
			setState(60);
			match(NUM);
			setState(61);
			match(T__23);
			setState(62);
			match(T__25);
			setState(63);
			match(NUM);
			setState(64);
			match(T__23);
			setState(65);
			match(T__12);
			setState(66);
			match(T__26);
			setState(67);
			sensores();
			setState(68);
			match(T__27);
			setState(69);
			certificacao();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(70);
				match(T__28);
				setState(71);
				certificacao();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__29);
			setState(78);
			limites_operacionais();
			setState(79);
			match(T__30);
			setState(80);
			restricoes();
			setState(81);
			match(T__12);
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
		public TerminalNode ID() { return getToken(DronesParser.ID, 0); }
		public CertificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterCertificacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitCertificacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitCertificacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertificacaoContext certificacao() throws RecognitionException {
		CertificacaoContext _localctx = new CertificacaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_certificacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterSensores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitSensores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitSensores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensoresContext sensores() throws RecognitionException {
		SensoresContext _localctx = new SensoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sensores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			sensor();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(86);
				match(T__28);
				setState(87);
				sensor();
				}
				}
				setState(92);
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
		public TerminalNode ID() { return getToken(DronesParser.ID, 0); }
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitSensor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitSensor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterLimites_operacionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitLimites_operacionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitLimites_operacionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limites_operacionaisContext limites_operacionais() throws RecognitionException {
		Limites_operacionaisContext _localctx = new Limites_operacionaisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_limites_operacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			limite();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(96);
				match(T__28);
				setState(97);
				limite();
				}
				}
				setState(102);
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
		public TerminalNode NUM() { return getToken(DronesParser.NUM, 0); }
		public LimiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterLimite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitLimite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitLimite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimiteContext limite() throws RecognitionException {
		LimiteContext _localctx = new LimiteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limite);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__31);
				setState(104);
				match(NUM);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__32);
				setState(106);
				match(NUM);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(T__33);
				setState(108);
				match(NUM);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(T__34);
				setState(110);
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
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterRestricoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitRestricoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitRestricoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestricoesContext restricoes() throws RecognitionException {
		RestricoesContext _localctx = new RestricoesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_restricoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			restricao();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(114);
				match(T__28);
				setState(115);
				restricao();
				}
				}
				setState(120);
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
			if ( listener instanceof DronesListener ) ((DronesListener)listener).enterRestricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DronesListener ) ((DronesListener)listener).exitRestricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DronesVisitor ) return ((DronesVisitor<? extends T>)visitor).visitRestricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestricaoContext restricao() throws RecognitionException {
		RestricaoContext _localctx = new RestricaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_restricao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,~\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4K"+
		"\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6[\n"+
		"\6\f\6\16\6^\13\6\3\7\3\7\3\b\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\n\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n"+
		"\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\20\23\3\2&\'\2z"+
		"\2\26\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f_\3\2\2\2\16"+
		"a\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24{\3\2\2\2\26\27\7\3\2\2\27\30\7)\2"+
		"\2\30\31\7\4\2\2\31\32\7\5\2\2\32\33\7+\2\2\33\34\7\6\2\2\34\35\7)\2\2"+
		"\35\36\7\7\2\2\36\37\7+\2\2\37 \7\b\2\2 !\7\t\2\2!\"\7+\2\2\"#\7\n\2\2"+
		"#$\7\13\2\2$%\5\4\3\2%&\7\f\2\2&\'\7+\2\2\'(\7\r\2\2()\7(\2\2)*\7\16\2"+
		"\2*+\7(\2\2+,\7\17\2\2,\3\3\2\2\2-.\t\2\2\2.\5\3\2\2\2/\60\7\24\2\2\60"+
		"\61\7)\2\2\61\62\7\4\2\2\62\63\7\25\2\2\63\64\7+\2\2\64\65\7\b\2\2\65"+
		"\66\7\26\2\2\66\67\7+\2\2\678\7\27\2\289\7\30\2\29:\7\4\2\2:;\7\31\2\2"+
		";<\7+\2\2<=\7\32\2\2=>\7\33\2\2>?\7+\2\2?@\7\32\2\2@A\7\34\2\2AB\7+\2"+
		"\2BC\7\32\2\2CD\7\17\2\2DE\7\35\2\2EF\5\n\6\2FG\7\36\2\2GL\5\b\5\2HI\7"+
		"\37\2\2IK\5\b\5\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL"+
		"\3\2\2\2OP\7 \2\2PQ\5\16\b\2QR\7!\2\2RS\5\22\n\2ST\7\17\2\2T\7\3\2\2\2"+
		"UV\7*\2\2V\t\3\2\2\2W\\\5\f\7\2XY\7\37\2\2Y[\5\f\7\2ZX\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2_`\7*\2\2`\r\3\2\2\2af"+
		"\5\20\t\2bc\7\37\2\2ce\5\20\t\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2g\17\3\2\2\2hf\3\2\2\2ij\7\"\2\2jr\7+\2\2kl\7#\2\2lr\7+\2\2mn\7$\2\2"+
		"nr\7+\2\2op\7%\2\2pr\7+\2\2qi\3\2\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\21"+
		"\3\2\2\2sx\5\24\13\2tu\7\37\2\2uw\5\24\13\2vt\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y\23\3\2\2\2zx\3\2\2\2{|\t\3\2\2|\25\3\2\2\2\7L\\fqx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}