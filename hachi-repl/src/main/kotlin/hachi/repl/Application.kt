package hachi.repl

import hachi.lang.compiler.Compiler
import java.nio.file.Paths

class Application

fun main(args: Array<String>) {
    val resource = Application::class.java.classLoader.getResource("hello.hc")
    val file = Paths.get(resource.toURI()).toFile()

    Compiler().compile(file)
}