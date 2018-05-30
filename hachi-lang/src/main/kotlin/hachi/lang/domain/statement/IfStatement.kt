package hachi.lang.domain.statement

import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.expression.Expression

class IfStatement(val condition: Expression, val trueStatement: Statement, val falseStatement: Statement) : Statement {
    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}