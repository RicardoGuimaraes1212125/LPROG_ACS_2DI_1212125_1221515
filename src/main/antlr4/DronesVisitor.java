// Generated from Drones.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DronesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DronesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DronesParser#drone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrone(DronesParser.DroneContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#estado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstado(DronesParser.EstadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#drones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrones(DronesParser.DronesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#modelo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelo(DronesParser.ModeloContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#certificacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertificacao(DronesParser.CertificacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#sensores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensores(DronesParser.SensoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#sensor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor(DronesParser.SensorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#limites_operacionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimites_operacionais(DronesParser.Limites_operacionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#limite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimite(DronesParser.LimiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#restricoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricoes(DronesParser.RestricoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#restricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricao(DronesParser.RestricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DronesParser#modelos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelos(DronesParser.ModelosContext ctx);
}