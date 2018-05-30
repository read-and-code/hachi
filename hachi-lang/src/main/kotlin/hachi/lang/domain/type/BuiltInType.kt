package hachi.lang.domain.type

enum class BuiltInType(private var typeName: String, private var typeClass: Class<*>?, private var descriptor: String) : Type {
    BOOLEAN("bool", Boolean::class.java, "Z"),
    INT("int", Int::class.java, "I"),
    CHAR("char", Char::class.java, "C"),
    BYTE("byte", Byte::class.java, "B"),
    SHORT("short", Short::class.java, "S"),
    LONG("long", Long::class.java, "J"),
    FLOAT("float", Float::class.java, "F"),
    DOUBLE("double", Double::class.java, "D"),
    STRING("string", String::class.java, "Ljava/lang/String;"),
    BOOLEAN_ARRAY("bool[]", Array<Boolean>::class.java, "[B"),
    INT_ARRAY("int[]", Array<Int>::class.java, "[I"),
    CHAR_ARRAY("char[]", Array<Char>::class.java, "[C"),
    BYTE_ARRAY("byte[]", Array<Byte>::class.java, "[B"),
    SHORT_ARRAY("short[]", Array<Short>::class.java, "[S"),
    LONG_ARRAY("long[]", Array<Long>::class.java, "[J"),
    FLOAT_ARRAY("float[]", Array<Float>::class.java, "[F"),
    DOUBLE_ARRAY("double[]", Array<Double>::class.java, "[D"),
    STRING_ARRAY("string[]", Array<String>::class.java, "[Ljava/lang/String;"),
    NONE("", null, ""),
    VOID("void", Void::class.java, "V");

    override fun getName(): String {
        return this.typeName
    }

    override fun getTypeClass(): Class<*>? {
        return this.typeClass
    }

    override fun getDescriptor(): String {
        return this.descriptor
    }

    override fun getInternalName(): String {
        return this.descriptor
    }
}