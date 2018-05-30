package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.`class`.Function
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.statement.Statement

class FunctionVisitor : HachiBaseVisitor<Function> {
    var scope: Scope

    constructor(scope: Scope) {
        this.scope = Scope(scope)
    }

    override fun visitFunction(functionContext: HachiParser.FunctionContext): Function {
        val functionName = functionContext.functionDeclaration().functionName().text
        val functionSignature = this.scope.getFunctionSignature(functionName)

        functionSignature.parameters
                .forEach { this.scope.addLocalVariable(LocalVariable(it.name, it.type)) }

        val functionBody = this.getFunctionBody(functionContext)

        return Function(functionSignature, functionBody)
    }

    private fun getFunctionBody(functionContext: HachiParser.FunctionContext): Statement {
        val statementVisitor = StatementVisitor(this.scope)

        return functionContext.functionBody().accept(statementVisitor)
    }
}