# Generated from Frota.g4 by ANTLR 4.13.2
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
        4,1,28,86,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,5,0,21,8,0,10,0,12,0,24,9,0,1,0,1,0,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,3,1,3,1,3,5,3,64,8,3,10,3,12,3,67,9,3,1,4,1,4,1,5,1,5,1,5,1,
        6,1,6,1,6,5,6,77,8,6,10,6,12,6,80,9,6,1,7,1,7,1,8,1,8,1,8,0,0,9,
        0,2,4,6,8,10,12,14,16,0,2,1,0,20,21,1,0,22,24,80,0,22,1,0,0,0,2,
        27,1,0,0,0,4,47,1,0,0,0,6,60,1,0,0,0,8,68,1,0,0,0,10,70,1,0,0,0,
        12,73,1,0,0,0,14,81,1,0,0,0,16,83,1,0,0,0,18,21,3,2,1,0,19,21,3,
        4,2,0,20,18,1,0,0,0,20,19,1,0,0,0,21,24,1,0,0,0,22,20,1,0,0,0,22,
        23,1,0,0,0,23,25,1,0,0,0,24,22,1,0,0,0,25,26,5,0,0,1,26,1,1,0,0,
        0,27,28,5,1,0,0,28,29,5,25,0,0,29,30,5,2,0,0,30,31,5,3,0,0,31,32,
        5,27,0,0,32,33,5,4,0,0,33,34,5,5,0,0,34,35,5,27,0,0,35,36,5,6,0,
        0,36,37,5,7,0,0,37,38,5,27,0,0,38,39,5,8,0,0,39,40,5,9,0,0,40,41,
        3,6,3,0,41,42,5,10,0,0,42,43,3,10,5,0,43,44,5,11,0,0,44,45,3,12,
        6,0,45,46,5,12,0,0,46,3,1,0,0,0,47,48,5,13,0,0,48,49,5,25,0,0,49,
        50,5,2,0,0,50,51,5,14,0,0,51,52,5,27,0,0,52,53,5,15,0,0,53,54,5,
        25,0,0,54,55,5,16,0,0,55,56,3,16,8,0,56,57,5,17,0,0,57,58,5,27,0,
        0,58,59,5,12,0,0,59,5,1,0,0,0,60,65,3,8,4,0,61,62,5,18,0,0,62,64,
        3,8,4,0,63,61,1,0,0,0,64,67,1,0,0,0,65,63,1,0,0,0,65,66,1,0,0,0,
        66,7,1,0,0,0,67,65,1,0,0,0,68,69,5,26,0,0,69,9,1,0,0,0,70,71,5,19,
        0,0,71,72,5,27,0,0,72,11,1,0,0,0,73,78,3,14,7,0,74,75,5,18,0,0,75,
        77,3,14,7,0,76,74,1,0,0,0,77,80,1,0,0,0,78,76,1,0,0,0,78,79,1,0,
        0,0,79,13,1,0,0,0,80,78,1,0,0,0,81,82,7,0,0,0,82,15,1,0,0,0,83,84,
        7,1,0,0,84,17,1,0,0,0,4,20,22,65,78
    ]

