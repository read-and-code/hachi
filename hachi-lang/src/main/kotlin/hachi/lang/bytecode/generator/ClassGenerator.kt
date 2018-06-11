package hachi.lang.bytecode.generator

import hachi.lang.domain.ClassDeclaration
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class ClassGenerator {
    private val classVersion = 52

    private val classWriter = ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS)

    fun generate(classDeclaration: ClassDeclaration): ClassWriter {
        val name = classDeclaration.name
        val methodGenerator = MethodGenerator(this.classWriter)

        this.classWriter.visit(this.classVersion, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, name, null, "java/lang/Object", null)

        classDeclaration.methods.forEach { it.accept(methodGenerator) }

        this.classWriter.visitEnd()

        return this.classWriter
    }
}