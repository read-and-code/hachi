package corgi.lang

import corgi.lang.bytecode.instructions.VariableDeclaration
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class CompilationUnit(val classDeclaration: ClassDeclaration) {
    fun getByteCode(): ByteArray {
        val classWriter = ClassWriter(0)

        classWriter.visit(52, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, this.classDeclaration.name, null, "java/lang/Object", null)

        val methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
        val localVariablesCount = this.classDeclaration.classScopeInstructions.filter { it -> it is VariableDeclaration }.count()
        val maxStack = 100

        this.classDeclaration.classScopeInstructions.toList().forEach { it -> it.apply(methodVisitor) }

        methodVisitor.visitInsn(Opcodes.RETURN)
        methodVisitor.visitMaxs(maxStack, localVariablesCount)
        methodVisitor.visitEnd()

        classWriter.visitEnd()

        return classWriter.toByteArray()
    }
}