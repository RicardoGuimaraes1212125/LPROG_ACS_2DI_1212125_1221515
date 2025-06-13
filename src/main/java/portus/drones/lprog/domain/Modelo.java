package portus.drones.lprog.domain;

import java.util.List;
import java.util.Map;

/**
 * Represents a drone model with specifications, sensors, certifications, and operational limits.
 */
public class Modelo {
    private String nome;
    private double capacidadeKg;
    private double autonomiaMin;
    private double velocidadeCruzeiro;
    private double velocidadeSubida;
    private double velocidadeDescida;
    private List<String> sensores;
    private List<String> certificacoes;
    private Map<String, Double> limites;
    private List<String> restricoes;

    /**
     * Gets the model name.
     * @return the name of the model
     */
    public String getNome() { return nome; }
    /**
     * Sets the model name.
     * @param nome the name to set
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Gets the cargo capacity in kg.
     * @return the capacity in kg
     */
    public double getCapacidadeKg() { return capacidadeKg; }
    /**
     * Sets the cargo capacity in kg.
     * @param capacidadeKg the capacity to set in kg
     */
    public void setCapacidadeKg(double capacidadeKg) { this.capacidadeKg = capacidadeKg; }

    /**
     * Gets the autonomy in minutes.
     * @return the autonomy in minutes
     */
    public double getAutonomiaMin() { return autonomiaMin; }
    /**
     * Sets the autonomy in minutes.
     * @param autonomiaMin the autonomy to set in minutes
     */
    public void setAutonomiaMin(double autonomiaMin) { this.autonomiaMin = autonomiaMin; }

    /**
     * Gets the cruise speed in km/h.
     * @return the cruise speed in km/h
     */
    public double getVelocidadeCruzeiro() { return velocidadeCruzeiro; }
    /**
     * Sets the cruise speed in km/h.
     * @param velocidadeCruzeiro the cruise speed to set in km/h
     */
    public void setVelocidadeCruzeiro(double velocidadeCruzeiro) { this.velocidadeCruzeiro = velocidadeCruzeiro; }

    /**
     * Gets the ascent speed in km/h.
     * @return the ascent speed in km/h
     */
    public double getVelocidadeSubida() { return velocidadeSubida; }
    /**
     * Sets the ascent speed in km/h.
     * @param velocidadeSubida the ascent speed to set in km/h
     */
    public void setVelocidadeSubida(double velocidadeSubida) { this.velocidadeSubida = velocidadeSubida; }

    /**
     * Gets the descent speed in km/h.
     * @return the descent speed in km/h
     */
    public double getVelocidadeDescida() { return velocidadeDescida; }
    /**
     * Sets the descent speed in km/h.
     * @param velocidadeDescida the descent speed to set in km/h
     */
    public void setVelocidadeDescida(double velocidadeDescida) { this.velocidadeDescida = velocidadeDescida; }

    /**
     * Gets the list of sensors.
     * @return the list of sensors
     */
    public List<String> getSensores() { return sensores; }
    /**
     * Sets the list of sensors.
     * @param sensores the list of sensors to set
     */
    public void setSensores(List<String> sensores) { this.sensores = sensores; }

    /**
     * Gets the list of certifications.
     * @return the list of certifications
     */
    public List<String> getCertificacoes() { return certificacoes; }
    /**
     * Sets the list of certifications.
     * @param certificacoes the list of certifications to set
     */
    public void setCertificacoes(List<String> certificacoes) { this.certificacoes = certificacoes; }

    /**
     * Gets the operational limits.
     * @return the map of operational limits
     */
    public Map<String, Double> getLimites() { return limites; }
    /**
     * Sets the operational limits.
     * @param limites the map of operational limits to set
     */
    public void setLimites(Map<String, Double> limites) { this.limites = limites; }

    /**
     * Gets the list of restrictions.
     * @return the list of restrictions
     */
    public List<String> getRestricoes() { return restricoes; }
    /**
     * Sets the list of restrictions.
     * @param restricoes the list of restrictions to set
     */
    public void setRestricoes(List<String> restricoes) { this.restricoes = restricoes; }

    /**
     * Returns a string representation of the model.
     * @return string with model details
     */
    @Override
    public String toString() {
        return "Modelo \"" + nome + "\" {\n" +
                "  Capacidade: " + capacidadeKg + " kg\n" +
                "  Autonomia: " + autonomiaMin + " min\n" +
                "  Velocidade:\n" +
                "    Cruzeiro: " + velocidadeCruzeiro + " km/h\n" +
                "    Subida: " + velocidadeSubida + " km/h\n" +
                "    Descida: " + velocidadeDescida + " km/h\n" +
                "  Sensores: " + (sensores != null ? String.join(", ", sensores) : "nenhum") + "\n" +
                "  Certificações: " + (certificacoes != null ? String.join(", ", certificacoes) : "nenhuma") + "\n" +
                "  Limites Operacionais: " + limitesToString() + "\n" +
                "  Restrições: " + (restricoes != null ? String.join(", ", restricoes) : "nenhuma") + "\n" +
                "}";
    }

    private String limitesToString() {
        if (limites == null || limites.isEmpty()) return "nenhum";
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Double> entry : limites.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
