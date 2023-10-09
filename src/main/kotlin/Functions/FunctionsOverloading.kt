package Functions

class FunctionsOverloading {

    fun sum(a: Int, b: Int) : Int{
        return a + b
    }
    fun sum(a: Double, b: Double) : Double{
        return a + b
    }
    fun sum(a: Int, b: Int, c: Int) : Int{
        return a + b + c
    }
    fun sum(a: Int, b: Double) : Double{
        return a + b
    }
    fun sum(a: Double, b: Int) : Double{
        return a + b
    }

}