package portus.drones.lprog;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import portus.drones.lprog.domain.missao.Missao;
import portus.drones.lprog.menu.MenuPrincipal;

public class Main implements MissoesVisitor<Missao> {
    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.run();
    }


    @Override
    public Missao visitMissoes(MissoesParser.MissoesContext ctx) {
        return null;
    }

    @Override
    public Missao visitMissao(MissoesParser.MissaoContext ctx) {
        
        return null;
    }

    @Override
    public Missao visitEntregas(MissoesParser.EntregasContext ctx) {
        return null;
    }

    @Override
    public Missao visitEntrega(MissoesParser.EntregaContext ctx) {
        return null;
    }

    @Override
    public Missao visitLocalizacao(MissoesParser.LocalizacaoContext ctx) {
        return null;
    }

    @Override
    public Missao visitEstado_missao(MissoesParser.Estado_missaoContext ctx) {
        return null;
    }

    @Override
    public Missao visitCoordenada(MissoesParser.CoordenadaContext ctx) {
        return null;
    }

    @Override
    public Missao visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Missao visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Missao visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Missao visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}