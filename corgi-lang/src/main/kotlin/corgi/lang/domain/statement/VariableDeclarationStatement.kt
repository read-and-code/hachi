package corgi.lang.domain.statement

import corgi.lang.bytecode.generator.StatementGenerator
import corgi.lang.domain.expression.Expression

class VariableDeclarationStatement(val name: String, val expression: Expression) : Statement {
    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}