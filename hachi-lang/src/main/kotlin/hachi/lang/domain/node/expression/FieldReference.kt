package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.scope.Field
import hachi.lang.domain.type.Type

class FieldReference(private val field: Field) : Reference {
    override fun getName(): String {
        return this.field.getName()
    }

    override fun getType(): Type {
        return this.field.getType()
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }

    fun getOwnerInternalName(): String {
        return this.field.getOwnerInternalName()
    }
}