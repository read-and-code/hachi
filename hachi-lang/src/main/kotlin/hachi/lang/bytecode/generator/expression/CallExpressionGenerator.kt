package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.Argument
import hachi.lang.domain.node.expression.Call
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.Expression
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.scope.Scope
import hachi.lang.exception.BadArgumentsToFunctionCallException
import hachi.lang.exception.WrongArgumentNameException
import hachi.lang.util.DescriptorFactory
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class CallExpressionGenerator(val expressionGenerator: ExpressionGenerator, private val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(constructorCall: ConstructorCall) {
        val ownerDescriptor = this.scope.getClassInternalName()

        this.methodVisitor.visitTypeInsn(Opcodes.NEW, ownerDescriptor)
        this.methodVisitor.visitInsn(Opcodes.DUP)

        val methodCallSignature = this.scope.getMethodCallSignature(constructorCall.getIdentifier(), constructorCall.getArguments())
        val methodDescriptor = DescriptorFactory.getMethodDescriptor(methodCallSignature)

        this.generateArguments(constructorCall)

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

    private fun generateArguments(call: Call) {
        val functionSignature = this.scope.getMethodCallSignature(call.getIdentifier(), call.getArguments())
        var arguments = call.getArguments()
        val parameters = functionSignature.parameters

        if (arguments.size > parameters.size) {
            throw BadArgumentsToFunctionCallException(call)
        }

        arguments = this.getSortedArguments(arguments, parameters)
        arguments.forEach { it.accept(this.expressionGenerator) }

        this.generateDefaultParameters(arguments, parameters, call)
    }

    private fun getSortedArguments(arguments: List<Argument>, functionParameters: List<FunctionParameter>): List<Argument> {
        return arguments.sortedWith(Comparator { a, b ->
            when (a.parameterName) {
                null -> 0
                else -> this.getIndexOfArgument(a, functionParameters) - this.getIndexOfArgument(b, functionParameters)
            }
        })
    }

    private fun getIndexOfArgument(argument: Argument, functionParameters: List<FunctionParameter>): Int {
        return functionParameters.filter { it.name == argument.parameterName }
                .map { functionParameters.indexOf(it) }
                .firstOrNull() ?: throw WrongArgumentNameException(argument, functionParameters)
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