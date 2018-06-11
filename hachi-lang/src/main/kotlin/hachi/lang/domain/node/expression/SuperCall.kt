package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type

class SuperCall(private val superCallArguments: List<Argument>) : Call {
    constructor() : this(emptyList())

    override fun getArguments(): List<Argument> {
        return this.superCallArguments
    }

    override fun getIdentifier(): String {
        return "super"
    }

    override fun getType(): Type {
        return BuiltInType.VOID
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}