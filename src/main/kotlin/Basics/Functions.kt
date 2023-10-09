package Basics

class Functions {
    public fun Test(){

    }

    fun showMessage(message: String){
        println(message)
    }

    fun displayUser(name: String, age: Int){
        println("Name: $name   Age: $age")
    }

    fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
        println("Name: $name   Age: $age  Position: $position")
    }

    fun printStrings(vararg strings: String){
        for(str in strings)
            println(str)
    }
    fun sum(vararg numbers: Int){
        var result=0
        for(n in numbers)
            result += n
        println("Сумма чисел равна $result")
    }

    fun square(x: Int) = x * x


    fun compareAge(age1: Int, age2: Int){

        fun ageIsValid(age: Int): Boolean{
            return age > 0 && age < 111
        }
        if( !ageIsValid(age1) || !ageIsValid(age2)) {
            println("Invalid age")
            return
        }

        when {
            age1 == age2 -> println("age1 == age2")
            age1 > age2 -> println("age1 > age2")
            age1 < age2 -> println("age1 < age2")
        }
    }








}