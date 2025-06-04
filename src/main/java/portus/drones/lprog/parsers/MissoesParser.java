package portus.drones.lprog.parsers;

// Generated from antlr4/Missoes.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import portus.drones.lprog.listeners.MissoesListener;
import portus.drones.lprog.visitors.MissoesVisitor;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MissoesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, STRING=26, HORA=27, NUM=28, WS=29;
	public static final int
		RULE_missoes = 0, RULE_missao = 1, RULE_entregas = 2, RULE_entrega = 3, 
		RULE_localizacao = 4, RULE_estado_missao = 5, RULE_coordenada = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"missoes", "missao", "entregas", "entrega", "localizacao", "estado_missao", 
			"coordenada"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'missao'", "'{'", "'inicio:'", "'drone:'", "'estado:'", "'rota:'", 
			"'['", "']'", "'}'", "','", "'origem:'", "'destino:'", "'distancia:'", 
			"'km'", "'altitude:'", "'m'", "'peso:'", "'kg'", "'latitude:'", "'longitude:'", 
			"'nome:'", "'planeada'", "'em_curso'", "'concluida'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "HORA", "NUM", "WS"
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
	public String getGrammarFileName() { return "Missoes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MissoesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MissoesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MissoesParser.EOF, 0); }
		public List<MissaoContext> missao() {
			return getRuleContexts(MissaoContext.class);
		}
		public MissaoContext missao(int i) {
			return getRuleContext(MissaoContext.class,i);
		}
		public MissoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener) ((MissoesListener)listener).enterMissoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitMissoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor) return ((MissoesVisitor<? extends T>)visitor).visitMissoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissoesContext missoes() throws RecognitionException {
		MissoesContext _localctx = new MissoesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_missoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(14);
				missao();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static class MissaoContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MissoesParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MissoesParser.STRING, i);
		}
		public TerminalNode HORA() { return getToken(MissoesParser.HORA, 0); }
		public Estado_missaoContext estado_missao() {
			return getRuleContext(Estado_missaoContext.class,0);
		}
		public EntregasContext entregas() {
			return getRuleContext(EntregasContext.class,0);
		}
		public MissaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).enterMissao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitMissao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor ) return ((MissoesVisitor<? extends T>)visitor).visitMissao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissaoContext missao() throws RecognitionException {
		MissaoContext _localctx = new MissaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_missao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(STRING);
			setState(24);
			match(T__1);
			setState(25);
			match(T__2);
			setState(26);
			match(HORA);
			setState(27);
			match(T__3);
			setState(28);
			match(STRING);
			setState(29);
			match(T__4);
			setState(30);
			estado_missao();
			setState(31);
			match(T__5);
			setState(32);
			match(T__6);
			setState(33);
			entregas();
			setState(34);
			match(T__7);
			setState(35);
			match(T__8);
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

	public static class EntregasContext extends ParserRuleContext {
		public List<EntregaContext> entrega() {
			return getRuleContexts(EntregaContext.class);
		}
		public EntregaContext entrega(int i) {
			return getRuleContext(EntregaContext.class,i);
		}
		public EntregasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entregas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).enterEntregas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitEntregas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor ) return ((MissoesVisitor<? extends T>)visitor).visitEntregas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntregasContext entregas() throws RecognitionException {
		EntregasContext _localctx = new EntregasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entregas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			entrega();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(38);
				match(T__9);
				setState(39);
				entrega();
				}
				}
				setState(44);
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

	public static class EntregaContext extends ParserRuleContext {
		public List<LocalizacaoContext> localizacao() {
			return getRuleContexts(LocalizacaoContext.class);
		}
		public LocalizacaoContext localizacao(int i) {
			return getRuleContext(LocalizacaoContext.class,i);
		}
		public List<TerminalNode> NUM() { return getTokens(MissoesParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MissoesParser.NUM, i);
		}
		public EntregaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrega; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).enterEntrega(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitEntrega(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor ) return ((MissoesVisitor<? extends T>)visitor).visitEntrega(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntregaContext entrega() throws RecognitionException {
		EntregaContext _localctx = new EntregaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entrega);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(T__10);
			setState(47);
			localizacao();
			setState(48);
			match(T__11);
			setState(49);
			localizacao();
			setState(50);
			match(T__12);
			setState(51);
			match(NUM);
			setState(52);
			match(T__13);
			setState(53);
			match(T__14);
			setState(54);
			match(NUM);
			setState(55);
			match(T__15);
			setState(56);
			match(T__16);
			setState(57);
			match(NUM);
			setState(58);
			match(T__17);
			setState(59);
			match(T__8);
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

	public static class LocalizacaoContext extends ParserRuleContext {
		public List<CoordenadaContext> coordenada() {
			return getRuleContexts(CoordenadaContext.class);
		}
		public CoordenadaContext coordenada(int i) {
			return getRuleContext(CoordenadaContext.class,i);
		}
		public TerminalNode STRING() { return getToken(MissoesParser.STRING, 0); }
		public LocalizacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localizacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).enterLocalizacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitLocalizacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor ) return ((MissoesVisitor<? extends T>)visitor).visitLocalizacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalizacaoContext localizacao() throws RecognitionException {
		LocalizacaoContext _localctx = new LocalizacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localizacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
			setState(62);
			match(T__18);
			setState(63);
			coordenada();
			setState(64);
			match(T__19);
			setState(65);
			coordenada();
			setState(66);
			match(T__20);
			setState(67);
			match(STRING);
			setState(68);
			match(T__8);
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

	public static class Estado_missaoContext extends ParserRuleContext {
		public Estado_missaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_missao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).enterEstado_missao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitEstado_missao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor ) return ((MissoesVisitor<? extends T>)visitor).visitEstado_missao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estado_missaoContext estado_missao() throws RecognitionException {
		Estado_missaoContext _localctx = new Estado_missaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estado_missao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class CoordenadaContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MissoesParser.NUM, 0); }
		public CoordenadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).enterCoordenada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MissoesListener ) ((MissoesListener)listener).exitCoordenada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MissoesVisitor ) return ((MissoesVisitor<? extends T>)visitor).visitCoordenada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordenadaContext coordenada() throws RecognitionException {
		CoordenadaContext _localctx = new CoordenadaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coordenada);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(NUM);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__24);
				setState(74);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\5\bN\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\30\32\2"+
		"K\2\23\3\2\2\2\4\30\3\2\2\2\6\'\3\2\2\2\b/\3\2\2\2\n?\3\2\2\2\fH\3\2\2"+
		"\2\16M\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2"+
		"\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2"+
		"\30\31\7\3\2\2\31\32\7\34\2\2\32\33\7\4\2\2\33\34\7\5\2\2\34\35\7\35\2"+
		"\2\35\36\7\6\2\2\36\37\7\34\2\2\37 \7\7\2\2 !\5\f\7\2!\"\7\b\2\2\"#\7"+
		"\t\2\2#$\5\6\4\2$%\7\n\2\2%&\7\13\2\2&\5\3\2\2\2\',\5\b\5\2()\7\f\2\2"+
		")+\5\b\5\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2"+
		"\2/\60\7\4\2\2\60\61\7\r\2\2\61\62\5\n\6\2\62\63\7\16\2\2\63\64\5\n\6"+
		"\2\64\65\7\17\2\2\65\66\7\36\2\2\66\67\7\20\2\2\678\7\21\2\289\7\36\2"+
		"\29:\7\22\2\2:;\7\23\2\2;<\7\36\2\2<=\7\24\2\2=>\7\13\2\2>\t\3\2\2\2?"+
		"@\7\4\2\2@A\7\25\2\2AB\5\16\b\2BC\7\26\2\2CD\5\16\b\2DE\7\27\2\2EF\7\34"+
		"\2\2FG\7\13\2\2G\13\3\2\2\2HI\t\2\2\2I\r\3\2\2\2JN\7\36\2\2KL\7\33\2\2"+
		"LN\7\36\2\2MJ\3\2\2\2MK\3\2\2\2N\17\3\2\2\2\5\23,M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}