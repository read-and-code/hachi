// Generated from Hachi.g4 by ANTLR 4.7.1

    package hachi.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HachiParser}.
 */
public interface HachiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HachiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(HachiParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(HachiParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(HachiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(HachiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(HachiParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(HachiParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(HachiParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(HachiParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(HachiParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(HachiParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HachiParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HachiParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(HachiParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(HachiParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(HachiParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(HachiParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterList(HachiParser.FunctionParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterList(HachiParser.FunctionParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(HachiParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(HachiParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionParameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterWithDefaultValue(HachiParser.FunctionParameterWithDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionParameterWithDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterWithDefaultValue(HachiParser.FunctionParameterWithDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(HachiParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(HachiParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HachiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HachiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(HachiParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(HachiParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(HachiParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(HachiParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HachiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HachiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(HachiParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(HachiParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(HachiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(HachiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(HachiParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(HachiParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(HachiParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(HachiParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(HachiParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(HachiParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(HachiParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(HachiParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnWithValue}
	 * labeled alternative in {@link HachiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithValue(HachiParser.ReturnWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnWithValue}
	 * labeled alternative in {@link HachiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithValue(HachiParser.ReturnWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnVoid}
	 * labeled alternative in {@link HachiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(HachiParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnVoid}
	 * labeled alternative in {@link HachiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(HachiParser.ReturnVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HachiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HachiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HachiParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HachiParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(HachiParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(HachiParser.FunctionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unnamedFunctionArgumentList}
	 * labeled alternative in {@link HachiParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedFunctionArgumentList(HachiParser.UnnamedFunctionArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unnamedFunctionArgumentList}
	 * labeled alternative in {@link HachiParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedFunctionArgumentList(HachiParser.UnnamedFunctionArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedFunctionArgumentList}
	 * labeled alternative in {@link HachiParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterNamedFunctionArgumentList(HachiParser.NamedFunctionArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedFunctionArgumentList}
	 * labeled alternative in {@link HachiParser#functionArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitNamedFunctionArgumentList(HachiParser.NamedFunctionArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#namedFunctionArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedFunctionArgument(HachiParser.NamedFunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#namedFunctionArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedFunctionArgument(HachiParser.NamedFunctionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(HachiParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(HachiParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReferenceLabel}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceLabel(HachiParser.VariableReferenceLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReferenceLabel}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceLabel(HachiParser.VariableReferenceLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueLabel}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueLabel(HachiParser.ValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueLabel}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueLabel(HachiParser.ValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supercall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSupercall(HachiParser.SupercallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supercall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSupercall(HachiParser.SupercallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(HachiParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(HachiParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HachiParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HachiParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(HachiParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(HachiParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorCall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(HachiParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorCall}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(HachiParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(HachiParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(HachiParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(HachiParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link HachiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(HachiParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(HachiParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(HachiParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HachiParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HachiParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HachiParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(HachiParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HachiParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(HachiParser.QualifiedNameContext ctx);
}