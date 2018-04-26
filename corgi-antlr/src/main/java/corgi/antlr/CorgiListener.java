// Generated from Corgi.g4 by ANTLR 4.7.1

    package corgi.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CorgiParser}.
 */
public interface CorgiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CorgiParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CorgiParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CorgiParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CorgiParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CorgiParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CorgiParser.ValueContext ctx);
}