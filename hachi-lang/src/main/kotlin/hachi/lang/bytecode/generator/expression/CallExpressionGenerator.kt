package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.Call
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.Expression
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.ClassType
import hachi.lang.exception.BadArgumentsToFunctionCallException
import hachi.lang.exception.WrongArgumentNameException
import hachi.lang.util.DescriptorFactory
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class CallExpressionGenerator(private val expressionGenerator: ExpressionGenerator, private val methodVisitor: MethodVisitor, private val scope: Scope) {
    fun generate(constructorCall: ConstructorCall) {
        val functionSignature = this.scope.getConstructorCallSignature(constructorCall.getIdentifier(), constructorCall.getArguments())
        val ownerDescriptor = ClassType(functionSignature.functionName).getDescriptor()

        this.methodVisitor.visitTypeInsn(Opcodes.NEW, ownerDescriptor)
        this.methodVisitor.visitInsn(Opcodes.DUP)

        val methodDescriptor = DescriptorFactory.getMethodDescriptor(functionSignature)

        this.generateArguments(constructorCall, functionSignature)

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", methodDescriptor, false)
    }

    fun generate(superCall: SuperCall) {
        this.methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)

        this.generateArguments(superCall)

        val ownerDescriptor = this.scope.getSuperClassInternalName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", "()V", false)
    }

    fun generate(functionCall: FunctionCall) {
        functionCall.owner.accept(this.expressionGenerator)

        this.generateArguments(functionCall)

        val functionName = functionCall.getIdentifier()
        val methodDescriptor = DescriptorFactory.getMethodDescriptor(functionCall.functionSignature)
        val ownerDescriptor = functionCall.getOwnerType().getInternalName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, ownerDescriptor, functionName, methodDescriptor, false)
    }

    private fun generateArguments(functionCall: FunctionCall) {
        val functionSignature = this.scope.getFunctionCallSignature(functionCall.getOwnerType(), functionCall.getIdentifier(), functionCall.getArguments())

        this.generateArguments(functionCall, functionSignature)
    }

    private fun generateArguments(superCall: SuperCall) {
        val functionSignature = this.scope.getFunctionCallSignature(superCall.getIdentifier(), superCall.getArguments())

        this.generateArguments(superCall, functionSignature)
    }

    private fun generateArguments(constructorCall: ConstructorCall) {
        val functionSignature = this.scope.getConstructorCallSignature(constructorCall.getIdentifier(), constructorCall.getArguments())

        this.generateArguments(constructorCall, functionSignature)
    }

    private fun generateArguments(call: Call, functionSignature: FunctionSignature) {
        var arguments = call.getArguments()
        val parameters = functionSignature.parameters

        if (arguments.size > parameters.size) {
            throw BadArgumentsToFunctionCallException(call)
        }

        arguments = this.getSortedArguments(arguments, parameters)
        arguments.forEach { it.accept(this.expressionGenerator) }

        this.generateDefaultParameters(arguments, parameters, call)
    }

    private fun getSortedArguments(functionArguments: List<FunctionArgument>, functionParameters: List<FunctionParameter>): List<FunctionArgument> {
        return functionArguments.sortedWith(Comparator { a, b ->
            when (a.parameterName) {
                null -> 0
                else -> this.getIndexOfArgument(a, functionParameters) - this.getIndexOfArgument(b, functionParameters)
            }
        })
    }

    private fun getIndexOfArgument(functionArgument: FunctionArgument, functionParameters: List<FunctionParameter>): Int {
        return functionParameters.filter { it.name == functionArgument.parameterName }
                .map { functionParameters.indexOf(it) }
                .firstOrNull() ?: throw WrongArgumentNameException(functionArgument, functionParameters)
    }

    private fun generateDefaultParameters(arguments: List<Expression>, parameters: List<FunctionParameter>, call: Call) {
        for (i in arguments.size..(parameters.size - 1)) {
            val defaultParameter = parameters[i].defaultValue

            when (defaultParameter) {
                null -> BadArgumentsToFunctionCallException(call)
                else -> defaultParameter.accept(this.expressionGenerator)
            }
        }
    }
}