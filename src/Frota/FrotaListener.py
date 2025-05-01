# Generated from Frota.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .FrotaParser import FrotaParser
else:
    from FrotaParser import FrotaParser

# This class defines a complete listener for a parse tree produced by FrotaParser.
class FrotaListener(ParseTreeListener):

    # Enter a parse tree produced by FrotaParser#frota.
    def enterFrota(self, ctx:FrotaParser.FrotaContext):
        pass

    # Exit a parse tree produced by FrotaParser#frota.
    def exitFrota(self, ctx:FrotaParser.FrotaContext):
        pass


    # Enter a parse tree produced by FrotaParser#modelo.
    def enterModelo(self, ctx:FrotaParser.ModeloContext):
        pass

    # Exit a parse tree produced by FrotaParser#modelo.
    def exitModelo(self, ctx:FrotaParser.ModeloContext):
        pass


    # Enter a parse tree produced by FrotaParser#drone.
    def enterDrone(self, ctx:FrotaParser.DroneContext):
        pass

    # Exit a parse tree produced by FrotaParser#drone.
    def exitDrone(self, ctx:FrotaParser.DroneContext):
        pass


    # Enter a parse tree produced by FrotaParser#sensores.
    def enterSensores(self, ctx:FrotaParser.SensoresContext):
        pass

    # Exit a parse tree produced by FrotaParser#sensores.
    def exitSensores(self, ctx:FrotaParser.SensoresContext):
        pass


    # Enter a parse tree produced by FrotaParser#sensor.
    def enterSensor(self, ctx:FrotaParser.SensorContext):
        pass

    # Exit a parse tree produced by FrotaParser#sensor.
    def exitSensor(self, ctx:FrotaParser.SensorContext):
        pass


    # Enter a parse tree produced by FrotaParser#limite_operacional.
    def enterLimite_operacional(self, ctx:FrotaParser.Limite_operacionalContext):
        pass

    # Exit a parse tree produced by FrotaParser#limite_operacional.
    def exitLimite_operacional(self, ctx:FrotaParser.Limite_operacionalContext):
        pass


    # Enter a parse tree produced by FrotaParser#restricoes.
    def enterRestricoes(self, ctx:FrotaParser.RestricoesContext):
        pass

    # Exit a parse tree produced by FrotaParser#restricoes.
    def exitRestricoes(self, ctx:FrotaParser.RestricoesContext):
        pass


    # Enter a parse tree produced by FrotaParser#restricao.
    def enterRestricao(self, ctx:FrotaParser.RestricaoContext):
        pass

    # Exit a parse tree produced by FrotaParser#restricao.
    def exitRestricao(self, ctx:FrotaParser.RestricaoContext):
        pass


    # Enter a parse tree produced by FrotaParser#estado.
    def enterEstado(self, ctx:FrotaParser.EstadoContext):
        pass

    # Exit a parse tree produced by FrotaParser#estado.
    def exitEstado(self, ctx:FrotaParser.EstadoContext):
        pass



del FrotaParser