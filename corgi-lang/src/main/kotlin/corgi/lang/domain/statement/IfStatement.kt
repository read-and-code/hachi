package corgi.lang.domain.statement

import corgi.lang.bytecode.generator.StatementGenerator
import corgi.lang.domain.expression.Expression

class IfStatement(val condition: Expression, val trueStatement: Statement, val falseStatement: Statement) : Statement {
    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}