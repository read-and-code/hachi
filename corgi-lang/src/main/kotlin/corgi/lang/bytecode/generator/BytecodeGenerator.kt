package corgi.lang.bytecode.generator

import corgi.lang.domain.global.CompilationUnit

class BytecodeGenerator {
    fun generate(compilationUnit: CompilationUnit): ByteArray {
        val classDeclaration = compilationUnit.classDeclaration
        val classGenerator = ClassGenerator()

        return classGenerator.generate(classDeclaration).toByteArray()
    }
}