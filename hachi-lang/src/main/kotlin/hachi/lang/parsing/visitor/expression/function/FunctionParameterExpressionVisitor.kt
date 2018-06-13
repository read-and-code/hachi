package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.parsing.visitor.expression.ExpressionVisitor
import hachi.lang.util.TypeResolver

class FunctionParameterExpressionVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<FunctionParameter>() {
    override fun visitFunctionParameter(functionParameterContext: HachiParser.FunctionParameterContext): FunctionParameter {
        val name = functionParameterContext.ID().text
        val type = TypeResolver.getFromTypeContext(functionParameterContext.type())

        return FunctionParameter(name, type, null)
    }

    override fun visitFunctionParameterWithDefaultValue(functionParameterWithDefaultValueContext: HachiParser.FunctionParameterWithDefaultValueContext): FunctionParameter {
        val name = functionParameterWithDefaultValueContext.ID().text
        val type = TypeResolver.getFromTypeContext(functionParameterWithDefaultValueContext.type())
        val defaultValue = functionParameterWithDefaultValueContext.defaultValue?.accept(this.expressionVisitor)

        return FunctionParameter(name, type, defaultValue)
    }
}