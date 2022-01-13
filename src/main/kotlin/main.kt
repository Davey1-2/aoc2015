
class Reindeer(val name: String, val speed: Int, val flightTime: Int, val restTime: Int){
    var travel = true
    var time = flightTime
    var distance = 0

    fun calculate(){
        time--
        if (travel){
            distance += speed
        }
        if (time <= 0){
            travel = !travel
            if (travel) time = flightTime
            if (!travel) time = restTime
        }
    }
}

fun main() {

    val reindeers = mutableListOf<Reindeer>()
    reindeers.add(Reindeer("Vixen",19,7,124))
    reindeers.add(Reindeer("Rudolph",3,15,28))
    reindeers.add(Reindeer("Donner",19,9,164))
    reindeers.add(Reindeer("Blitzen",19,9,158))
    reindeers.add(Reindeer("Cupid",25,6,145))
    reindeers.add(Reindeer("Dasher",14,3,38))
    reindeers.add(Reindeer("Dancer",25,6,37))
    reindeers.add(Reindeer("Prancer",13,7,143))
    var reindeer1 = reindeers[0]


    for (reindeer in reindeers) reindeer.calculate()
    for (reindeer in reindeers ){
        if (reindeer.distance > reindeer1.distance)
            reindeer1 = reindeer
    }
    println("Zavod vyhral " + reindeer1.name)
    println("Jeho vzdalenost je " + reindeer1.distance)
}

