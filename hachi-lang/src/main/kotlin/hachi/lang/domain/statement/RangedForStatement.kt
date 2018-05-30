package hachi.lang.domain.statement

import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.expression.Expression
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.Type
import hachi.lang.exception.UnsupportedRangedLoopTypes
import hachi.lang.util.TypeChecker

class RangedForStatement(val iteratorVariable: Statement, private val startExpression: Expression, val endExpression: Expression, val statement: Statement, val iteratorVariableName: String, val scope: Scope) : Statement {
    init {
        if (!TypeChecker.isInt(this.startExpression.type) || !TypeChecker.isInt(this.endExpression.type)) {
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