// Generated from Frota.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FrotaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		RULE_frota = 0, RULE_drone = 1, RULE_estado = 2, RULE_drones = 3, RULE_modelo = 4, 
		RULE_certificacao = 5, RULE_sensores = 6, RULE_sensor = 7, RULE_limites_operacionais = 8, 
		RULE_limite = 9, RULE_restricoes = 10, RULE_restricao = 11, RULE_modelos = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"frota", "drone", "estado", "drones", "modelo", "certificacao", "sensores", 
			"sensor", "limites_operacionais", "limite", "restricoes", "restricao", 
			"modelos"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(26);
				drone();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		enterRule(_localctx, 2, RULE_drone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(STRING);
			setState(36);
			match(T__1);
			setState(37);
			match(T__2);
			setState(38);
			match(NUM);
			setState(39);
			match(T__3);
			setState(40);
			match(STRING);
			setState(41);
			match(T__4);
			setState(42);
			match(NUM);
			setState(43);
			match(T__5);
			setState(44);
			match(T__6);
			setState(45);
			match(NUM);
			setState(46);
			match(T__7);
			setState(47);
			match(T__8);
			setState(48);
			estado();
			setState(49);
			match(T__9);
			setState(50);
			match(NUM);
			setState(51);
			match(T__10);
			setState(52);
			match(DATA);
			setState(53);
			match(T__11);
			setState(54);
			match(DATA);
			setState(55);
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
		enterRule(_localctx, 4, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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

	public static class DronesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FrotaParser.EOF, 0); }
		public List<DroneContext> drone() {
			return getRuleContexts(DroneContext.class);
		}
		public DroneContext drone(int i) {
			return getRuleContext(DroneContext.class,i);
		}
		public DronesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterDrones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitDrones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitDrones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DronesContext drones() throws RecognitionException {
		DronesContext _localctx = new DronesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_drones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(59);
				drone();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
		enterRule(_localctx, 8, RULE_modelo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__17);
			setState(68);
			match(STRING);
			setState(69);
			match(T__1);
			setState(70);
			match(T__18);
			setState(71);
			match(NUM);
			setState(72);
			match(T__5);
			setState(73);
			match(T__19);
			setState(74);
			match(NUM);
			setState(75);
			match(T__20);
			setState(76);
			match(T__21);
			setState(77);
			match(T__1);
			setState(78);
			match(T__22);
			setState(79);
			match(NUM);
			setState(80);
			match(T__23);
			setState(81);
			match(T__24);
			setState(82);
			match(NUM);
			setState(83);
			match(T__23);
			setState(84);
			match(T__25);
			setState(85);
			match(NUM);
			setState(86);
			match(T__23);
			setState(87);
			match(T__12);
			setState(88);
			match(T__26);
			setState(89);
			sensores();
			setState(90);
			match(T__27);
			setState(91);
			certificacao();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(92);
				match(T__28);
				setState(93);
				certificacao();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__29);
			setState(100);
			limites_operacionais();
			setState(101);
			match(T__30);
			setState(102);
			restricoes();
			setState(103);
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
		enterRule(_localctx, 10, RULE_certificacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 12, RULE_sensores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			sensor();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(108);
				match(T__28);
				setState(109);
				sensor();
				}
				}
				setState(114);
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
		enterRule(_localctx, 14, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 16, RULE_limites_operacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			limite();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(118);
				match(T__28);
				setState(119);
				limite();
				}
				}
				setState(124);
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
		enterRule(_localctx, 18, RULE_limite);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__31);
				setState(126);
				match(NUM);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__32);
				setState(128);
				match(NUM);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(T__33);
				setState(130);
				match(NUM);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(T__34);
				setState(132);
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
		enterRule(_localctx, 20, RULE_restricoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			restricao();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(136);
				match(T__28);
				setState(137);
				restricao();
				}
				}
				setState(142);
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
		enterRule(_localctx, 22, RULE_restricao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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

	public static class ModelosContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FrotaParser.EOF, 0); }
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
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).enterModelos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrotaListener ) ((FrotaListener)listener).exitModelos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrotaVisitor ) return ((FrotaVisitor<? extends T>)visitor).visitModelos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelosContext modelos() throws RecognitionException {
		ModelosContext _localctx = new ModelosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modelos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(145);
				modelo();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u009c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b\3\t\3\t\3\n\3\n"+
		"\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0088\n\13\3\f\3\f\3\f\7\f\u008d\n\f\f\f\16\f\u0090\13\f\3\r\3\r\3"+
		"\16\7\16\u0095\n\16\f\16\16\16\u0098\13\16\3\16\3\16\3\16\2\2\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\4\3\2\20\23\3\2&\'\2\u0098\2\37\3\2\2\2"+
		"\4$\3\2\2\2\6;\3\2\2\2\b@\3\2\2\2\nE\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20"+
		"u\3\2\2\2\22w\3\2\2\2\24\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u0091\3\2\2"+
		"\2\32\u0096\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2"+
		"\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$%\7\3\2"+
		"\2%&\7)\2\2&\'\7\4\2\2\'(\7\5\2\2()\7+\2\2)*\7\6\2\2*+\7)\2\2+,\7\7\2"+
		"\2,-\7+\2\2-.\7\b\2\2./\7\t\2\2/\60\7+\2\2\60\61\7\n\2\2\61\62\7\13\2"+
		"\2\62\63\5\6\4\2\63\64\7\f\2\2\64\65\7+\2\2\65\66\7\r\2\2\66\67\7(\2\2"+
		"\678\7\16\2\289\7(\2\29:\7\17\2\2:\5\3\2\2\2;<\t\2\2\2<\7\3\2\2\2=?\5"+
		"\4\3\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7"+
		"\2\2\3D\t\3\2\2\2EF\7\24\2\2FG\7)\2\2GH\7\4\2\2HI\7\25\2\2IJ\7+\2\2JK"+
		"\7\b\2\2KL\7\26\2\2LM\7+\2\2MN\7\27\2\2NO\7\30\2\2OP\7\4\2\2PQ\7\31\2"+
		"\2QR\7+\2\2RS\7\32\2\2ST\7\33\2\2TU\7+\2\2UV\7\32\2\2VW\7\34\2\2WX\7+"+
		"\2\2XY\7\32\2\2YZ\7\17\2\2Z[\7\35\2\2[\\\5\16\b\2\\]\7\36\2\2]b\5\f\7"+
		"\2^_\7\37\2\2_a\5\f\7\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2db\3\2\2\2ef\7 \2\2fg\5\22\n\2gh\7!\2\2hi\5\26\f\2ij\7\17\2\2j\13"+
		"\3\2\2\2kl\7*\2\2l\r\3\2\2\2mr\5\20\t\2no\7\37\2\2oq\5\20\t\2pn\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tr\3\2\2\2uv\7*\2\2v\21\3"+
		"\2\2\2w|\5\24\13\2xy\7\37\2\2y{\5\24\13\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\23\3\2\2\2~|\3\2\2\2\177\u0080\7\"\2\2\u0080\u0088\7+\2"+
		"\2\u0081\u0082\7#\2\2\u0082\u0088\7+\2\2\u0083\u0084\7$\2\2\u0084\u0088"+
		"\7+\2\2\u0085\u0086\7%\2\2\u0086\u0088\7+\2\2\u0087\177\3\2\2\2\u0087"+
		"\u0081\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\25\3\2\2"+
		"\2\u0089\u008e\5\30\r\2\u008a\u008b\7\37\2\2\u008b\u008d\5\30\r\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\27\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\t\3\2\2\u0092\31"+
		"\3\2\2\2\u0093\u0095\5\n\6\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7\2\2\3\u009a\33\3\2\2\2\n\37@br|\u0087\u008e\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}