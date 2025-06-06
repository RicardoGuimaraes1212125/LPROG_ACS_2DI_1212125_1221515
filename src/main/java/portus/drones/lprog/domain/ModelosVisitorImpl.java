package portus.drones.lprog.domain;

import portus.drones.lprog.parsers.ModelosParser;
import portus.drones.lprog.visitors.ModelosBaseVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelosVisitorImpl extends ModelosBaseVisitor<Void> {
    public List<Modelo> modelos = new ArrayList<>();

    @Override
    public Void visitModelos(ModelosParser.ModelosContext ctx) {
        for (var modeloCtx : ctx.modelo()) {
            visitModelo(modeloCtx);
        }
        return null;
    }

    @Override
    public Void visitModelo(ModelosParser.ModeloContext ctx) {
        Modelo m = new Modelo();
        m.setNome(removeQuotes(ctx.STRING().getText()));
        m.setCapacidadeKg(Double.parseDouble(ctx.NUM(0).getText()));
        m.setAutonomiaMin(Double.parseDouble(ctx.NUM(1).getText()));
        m.setVelocidadeCruzeiro(Double.parseDouble(ctx.NUM(2).getText()));
        m.setVelocidadeSubida(Double.parseDouble(ctx.NUM(3).getText()));
        m.setVelocidadeDescida(Double.parseDouble(ctx.NUM(4).getText()));

        List<String> sensores = new ArrayList<>();
        for (var s : ctx.sensores().sensor()) {
            sensores.add(s.ID().getText());
        }
        m.setSensores(sensores);

        List<String> certificacoes = new ArrayList<>();
        for (var cert : ctx.certificacao()) {
            certificacoes.add(cert.ID().getText());
        }
        m.setCertificacoes(certificacoes);

        Map<String, Double> limites = new HashMap<>();
        for (var lim : ctx.limites_operacionais().limite()) {
            String texto = lim.getText();
            String[] partes = texto.split("=");
            limites.put(partes[0], Double.parseDouble(partes[1]));
        }
        m.setLimites(limites);

        List<String> restricoes = new ArrayList<>();
        for (var r : ctx.restricoes().restricao()) {
            restricoes.add(r.getText());
        }
        m.setRestricoes(restricoes);

        modelos.add(m);
        return null;
    }

    private String removeQuotes(String s) {
        return s.replaceAll("\"", "");
    }
}
