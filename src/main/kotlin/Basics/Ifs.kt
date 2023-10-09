package Basics

class Ifs {
    public fun Ifs(){
        val a = 10

        if(a == 10) {
            println("a равно 10")
        }
        else if(a == 9){
            println("a равно 9")
        }
        else if(a == 8){
            println("a равно 8")
        }
        else{
            println("a имеет неопределенное значение")
        }
    }

    public fun Whens(){
        val isEnabled = true
        when(isEnabled){
            false -> println("isEnabled off")
            true -> println("isEnabled on")
        }
    }


}