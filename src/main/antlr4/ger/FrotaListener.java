// Generated from Frota.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FrotaParser}.
 */
public interface FrotaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FrotaParser#frota}.
	 * @param ctx the parse tree
	 */
	void enterFrota(FrotaParser.FrotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#frota}.
	 * @param ctx the parse tree
	 */
	void exitFrota(FrotaParser.FrotaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#drone}.
	 * @param ctx the parse tree
	 */
	void enterDrone(FrotaParser.DroneContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#drone}.
	 * @param ctx the parse tree
	 */
	void exitDrone(FrotaParser.DroneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(FrotaParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(FrotaParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#drones}.
	 * @param ctx the parse tree
	 */
	void enterDrones(FrotaParser.DronesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#drones}.
	 * @param ctx the parse tree
	 */
	void exitDrones(FrotaParser.DronesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#modelo}.
	 * @param ctx the parse tree
	 */
	void enterModelo(FrotaParser.ModeloContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#modelo}.
	 * @param ctx the parse tree
	 */
	void exitModelo(FrotaParser.ModeloContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#certificacao}.
	 * @param ctx the parse tree
	 */
	void enterCertificacao(FrotaParser.CertificacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#certificacao}.
	 * @param ctx the parse tree
	 */
	void exitCertificacao(FrotaParser.CertificacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#sensores}.
	 * @param ctx the parse tree
	 */
	void enterSensores(FrotaParser.SensoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#sensores}.
	 * @param ctx the parse tree
	 */
	void exitSensores(FrotaParser.SensoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(FrotaParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(FrotaParser.SensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#limites_operacionais}.
	 * @param ctx the parse tree
	 */
	void enterLimites_operacionais(FrotaParser.Limites_operacionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#limites_operacionais}.
	 * @param ctx the parse tree
	 */
	void exitLimites_operacionais(FrotaParser.Limites_operacionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#limite}.
	 * @param ctx the parse tree
	 */
	void enterLimite(FrotaParser.LimiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#limite}.
	 * @param ctx the parse tree
	 */
	void exitLimite(FrotaParser.LimiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#restricoes}.
	 * @param ctx the parse tree
	 */
	void enterRestricoes(FrotaParser.RestricoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#restricoes}.
	 * @param ctx the parse tree
	 */
	void exitRestricoes(FrotaParser.RestricoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#restricao}.
	 * @param ctx the parse tree
	 */
	void enterRestricao(FrotaParser.RestricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#restricao}.
	 * @param ctx the parse tree
	 */
	void exitRestricao(FrotaParser.RestricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrotaParser#modelos}.
	 * @param ctx the parse tree
	 */
	void enterModelos(FrotaParser.ModelosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrotaParser#modelos}.
	 * @param ctx the parse tree
	 */
	void exitModelos(FrotaParser.ModelosContext ctx);
}