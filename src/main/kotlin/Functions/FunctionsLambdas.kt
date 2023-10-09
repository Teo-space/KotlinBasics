package Functions

class FunctionsLambdas {

    public fun Test(){
        val hello = { println("Hello Kotlin") }
        hello()
        val printer = {message: String -> println(message)}
        printer("Hello")
        val sum = {x:Int, y:Int -> println(x + y)}
        sum(2, 3)   // 5

    }

}