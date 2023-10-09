package Basics

class Cycles {

    public fun Test(){
        for(n in 1..9){
            print("${n * n} \t")
        }

        var i = 10
        while(i > 0){
            println(i*i)
            i--;
        }

        var x = -1
        do{
            println(x*x)
            x--;
        }
        while(x > 0)



    }

}