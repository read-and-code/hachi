package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.Argument
import hachi.lang.domain.node.expression.Call
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.node.expression.VariableReference
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

        val arguments = this.getArgumentsForCall(functionCallContext.argumentList())
        val functionSignature = this.scope.getMethodCallSignature(functionName, arguments)

        functionCallContext.owner?.let {
            val owner = functionCallContext.owner.accept(this.expressionVisitor)

            return FunctionCall(functionSignature, arguments, owner)
        }

        val thisType = ClassType(this.scope.getClassName())

        return FunctionCall(functionSignature, arguments, VariableReference("this", thisType))
    }

    override fun visitConstructorCall(constructorCallContext: HachiParser.ConstructorCallContext): Call {
        val className = constructorCallContext.className().text
        val arguments = this.getArgumentsForCall(constructorCallContext.argumentList())

        return ConstructorCall(className, arguments)
    }

    override fun visitSupercall(supercallContext: HachiParser.SupercallContext): Call {
        val arguments = this.getArgumentsForCall(supercallContext.argumentList())

        return SuperCall(arguments)
    }

    private fun getArgumentsForCall(argumentListContext: HachiParser.ArgumentListContext?): List<Argument> {
        if (argumentListContext != null) {
            val argumentExpressionsListVisitor = ArgumentExpressionsListVisitor(this.expressionVisitor)

            return argumentListContext.accept(argumentExpressionsListVisitor)
        } else {
            return emptyList()
        }
    }
}