package corgi.lang

import corgi.lang.bytecode.generator.ByteCodeGenerator
import corgi.lang.domain.global.CompilationUnit
import java.io.File
import java.io.FileOutputStream

class Compiler {
    fun compile(file: File) {
        val compilationUnit = Parser().getCompilationUnit(file.absolutePath)

        this.saveByteCodeToClassFile(compilationUnit)
    }

    private fun saveByteCodeToClassFile(compilationUnit: CompilationUnit) {
        val byteCodeGenerator = ByteCodeGenerator()
        val byteCode = byteCodeGenerator.generate(compilationUnit)
        val className = compilationUnit.getClassName()
        val fileName = className + ".class"
        val outputStream = FileOutputStream(fileName)

        outputStream.write(byteCode)
        outputStream.close()
    }
}