package corgi.lang

import java.io.File

class Compiler {
    fun compile(file: File) {
        val instructions = SyntaxTreeTraverser().getInstructions(file.absolutePath)
    }
}