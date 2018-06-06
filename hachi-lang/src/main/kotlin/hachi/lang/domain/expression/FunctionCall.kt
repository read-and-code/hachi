package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.Type

class FunctionCall(val owner: Expression, val functionSignature: FunctionSignature, private val functionCallArguments: List<Expression>) : Call {
    private val functionCallType = this.functionSignature.returnType

    constructor(ownerType: Type, functionSignature: FunctionSignature, arguments: List<Expression>) : this(EmptyExpression(ownerType), functionSignature, arguments)

    override fun getIdentifier(): String {
        return this.functionSignature.functionName
    }

    fun getOwnerType(): Type {
        return this.owner.getType()
    }

    override fun getType(): Type {
        return this.functionCallType
    }

    override fun getArguments(): List<Expression> {
        return this.functionCallArguments
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}