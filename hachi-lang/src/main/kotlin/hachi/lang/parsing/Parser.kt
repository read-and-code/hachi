package hachi.lang.parsing

import hachi.antlr.HachiLexer
import hachi.antlr.HachiParser
import hachi.lang.domain.global.CompilationUnit
import hachi.lang.visitor.CompilationUnitVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Parser {
    fun getCompilationUnit(fileAbsolutePath: String): CompilationUnit {
        val charStream = CharStreams.fromFileName(fileAbsolutePath)
        val hachiLexer = HachiLexer(charStream)
        val commonTokenStream = CommonTokenStream(hachiLexer)
        val hachiParser = HachiParser(commonTokenStream)
        hachiParser.addErrorListener(HachiErrorListener())

        return hachiParser.compilationUnit().accept(CompilationUnitVisitor())
    }
}