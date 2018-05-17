// Generated from Corgi.g4 by ANTLR 4.7.1

    package corgi.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CorgiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CorgiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CorgiParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CorgiParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(CorgiParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CorgiParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CorgiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(CorgiParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(CorgiParser.FunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#functionParameterDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterDefaultValue(CorgiParser.FunctionParameterDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CorgiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(CorgiParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CorgiParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CorgiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CorgiParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(CorgiParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CorgiParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(CorgiParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIABLE_REFERENCE}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIABLE_REFERENCE(CorgiParser.VARIABLE_REFERENCEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_CALL}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_CALL(CorgiParser.FUNCTION_CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTIPLY}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTIPLY(CorgiParser.MULTIPLYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VALUE}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVALUE(CorgiParser.VALUEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBTRACT}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBTRACT(CorgiParser.SUBTRACTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVIDE}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVIDE(CorgiParser.DIVIDEContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(CorgiParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CorgiParser.ValueContext ctx);
}