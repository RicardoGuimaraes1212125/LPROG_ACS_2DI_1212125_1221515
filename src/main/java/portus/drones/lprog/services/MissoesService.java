package portus.drones.lprog.services;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import portus.drones.lprog.domain.missao.Missoes;
import portus.drones.lprog.lexers.MissoesLexer;
import portus.drones.lprog.parsers.MissoesParser;
import portus.drones.lprog.domain.missao.Missao;
import portus.drones.lprog.visitors.MissoesModelVisitor;

public class MissoesService {

    /**
     * Loads missions from a file
     * @param filePath path to the file
     * @return true if successful, false otherwise
     */    
    public boolean loadMissoesFromFile(String filePath) {
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
            Missoes.setMissoes(loadedMissoes);
            
            System.out.println("✓ " + loadedMissoes.size() + " missões carregadas com sucesso.");
            return true;
        } catch (Exception e) {
            System.out.println("✗ Erro ao carregar missões: " + e.getMessage());
            return false;
        }
    }


    /**
     * Clears all missions
     */
    public void clearMissions(String name) {
        List<Missao> missoes = Missoes.getMissoes();

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Nome da missão não pode estar vazio.");
            return;
        }

        Missao missaoToRemove = missoes
                .stream()
                .filter(m -> m.getNome().equals(name))
                .findFirst()
                .orElse(null);

        if (missaoToRemove != null) {
            missoes.remove(missaoToRemove);
            System.out.println("✓  Missão '" + name + "' removida com sucesso.");
        } else {
            System.out.println("✗ Missão '" + name + "' não encontrada.");
        }
    }

    /**
     * Lists all missions
     */
    public void listMissoes() {
        if (Missoes.getMissoes().isEmpty()) {
            System.out.println("✗ Sem missões carregadas.");
            return;
        }
        
        for (int i = 0; i < Missoes.getMissoes().size(); i++) {
            Missao missao = Missoes.getMissoes().get(i);
            System.out.println((i + 1) + ". " + missao.toString());
        }
    }
}
