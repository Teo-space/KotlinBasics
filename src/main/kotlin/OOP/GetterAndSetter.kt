package OOP

class GetterAndSetter {

    var age: Int = 18
        set(value){
            println("Call setter")
            if((value>0) and (value <110))
                field = value
        }
        get(){
            println("Call getter")
            return field
        }

}