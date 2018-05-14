package corgi.lang.bytecode.generators

import corgi.lang.domain.expressions.FunctionCall
import corgi.lang.domain.expressions.FunctionParameter
import corgi.lang.domain.expressions.Value
import corgi.lang.domain.expressions.VariableReference
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.ClassType
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

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
        val methodDescriptor = owner.getInternalName()
        val ownerDescriptor = functionCall.getFunctionName()
        val functionName = functionCall.getFunctionName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, ownerDescriptor, functionName, methodDescriptor, false)
    }
}