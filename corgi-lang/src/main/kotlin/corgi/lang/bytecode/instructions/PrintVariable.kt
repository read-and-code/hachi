package corgi.lang.bytecode.instructions

import corgi.antlr.CorgiParser
import corgi.lang.Variable
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class PrintVariable(var variable: Variable) : Instruction, Opcodes {
    override fun apply(methodVisitor: MethodVisitor) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        val id = this.variable.id

        when (this.variable.type) {
            CorgiParser.NUMBER -> {
                methodVisitor.visitVarInsn(Opcodes.ILOAD, id)
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)
            }
            CorgiParser.STRING -> {
                methodVisitor.visitVarInsn(Opcodes.ALOAD, id)
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false)
            }
        }
    }
}