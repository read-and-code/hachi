package hachi.lang.domain.node.statement

import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.node.expression.Expression
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.Type
import hachi.lang.exception.UnsupportedRangedLoopTypes
import hachi.lang.util.TypeChecker

class RangedForStatement(val iteratorVariable: Statement, private val startExpression: Expression, val endExpression: Expression, val statement: Statement, val iteratorVariableName: String, val scope: Scope) : Statement {
    init {
        if (!TypeChecker.isInt(this.startExpression.getType()) || !TypeChecker.isInt(this.endExpression.getType())) {
            throw UnsupportedRangedLoopTypes()
        }
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }

    fun getType(): Type {
        return this.startExpression.getType()
    }
}