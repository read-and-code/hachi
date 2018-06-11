package hachi.lang.bytecode.generator.statement

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.node.statement.AssignmentStatement
import hachi.lang.domain.node.statement.VariableDeclarationStatement

class VariableDeclarationStatementGenerator(val statementGenerator: StatementGenerator, val expressionGenerator: ExpressionGenerator) {
    fun generate(variableDeclarationStatement: VariableDeclarationStatement) {
        val expression = variableDeclarationStatement.expression

        expression.accept(this.expressionGenerator)

        val assignmentStatement = AssignmentStatement(variableDeclarationStatement)

        assignmentStatement.accept(this.statementGenerator)
    }
}