package Basics

class Ranges {

    public fun Test(){
        val range1 = 1..5// диапазон [1, 2, 3, 4, 5]
        println(range1)
        println(5 in range1)
        println(5 !in range1)

        val range2 =  "a".."d"
        println(range2)

        val range3 =  1..5// 1 2 3 4 5
        println(range3)

        val range4 =  5 downTo 1// 5 4 3 2 1
        println(range4)


        val range5 = 1..10 step 2           // 1 3 5 7 9
        println(range5)
        val range6 = 10 downTo 1 step 3     // 10 7 4 1
        println(range6)

        val range7 = 1 until 9          // 1 2 3 4 5 6 7 8
        println(range7)
        val range8 = 1 until 9 step 2   // 1 3 5 7
        println(range8)
    }

}