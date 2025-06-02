package portus.drones.lprog.domain.missao;

public class Entrega {
    private Localizacao origem;
    private Localizacao destino;
    private double distanciaKm;
    private double altitudeM;
    private double pesoKg;


    public Entrega(Localizacao origem, Localizacao destino, double distanciaKm, double altitudeM, double pesoKg) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.altitudeM = altitudeM;
        this.pesoKg = pesoKg;
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

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getAltitudeM() {
        return altitudeM;
    }

    public void setAltitudeM(double altitudeM) {
        this.altitudeM = altitudeM;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "origem=" + origem +
                ", destino=" + destino +
                ", distanciaKm=" + distanciaKm +
                ", altitudeM=" + altitudeM +
                ", pesoKg=" + pesoKg +
                '}';
    }
}
