package portus.drones.lprog.services;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import portus.drones.lprog.domain.Drone;
import static portus.drones.lprog.domain.Frota.drones;
import static portus.drones.lprog.domain.Frota.modelos;
import portus.drones.lprog.domain.Modelo;
import portus.drones.lprog.domain.entrega.Entrega;
import portus.drones.lprog.domain.entrega.Localizacao;
import portus.drones.lprog.domain.missao.EstadoMissao;
import portus.drones.lprog.domain.missao.Missao;
import static portus.drones.lprog.domain.missao.Missoes.missoes;
import portus.drones.lprog.lexers.MissoesLexer;
import portus.drones.lprog.parsers.MissoesParser;
import portus.drones.lprog.visitors.MissoesModelVisitor;


/**
 * Service class for managing missions (missões).
 * Handles loading, parsing, exporting, and validating mission data.
 */
public class MissoesService {

    /**
     * Loads missions from a default file when the program starts.
     * If the file does not exist, informs the user.
     */
    public void loadMissoesOnProgramStart() {
        // Load missions from the default file if it exists
        String defaultFilePath = "src/main/java/portus/drones/lprog/DB/missoes.txt";
        if (Files.exists(Paths.get(defaultFilePath))) {
            loadMissoesFromFile(defaultFilePath);
            System.out.println("(missoes carregadas automaticamente do ficheiro: " + defaultFilePath + ")");
        } else {
            System.out.println("✗ Nenhum ficheiro de missões encontrado. Inicie com um ficheiro vazio.");
        }
    }

    /**
     * Loads missions from a file.
     * @param filePath Path to the file containing missions.
     */
    public void loadMissoesFromFile(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Create ANTLR input stream
            var input = CharStreams.fromString(content);

            MissoesLexer lexer = new MissoesLexer(input);

            // Create token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create parser
            MissoesParser parser = new MissoesParser(tokens);


            // Add error listener to capture syntax errors
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    throw new RuntimeException("Erro de sintax na linha " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            // Create visitor and extract missions
            MissoesModelVisitor visitor = new MissoesModelVisitor();
            List<Missao> loadedMissoes = visitor.visitMissoes(parser.missoes());

            // Add to existing missions
            missoes.addAll(loadedMissoes);

            System.out.println("✓ " + loadedMissoes.size() + " missões carregadas com sucesso.");
        } catch (Exception e) {
            System.out.println("✗ Erro ao carregar missões: " + e.getMessage());
        }
    }


    /**
     * Exports missions to a file.
     * @param filePath path where to save the file
     */
    public void exportMissoesToFile(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Missao missao : missoes) {
                writer.println(missaoToString(missao));
                writer.println(); // Empty line between missions
            }

