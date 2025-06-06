package portus.drones.lprog.visitors;// Generated from Modelos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import portus.drones.lprog.parsers.ModelosParser;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModelosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModelosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModelosParser#modelo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelo(ModelosParser.ModeloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#certificacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertificacao(ModelosParser.CertificacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#sensores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensores(ModelosParser.SensoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#sensor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor(ModelosParser.SensorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#limites_operacionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimites_operacionais(ModelosParser.Limites_operacionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#limite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimite(ModelosParser.LimiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#restricoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricoes(ModelosParser.RestricoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#restricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricao(ModelosParser.RestricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelosParser#modelos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelos(ModelosParser.ModelosContext ctx);
}