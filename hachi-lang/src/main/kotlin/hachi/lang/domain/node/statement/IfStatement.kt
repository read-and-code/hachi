package hachi.lang.domain.node.statement

import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.node.expression.Expression

class IfStatement(val condition: Expression, val trueStatement: Statement, val falseStatement: Statement?) : Statement {
    constructor(condition: Expression, trueStatement: Statement) : this(condition, trueStatement, null)

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}