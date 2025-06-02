package portus.drones.lprog.services;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import portus.drones.lprog.MissoesLexer;
import portus.drones.lprog.MissoesParser;
import portus.drones.lprog.domain.missao.Missao;
import portus.drones.lprog.visitors.MissoesModelVisitor;

public class MissoesService {
    private final List<Missao> missoes;
    
    public MissoesService() {
        this.missoes = new ArrayList<>();
    }
    
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
                    throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            // Parse starting from the missoes rule
            // Create visitor and extract missions
            MissoesModelVisitor visitor = new MissoesModelVisitor();
            List<Missao> loadedMissoes = visitor.visitMissoes(parser.missoes());
            
            // Add to existing missions
            this.missoes.addAll(loadedMissoes);
            
            System.out.println("✓ " + loadedMissoes.size() + " missões carregadas com sucesso.");
            return true;
            
        } catch (Exception e) {
            System.err.println("✗ Erro ao carregar missões: " + e.getMessage());
            return false;
        } finally {
            // Clear lexer and parser resources
            MissoesLexer lexer = null;
            MissoesParser parser = null;
        }
    }

    /**
     * Lists all missions
     */
    public void listMissions() {
        if (missoes.isEmpty()) {
            System.out.println("Sem missões carregadas.");
            return;
        }
        
        for (int i = 0; i < missoes.size(); i++) {
            Missao missao = missoes.get(i);
            System.out.println((i + 1) + ". " + missao.toString());
        }
    }
}
