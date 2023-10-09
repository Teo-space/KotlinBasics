package Functions

class FuntionsInline {

    fun square(x: Int) = x * x

    fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){

        val result = op(x, y)
        println(result)
    }

}