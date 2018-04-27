package corgi.lang

import corgi.lang.bytecode.instructions.ClassScopeInstruction
import java.util.*

class ClassDeclaration(val classScopeInstructions: Queue<ClassScopeInstruction>, val name: String)