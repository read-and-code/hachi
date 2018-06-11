package hachi.lang.bytecode.generator

import hachi.lang.domain.CompilationUnit

class BytecodeGenerator {
    fun generate(compilationUnit: CompilationUnit): ByteArray {
        val classDeclaration = compilationUnit.classDeclaration
        val classGenerator = ClassGenerator()

        return classGenerator.generate(classDeclaration).toByteArray()
    }
}