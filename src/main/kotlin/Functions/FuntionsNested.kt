package Functions

class FuntionsNested {

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