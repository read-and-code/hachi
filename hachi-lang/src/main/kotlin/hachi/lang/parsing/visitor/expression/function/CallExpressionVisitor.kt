package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.Call
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.LocalVariableReference
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.ClassType
import hachi.lang.exception.FunctionNameEqualClassException
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class CallExpressionVisitor(private val expressionVisitor: ExpressionVisitor, private val scope: Scope) : HachiBaseVisitor<Call>() {
    override fun visitFunctionCall(functionCallContext: HachiParser.FunctionCallContext): Call {
        val functionName = functionCallContext.functionName().text

        if (functionName == this.scope.getClassName()) {
            throw FunctionNameEqualClassException(functionName)
        }

        val arguments = this.getArgumentsForCall(functionCallContext.functionArgumentList())

        functionCallContext.owner?.let {
            val owner = functionCallContext.owner.accept(this.expressionVisitor)
            val functionSignature = this.scope.getFunctionCallSignature(owner.getType(), functionName, arguments)

            return FunctionCall(functionSignature, arguments, owner)
        }

        val thisType = ClassType(this.scope.getClassName())
        val functionSignature = this.scope.getFunctionCallSignature(functionName, arguments)
        val thisVariable = LocalVariable("this", thisType)

        return FunctionCall(functionSignature, arguments, LocalVariableReference(thisVariable))
    }

    override fun visitConstructorCall(constructorCallContext: HachiParser.ConstructorCallContext): Call {
        val className = constructorCallContext.className().text
        val arguments = this.getArgumentsForCall(constructorCallContext.functionArgumentList())

        return ConstructorCall(className, arguments)
    }

    override fun visitSupercall(supercallContext: HachiParser.SupercallContext): Call {
        val arguments = this.getArgumentsForCall(supercallContext.functionArgumentList())

        return SuperCall(arguments)
    }

    private fun getArgumentsForCall(functionArgumentListContext: HachiParser.FunctionArgumentListContext?): List<FunctionArgument> {
        return when (functionArgumentListContext) {
            null -> emptyList()
            else -> {
                val argumentExpressionsListVisitor = FunctionArgumentListExpressionVisitor(this.expressionVisitor)

                functionArgumentListContext.accept(argumentExpressionsListVisitor)
            }
        }
    }
}