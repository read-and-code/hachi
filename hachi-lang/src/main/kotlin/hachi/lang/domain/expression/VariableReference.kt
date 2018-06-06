package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.type.Type

class VariableReference(val variableName: String, val variableReferenceType: Type) : Expression {
    override fun getType(): Type {
        return this.variableReferenceType
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}