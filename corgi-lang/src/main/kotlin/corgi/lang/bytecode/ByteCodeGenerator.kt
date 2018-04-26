package corgi.lang.bytecode

import corgi.lang.bytecode.instructions.Instruction
import corgi.lang.bytecode.instructions.VariableDeclaration
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes
import java.util.*

class ByteCodeGenerator : Opcodes {
    fun generateByteCode(instructions: Queue<Instruction>, name: String): ByteArray {
        val classWriter = ClassWriter(0)

        classWriter.visit(52, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, name, null, "java/lang/Object", null)

        val methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
        val localVariablesCount = instructions.filter { it -> it is VariableDeclaration }.count()
        val maxStack = 100

        instructions.toList().forEach { it -> it.apply(methodVisitor) }

        methodVisitor.visitInsn(Opcodes.RETURN)
        methodVisitor.visitMaxs(maxStack, localVariablesCount)
        methodVisitor.visitEnd()

        classWriter.visitEnd()

        return classWriter.toByteArray()
    }
}