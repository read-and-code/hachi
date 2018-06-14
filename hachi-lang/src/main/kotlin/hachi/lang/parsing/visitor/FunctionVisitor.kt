package hachi.lang.parsing.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.Constructor
import hachi.lang.domain.Function
import hachi.lang.domain.node.statement.Statement
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.parsing.visitor.statement.StatementVisitor

class FunctionVisitor(scope: Scope) : HachiBaseVisitor<Function>() {
    val scope = Scope(scope)

    override fun visitFunction(functionContext: HachiParser.FunctionContext): Function {
        val functionSignature = functionContext.functionDeclaration().accept(FunctionSignatureVisitor(this.scope))

        this.scope.addLocalVariable(LocalVariable("this", this.scope.getClassType()))
        this.addFunctionParametersAsLocalVariables(functionSignature)

        val functionBody = this.getFunctionBody(functionContext)

        return if (functionSignature.functionName == this.scope.getClassName()) {
            Constructor(functionSignature, functionBody)
        } else {
            Function(functionSignature, functionBody)
        }
    }

    private fun addFunctionParametersAsLocalVariables(functionSignature: FunctionSignature) {
        functionSignature.parameters.forEach { this.scope.addLocalVariable(LocalVariable(it.name, it.getType())) }
    }

    private fun getFunctionBody(functionContext: HachiParser.FunctionContext): Statement {
        val statementVisitor = StatementVisitor(this.scope)

        return functionContext.functionBody().accept(statementVisitor)
    }
}