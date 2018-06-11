package hachi.lang.domain.node.statement

import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.node.expression.Expression

class PrintStatement(val expression: Expression) : Statement {
    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}