package portus.drones.lprog.domain;

import java.util.List;
import java.util.Map;

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

    //gets and sets
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getCapacidadeKg() { return capacidadeKg; }
    public void setCapacidadeKg(double capacidadeKg) { this.capacidadeKg = capacidadeKg; }

    public double getAutonomiaMin() { return autonomiaMin; }
    public void setAutonomiaMin(double autonomiaMin) { this.autonomiaMin = autonomiaMin; }

    public double getVelocidadeCruzeiro() { return velocidadeCruzeiro; }
    public void setVelocidadeCruzeiro(double velocidadeCruzeiro) { this.velocidadeCruzeiro = velocidadeCruzeiro; }

    public double getVelocidadeSubida() { return velocidadeSubida; }
    public void setVelocidadeSubida(double velocidadeSubida) { this.velocidadeSubida = velocidadeSubida; }

    public double getVelocidadeDescida() { return velocidadeDescida; }
    public void setVelocidadeDescida(double velocidadeDescida) { this.velocidadeDescida = velocidadeDescida; }

    public List<String> getSensores() { return sensores; }
    public void setSensores(List<String> sensores) { this.sensores = sensores; }

    public List<String> getCertificacoes() { return certificacoes; }
    public void setCertificacoes(List<String> certificacoes) { this.certificacoes = certificacoes; }

    public Map<String, Double> getLimites() { return limites; }
    public void setLimites(Map<String, Double> limites) { this.limites = limites; }

    public List<String> getRestricoes() { return restricoes; }
    public void setRestricoes(List<String> restricoes) { this.restricoes = restricoes; }

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
