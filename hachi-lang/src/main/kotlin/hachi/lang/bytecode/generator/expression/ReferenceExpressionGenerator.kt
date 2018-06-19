package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.VariableReference
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor

class VariableReferenceExpressionGenerator(val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(variableReference: VariableReference) {
        val variableName = variableReference.variableName
        val index = this.scope.getLocalVariableIndex(variableName)
        val localVariable = this.scope.getLocalVariable(variableName)
        val type = localVariable.type

        this.methodVisitor.visitVarInsn(type.getLoadOpcode(), index)
    }
}