package portus.drones.lprog.domain;

import java.time.LocalDate;

/**
 * Represents a drone in the fleet, with model, state, and maintenance information.
 */
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
    /**
     * Gets the name of the drone.
     * @return the name of the drone
     */
    public String getNome() { return nome; }
    /**
     * Sets the name of the drone.
     * @param nome the new name of the drone
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Gets the serial number of the drone.
     * @return the serial number of the drone
     */
    public long getNumeroSerie() { return numeroSerie; }
    /**
     * Sets the serial number of the drone.
     * @param numeroSerie the new serial number of the drone
     */
    public void setNumeroSerie(long numeroSerie) { this.numeroSerie = numeroSerie; }

    /**
     * Gets the model of the drone.
     * @return the model of the drone
     */
    public String getModelo() { return modelo; }
    /**
     * Sets the model of the drone.
     * @param modelo the new model of the drone
     */
    public void setModelo(String modelo) { this.modelo = modelo; }

    /**
     * Gets the base weight of the drone.
     * @return the base weight of the drone
     */
    public double getPesoBase() { return pesoBase; }
    /**
     * Sets the base weight of the drone.
     * @param pesoBase the new base weight of the drone
     */
    public void setPesoBase(double pesoBase) { this.pesoBase = pesoBase; }

    /**
     * Gets the current battery level of the drone.
     * @return the current battery level of the drone
     */
    public double getBateriaAtual() { return bateriaAtual; }
    /**
     * Sets the current battery level of the drone.
     * @param bateriaAtual the new battery level of the drone
     */
    public void setBateriaAtual(double bateriaAtual) { this.bateriaAtual = bateriaAtual; }

    /**
     * Gets the state of the drone.
     * @return the state of the drone
     */
    public String getEstado() { return estado; }
    /**
     * Sets the state of the drone.
     * @param estado the new state of the drone
     */
    public void setEstado(String estado) { this.estado = estado; }

    /**
     * Gets the flight hours of the drone.
     * @return the flight hours of the drone
     */
    public double getHorasVoo() { return horasVoo; }
    /**
     * Sets the flight hours of the drone.
     * @param horasVoo the new flight hours of the drone
     */
    public void setHorasVoo(double horasVoo) { this.horasVoo = horasVoo; }

    /**
     * Gets the date of the last maintenance of the drone.
     * @return the date of the last maintenance of the drone
     */
    public LocalDate getUltimaManutencao() { return ultimaManutencao; }
    /**
     * Sets the date of the last maintenance of the drone.
     * @param ultimaManutencao the new date of the last maintenance of the drone
     */
    public void setUltimaManutencao(LocalDate ultimaManutencao) { this.ultimaManutencao = ultimaManutencao; }

    /**
     * Gets the date of the next maintenance of the drone.
     * @return the date of the next maintenance of the drone
     */
    public LocalDate getProximaManutencao() { return proximaManutencao; }
    /**
     * Sets the date of the next maintenance of the drone.
     * @param proximaManutencao the new date of the next maintenance of the drone
     */
    public void setProximaManutencao(LocalDate proximaManutencao) { this.proximaManutencao = proximaManutencao; }

    /**
     * Returns a string representation of the drone.
     * @return string with drone details
     */
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

