// Generated from Drones.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DronesParser}.
 */
public interface DronesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DronesParser#drone}.
	 * @param ctx the parse tree
	 */
	void enterDrone(DronesParser.DroneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#drone}.
	 * @param ctx the parse tree
	 */
	void exitDrone(DronesParser.DroneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(DronesParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(DronesParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#modelo}.
	 * @param ctx the parse tree
	 */
	void enterModelo(DronesParser.ModeloContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#modelo}.
	 * @param ctx the parse tree
	 */
	void exitModelo(DronesParser.ModeloContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#certificacao}.
	 * @param ctx the parse tree
	 */
	void enterCertificacao(DronesParser.CertificacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#certificacao}.
	 * @param ctx the parse tree
	 */
	void exitCertificacao(DronesParser.CertificacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#sensores}.
	 * @param ctx the parse tree
	 */
	void enterSensores(DronesParser.SensoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#sensores}.
	 * @param ctx the parse tree
	 */
	void exitSensores(DronesParser.SensoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(DronesParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(DronesParser.SensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#limites_operacionais}.
	 * @param ctx the parse tree
	 */
	void enterLimites_operacionais(DronesParser.Limites_operacionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#limites_operacionais}.
	 * @param ctx the parse tree
	 */
	void exitLimites_operacionais(DronesParser.Limites_operacionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#limite}.
	 * @param ctx the parse tree
	 */
	void enterLimite(DronesParser.LimiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#limite}.
	 * @param ctx the parse tree
	 */
	void exitLimite(DronesParser.LimiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#restricoes}.
	 * @param ctx the parse tree
	 */
	void enterRestricoes(DronesParser.RestricoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#restricoes}.
	 * @param ctx the parse tree
	 */
	void exitRestricoes(DronesParser.RestricoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DronesParser#restricao}.
	 * @param ctx the parse tree
	 */
	void enterRestricao(DronesParser.RestricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DronesParser#restricao}.
	 * @param ctx the parse tree
	 */
	void exitRestricao(DronesParser.RestricaoContext ctx);
}