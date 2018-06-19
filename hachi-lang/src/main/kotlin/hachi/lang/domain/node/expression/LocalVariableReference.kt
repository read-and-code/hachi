package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.type.Type

class LocalVariableReference(private val localVariable: LocalVariable) : Reference {
    override fun getName(): String {
        return this.localVariable.getName()
    }

    override fun getType(): Type {
        return this.localVariable.getType()
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}