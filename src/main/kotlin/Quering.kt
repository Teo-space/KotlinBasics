import java.util.*

class Quering {

    data class SensorData(val sensorName: String, val age: Date, val Value : Double)

    public fun Run(){
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


        start = System.currentTimeMillis()
        val c = Datas.filter { it.sensorName == "S1" }.map { it.Value }.count()
        println ("query time: ${System.currentTimeMillis()-start}");
        println ("result: ${c}");

        start = System.currentTimeMillis()
        val cs = Datas.stream().filter { it.sensorName == "S1" }.map { it.Value }.count()
        println ("query time: ${System.currentTimeMillis()-start}");
        println ("result: ${cs}");


        start = System.currentTimeMillis()
        val cps = Datas.parallelStream().filter { it.sensorName == "S1" }.map { it.Value }.count()
        println ("query time: ${System.currentTimeMillis()-start}");
        println ("result: ${cps}");


        start = System.currentTimeMillis()
        val min = Datas.filter { it.sensorName == "S1" }.map { it.Value }.min()
        println ("query time: ${System.currentTimeMillis()-start}");
        println ("result: ${min}");

        start = System.currentTimeMillis()
        val max = Datas.filter { it.sensorName == "S1" }.maxBy{ it.Value }
        println ("query time: ${System.currentTimeMillis()-start}");
        println ("result: ${max}");

        start = System.currentTimeMillis()
        val sum = Datas.filter { it.sensorName == "S1" }.sumOf {it.Value}
        println ("query time: ${System.currentTimeMillis()-start}");
        println ("result: ${sum}");




    }


}