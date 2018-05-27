package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.expression.Expression
import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.domain.scope.Scope
import corgi.lang.util.TypeResolver

class FunctionSignatureVisitor(val scope: Scope) : CorgiBaseVisitor<FunctionSignature>() {
    private val expressionVisitor = ExpressionVisitor(scope)

    override fun visitFunctionDeclaration(functionDeclarationContext: CorgiParser.FunctionDeclarationContext): FunctionSignature {
        val functionName = functionDeclarationContext.functionName().text
        val functionArgumentContexts = functionDeclarationContext.functionParameter()
        val functionParameters = functionArgumentContexts.map {
            val name = it.ID().text
            val type = TypeResolver.getFromTypeName(it.type())
            val defaultValue = this.getParameterDefaultValue(it)

            FunctionParameter(name, defaultValue, type)
        }

        val returnType = TypeResolver.getFromTypeName(functionDeclarationContext.type())

        return FunctionSignature(functionName, functionParameters, returnType)
    }

    private fun getParameterDefaultValue(functionParameterContext: CorgiParser.FunctionParameterContext): Expression? {
        return when (functionParameterContext.functionParameterDefaultValue()) {
            null -> null
            else -> functionParameterContext.functionParameterDefaultValue()
                    .expression()
                    .accept(this.expressionVisitor)
        }
    }
}