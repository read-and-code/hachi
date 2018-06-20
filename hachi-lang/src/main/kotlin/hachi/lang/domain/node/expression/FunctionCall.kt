package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.Type

class FunctionCall(val functionSignature: FunctionSignature, private val arguments: List<FunctionArgument>, val owner: Expression) : Call {
    private val functionCallType = this.functionSignature.returnType

    constructor(functionSignature: FunctionSignature, functionArguments: List<FunctionArgument>, ownerType: Type) : this(functionSignature, functionArguments, EmptyExpression(ownerType))

    override fun getIdentifier(): String {
        return this.functionSignature.functionName
    }

    fun getOwnerType(): Type {
        return this.owner.getType()
    }

    override fun getType(): Type {
        return this.functionCallType
    }

    override fun getArguments(): List<FunctionArgument> {
        return this.arguments
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}