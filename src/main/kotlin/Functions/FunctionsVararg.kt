package Functions

class FunctionsVararg {

    fun sum(vararg numbers: Int){
        var result=0
        for(n in numbers)
            result += n
        println("Сумма чисел равна $result")
    }

    ///printUserGroup(3, "Tom", "Bob", "Alice")
    fun printUserGroup(count:Int, vararg users: String){
        println("Count: $count")
        for(user in users)
            println(user)
    }

    //printUserGroup("KT-091", "Tom", "Bob", "Alice", count=3)
    fun printUserGroup(group: String, vararg users: String, count:Int){
        println("Group: $group")
        println("Count: $count")
        for(user in users)
            println(user)
    }

    //val nums = intArrayOf(1, 2, 3, 4)
    //changeNumbers(*nums, koef=2)
    fun changeNumbers(vararg numbers: Int, koef: Int){
        for(number in numbers)
            println(number * koef)
    }


}