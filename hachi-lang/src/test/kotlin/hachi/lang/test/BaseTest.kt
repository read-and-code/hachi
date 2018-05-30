package hachi.lang.test

import hachi.lang.domain.global.CompilationUnit
import hachi.lang.parsing.Parser
import java.nio.file.Paths

abstract class BaseTest {
    fun getCompilationUnit(fileName: String): CompilationUnit {
        return Parser().getCompilationUnit(this.getResourceFileAbsolutePath(fileName))
    }

    private fun getResourceFileAbsolutePath(fileName: String): String {
        return Paths.get(this::class.java.classLoader.getResource(fileName).toURI()).toString()
    }
}