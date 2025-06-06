package portus.drones.lprog.domain;

import java.time.LocalDate;

public class Drone {
    private String nome;
    private long numeroSerie;
    private String modelo;
    private double pesoBase;
    private double bateriaAtual;
    private String estado;
    private double horasVoo;
    private LocalDate ultimaManutencao;
    private LocalDate proximaManutencao;

    //gets and sets
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public long getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(long numeroSerie) { this.numeroSerie = numeroSerie; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPesoBase() { return pesoBase; }
    public void setPesoBase(double pesoBase) { this.pesoBase = pesoBase; }

    public double getBateriaAtual() { return bateriaAtual; }
    public void setBateriaAtual(double bateriaAtual) { this.bateriaAtual = bateriaAtual; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getHorasVoo() { return horasVoo; }
    public void setHorasVoo(double horasVoo) { this.horasVoo = horasVoo; }

    public LocalDate getUltimaManutencao() { return ultimaManutencao; }
    public void setUltimaManutencao(LocalDate ultimaManutencao) { this.ultimaManutencao = ultimaManutencao; }

    public LocalDate getProximaManutencao() { return proximaManutencao; }
    public void setProximaManutencao(LocalDate proximaManutencao) { this.proximaManutencao = proximaManutencao; }

    @Override
    public String toString() {
        return "Drone \"" + nome + "\" {\n" +
                "  Número de Série: " + numeroSerie + "\n" +
                "  Modelo: \"" + modelo + "\"\n" +
                "  Peso Base: " + pesoBase + " kg\n" +
                "  Bateria Atual: " + bateriaAtual + " %\n" +
                "  Estado: " + estado + "\n" +
                "  Horas de Voo: " + horasVoo + "\n" +
                "  Última Manutenção: " + ultimaManutencao + "\n" +
                "  Próxima Manutenção: " + proximaManutencao + "\n" +
                "}";
    }
}

