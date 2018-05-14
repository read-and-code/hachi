package corgi.lang.domain.statement

import corgi.lang.bytecode.generators.StatementGenerator
import corgi.lang.domain.expressions.Expression

class VariableDeclarationStatement(val name: String, val expression: Expression) : Statement {
    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}