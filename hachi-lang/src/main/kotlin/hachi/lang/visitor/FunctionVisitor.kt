package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.`class`.Constructor
import hachi.lang.domain.`class`.Function
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.statement.Statement
import hachi.lang.util.TypeResolver

class FunctionVisitor(scope: Scope) : HachiBaseVisitor<Function>() {
    val scope = Scope(scope)

    override fun visitFunction(functionContext: HachiParser.FunctionContext): Function {
        val functionName = functionContext.functionDeclaration().functionName().text
        val parameterTypes = functionContext.functionDeclaration()
                .functionParameter()
                .map { TypeResolver.getFromTypeName(it.type()) }
        val functionSignature = this.scope.getMethodCallSignature(functionName, parameterTypes)

        this.scope.addLocalVariable(LocalVariable("this", this.scope.getClassType()))

        functionSignature.parameters
                .forEach { this.scope.addLocalVariable(LocalVariable(it.name, it.getType())) }

        val functionBody = this.getFunctionBody(functionContext)

        if (functionSignature.functionName == this.scope.getClassName()) {
            return Constructor(functionSignature, functionBody)
        }

        return Function(functionSignature, functionBody)
    }

    private fun getFunctionBody(functionContext: HachiParser.FunctionContext): Statement {
        val statementVisitor = StatementVisitor(this.scope)

        return functionContext.functionBody().accept(statementVisitor)
    }
}