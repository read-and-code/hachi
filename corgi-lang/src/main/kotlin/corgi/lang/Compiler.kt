package corgi.lang

import corgi.lang.bytecode.ByteCodeGenerator
import java.io.File
import java.io.FileOutputStream

class Compiler {
    fun compile(file: File) {
        val fileName = file.name
        val className = fileName.replace(".cg", "")
        val instructions = SyntaxTreeTraverser().getInstructions(file.absolutePath)
        val byteCode = ByteCodeGenerator().generateByteCode(instructions, className)

        this.saveByteCodeToClassFile(file.absolutePath, byteCode)
    }

    private fun saveByteCodeToClassFile(fileName: String, byteCode: ByteArray) {
        val classFile = fileName.replace(".cg", ".class")
        val outputStream = FileOutputStream(classFile)

        outputStream.write(byteCode)
        outputStream.close()
    }
}