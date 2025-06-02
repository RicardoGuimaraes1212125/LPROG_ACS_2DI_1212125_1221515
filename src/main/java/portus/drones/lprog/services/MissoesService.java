package portus.drones.lprog.services;

import java.io.FileWriter;
import java.io.PrintWriter;
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
            
            // Create lexer
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
            
            System.out.println("✓ Successfully loaded " + loadedMissoes.size() + " mission(s) from file: " + filePath);
            return true;
            
        } catch (Exception e) {
            System.err.println("✗ Error loading missions from file: " + e.getMessage());
            return false;
        }
    }

    /**
     * Lists all missions
     */
    public void listMissoes() {
        if (missoes.isEmpty()) {
            System.out.println("No missions loaded.");
            return;
        }
        
        System.out.println("\n=== LOADED MISSIONS ===");
        for (int i = 0; i < missoes.size(); i++) {
            Missao missao = missoes.get(i);
            System.out.println((i + 1) + ". " + missao.toString());
        }
        System.out.println("======================");
    }
    
    /**
     * Gets all missions
     * @return list of missions
     */
    public List<Missao> getMissoes() {
        return new ArrayList<>(missoes);
    }
    

}
