package corgi.lang.parsing

import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer

class CorgiTreeWalkErrorListener : BaseErrorListener() {
    override fun syntaxError(recognizer: Recognizer<*, *>?, offendingSymbol: Any?, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
        val message = "You fucked up at line %d,char %d :(. Details:\\n%s"

        println(message.format(line, charPositionInLine, msg))
    }
}