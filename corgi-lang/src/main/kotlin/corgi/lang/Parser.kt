package corgi.lang

import corgi.antlr.CorgiLexer
import corgi.antlr.CorgiParser
import corgi.lang.domain.global.CompilationUnit
import corgi.lang.parsing.CorgiErrorListener
import corgi.lang.visitor.CompilationUnitVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Parser {
    fun getCompilationUnit(fileAbsolutePath: String): CompilationUnit {
        val charStream = CharStreams.fromFileName(fileAbsolutePath)
        val corgiLexer = CorgiLexer(charStream)
        val commonTokenStream = CommonTokenStream(corgiLexer)
        val corgiParser = CorgiParser(commonTokenStream)
        corgiParser.addErrorListener(CorgiErrorListener())

        return corgiParser.compilationUnit().accept(CompilationUnitVisitor())
    }
}