package DataStructs

class Arrays {

    public fun Test(){
        val numbers1: Array<Int>

        val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        val n = numbers[1]
        numbers[2] = 7
        println("numbers[2] = ${numbers[2]}")

        for(number in numbers){
            print("$number \t")
        }
        println ()

        val people = arrayOf("Tom", "Sam", "Bob")

        var i = 0
        while( i in people.indices){
            println(people[i])
            i++;
        }



    }

}