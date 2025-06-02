package portus.drones.lprog.domain.missao;

import java.util.ArrayList;
import java.util.List;

public class Missoes {
    private List<Missao> missoes = new ArrayList<>();


    public List<Missao> getMissoes() {
        return missoes;
    }

    public void setMissoes(List<Missao> missoes) {
        this.missoes = missoes;
    }
}
