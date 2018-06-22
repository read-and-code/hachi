package hachi.lang.parsing.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.Statement
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.parsing.visitor.statement.StatementVisitor

open class BaseFunctionVisitor<T>(scope: Scope) : HachiBaseVisitor<T>() {
    protected val scope = Scope(scope)

    protected fun addFunctionParametersAsLocalVariables(functionSignature: FunctionSignature) {
        functionSignature.parameters.forEach { this.scope.addLocalVariable(LocalVariable(it.name, it.getType())) }
    }

    protected fun getFunctionBody(functionContext: HachiParser.FunctionContext): Statement {
        val statementVisitor = StatementVisitor(this.scope)

        return functionContext.functionBody().accept(statementVisitor)
    }

    protected fun getFunctionBody(constructorContext: HachiParser.ConstructorContext): Statement {
        val statementVisitor = StatementVisitor(this.scope)

        return constructorContext.functionBody().accept(statementVisitor)
    }
}