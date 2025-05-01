# Generated from Missoes.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MissoesParser import MissoesParser
else:
    from MissoesParser import MissoesParser

# This class defines a complete listener for a parse tree produced by MissoesParser.
class MissoesListener(ParseTreeListener):

    # Enter a parse tree produced by MissoesParser#missoes.
    def enterMissoes(self, ctx:MissoesParser.MissoesContext):
        pass

    # Exit a parse tree produced by MissoesParser#missoes.
    def exitMissoes(self, ctx:MissoesParser.MissoesContext):
        pass


    # Enter a parse tree produced by MissoesParser#missao.
    def enterMissao(self, ctx:MissoesParser.MissaoContext):
        pass

    # Exit a parse tree produced by MissoesParser#missao.
    def exitMissao(self, ctx:MissoesParser.MissaoContext):
        pass


    # Enter a parse tree produced by MissoesParser#entregas.
    def enterEntregas(self, ctx:MissoesParser.EntregasContext):
        pass

    # Exit a parse tree produced by MissoesParser#entregas.
    def exitEntregas(self, ctx:MissoesParser.EntregasContext):
        pass


    # Enter a parse tree produced by MissoesParser#entrega.
    def enterEntrega(self, ctx:MissoesParser.EntregaContext):
        pass

    # Exit a parse tree produced by MissoesParser#entrega.
    def exitEntrega(self, ctx:MissoesParser.EntregaContext):
        pass



del MissoesParser