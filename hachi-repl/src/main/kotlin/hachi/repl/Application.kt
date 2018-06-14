package hachi.repl

import hachi.lang.compiler.Compiler
import java.io.File

class Application

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Missing hachi file")
    } else {
        val file = File(args[0])

        Compiler().compile(file)
    }
}