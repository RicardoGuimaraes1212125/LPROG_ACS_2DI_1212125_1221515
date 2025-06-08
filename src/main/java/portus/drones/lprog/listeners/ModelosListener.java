package portus.drones.lprog.listeners;
// Generated from Modelos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;
import portus.drones.lprog.parsers.ModelosParser;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelosParser}.
 */
public interface ModelosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelosParser#modelo}.
	 * @param ctx the parse tree
	 */
	void enterModelo(ModelosParser.ModeloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#modelo}.
	 * @param ctx the parse tree
	 */
	void exitModelo(ModelosParser.ModeloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#certificacao}.
	 * @param ctx the parse tree
	 */
	void enterCertificacao(ModelosParser.CertificacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#certificacao}.
	 * @param ctx the parse tree
	 */
	void exitCertificacao(ModelosParser.CertificacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#sensores}.
	 * @param ctx the parse tree
	 */
	void enterSensores(ModelosParser.SensoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#sensores}.
	 * @param ctx the parse tree
	 */
	void exitSensores(ModelosParser.SensoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(ModelosParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(ModelosParser.SensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#limites_operacionais}.
	 * @param ctx the parse tree
	 */
	void enterLimites_operacionais(ModelosParser.Limites_operacionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#limites_operacionais}.
	 * @param ctx the parse tree
	 */
	void exitLimites_operacionais(ModelosParser.Limites_operacionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#limite}.
	 * @param ctx the parse tree
	 */
	void enterLimite(ModelosParser.LimiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#limite}.
	 * @param ctx the parse tree
	 */
	void exitLimite(ModelosParser.LimiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#restricoes}.
	 * @param ctx the parse tree
	 */
	void enterRestricoes(ModelosParser.RestricoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#restricoes}.
	 * @param ctx the parse tree
	 */
	void exitRestricoes(ModelosParser.RestricoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#restricao}.
	 * @param ctx the parse tree
	 */
	void enterRestricao(ModelosParser.RestricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#restricao}.
	 * @param ctx the parse tree
	 */
	void exitRestricao(ModelosParser.RestricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelosParser#modelos}.
	 * @param ctx the parse tree
	 */
	void enterModelos(ModelosParser.ModelosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelosParser#modelos}.
	 * @param ctx the parse tree
	 */
	void exitModelos(ModelosParser.ModelosContext ctx);
}