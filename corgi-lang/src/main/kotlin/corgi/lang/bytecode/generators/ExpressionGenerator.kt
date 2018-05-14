package corgi.lang.bytecode.generators

import corgi.lang.domain.expressions.FunctionCall
import corgi.lang.domain.expressions.FunctionParameter
import corgi.lang.domain.expressions.Value
import corgi.lang.domain.expressions.VariableReference
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.ClassType
import corgi.lang.utils.DescriptorFactory
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes
import jdk.internal.org.objectweb.asm.Type

class ExpressionGenerator(val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(variableReference: VariableReference) {
        val variableName = variableReference.variableName
        val index = this.scope.getLocalVariableIndex(variableName)
        val localVariable = this.scope.getLocalVariable(variableName)
        val type = localVariable.type

        when (type) {
            BuiltInType.INT -> this.methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
            else -> this.methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
        }
    }

    fun generate(functionParameter: FunctionParameter) {
        val type = functionParameter.type
        val index = this.scope.getLocalVariableIndex(functionParameter.name)

        when (type) {
            BuiltInType.INT -> this.methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
            else -> this.methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
        }
    }

    fun generate(value: Value) {
        val type = value.type
        val stringValue = value.value

        when (type) {
            BuiltInType.INT -> this.methodVisitor.visitIntInsn(Opcodes.BIPUSH, stringValue.toInt())
            BuiltInType.STRING -> this.methodVisitor.visitLdcInsn(stringValue)
        }
    }

    fun generate(functionCall: FunctionCall) {
        val parameters = functionCall.parameters
        parameters.forEach { it -> it.accept(this) }

        val owner = when (functionCall.owner) {
            null -> ClassType(this.scope.getClassName())
            else -> functionCall.owner
        }
        val methodDescriptor = this.getFunctionDescriptor(functionCall)
        val ownerDescriptor = owner.getInternalName()
        val functionName = functionCall.getFunctionName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, ownerDescriptor, functionName, methodDescriptor, false)
    }

    private fun getFunctionDescriptor(functionCall: FunctionCall): String? {
        return this.getDescriptorForFunctionInScope(functionCall)
                ?: this.getDescriptorForFunctionOnClasspath(functionCall)
    }

    private fun getDescriptorForFunctionInScope(functionCall: FunctionCall): String? {
        return DescriptorFactory.getMethodDescriptor(functionCall.signature)
    }

    private fun getDescriptorForFunctionOnClasspath(functionCall: FunctionCall): String? {
        try {
            val functionName = functionCall.getFunctionName()
            val owner = functionCall.owner
            val className = when (owner) {
                null -> this.scope.getClassName()
                else -> owner.getName()
            }
            val clazz = Class.forName(className)
            val method = clazz.getMethod(functionName)

            return Type.getMethodDescriptor(method)
        } catch (e: ReflectiveOperationException) {
            e.printStackTrace()

            return ""
        }
    }
}