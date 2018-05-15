package corgi.lang.domain.expression

import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.bytecode.generator.StatementGenerator
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