package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class FunctionParameterExpressionListVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<List<FunctionParameter>>() {
    override fun visitFunctionParameterList(functionParameterListContext: HachiParser.FunctionParameterListContext?): List<FunctionParameter> {
        val functionParameterContexts = functionParameterListContext?.functionParameter()
        val functionParameterExpressionVisitor = FunctionParameterExpressionVisitor(this.expressionVisitor)
        val parameters = emptyList<FunctionParameter>().toMutableList()

        if (functionParameterContexts != null) {
            parameters.addAll(functionParameterContexts.map { it.accept(functionParameterExpressionVisitor) })
        }

        val functionParameterWithDefaultValueContexts = functionParameterListContext?.functionParameterWithDefaultValue()

        if (functionParameterWithDefaultValueContexts != null) {
            parameters.addAll(functionParameterWithDefaultValueContexts.map { it.accept(functionParameterExpressionVisitor) })
        }

        return parameters
    }
}