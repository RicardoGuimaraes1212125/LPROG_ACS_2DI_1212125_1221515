# Generated from Missoes.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,19,51,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,5,0,10,8,0,10,0,12,
        0,13,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,2,1,2,1,2,5,2,33,8,2,10,2,12,2,36,9,2,1,3,1,3,1,3,1,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,0,0,4,0,2,4,6,0,0,48,0,11,1,
        0,0,0,2,16,1,0,0,0,4,29,1,0,0,0,6,37,1,0,0,0,8,10,3,2,1,0,9,8,1,
        0,0,0,10,13,1,0,0,0,11,9,1,0,0,0,11,12,1,0,0,0,12,14,1,0,0,0,13,
        11,1,0,0,0,14,15,5,0,0,1,15,1,1,0,0,0,16,17,5,1,0,0,17,18,5,16,0,
        0,18,19,5,2,0,0,19,20,5,3,0,0,20,21,5,17,0,0,21,22,5,4,0,0,22,23,
        5,16,0,0,23,24,5,5,0,0,24,25,5,6,0,0,25,26,3,4,2,0,26,27,5,7,0,0,
        27,28,5,8,0,0,28,3,1,0,0,0,29,34,3,6,3,0,30,31,5,9,0,0,31,33,3,6,
        3,0,32,30,1,0,0,0,33,36,1,0,0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,5,
        1,0,0,0,36,34,1,0,0,0,37,38,5,2,0,0,38,39,5,10,0,0,39,40,5,16,0,
        0,40,41,5,11,0,0,41,42,5,16,0,0,42,43,5,12,0,0,43,44,5,18,0,0,44,
        45,5,13,0,0,45,46,5,14,0,0,46,47,5,18,0,0,47,48,5,15,0,0,48,49,5,
        8,0,0,49,7,1,0,0,0,2,11,34
    ]

class MissoesParser ( Parser ):

    grammarFileName = "Missoes.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'missao'", "'{'", "'inicio:'", "'drone:'", 
                     "'rota:'", "'['", "']'", "'}'", "','", "'origem:'", 
                     "'destino:'", "'distancia:'", "'km'", "'altitude:'", 
                     "'m'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "STRING", "HORA", "NUM", "WS" ]

    RULE_missoes = 0
    RULE_missao = 1
    RULE_entregas = 2
    RULE_entrega = 3

    ruleNames =  [ "missoes", "missao", "entregas", "entrega" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    STRING=16
    HORA=17
    NUM=18
    WS=19

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class MissoesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MissoesParser.EOF, 0)

        def missao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MissoesParser.MissaoContext)
            else:
                return self.getTypedRuleContext(MissoesParser.MissaoContext,i)


        def getRuleIndex(self):
            return MissoesParser.RULE_missoes

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMissoes" ):
                listener.enterMissoes(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMissoes" ):
                listener.exitMissoes(self)




    def missoes(self):

        localctx = MissoesParser.MissoesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_missoes)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==1:
                self.state = 8
                self.missao()
                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 14
            self.match(MissoesParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MissaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(MissoesParser.STRING)
            else:
                return self.getToken(MissoesParser.STRING, i)

        def HORA(self):
            return self.getToken(MissoesParser.HORA, 0)

        def entregas(self):
            return self.getTypedRuleContext(MissoesParser.EntregasContext,0)


        def getRuleIndex(self):
            return MissoesParser.RULE_missao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMissao" ):
                listener.enterMissao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMissao" ):
                listener.exitMissao(self)




    def missao(self):

        localctx = MissoesParser.MissaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_missao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self.match(MissoesParser.T__0)
            self.state = 17
            self.match(MissoesParser.STRING)
            self.state = 18
            self.match(MissoesParser.T__1)
            self.state = 19
            self.match(MissoesParser.T__2)
            self.state = 20
            self.match(MissoesParser.HORA)
            self.state = 21
            self.match(MissoesParser.T__3)
            self.state = 22
            self.match(MissoesParser.STRING)
            self.state = 23
            self.match(MissoesParser.T__4)
            self.state = 24
            self.match(MissoesParser.T__5)
            self.state = 25
            self.entregas()
            self.state = 26
            self.match(MissoesParser.T__6)
            self.state = 27
            self.match(MissoesParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EntregasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def entrega(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MissoesParser.EntregaContext)
            else:
                return self.getTypedRuleContext(MissoesParser.EntregaContext,i)


        def getRuleIndex(self):
            return MissoesParser.RULE_entregas

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEntregas" ):
                listener.enterEntregas(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEntregas" ):
                listener.exitEntregas(self)




    def entregas(self):

        localctx = MissoesParser.EntregasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_entregas)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.entrega()
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==9:
                self.state = 30
                self.match(MissoesParser.T__8)
                self.state = 31
                self.entrega()
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EntregaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(MissoesParser.STRING)
            else:
                return self.getToken(MissoesParser.STRING, i)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(MissoesParser.NUM)
            else:
                return self.getToken(MissoesParser.NUM, i)

        def getRuleIndex(self):
            return MissoesParser.RULE_entrega

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEntrega" ):
                listener.enterEntrega(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEntrega" ):
                listener.exitEntrega(self)




    def entrega(self):

        localctx = MissoesParser.EntregaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_entrega)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self.match(MissoesParser.T__1)
            self.state = 38
            self.match(MissoesParser.T__9)
            self.state = 39
            self.match(MissoesParser.STRING)
            self.state = 40
            self.match(MissoesParser.T__10)
            self.state = 41
            self.match(MissoesParser.STRING)
            self.state = 42
            self.match(MissoesParser.T__11)
            self.state = 43
            self.match(MissoesParser.NUM)
            self.state = 44
            self.match(MissoesParser.T__12)
            self.state = 45
            self.match(MissoesParser.T__13)
            self.state = 46
            self.match(MissoesParser.NUM)
            self.state = 47
            self.match(MissoesParser.T__14)
            self.state = 48
            self.match(MissoesParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





