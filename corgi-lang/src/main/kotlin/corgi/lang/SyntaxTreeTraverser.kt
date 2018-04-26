package corgi.lang

import corgi.antlr.CorgiLexer
import corgi.antlr.CorgiParser
import corgi.lang.bytecode.instructions.Instruction
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.util.*

class SyntaxTreeTraverser {
    fun getInstructions(fileAbsolutePath: String): Queue<Instruction> {
        val charStream = CharStreams.fromFileName(fileAbsolutePath)
        val corgiLexer = CorgiLexer(charStream)
        val commonTokenStream = CommonTokenStream(corgiLexer)
        val corgiParser = CorgiParser(commonTokenStream)
        val corgiTreeWalkListener = CorgiTreeWalkListener()
        val corgiTreeWalkErrorListener = CorgiTreeWalkErrorListener()

        corgiParser.addErrorListener(corgiTreeWalkErrorListener)
        corgiParser.addParseListener(corgiTreeWalkListener)
        corgiParser.compilationUnit()

        return corgiTreeWalkListener.instructions
    }
}