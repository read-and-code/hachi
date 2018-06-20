package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.ConditionalExpression
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.EmptyExpression
import hachi.lang.domain.node.expression.FieldReference
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.node.expression.LocalVariableReference
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.node.expression.Value
import hachi.lang.domain.node.expression.arithmetic.Addition
import hachi.lang.domain.node.expression.arithmetic.Division
import hachi.lang.domain.node.expression.arithmetic.Multiplication
import hachi.lang.domain.node.expression.arithmetic.Subtraction
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor

class ExpressionGenerator(private val methodVisitor: MethodVisitor, private val scope: Scope) {
    private val referenceExpressionGenerator = ReferenceExpressionGenerator(this.methodVisitor, this.scope)

    private val valueExpressionGenerator = ValueExpressionGenerator(this.methodVisitor)

    private val callExpressionGenerator = CallExpressionGenerator(this, this.methodVisitor, this.scope)

    private val arithmeticExpressionGenerator = ArithmeticExpressionGenerator(this, this.methodVisitor)

    private val conditionalExpressionGenerator = ConditionalExpressionGenerator(this, this.methodVisitor)

    private val functionParameterExpressionGenerator = FunctionParameterExpressionGenerator(this.methodVisitor, this.scope)

    fun generate(localVariableReference: LocalVariableReference) {
        this.referenceExpressionGenerator.generate(localVariableReference)
    }

    fun generate(fieldReference: FieldReference) {
        this.referenceExpressionGenerator.generate(fieldReference)
    }

    fun generate(value: Value) {
        this.valueExpressionGenerator.generate(value)
    }

    fun generate(functionParameter: FunctionParameter) {
        this.functionParameterExpressionGenerator.generate(functionParameter)
    }

    fun generate(constructorCall: ConstructorCall) {
        this.callExpressionGenerator.generate(constructorCall)
    }

    fun generate(superCall: SuperCall) {
        this.callExpressionGenerator.generate(superCall)
    }

    fun generate(functionCall: FunctionCall) {
        this.callExpressionGenerator.generate(functionCall)
    }

    fun generate(addition: Addition) {
        this.arithmeticExpressionGenerator.generate(addition)
    }

    fun generate(subtraction: Subtraction) {
        this.arithmeticExpressionGenerator.generate(subtraction)
    }

    fun generate(multiplication: Multiplication) {
        this.arithmeticExpressionGenerator.generate(multiplication)
    }

    fun generate(division: Division) {
        this.arithmeticExpressionGenerator.generate(division)
    }

    fun generate(conditionalExpression: ConditionalExpression) {
        this.conditionalExpressionGenerator.generate(conditionalExpression)
    }

    fun generate(emptyExpression: EmptyExpression) {
    }
}