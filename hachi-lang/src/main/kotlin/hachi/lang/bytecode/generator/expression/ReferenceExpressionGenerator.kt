package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.FieldReference
import hachi.lang.domain.node.expression.LocalVariableReference
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class ReferenceExpressionGenerator(private val methodVisitor: MethodVisitor, private val scope: Scope) {
    fun generate(localVariableReference: LocalVariableReference) {
        val variableName = localVariableReference.getName()
        val index = this.scope.getLocalVariableIndex(variableName)
        val type = localVariableReference.getType()

        this.methodVisitor.visitVarInsn(type.getLoadOpcode(), index)
    }

    fun generate(fieldReference: FieldReference) {
        val variableName = fieldReference.getName()
        val type = fieldReference.getType()
        val ownerInternalName = fieldReference.getOwnerInternalName()
        val descriptor = type.getDescriptor()

        this.methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)
        this.methodVisitor.visitFieldInsn(Opcodes.GETFIELD, ownerInternalName, variableName, descriptor)
    }
}