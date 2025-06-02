package portus.drones.lprog;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import portus.drones.lprog.domain.missao.Missao;
import portus.drones.lprog.menu.MenuPrincipal;

public class Main{
    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.run();
    }
}