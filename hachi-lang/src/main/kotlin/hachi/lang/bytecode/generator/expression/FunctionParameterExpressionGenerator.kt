package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor

class FunctionParameterExpressionGenerator(val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(functionParameter: FunctionParameter) {
        val type = functionParameter.getType()
        val index = this.scope.getLocalVariableIndex(functionParameter.name)

        this.methodVisitor.visitVarInsn(type.getLoadOpcode(), index)
    }
}