package portus.drones.lprog.domain;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DronesVisitorImpl extends DronesBaseVisitor<Void> {
    public List<Drone> drones = new ArrayList<>();

    @Override
    public Void visitDrones(DronesParser.DronesContext ctx) {
        for (var droneCtx : ctx.drone()) {
            visitDrone(droneCtx);
        }
        return null;
    }

    @Override
    public Void visitDrone(DronesParser.DroneContext ctx) {
        Drone d = new Drone();
        d.setNome(removeQuotes(ctx.STRING(0).getText()));
        d.setNumeroSerie(Long.parseLong(ctx.NUM(0).getText()));
        d.setModelo(removeQuotes(ctx.STRING(1).getText()));
        d.setPesoBase(Double.parseDouble(ctx.NUM(1).getText()));
        d.setBateriaAtual(Double.parseDouble(ctx.NUM(2).getText()));
        d.setEstado(ctx.estado().getText());
        d.setHorasVoo(Double.parseDouble(ctx.NUM(3).getText()));
        d.setUltimaManutencao(LocalDate.parse(ctx.DATA(0).getText()));
        d.setProximaManutencao(LocalDate.parse(ctx.DATA(1).getText()));
        drones.add(d);
        return null;
    }

    private String removeQuotes(String s) {
        return s.replaceAll("\"", "");
    }
}
