package corgi.lang.domain.expressions

import corgi.lang.bytecode.generators.ExpressionGenerator
import corgi.lang.bytecode.generators.StatementGenerator
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.type.Type
import java.util.*

class FunctionCall(val owner: Type?, val signature: FunctionSignature, parameters: Collection<Expression>) : Expression(signature.returnType), Statement {
    val parameters: Collection<Expression> = parameters
        get() = Collections.unmodifiableCollection(field)

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