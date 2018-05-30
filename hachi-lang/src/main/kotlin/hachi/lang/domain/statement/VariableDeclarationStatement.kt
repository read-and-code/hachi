package hachi.lang.domain.statement

import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.expression.Expression

class VariableDeclarationStatement(val name: String, val expression: Expression) : Statement {
    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}