class FrotaParser ( Parser ):

    grammarFileName = "Frota.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'modelo'", "'{'", "'capacidade:'", "'kg'", 
                     "'autonomia:'", "'min'", "'velocidade:'", "'km/h'", 
                     "'sensores:'", "'limites:'", "'restricoes:'", "'}'", 
                     "'drone'", "'numero_serie:'", "'modelo:'", "'estado:'", 
                     "'horas_voo:'", "','", "'max_horas_voo='", "'voo_diurno'", 
                     "'voo_noturno'", "'ativo'", "'manutencao'", "'inativo'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "STRING", "ID", "NUM", "WS" ]

    RULE_frota = 0
    RULE_modelo = 1
    RULE_drone = 2
    RULE_sensores = 3
    RULE_sensor = 4
    RULE_limite_operacional = 5
    RULE_restricoes = 6
    RULE_restricao = 7
    RULE_estado = 8

    ruleNames =  [ "frota", "modelo", "drone", "sensores", "sensor", "limite_operacional", 
                   "restricoes", "restricao", "estado" ]

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
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    STRING=25
    ID=26
    NUM=27
    WS=28

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class FrotaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(FrotaParser.EOF, 0)

        def modelo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FrotaParser.ModeloContext)
            else:
                return self.getTypedRuleContext(FrotaParser.ModeloContext,i)


        def drone(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FrotaParser.DroneContext)
            else:
                return self.getTypedRuleContext(FrotaParser.DroneContext,i)


        def getRuleIndex(self):
            return FrotaParser.RULE_frota

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFrota" ):
                listener.enterFrota(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFrota" ):
                listener.exitFrota(self)




    def frota(self):

        localctx = FrotaParser.FrotaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_frota)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==1 or _la==13:
                self.state = 20
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1]:
                    self.state = 18
                    self.modelo()
                    pass
                elif token in [13]:
                    self.state = 19
                    self.drone()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 25
            self.match(FrotaParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ModeloContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(FrotaParser.STRING, 0)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(FrotaParser.NUM)
            else:
                return self.getToken(FrotaParser.NUM, i)

        def sensores(self):
            return self.getTypedRuleContext(FrotaParser.SensoresContext,0)


        def limite_operacional(self):
            return self.getTypedRuleContext(FrotaParser.Limite_operacionalContext,0)


        def restricoes(self):
            return self.getTypedRuleContext(FrotaParser.RestricoesContext,0)


        def getRuleIndex(self):
            return FrotaParser.RULE_modelo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterModelo" ):
                listener.enterModelo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitModelo" ):
                listener.exitModelo(self)




    def modelo(self):

        localctx = FrotaParser.ModeloContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_modelo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(FrotaParser.T__0)
            self.state = 28
            self.match(FrotaParser.STRING)
            self.state = 29
            self.match(FrotaParser.T__1)
            self.state = 30
            self.match(FrotaParser.T__2)
            self.state = 31
            self.match(FrotaParser.NUM)
            self.state = 32
            self.match(FrotaParser.T__3)
            self.state = 33
            self.match(FrotaParser.T__4)
            self.state = 34
            self.match(FrotaParser.NUM)
            self.state = 35
            self.match(FrotaParser.T__5)
            self.state = 36
            self.match(FrotaParser.T__6)
            self.state = 37
            self.match(FrotaParser.NUM)
            self.state = 38
            self.match(FrotaParser.T__7)
            self.state = 39
            self.match(FrotaParser.T__8)
            self.state = 40
            self.sensores()
            self.state = 41
            self.match(FrotaParser.T__9)
            self.state = 42
            self.limite_operacional()
            self.state = 43
            self.match(FrotaParser.T__10)
            self.state = 44
            self.restricoes()
            self.state = 45
            self.match(FrotaParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DroneContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(FrotaParser.STRING)
            else:
                return self.getToken(FrotaParser.STRING, i)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(FrotaParser.NUM)
            else:
                return self.getToken(FrotaParser.NUM, i)

        def estado(self):
            return self.getTypedRuleContext(FrotaParser.EstadoContext,0)


        def getRuleIndex(self):
            return FrotaParser.RULE_drone

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDrone" ):
                listener.enterDrone(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDrone" ):
                listener.exitDrone(self)




    def drone(self):

        localctx = FrotaParser.DroneContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_drone)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(FrotaParser.T__12)
            self.state = 48
            self.match(FrotaParser.STRING)
            self.state = 49
            self.match(FrotaParser.T__1)
            self.state = 50
            self.match(FrotaParser.T__13)
            self.state = 51
            self.match(FrotaParser.NUM)
            self.state = 52
            self.match(FrotaParser.T__14)
            self.state = 53
            self.match(FrotaParser.STRING)
            self.state = 54
            self.match(FrotaParser.T__15)
            self.state = 55
            self.estado()
            self.state = 56
            self.match(FrotaParser.T__16)
            self.state = 57
            self.match(FrotaParser.NUM)
            self.state = 58
            self.match(FrotaParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SensoresContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sensor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FrotaParser.SensorContext)
            else:
                return self.getTypedRuleContext(FrotaParser.SensorContext,i)


        def getRuleIndex(self):
            return FrotaParser.RULE_sensores

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSensores" ):
                listener.enterSensores(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSensores" ):
                listener.exitSensores(self)




    def sensores(self):

        localctx = FrotaParser.SensoresContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_sensores)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.sensor()
            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==18:
                self.state = 61
                self.match(FrotaParser.T__17)
                self.state = 62
                self.sensor()
                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SensorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(FrotaParser.ID, 0)

        def getRuleIndex(self):
            return FrotaParser.RULE_sensor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSensor" ):
                listener.enterSensor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSensor" ):
                listener.exitSensor(self)




    def sensor(self):

        localctx = FrotaParser.SensorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_sensor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(FrotaParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Limite_operacionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(FrotaParser.NUM, 0)

        def getRuleIndex(self):
            return FrotaParser.RULE_limite_operacional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLimite_operacional" ):
                listener.enterLimite_operacional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLimite_operacional" ):
                listener.exitLimite_operacional(self)




    def limite_operacional(self):

        localctx = FrotaParser.Limite_operacionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_limite_operacional)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(FrotaParser.T__18)
            self.state = 71
            self.match(FrotaParser.NUM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RestricoesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def restricao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(FrotaParser.RestricaoContext)
            else:
                return self.getTypedRuleContext(FrotaParser.RestricaoContext,i)


        def getRuleIndex(self):
            return FrotaParser.RULE_restricoes

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRestricoes" ):
                listener.enterRestricoes(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRestricoes" ):
                listener.exitRestricoes(self)




    def restricoes(self):

        localctx = FrotaParser.RestricoesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_restricoes)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.restricao()
            self.state = 78
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==18:
                self.state = 74
                self.match(FrotaParser.T__17)
                self.state = 75
                self.restricao()
                self.state = 80
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RestricaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return FrotaParser.RULE_restricao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRestricao" ):
                listener.enterRestricao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRestricao" ):
                listener.exitRestricao(self)




    def restricao(self):

        localctx = FrotaParser.RestricaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_restricao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            _la = self._input.LA(1)
            if not(_la==20 or _la==21):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EstadoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return FrotaParser.RULE_estado

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEstado" ):
                listener.enterEstado(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEstado" ):
                listener.exitEstado(self)




    def estado(self):

        localctx = FrotaParser.EstadoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_estado)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





