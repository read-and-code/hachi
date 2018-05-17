package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.expression.Expression
import corgi.lang.domain.expression.FunctionCall
import corgi.lang.domain.expression.Value
import corgi.lang.domain.expression.VariableReference
import corgi.lang.domain.math.Addition
import corgi.lang.domain.math.Division
import corgi.lang.domain.math.Multiplication
import corgi.lang.domain.math.Subtraction
import corgi.lang.domain.scope.Scope
import corgi.lang.util.TypeResolver

class ExpressionVisitor(val scope: Scope) : CorgiBaseVisitor<Expression>() {
    override fun visitVariableReference(variableReferenceContext: CorgiParser.VariableReferenceContext): Expression {
        val variableName = variableReferenceContext.text
        val localVariable = this.scope.getLocalVariable(variableName)

        return VariableReference(variableName, localVariable.type)
    }

    override fun visitValue(valueContext: CorgiParser.ValueContext): Expression {
        val value = valueContext.text
        val type = TypeResolver.getFromValue(valueContext.text)

        return Value(value, type)
    }

    override fun visitFunctionCall(functionCallContext: CorgiParser.FunctionCallContext): Expression {
        val functionName = functionCallContext.functionName().text
        val functionSignature = this.scope.getFunctionSignature(functionName)
        val calledParameters = functionCallContext.expressionList().expression()
        val arguments = calledParameters.map { it.accept(this) }

        return FunctionCall(null, functionSignature, arguments)
    }

    override fun visitAdd(addContext: CorgiParser.AddContext): Expression {
        val leftExpressionContext = addContext.expression(0)
        val rightExpressionContext = addContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Addition(leftExpression, rightExpression)
    }

    override fun visitMultiply(multiplyContext: CorgiParser.MultiplyContext): Expression {
        val leftExpressionContext = multiplyContext.expression(0)
        val rightExpressionContext = multiplyContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Multiplication(leftExpression, rightExpression)
    }

    override fun visitSubtract(subtractContext: CorgiParser.SubtractContext): Expression {
        val leftExpressionContext = subtractContext.expression(0)
        val rightExpressionContext = subtractContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Subtraction(leftExpression, rightExpression)
    }

    override fun visitDivide(divideContext: CorgiParser.DivideContext): Expression {
        val leftExpressionContext = divideContext.expression(0)
        val rightExpressionContext = divideContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Division(leftExpression, rightExpression)
    }
}