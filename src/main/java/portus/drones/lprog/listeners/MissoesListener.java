package portus.drones.lprog.listeners;// Generated from antlr4/Missoes.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;
import portus.drones.lprog.MissoesParser;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MissoesParser}.
 */
public interface MissoesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MissoesParser#missoes}.
	 * @param ctx the parse tree
	 */
	void enterMissoes(MissoesParser.MissoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#missoes}.
	 * @param ctx the parse tree
	 */
	void exitMissoes(MissoesParser.MissoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissoesParser#missao}.
	 * @param ctx the parse tree
	 */
	void enterMissao(MissoesParser.MissaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#missao}.
	 * @param ctx the parse tree
	 */
	void exitMissao(MissoesParser.MissaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissoesParser#entregas}.
	 * @param ctx the parse tree
	 */
	void enterEntregas(MissoesParser.EntregasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#entregas}.
	 * @param ctx the parse tree
	 */
	void exitEntregas(MissoesParser.EntregasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissoesParser#entrega}.
	 * @param ctx the parse tree
	 */
	void enterEntrega(MissoesParser.EntregaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#entrega}.
	 * @param ctx the parse tree
	 */
	void exitEntrega(MissoesParser.EntregaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissoesParser#localizacao}.
	 * @param ctx the parse tree
	 */
	void enterLocalizacao(MissoesParser.LocalizacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#localizacao}.
	 * @param ctx the parse tree
	 */
	void exitLocalizacao(MissoesParser.LocalizacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissoesParser#estado_missao}.
	 * @param ctx the parse tree
	 */
	void enterEstado_missao(MissoesParser.Estado_missaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#estado_missao}.
	 * @param ctx the parse tree
	 */
	void exitEstado_missao(MissoesParser.Estado_missaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissoesParser#coordenada}.
	 * @param ctx the parse tree
	 */
	void enterCoordenada(MissoesParser.CoordenadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissoesParser#coordenada}.
	 * @param ctx the parse tree
	 */
	void exitCoordenada(MissoesParser.CoordenadaContext ctx);
}