// Generated from Frota.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FrotaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FrotaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FrotaParser#frota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrota(FrotaParser.FrotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#modelo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelo(FrotaParser.ModeloContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#certificacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertificacao(FrotaParser.CertificacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#drone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrone(FrotaParser.DroneContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#sensores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensores(FrotaParser.SensoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#sensor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor(FrotaParser.SensorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#limites_operacionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimites_operacionais(FrotaParser.Limites_operacionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#limite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimite(FrotaParser.LimiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#restricoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricoes(FrotaParser.RestricoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#restricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestricao(FrotaParser.RestricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrotaParser#estado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstado(FrotaParser.EstadoContext ctx);
}