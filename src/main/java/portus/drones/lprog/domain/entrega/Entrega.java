package portus.drones.lprog.domain.entrega;

public class Entrega {
    private Localizacao origem;
    private Localizacao destino;
    private double distancia;
    private double altitude;
    private double peso;


    public Entrega(Localizacao origem, Localizacao destino, double distancia, double altitude, double peso) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.altitude = altitude;
        this.peso = peso;
    }

    public Localizacao getOrigem() {
        return origem;
    }

    public void setOrigem(Localizacao origem) {
        this.origem = origem;
    }

    public Localizacao getDestino() {
        return destino;
    }

    public void setDestino(Localizacao destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "origem=" + origem +
                ", destino=" + destino +
                ", distanciaKm=" + distancia +
                ", altitudeM=" + altitude +
                ", pesoKg=" + peso +
                '}';
    }
}
