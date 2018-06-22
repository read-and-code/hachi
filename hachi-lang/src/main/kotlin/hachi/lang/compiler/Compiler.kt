package hachi.lang.compiler

import hachi.lang.bytecode.generator.BytecodeGenerator
import hachi.lang.domain.CompilationUnit
import hachi.lang.parsing.Parser
import java.io.File
import java.io.FileOutputStream

class Compiler {
    fun compile(file: File) {
        val compilationUnit = Parser().getCompilationUnit(file.absolutePath)

        this.saveBytecodeToClassFile(compilationUnit, file.parent)
    }

    private fun saveBytecodeToClassFile(compilationUnit: CompilationUnit, path: String) {
        val bytecodeGenerator = BytecodeGenerator()
        val byteCode = bytecodeGenerator.generate(compilationUnit)
        val className = compilationUnit.getClassName()
        val fileName = "%s/%s.class".format(path, className)
        val outputStream = FileOutputStream(fileName)

        outputStream.write(byteCode)
        outputStream.close()
    }
}