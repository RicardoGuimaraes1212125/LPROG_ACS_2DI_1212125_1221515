package portus.drones.lprog.domain.missao;

import portus.drones.lprog.domain.entrega.Entrega;
import portus.drones.lprog.domain.entrega.Localizacao;

import java.util.List;

public class Missao {
    private String nome;
    private String inicioHora;
    private String droneNomeReferencia;

    private EstadoMissao estado;
    private List<Entrega> entregas;


    public Missao(String nome, String inicioHora, String droneNomeReferencia, EstadoMissao estado, List<Entrega> entregas) {
        this.nome = nome;
        this.inicioHora = inicioHora;
        this.droneNomeReferencia = droneNomeReferencia;
        this.estado = estado;
        this.entregas = entregas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInicioHora() {
        return inicioHora;
    }

    public void setInicioHora(String inicioHora) {
        this.inicioHora = inicioHora;
    }

    public String getDroneNomeReferencia() {
        return droneNomeReferencia;
    }

    public void setDroneNomeReferencia(String droneNomeReferencia) {
        this.droneNomeReferencia = droneNomeReferencia;
    }

    public EstadoMissao getEstado() {
        return estado;
    }

    public void setEstado(EstadoMissao estado) {
        this.estado = estado;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public Localizacao getPontoPartidaInicial() {
        if (entregas != null && !entregas.isEmpty() && entregas.get(0) != null) {
            return entregas.get(0).getOrigem();
        }
        return null;
    }

    public Localizacao getPontoFinalUltimaEntrega() {
        if (entregas != null && !entregas.isEmpty() && entregas.get(entregas.size() - 1) != null) {
            return entregas.get(entregas.size() - 1).getDestino();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Missao{" +
                "nome='" + nome + '\'' +
                ", inicioHora='" + inicioHora + '\'' +
                ", droneNomeReferencia='" + droneNomeReferencia + '\'' +
                '}';
    }
}
