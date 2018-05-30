package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.expression.Expression
import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.Scope
import hachi.lang.util.TypeResolver

class FunctionSignatureVisitor(val scope: Scope) : HachiBaseVisitor<FunctionSignature>() {
    private val expressionVisitor = ExpressionVisitor(scope)

    override fun visitFunctionDeclaration(functionDeclarationContext: HachiParser.FunctionDeclarationContext): FunctionSignature {
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

    private fun getParameterDefaultValue(functionParameterContext: HachiParser.FunctionParameterContext): Expression? {
        return when (functionParameterContext.functionParameterDefaultValue()) {
            null -> null
            else -> functionParameterContext.functionParameterDefaultValue()
                    .expression()
                    .accept(this.expressionVisitor)
        }
    }
}