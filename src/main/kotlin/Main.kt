import Extensions.Rectangle
import Extensions.printClassName
import java.util.*


// Try adding program arguments via Run/Debug configuration.
// Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

fun main(args: Array<String>) {//println("Program arguments: ${args.joinToString()}")

    //println(Vars())
    //DataTypes()
    //Ranges().Test()
    //Cycles().Test()
    //Arrays().Test()
    //printClassName(Rectangle())


    val Datas : MutableList<SensorData> = arrayListOf()

    println (Date());
    var start = System.currentTimeMillis()
    for(i in 0..1000000){
        Datas.add(SensorData("S1", Date(), Math.random()))
        Datas.add(SensorData("S2", Date(), Math.random()))
        Datas.add(SensorData("S3", Date(), Math.random()))
    }
    println ("Fill time: ${System.currentTimeMillis()-start}");

    println ("count all: ${Datas.size}");
    println ("count all: ${Datas.count()}");
    println ("count S1: ${Datas.count {it.sensorName=="S1"} }");

    start = System.currentTimeMillis()
    val x = Datas.filter { it.sensorName == "S1" }.map { it.Value }.sum()
    println ("query time: ${System.currentTimeMillis()-start}");
    println ("result: ${x}");

}

data class SensorData(val sensorName: String, val age: Date, val Value : Double)


//record SensorData(String SensorName, Date At, Double Value) { }






