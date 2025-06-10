package portus.drones.lprog.domain.missao;

import portus.drones.lprog.domain.entrega.Entrega;
import portus.drones.lprog.domain.entrega.Localizacao;

import java.util.List;

public class Missao {
    private String nome;
    private String inicio;
    private String drone;

    private EstadoMissao estado;
    private List<Entrega> entregas;


    public Missao() {

    }

    public Missao(String nome, String inicio, String drone, EstadoMissao estado, List<Entrega> entregas) {
        this.nome = nome;
        this.inicio = inicio;
        this.drone = drone;
        this.estado = estado;
        this.entregas = entregas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getDrone() {
        return drone;
    }

    public void setDrone(String drone) {
        this.drone = drone;
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
        StringBuilder sb = new StringBuilder();
        sb.append(nome)
          .append(" às ").append(inicio)
          .append(" com o drone ").append(drone)
          .append(" com o estado ").append(estado != null ? estado.toString().toLowerCase() : "")
          .append(".\n");
        sb.append("Rotas:\n");
        if (entregas != null) {
            for (int i = 0; i < entregas.size(); i++) {
                Entrega entrega = entregas.get(i);
                sb.append(i + 1).append(" - ")
                  .append(entrega.getOrigem().getNome())
                  .append(" (").append(entrega.getOrigem().getLatitude()).append(", ")
                  .append(entrega.getOrigem().getLongitude()).append(") até ")
                  .append(entrega.getDestino().getNome())
                  .append(" (").append(entrega.getDestino().getLatitude()).append(", ")
                  .append(entrega.getDestino().getLongitude()).append(") com ")
                  .append(entrega.getPeso())
                  .append("kg, ")
                  .append(entrega.getAltitude())
                  .append("m de altitude e ")
                  .append(entrega.getDistancia())
                  .append("km de distancia\n");
            }
        }
        return sb.toString();
    }
}
