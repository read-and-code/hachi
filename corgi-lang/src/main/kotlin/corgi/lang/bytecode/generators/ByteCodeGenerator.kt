package corgi.lang.bytecode.generators

import corgi.lang.domain.global.CompilationUnit

class ByteCodeGenerator {
    fun generate(compilationUnit: CompilationUnit): ByteArray {
        val classDeclaration = compilationUnit.classDeclaration
        val classGenerator = ClassGenerator()

        return classGenerator.generate(classDeclaration).toByteArray()
    }
}