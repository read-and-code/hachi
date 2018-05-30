package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.statement.Statement
import hachi.lang.domain.type.Type

class FunctionCall(val owner: Type?, val functionSignature: FunctionSignature, val arguments: Collection<Expression>) : Expression(functionSignature.returnType), Statement {
    fun getFunctionName(): String {
        return this.functionSignature.functionName
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}