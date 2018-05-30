package corgi.lang.domain.statement

import corgi.lang.bytecode.generator.StatementGenerator
import corgi.lang.domain.expression.Expression
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.Type
import corgi.lang.exception.UnsupportedRangedLoopTypes

class RangedForStatement(val iteratorVariable: Statement, private val startExpression: Expression, val endExpression: Expression, val statement: Statement, val iteratorVariableName: String, val scope: Scope) : Statement {
    init {
        if (this.startExpression.type != BuiltInType.INT || this.endExpression.type != BuiltInType.INT) {
            throw UnsupportedRangedLoopTypes()
        }
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }

    fun getType(): Type {
        return this.startExpression.type
    }
}