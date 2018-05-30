package corgi.lang.exception

class UnsupportedRangedLoopTypes : CompilationException() {
    override val message: String?
        get() = "Only integer types are supported so far"
}