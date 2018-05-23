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
	 * Visit a parse tree produced by {@link CorgiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CorgiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CorgiParser.StatementContext ctx);
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
	 * Visit a parse tree produced by the {@code returnVoid}
	 * labeled alternative in {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(CorgiParser.ReturnVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnWithValue}
	 * labeled alternative in {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(CorgiParser.ReturnWithValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CorgiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CorgiParser.IfStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CorgiParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReferenceLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferenceLabel(CorgiParser.VariableReferenceLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallLabel(CorgiParser.FunctionCallLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLabel(CorgiParser.ValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CorgiParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(CorgiParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CorgiParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(CorgiParser.MultiplyContext ctx);
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