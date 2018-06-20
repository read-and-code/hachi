package hachi.lang.domain.type

enum class BuiltInType(private val typeName: String, private val typeClass: Class<*>?, private val descriptor: String, private val opcodes: TypeSpecificOpcodes) : Type {
    BOOLEAN("boolean", Boolean::class.java, "Z", TypeSpecificOpcodes.INT),
    INT("int", Int::class.java, "I", TypeSpecificOpcodes.INT),
    CHAR("char", Char::class.java, "C", TypeSpecificOpcodes.INT),
    BYTE("byte", Byte::class.java, "B", TypeSpecificOpcodes.INT),
    SHORT("short", Short::class.java, "S", TypeSpecificOpcodes.INT),
    LONG("long", Long::class.java, "J", TypeSpecificOpcodes.LONG),
    FLOAT("float", Float::class.java, "F", TypeSpecificOpcodes.FLOAT),
    DOUBLE("double", Double::class.java, "D", TypeSpecificOpcodes.DOUBLE),
    STRING("string", String::class.java, "Ljava/lang/String;", TypeSpecificOpcodes.OBJECT),
    BOOLEAN_ARRAY("bool[]", Array<Boolean>::class.java, "[B", TypeSpecificOpcodes.OBJECT),
    INT_ARRAY("int[]", Array<Int>::class.java, "[I", TypeSpecificOpcodes.OBJECT),
    CHAR_ARRAY("char[]", Array<Char>::class.java, "[C", TypeSpecificOpcodes.OBJECT),
    BYTE_ARRAY("byte[]", Array<Byte>::class.java, "[B", TypeSpecificOpcodes.OBJECT),
    SHORT_ARRAY("short[]", Array<Short>::class.java, "[S", TypeSpecificOpcodes.OBJECT),
    LONG_ARRAY("long[]", Array<Long>::class.java, "[J", TypeSpecificOpcodes.OBJECT),
    FLOAT_ARRAY("float[]", Array<Float>::class.java, "[F", TypeSpecificOpcodes.OBJECT),
    DOUBLE_ARRAY("double[]", Array<Double>::class.java, "[D", TypeSpecificOpcodes.OBJECT),
    STRING_ARRAY("string[]", Array<String>::class.java, "[Ljava/lang/String;", TypeSpecificOpcodes.OBJECT),
    NONE("", null, "", TypeSpecificOpcodes.OBJECT),
    VOID("void", Void::class.java, "V", TypeSpecificOpcodes.VOID);

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

    override fun getLoadOpcode(): Int {
        return this.opcodes.loadOpcode
    }

    override fun getStoreOpcode(): Int {
        return this.opcodes.storeOpcode
    }

    override fun getReturnOpcode(): Int {
        return this.opcodes.returnOpcode
    }

    override fun getAddOpcode(): Int {
        return this.opcodes.addOpcode
    }

    override fun getSubtractOpcode(): Int {
        return this.opcodes.subtractOpcode
    }

    override fun getMultiplyOpcode(): Int {
        return this.opcodes.multiplyOpcode
    }

    override fun getDivideOpcode(): Int {
        return this.opcodes.divideOpcode
    }
}