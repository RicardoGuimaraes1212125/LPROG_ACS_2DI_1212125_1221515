// Generated from Frota.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FrotaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, STRING=38, 
		ID=39, NUM=40, DATA=41, WS=42;
	public static final int
		RULE_frota = 0, RULE_modelo = 1, RULE_certificacao = 2, RULE_drone = 3, 
		RULE_sensores = 4, RULE_sensor = 5, RULE_limites_operacionais = 6, RULE_limite = 7, 
		RULE_restricoes = 8, RULE_restricao = 9, RULE_estado = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"frota", "modelo", "certificacao", "drone", "sensores", "sensor", "limites_operacionais", 
			"limite", "restricoes", "restricao", "estado"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'modelo'", "'{'", "'capacidade:'", "'kg'", "'autonomia:'", "'min'", 
			"'velocidade:'", "'cruzeiro:'", "'km/h'", "'subida:'", "'descida:'", 
			"'}'", "'sensores:'", "'certificacoes:'", "','", "'limites:'", "'restricoes:'", 
			"'drone'", "'numero_serie:'", "'modelo:'", "'peso_base:'", "'bateria_atual:'", 
			"'%'", "'estado:'", "'horas_voo:'", "'ultima_manutencao:'", "'proxima_manutencao:'", 
			"'max_horas_voo='", "'max_altitude='", "'min_bateria='", "'max_peso='", 
			"'voo_diurno'", "'voo_noturno'", "'ativo'", "'manutencao'", "'inativo'", 
			"'em_missao'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "ID", "NUM", "DATA", "WS"
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
	public String getGrammarFileName() { return "Frota.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FrotaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FrotaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FrotaParser.EOF, 0); }
		public List<ModeloContext> modelo() {
			return getRuleContexts(ModeloContext.class);
		}
		public ModeloContext modelo(int i) {
			return getRuleContext(ModeloContext.class,i);
		}
		public List<DroneContext> drone() {
			return getRuleContexts(DroneContext.class);
		}
		public DroneContext drone(int i) {
			return getRuleContext(DroneContext.class,i);
		}
		public FrotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterFrota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitFrota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitFrota(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrotaContext frota() throws RecognitionException {
		FrotaContext _localctx = new FrotaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_frota);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__17) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(22);
					modelo();
					}
					break;
				case T__17:
					{
					setState(23);
					drone();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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

	public static class ModeloContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrotaParser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(FrotaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(FrotaParser.NUM, i);
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
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterModelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitModelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitModelo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeloContext modelo() throws RecognitionException {
		ModeloContext _localctx = new ModeloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(STRING);
			setState(33);
			match(T__1);
			setState(34);
			match(T__2);
			setState(35);
			match(NUM);
			setState(36);
			match(T__3);
			setState(37);
			match(T__4);
			setState(38);
			match(NUM);
			setState(39);
			match(T__5);
			setState(40);
			match(T__6);
			setState(41);
			match(T__1);
			setState(42);
			match(T__7);
			setState(43);
			match(NUM);
			setState(44);
			match(T__8);
			setState(45);
			match(T__9);
			setState(46);
			match(NUM);
			setState(47);
			match(T__8);
			setState(48);
			match(T__10);
			setState(49);
			match(NUM);
			setState(50);
			match(T__8);
			setState(51);
			match(T__11);
			setState(52);
			match(T__12);
			setState(53);
			sensores();
			setState(54);
			match(T__13);
			setState(55);
			certificacao();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(56);
				match(T__14);
				setState(57);
				certificacao();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(T__15);
			setState(64);
			limites_operacionais();
			setState(65);
			match(T__16);
			setState(66);
			restricoes();
			setState(67);
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
		public TerminalNode ID() { return getToken(FrotaParser.ID, 0); }
		public CertificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterCertificacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitCertificacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitCertificacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertificacaoContext certificacao() throws RecognitionException {
		CertificacaoContext _localctx = new CertificacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_certificacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	public static class DroneContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(FrotaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FrotaParser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(FrotaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(FrotaParser.NUM, i);
		}
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public List<TerminalNode> DATA() { return getTokens(FrotaParser.DATA); }
		public TerminalNode DATA(int i) {
			return getToken(FrotaParser.DATA, i);
		}
		public DroneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterDrone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitDrone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitDrone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DroneContext drone() throws RecognitionException {
		DroneContext _localctx = new DroneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_drone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__17);
			setState(72);
			match(STRING);
			setState(73);
			match(T__1);
			setState(74);
			match(T__18);
			setState(75);
			match(NUM);
			setState(76);
			match(T__19);
			setState(77);
			match(STRING);
			setState(78);
			match(T__20);
			setState(79);
			match(NUM);
			setState(80);
			match(T__3);
			setState(81);
			match(T__21);
			setState(82);
			match(NUM);
			setState(83);
			match(T__22);
			setState(84);
			match(T__23);
			setState(85);
			estado();
			setState(86);
			match(T__24);
			setState(87);
			match(NUM);
			setState(88);
			match(T__25);
			setState(89);
			match(DATA);
			setState(90);
			match(T__26);
			setState(91);
			match(DATA);
			setState(92);
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
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterSensores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitSensores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitSensores(this);
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
			setState(94);
			sensor();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(95);
				match(T__14);
				setState(96);
				sensor();
				}
				}
				setState(101);
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
		public TerminalNode ID() { return getToken(FrotaParser.ID, 0); }
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitSensor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitSensor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterLimites_operacionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitLimites_operacionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitLimites_operacionais(this);
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
			setState(104);
			limite();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(105);
				match(T__14);
				setState(106);
				limite();
				}
				}
				setState(111);
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
		public TerminalNode NUM() { return getToken(FrotaParser.NUM, 0); }
		public LimiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterLimite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitLimite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitLimite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimiteContext limite() throws RecognitionException {
		LimiteContext _localctx = new LimiteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limite);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__27);
				setState(113);
				match(NUM);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__28);
				setState(115);
				match(NUM);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__29);
				setState(117);
				match(NUM);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__30);
				setState(119);
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
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterRestricoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitRestricoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitRestricoes(this);
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
			setState(122);
			restricao();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(123);
				match(T__14);
				setState(124);
				restricao();
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

	public static class RestricaoContext extends ParserRuleContext {
		public RestricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterRestricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitRestricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitRestricao(this);
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
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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

	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitEstado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitEstado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3"+
		"\7\3\7\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t{\n\t\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\13\3\13"+
		"\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\"#\3\2$\'\2\u0086"+
		"\2\34\3\2\2\2\4!\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\n`\3\2\2\2\fh\3\2\2\2\16"+
		"j\3\2\2\2\20z\3\2\2\2\22|\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2\2\30"+
		"\33\5\4\3\2\31\33\5\b\5\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \3\3"+
		"\2\2\2!\"\7\3\2\2\"#\7(\2\2#$\7\4\2\2$%\7\5\2\2%&\7*\2\2&\'\7\6\2\2\'"+
		"(\7\7\2\2()\7*\2\2)*\7\b\2\2*+\7\t\2\2+,\7\4\2\2,-\7\n\2\2-.\7*\2\2./"+
		"\7\13\2\2/\60\7\f\2\2\60\61\7*\2\2\61\62\7\13\2\2\62\63\7\r\2\2\63\64"+
		"\7*\2\2\64\65\7\13\2\2\65\66\7\16\2\2\66\67\7\17\2\2\678\5\n\6\289\7\20"+
		"\2\29>\5\6\4\2:;\7\21\2\2;=\5\6\4\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\22\2\2BC\5\16\b\2CD\7\23\2\2DE\5\22\n\2"+
		"EF\7\16\2\2F\5\3\2\2\2GH\7)\2\2H\7\3\2\2\2IJ\7\24\2\2JK\7(\2\2KL\7\4\2"+
		"\2LM\7\25\2\2MN\7*\2\2NO\7\26\2\2OP\7(\2\2PQ\7\27\2\2QR\7*\2\2RS\7\6\2"+
		"\2ST\7\30\2\2TU\7*\2\2UV\7\31\2\2VW\7\32\2\2WX\5\26\f\2XY\7\33\2\2YZ\7"+
		"*\2\2Z[\7\34\2\2[\\\7+\2\2\\]\7\35\2\2]^\7+\2\2^_\7\16\2\2_\t\3\2\2\2"+
		"`e\5\f\7\2ab\7\21\2\2bd\5\f\7\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2"+
		"\2f\13\3\2\2\2ge\3\2\2\2hi\7)\2\2i\r\3\2\2\2jo\5\20\t\2kl\7\21\2\2ln\5"+
		"\20\t\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\17\3\2\2\2qo\3\2\2\2"+
		"rs\7\36\2\2s{\7*\2\2tu\7\37\2\2u{\7*\2\2vw\7 \2\2w{\7*\2\2xy\7!\2\2y{"+
		"\7*\2\2zr\3\2\2\2zt\3\2\2\2zv\3\2\2\2zx\3\2\2\2{\21\3\2\2\2|\u0081\5\24"+
		"\13\2}~\7\21\2\2~\u0080\5\24\13\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\t\2\2\2\u0085\25\3\2\2\2\u0086\u0087\t\3\2\2\u0087\27\3\2"+
		"\2\2\t\32\34>eoz\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}