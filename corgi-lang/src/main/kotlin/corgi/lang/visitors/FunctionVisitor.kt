package corgi.lang.visitors

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.`class`.Function
import corgi.lang.domain.expressions.FunctionParameter
import corgi.lang.domain.scope.LocalVariable
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.type.Type
import corgi.lang.utils.TypeResolver

class FunctionVisitor(val scope: Scope) : CorgiBaseVisitor<Function>() {
    override fun visitFunction(functionContext: CorgiParser.FunctionContext): Function {
        val functionName = this.getName(functionContext)
        val returnType = this.getReturnType(functionContext)
        val arguments = this.getArguments(functionContext)
        val statements = this.getStatements(functionContext)

        return Function(functionName, arguments, statements, returnType, this.scope)
    }

    private fun getName(functionContext: CorgiParser.FunctionContext): String {
        return functionContext.functionDeclaration().functionName().text
    }

    private fun getReturnType(functionContext: CorgiParser.FunctionContext): Type {
        val typeContext = functionContext.functionDeclaration().type()

        return TypeResolver.getFromTypeName(typeContext)
    }

    private fun getArguments(functionContext: CorgiParser.FunctionContext): List<FunctionParameter> {
        val functionArgumentContexts = functionContext.functionDeclaration().functionArgument()

        val functionParameters = functionArgumentContexts.map { it ->
            FunctionParameter(it.ID().text, TypeResolver.getFromTypeName(it.type()))
        }

        functionParameters.forEach { it -> this.scope.addLocalVariable(LocalVariable(it.name, it.type)) }

        return functionParameters
    }

    private fun getStatements(functionContext: CorgiParser.FunctionContext): List<Statement> {
        val statementVisitor = StatementVisitor(this.scope)

        return functionContext.blockStatement().map { it -> it.accept(statementVisitor) }
    }
}