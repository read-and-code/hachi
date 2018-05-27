package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.`class`.Function
import corgi.lang.domain.scope.LocalVariable
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.Statement

class FunctionVisitor : CorgiBaseVisitor<Function> {
    var scope: Scope

    constructor(scope: Scope) {
        this.scope = Scope(scope)
    }

    override fun visitFunction(functionContext: CorgiParser.FunctionContext): Function {
        val functionName = functionContext.functionDeclaration().functionName().text
        val functionSignature = this.scope.getFunctionSignature(functionName)

        functionSignature.parameters
                .forEach { this.scope.addLocalVariable(LocalVariable(it.name, it.type)) }

        val functionBody = this.getFunctionBody(functionContext)

        return Function(functionSignature, functionBody)
    }

    private fun getFunctionBody(functionContext: CorgiParser.FunctionContext): Statement {
        val statementVisitor = StatementVisitor(this.scope)

        return functionContext.functionBody().accept(statementVisitor)
    }
}