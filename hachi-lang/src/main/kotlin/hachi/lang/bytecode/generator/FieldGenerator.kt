package hachi.lang.bytecode.generator

import hachi.lang.domain.scope.Field
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class FieldGenerator(private val classWriter: ClassWriter) {
    fun generate(field: Field) {
        val name = field.getName()
        val descriptor = field.getType().getDescriptor()
        val fieldVisitor = this.classWriter.visitField(Opcodes.ACC_PUBLIC, name, descriptor, null, null)

        fieldVisitor.visitEnd()
    }
}