            System.out.println("✓ Missoes exportadas com sucesso para: " + filePath);
        } catch (Exception e) {
            System.err.println("✗ Erro ao exportar missões para o ficheiro: " + e.getMessage());
        }
    }

    /**
     * Converts a mission object back to its string representation for export purposes.
     * @param missao the mission to convert
     * @return string representation of the mission
     */
    private String missaoToString(Missao missao) {
        StringBuilder sb = new StringBuilder();

        sb.append("missao \"").append(missao.getNome()).append("\" {\n");
        sb.append("  inicio: ").append(missao.getInicio()).append("\n");
        sb.append("  drone: \"").append(missao.getDrone()).append("\"\n");
        sb.append("  estado: ").append(missao.getEstado().getValue()).append("\n");
        sb.append("  rota: [\n");

        for (int i = 0; i < missao.getEntregas().size(); i++) {
            Entrega entrega = missao.getEntregas().get(i);

            Localizacao origem = entrega.getOrigem();
            Localizacao destino = entrega.getDestino();
            double distancia = entrega.getDistancia();
            double altitude = entrega.getAltitude();
            double peso = entrega.getPeso();

            sb.append("    {\n");
            sb.append("      origem: {\n");
            sb.append("        latitude: ").append(origem.getLatitude()).append("\n");
            sb.append("        longitude: ").append(origem.getLongitude()).append("\n");
            sb.append("        nome: \"").append(origem.getNome()).append("\"\n");
            sb.append("      }\n");
            sb.append("      destino: {\n");
            sb.append("        latitude: ").append(destino.getLatitude()).append("\n");
            sb.append("        longitude: ").append(destino.getLongitude()).append("\n");
            sb.append("        nome: \"").append(destino.getNome()).append("\"\n");
            sb.append("      }\n");
            sb.append("      distancia: ").append(distancia).append("km\n");
            sb.append("      altitude: ").append(altitude).append("m\n");
            sb.append("      peso: ").append(peso).append("kg\n");
            sb.append("    }");

            if (i < missao.getEntregas().size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }

        sb.append("  ]\n");
        sb.append("}");

        return sb.toString();
    }



    /**
     * Remove a missao by name.
     * @param name the name of the missao to remove
     */
    public void removeMissao(String name) {

        Missao missao = missoes
                .stream()
                .filter(m -> m.getNome().equals(name))
                .findFirst()
                .orElse(null);

        if (missao == null) {
            System.out.println("✗ Missão não encontrada.");
            return;
        }

        if (missao.getEstado() == EstadoMissao.EM_CURSO) {
            System.out.println("✗ Missão não pode ser removida pois encontra-se em curso.");
            return;
        }


        missoes.remove(missao);
        System.out.println("✓ Missão removida com sucesso.");
    }

    /**
     * Lists all missions by printing them to the console.
     */
    public void listMissoes() {
        if (missoes.isEmpty()) {
            System.out.println("✗ Sem missões carregadas.");
            return;
        }

        missoes.forEach(System.out::println);
    }

    /**
     * Calculates the total distance of a mission.
     * @param nomeMissao the name of the mission
     * @return total distance, or -1 if not found
     */
    public double calculateMissaoDistance(String nomeMissao) {
        for (Missao m : missoes) {
            if (m.getNome().equalsIgnoreCase(nomeMissao)) {
                return m.getEntregas()
                        .stream()
                        .mapToDouble(Entrega::getDistancia)
                        .sum();
            }
        }
        return -1; // Missão não encontrada
    }

    /**
     * Calculates the estimated time to complete a mission.
     * @param nomeMissao the name of the mission
     * @return estimated time in hours, or -1 if not found
     */
    public double calculateMissaoEstimatedTime(String nomeMissao) {
        Missao missao = missoes
                .stream()
                .filter(m -> m.getNome().equalsIgnoreCase(nomeMissao))
                .findFirst()
                .orElse(null);

        if (missao != null) {
            String nomeDrone = missao.getDrone();

            Drone drone = drones
                    .stream()
                    .filter(d -> d.getNome().equalsIgnoreCase(nomeDrone))
                    .findFirst()
                    .orElse(null);

            if (drone == null) return -1;

            String nomeModelo = drone.getModelo();

            Modelo modelo = modelos
                    .stream()
                    .filter(m -> m.getNome().equalsIgnoreCase(nomeModelo))
                    .findFirst()
                    .orElse(null);

            if (modelo == null) return -1;

            double cruiseSpeed = modelo.getVelocidadeCruzeiro();

            if (cruiseSpeed <= 0) return -1;

            double totalDistance = missao
                    .getEntregas()
                    .stream()
                    .mapToDouble(Entrega::getDistancia)
                    .sum();

            return totalDistance / cruiseSpeed;
        }
        return -1;
    }


    /**
     * Validates a mission by checking range and restrictions.
     * @param nomeMissao the name of the mission to validate
     */
    public void validateMissao(String nomeMissao) {
        Missao missao = missoes
                .stream()
                .filter(m -> m.getNome().equalsIgnoreCase(nomeMissao))
                .findFirst()
                .orElse(null);


        if (missao == null) {
            System.out.println("Missão não encontrada.");
            return;
        }


        String droneName = missao.getDrone();
        Drone drone = drones
                .stream()
                .filter(d -> d.getNome().equalsIgnoreCase(droneName))
                .findFirst()
                .orElse(null);

        if (drone == null) {
            System.out.println("Drone não encontrado.");
            return;
        }

        String modeloName = drone.getModelo();
        Modelo modelo = modelos
                .stream()
                .filter(m -> m.getNome().equalsIgnoreCase(modeloName))
                .findFirst()
                .orElse(null);

        if (modelo == null) {
            System.out.println("Modelo do drone não encontrado.");
            return;
        }

        double cruiseSpeed = modelo.getVelocidadeCruzeiro();
        double rangeInMinutes = modelo.getAutonomiaMin();
        double rangeInKms = (rangeInMinutes / 60) * cruiseSpeed;

        double missaoTotalDistance = this.calculateMissaoDistance(missao.getNome());

        boolean hasSufficientRange = rangeInKms >= missaoTotalDistance;

        if (!hasSufficientRange) {
            System.out.println("✗ Alcance insuficiente para a missão.");
            return;
        }

        // Parse the start time of the mission from string to LocalTime to check night restrictions
        LocalTime horaInicio = LocalTime.parse(missao.getInicio());

        boolean isMissaoAtNighTime = horaInicio.getHour() >= 20 || horaInicio.getHour() < 6;
        boolean nightTimeFlightPermitted = modelo
                .getRestricoes()
                .stream()
                .anyMatch(r -> r.toLowerCase().contains("voo_noturno"));

        if (isMissaoAtNighTime && !nightTimeFlightPermitted) {
            System.out.println("✗ Missão decorre de noite e o drone não pode voar à noite.");
            return;
        }

        System.out.println("✓ Missão é valida e pode ser executada. Nenhuma restrição encontrada.");
    }
}
