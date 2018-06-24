package hachi.lang.test

import hachi.lang.compiler.Compiler
import hachi.lang.domain.CompilationUnit
import hachi.lang.parsing.Parser
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.nio.file.Paths

abstract class BaseTest {
    fun getCompilationUnit(fileName: String): CompilationUnit {
        return Parser().getCompilationUnit(this.getResourceFileAbsolutePath(fileName))
    }

    fun getResourceFileAbsolutePath(fileName: String): String {
        return Paths.get(this::class.java.classLoader.getResource(fileName).toURI()).toString()
    }

    fun run(fileName: String): List<String> {
        val file = File(this.getResourceFileAbsolutePath(fileName))

        Compiler().compile(file)

        val process = Runtime.getRuntime().exec(arrayOf("java", "-cp", file.parent, fileName.replace(".hc", "")))
        val bufferedReader = BufferedReader(InputStreamReader(process.inputStream))

        var line = bufferedReader.readLine()
        val output = mutableListOf<String>()

        while (line != null) {
            output.add(line)

            line = bufferedReader.readLine()
        }

        return output
    }
}