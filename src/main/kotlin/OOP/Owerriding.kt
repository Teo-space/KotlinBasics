package OOP

open class OwerridingBase {

    open val Age : Int = 1

    open fun Method() : Int = 100
}

final class Owerrided : OwerridingBase() {

    final override val Age : Int = 18

    open override fun Method() : Int = 1000
}
