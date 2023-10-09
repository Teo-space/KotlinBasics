package Functions

class Functions {

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

}