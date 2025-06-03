package portus.drones.lprog.visitors;// Generated from antlr4/Missoes.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import portus.drones.lprog.parsers.MissoesParser;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MissoesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MissoesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MissoesParser#missoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissoes(MissoesParser.MissoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissoesParser#missao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissao(MissoesParser.MissaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissoesParser#entregas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntregas(MissoesParser.EntregasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissoesParser#entrega}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrega(MissoesParser.EntregaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissoesParser#localizacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalizacao(MissoesParser.LocalizacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissoesParser#estado_missao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstado_missao(MissoesParser.Estado_missaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissoesParser#coordenada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordenada(MissoesParser.CoordenadaContext ctx);
}