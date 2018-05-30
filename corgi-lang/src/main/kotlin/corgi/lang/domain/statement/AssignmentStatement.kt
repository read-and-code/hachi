package corgi.lang.domain.statement

import corgi.lang.bytecode.generator.StatementGenerator
import corgi.lang.domain.expression.Expression

class AssignmentStatement(val variableName: String, val expression: Expression) : Statement {
    constructor(variableDeclarationStatement: VariableDeclarationStatement)
            : this(variableDeclarationStatement.name, variableDeclarationStatement.expression)

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}