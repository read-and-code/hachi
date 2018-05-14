package corgi.lang.domain.expressions

import corgi.lang.bytecode.generators.ExpressionGenerator
import corgi.lang.bytecode.generators.StatementGenerator
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.type.Type

class FunctionCall(val owner: Type?, val signature: FunctionSignature, val parameters: Collection<Expression>) : Expression(signature.returnType), Statement {
    fun getFunctionName(): String {
        return this.signature.name
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}