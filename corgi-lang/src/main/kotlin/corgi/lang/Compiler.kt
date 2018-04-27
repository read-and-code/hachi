package corgi.lang

import java.io.File
import java.io.FileOutputStream

class Compiler {
    fun compile(file: File) {
        val compilationUnit = SyntaxTreeTraverser().getCompilationUnit(file.absolutePath)

        this.saveByteCodeToClassFile(compilationUnit)
    }

    private fun saveByteCodeToClassFile(compilationUnit: CompilationUnit) {
        val classFile = compilationUnit.classDeclaration.name + ".class"
        val outputStream = FileOutputStream(classFile)

        outputStream.write(compilationUnit.getByteCode())
        outputStream.close()
    }
}