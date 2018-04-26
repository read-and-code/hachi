package corgi.lang.bytecode

import jdk.internal.org.objectweb.asm.MethodVisitor

interface Instruction {
    fun apply(methodVisitor: MethodVisitor)
}