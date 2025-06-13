package portus.drones.lprog.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import portus.drones.lprog.domain.Drone;
import static portus.drones.lprog.domain.Frota.drones;
import static portus.drones.lprog.domain.Frota.modelos;
import portus.drones.lprog.domain.Modelo;
import portus.drones.lprog.lexers.DronesLexer;
import portus.drones.lprog.lexers.ModelosLexer;
import portus.drones.lprog.parsers.DronesParser;
import portus.drones.lprog.parsers.ModelosParser;
import portus.drones.lprog.visitors.DronesVisitorImpl;
import portus.drones.lprog.visitors.ModelosVisitorImpl;


/**
 * Service class for managing the drone fleet and models.
 * Handles loading, parsing, and exporting drone and model data.
 */
public class FrotaService {

    /**
     * Loads drone models from a file.
     * @param caminho Path to the file containing models.
     * @throws IOException if the file cannot be read.
     */
    public void carregarModelos(String caminho) throws IOException {
        String input = Files.readString(Path.of(caminho));
        ModelosLexer lexer = new ModelosLexer(CharStreams.fromString(input));
        ModelosParser parser = new ModelosParser(new CommonTokenStream(lexer));
        var tree = parser.modelos();

        ModelosVisitorImpl visitor = new ModelosVisitorImpl();
        visitor.visit(tree);

        modelos.clear();
        modelos.addAll(visitor.modelos);
        System.out.println("Modelos carregados: " + modelos.size());
    }

    /**
     * Loads drones from a file.
     * @param caminho Path to the file containing drones.
     * @throws IOException if the file cannot be read.
     */
    public void carregarDrones(String caminho) throws IOException {
        String input = Files.readString(Path.of(caminho));
        DronesLexer lexer = new DronesLexer(CharStreams.fromString(input));
        DronesParser parser = new DronesParser(new CommonTokenStream(lexer));
        var tree = parser.drones();

        DronesVisitorImpl visitor = new DronesVisitorImpl();
        visitor.visit(tree);

        drones.clear();
        drones.addAll(visitor.drones);
        System.out.println("Drones carregados: " + drones.size());
    }

    /**
     * Exports the current list of drones to a file.
     * @param caminho Path to the output file.
     * @throws IOException if the file cannot be written.
     */
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

    /**
     * Lists all drones in the fleet by printing them to the console.
     */
    public void listarDrones() {
        drones.forEach(System.out::println);
    }

    /**
     * Lists all models in the fleet by printing them to the console.
     */
    public void listarModelos() {
        modelos.forEach(System.out::println);
    }

    /**
     * Adds a drone to the fleet.
     * @param d the drone to add
     */
    public void adicionarDrone(Drone d) {
        drones.add(d);
    }

    /**
     * Gets a model by its name.
     * @param nome the name of the model
     * @return the model with the given name, or null if not found
     */
    public Modelo getModeloPorNome(String nome) {
        return modelos
                .stream()
                .filter(m -> m.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    /**
     * Removes a drone from the fleet by its name.
     * @param nomeDrone the name of the drone to remove
     * @return true if the drone was removed, false otherwise
     */
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
