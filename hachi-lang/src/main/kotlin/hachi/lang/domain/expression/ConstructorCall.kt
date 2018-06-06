package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type

class ConstructorCall(private val constructorIdentifier: String, private val constructorArguments: List<Expression>) : Call {
    val type = ClassType(this.constructorIdentifier)

    constructor(identifier: String) : this(identifier, emptyList())

    override fun getArguments(): List<Expression> {
        return this.constructorArguments
    }

    override fun getIdentifier(): String {
        return this.constructorIdentifier
    }

    override fun getType(): Type {
        return this.type
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}