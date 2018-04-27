package corgi.lang

import corgi.antlr.CorgiLexer
import corgi.antlr.CorgiParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class SyntaxTreeTraverser {
    fun getCompilationUnit(fileAbsolutePath: String): CompilationUnit {
        val charStream = CharStreams.fromFileName(fileAbsolutePath)
        val corgiLexer = CorgiLexer(charStream)
        val commonTokenStream = CommonTokenStream(corgiLexer)
        val corgiParser = CorgiParser(commonTokenStream)
        val corgiTreeWalkListener = CorgiTreeWalkListener()
        val corgiTreeWalkErrorListener = CorgiTreeWalkErrorListener()

        corgiParser.addErrorListener(corgiTreeWalkErrorListener)
        corgiParser.addParseListener(corgiTreeWalkListener)
        corgiParser.compilationUnit()

        return corgiTreeWalkListener.compilationUnit
    }
}