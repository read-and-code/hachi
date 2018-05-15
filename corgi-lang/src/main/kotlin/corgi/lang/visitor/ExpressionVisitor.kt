package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.expression.Expression
import corgi.lang.domain.expression.FunctionCall
import corgi.lang.domain.expression.Value
import corgi.lang.domain.expression.VariableReference
import corgi.lang.domain.scope.Scope
import corgi.lang.util.TypeResolver

class ExpressionVisitor(val scope: Scope) : CorgiBaseVisitor<Expression>() {
    override fun visitVariableReference(variableReferenceContext: CorgiParser.VariableReferenceContext): Expression {
        val variableName = variableReferenceContext.text
        val localVariable = this.scope.getLocalVariable(variableName)

        return VariableReference(variableName, localVariable.type)
    }

    override fun visitValue(valueContext: CorgiParser.ValueContext): Expression {
        val value = valueContext.text
        val type = TypeResolver.getFromValue(valueContext.text)

        return Value(value, type)
    }

    override fun visitFunctionCall(functionCallContext: CorgiParser.FunctionCallContext): Expression {
        val functionName = functionCallContext.functionName().text
        val functionSignature = this.scope.getFunctionSignature(functionName)
        val calledParameters = functionCallContext.expressionList().expression()
        val arguments = calledParameters.map { it -> it.accept(this) }

        return FunctionCall(null, functionSignature, arguments)
    }
}