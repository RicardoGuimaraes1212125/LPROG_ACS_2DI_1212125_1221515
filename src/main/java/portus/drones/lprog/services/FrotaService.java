package portus.drones.lprog.services;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.antlr.v4.runtime.*;


import portus.drones.lprog.domain.*;
import portus.drones.lprog.lexers.DronesLexer;
import portus.drones.lprog.lexers.ModelosLexer;
import portus.drones.lprog.parsers.DronesParser;
import portus.drones.lprog.parsers.ModelosParser;


public class FrotaService {
    private final List<Drone> drones = new ArrayList<>();
    private final List<Modelo> modelos = new ArrayList<>();

    public void carregarModelos(String caminho) throws IOException {
        String input = Files.readString(Path.of(caminho));
        ModelosLexer lexer = new ModelosLexer(CharStreams.fromString(input));
        ModelosParser parser = new ModelosParser(new CommonTokenStream(lexer));
        var tree = parser.modelos();

        ModelosVisitorImpl visitor = new ModelosVisitorImpl();
        visitor.visit(tree);

        this.modelos.clear();
        this.modelos.addAll(visitor.modelos);
        System.out.println("Modelos carregados: " + modelos.size());
    }

    public void carregarDrones(String caminho) throws IOException {
        String input = Files.readString(Path.of(caminho));
        DronesLexer lexer = new DronesLexer(CharStreams.fromString(input));
        DronesParser parser = new DronesParser(new CommonTokenStream(lexer));
        var tree = parser.drones();

        DronesVisitorImpl visitor = new DronesVisitorImpl();
        visitor.visit(tree);

        this.drones.clear();
        this.drones.addAll(visitor.drones);
        System.out.println("Drones carregados: " + drones.size());
    }

    public void exportarDrones(String caminho) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Drone d : drones) {
            sb.append("drone \"").append(d.getNome()).append("\" {\n");
            sb.append("  numero_serie: ").append(d.getNumeroSerie()).append("\n");
            sb.append("  modelo: \"").append(d.getModelo()).append("\"\n");
            sb.append("  peso_base: ").append(d.getPesoBase()).append(" kg\n");
            sb.append("  bateria_atual: ").append(d.getBateriaAtual()).append(" %\n");
            sb.append("  estado: ").append(d.getEstado()).append("\n");
            sb.append("  horas_voo: ").append(d.getHorasVoo()).append("\n");
            sb.append("  ultima_manutencao: ").append(d.getUltimaManutencao()).append("\n");
            sb.append("  proxima_manutencao: ").append(d.getProximaManutencao()).append("\n");
            sb.append("}\n\n");
        }
        Files.writeString(Path.of(caminho), sb.toString());
        System.out.println("Frota exportada para " + caminho);
    }

    public void listarDrones() {
        drones.forEach(System.out::println);
    }

    public void listarModelos() {
        modelos.forEach(System.out::println);
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void adicionarDrone(Drone d) {
        drones.add(d);
    }

    public Modelo getModeloPorNome(String nome) {
        return modelos.stream()
                .filter(m -> m.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarDrone(String nomeDrone) {
        if (nomeDrone == null || nomeDrone.isBlank()) return false;

        Drone drone = drones.stream()
                .filter(d -> d.getNome().equalsIgnoreCase(nomeDrone))
                .findFirst()
                .orElse(null);

        if (drone == null) return false;

        drones.remove(drone);
        return true;
    }
}
