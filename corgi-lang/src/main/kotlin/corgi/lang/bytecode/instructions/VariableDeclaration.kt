package corgi.lang.bytecode.instructions

import corgi.antlr.CorgiParser
import corgi.lang.Variable
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class VariableDeclaration(var variable: Variable) : ClassScopeInstruction, Opcodes {
    override fun apply(methodVisitor: MethodVisitor) {
        when (this.variable.type) {
            CorgiParser.NUMBER -> {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, this.variable.value.toInt())
                methodVisitor.visitVarInsn(Opcodes.ISTORE, this.variable.id)
            }
            CorgiParser.STRING -> {
                methodVisitor.visitLdcInsn(this.variable.value)
                methodVisitor.visitVarInsn(Opcodes.ASTORE, this.variable.id)
            }
        }
    }
}