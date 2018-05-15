package corgi.lang.bytecode.generator

import corgi.lang.domain.global.ClassDeclaration
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class ClassGenerator {
    private val classVersion = 52

    private val classWriter = ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS)

    fun generate(classDeclaration: ClassDeclaration): ClassWriter {
        val name = classDeclaration.name

        this.classWriter.visit(this.classVersion, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, name, null, "java/lang/Object", null)

        classDeclaration.methods.forEach { it -> MethodGenerator(this.classWriter).generate(it) }

        this.classWriter.visitEnd()

        return this.classWriter
    }
}