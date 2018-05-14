package corgi.lang.visitors

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.expressions.FunctionParameter
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.utils.TypeResolver

class FunctionSignatureVisitor : CorgiBaseVisitor<FunctionSignature>() {
    override fun visitFunctionDeclaration(functionDeclarationContext: CorgiParser.FunctionDeclarationContext): FunctionSignature {
        val functionName = functionDeclarationContext.functionName().text
        val functionArgumentContexts = functionDeclarationContext.functionArgument()
        val functionParameters = functionArgumentContexts.map {
            val name = it.ID().text
            val type = TypeResolver.getFromTypeName(it.type())

            FunctionParameter(name, type)
        }

        val returnType = TypeResolver.getFromTypeName(functionDeclarationContext.type())

        return FunctionSignature(functionName, functionParameters, returnType)
    }
}