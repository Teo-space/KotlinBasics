package OOP

open class Person(Name: String, Age: Int)
{
    var Name: String = "Undefined"
    var Age: Int = 18
    init {
        this.Name = Name
        this.Age = Age
    }

    fun sayHello(){
        println("Hello, my name is $Name")
    }

    fun go(location: String){
        println("$Name goes to $location")
    }

    fun personToString() : String{
        return "Name: $Name  Age: $Age"
    }
}
//Inheritance
public class Customer(Name: String, Age: Int) : Person(Name, Age) {

}
