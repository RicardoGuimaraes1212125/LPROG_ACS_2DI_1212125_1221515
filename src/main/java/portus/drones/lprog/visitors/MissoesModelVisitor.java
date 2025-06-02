package portus.drones.lprog.visitors;

import portus.drones.lprog.MissoesParser;
import portus.drones.lprog.domain.entrega.Coordenada;
import portus.drones.lprog.domain.entrega.Entrega;
import portus.drones.lprog.domain.entrega.Localizacao;
import portus.drones.lprog.domain.missao.EstadoMissao;
import portus.drones.lprog.domain.missao.Missao;
import java.util.ArrayList;
import java.util.List;

public class MissoesModelVisitor extends MissoesBaseVisitor<Object> {

    @Override
    public List<Missao> visitMissoes(MissoesParser.MissoesContext ctx) {
        List<Missao> missoes = new ArrayList<>();
        for (MissoesParser.MissaoContext missaoCtx : ctx.missao()) {
            Missao missao = (Missao) visit(missaoCtx);
            if (missao != null) {
                missoes.add(missao);
            }
        }
        return missoes;
    }

    @Override
    public Missao visitMissao(MissoesParser.MissaoContext ctx) {
        Missao missao = new Missao();
        
        // Remove quotes from STRING tokens
        String nome = ctx.STRING(0).getText();
        missao.setNome(removeQuotes(nome));
        
        missao.setInicio(ctx.HORA().getText());
        
        String drone = ctx.STRING(1).getText();
        missao.setDrone(removeQuotes(drone));
        
        EstadoMissao estado = (EstadoMissao) visit(ctx.estado_missao());
        missao.setEstado(estado);
        
        List<Entrega> entregas = visitEntregas(ctx.entregas());
        missao.setEntregas(entregas);
        
        return missao;
    }

    @Override
    public List<Entrega> visitEntregas(MissoesParser.EntregasContext ctx) {
        List<Entrega> entregas = new ArrayList<>();
        for (MissoesParser.EntregaContext entregaCtx : ctx.entrega()) {
            Entrega entrega = (Entrega) visit(entregaCtx);
            if (entrega != null) {
                entregas.add(entrega);
            }
        }
        return entregas;
    }

    @Override
    public Entrega visitEntrega(MissoesParser.EntregaContext ctx) {
        Entrega entrega = new Entrega();
        
        // Get origem and destino
        List<MissoesParser.LocalizacaoContext> localizacoes = ctx.localizacao();
        Localizacao origem = (Localizacao) visit(localizacoes.get(0));
        Localizacao destino = (Localizacao) visit(localizacoes.get(1));
        
        entrega.setOrigem(origem);
        entrega.setDestino(destino);
        
        // Get numeric values
        List<String> nums = new ArrayList<>();
        for (int i = 0; i < ctx.NUM().size(); i++) {
            nums.add(ctx.NUM(i).getText());
        }
        
        entrega.setDistancia(Double.parseDouble(nums.get(0)));
        entrega.setAltitude(Double.parseDouble(nums.get(1)));
        entrega.setPeso(Double.parseDouble(nums.get(2)));
        
        return entrega;
    }

    @Override
    public Localizacao visitLocalizacao(MissoesParser.LocalizacaoContext ctx) {
        Localizacao localizacao = new Localizacao();
        
        // Get coordinates
        List<MissoesParser.CoordenadaContext> coordenadas = ctx.coordenada();
        Coordenada latitude = new Coordenada((double) visit(coordenadas.get(0)));
        Coordenada longitude =  new Coordenada((double) visit(coordenadas.get(1)));

        localizacao.setLatitude(latitude);
        localizacao.setLongitude(longitude);
        
        // Get name
        String nome = ctx.STRING().getText();
        localizacao.setNome(removeQuotes(nome));
        
        return localizacao;
    }

    @Override
    public EstadoMissao visitEstado_missao(MissoesParser.Estado_missaoContext ctx) {
        String estadoText = ctx.getText();
        return EstadoMissao.fromString(estadoText);
    }

    @Override
    public Double visitCoordenada(MissoesParser.CoordenadaContext ctx) {
        if (ctx.getText().startsWith("-")) {
            // Negative coordinate (has '-' token)
            return -Double.parseDouble(ctx.NUM().getText());
        } else {
            // Positive coordinate
            return Double.parseDouble(ctx.NUM().getText());
        }
    }
    
    private String removeQuotes(String str) {
        if (str != null && str.length() >= 2 && str.startsWith("\"") && str.endsWith("\"")) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }
}
