package hachi.lang.compiler

import hachi.lang.bytecode.generator.BytecodeGenerator
import hachi.lang.domain.CompilationUnit
import hachi.lang.parsing.Parser
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