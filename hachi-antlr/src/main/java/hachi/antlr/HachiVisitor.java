// Generated from Hachi.g4 by ANTLR 4.7.1

    package hachi.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HachiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HachiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HachiParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(HachiParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(HachiParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(HachiParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(HachiParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HachiParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(HachiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(HachiParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterList(HachiParser.FunctionParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(HachiParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionParameterWithDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterWithDefaultValue(HachiParser.FunctionParameterWithDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(HachiParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HachiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(HachiParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(HachiParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HachiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(HachiParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(HachiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(HachiParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnWithValue}
	 * labeled alternative in {@link HachiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(HachiParser.ReturnWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnVoid}
	 * labeled alternative in {@link HachiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(HachiParser.ReturnVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(HachiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(HachiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(HachiParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HachiParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(HachiParser.FunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unnamedFunctionArgumentList}
	 * labeled alternative in {@link HachiParser#functionArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedFunctionArgumentList(HachiParser.UnnamedFunctionArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedFunctionArgumentList}
	 * labeled alternative in {@link HachiParser#functionArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunctionArgumentList(HachiParser.NamedFunctionArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#namedFunctionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunctionArgument(HachiParser.NamedFunctionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(HachiParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableReferenceLabel}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReferenceLabel(HachiParser.VariableReferenceLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueLabel}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLabel(HachiParser.ValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supercall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupercall(HachiParser.SupercallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(HachiParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HachiParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(HachiParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorCall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(HachiParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(HachiParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(HachiParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(HachiParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HachiParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HachiParser.ValueContext ctx);
}