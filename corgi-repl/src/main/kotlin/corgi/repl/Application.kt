package corgi.repl

import corgi.lang.compiler.Compiler
import java.nio.file.Paths

class Application

fun main(args: Array<String>) {
    val resource = Application::class.java.classLoader.getResource("hello.cg")
    val file = Paths.get(resource.toURI()).toFile()

    Compiler().compile(file)
}