package portus.drones.lprog.domain.missao;

import java.util.ArrayList;
import java.util.List;

public class Missoes {
    public static List<Missao> missoes = new ArrayList<>();


    public static List<Missao> getMissoes() {
        return missoes;
    }

    public static void setMissoes(List<Missao> missoes) {
        Missoes.missoes = missoes;
    }
}
