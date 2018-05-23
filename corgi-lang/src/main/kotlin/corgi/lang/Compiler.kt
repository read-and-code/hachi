package corgi.lang

import corgi.lang.bytecode.generator.BytecodeGenerator
import corgi.lang.domain.global.CompilationUnit
import java.io.File
import java.io.FileOutputStream

class Compiler {
    fun compile(file: File) {
        val compilationUnit = Parser().getCompilationUnit(file.absolutePath)

        this.saveBytecodeToClassFile(compilationUnit)
    }

    private fun saveBytecodeToClassFile(compilationUnit: CompilationUnit) {
        val bytecodeGenerator = BytecodeGenerator()
        val byteCode = bytecodeGenerator.generate(compilationUnit)
        val className = compilationUnit.getClassName()
        val fileName = "%s.class".format(className)
        val outputStream = FileOutputStream(fileName)

        outputStream.write(byteCode)
        outputStream.close()
    }
}