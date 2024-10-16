package com.example.dependencyinjection

interface Engine {
    fun start()
}

class GasEngine : Engine {
    override fun start() {
        println("Gas engine started")
    }
}

class ElectricEngine : Engine {
    override fun start() {
        println("Electric engine started")
    }
}
class DieselEngine : Engine {
    override fun start() {
        println("Diesel engine started")
    }
}
class Car(private val engine:Engine) {
    fun start() {
        engine.start()

    }
}



fun main(){
    val GasEngine: GasEngine = GasEngine()
    val car = Car(GasEngine)
    car.start()

    val ElectricEngine: ElectricEngine = ElectricEngine()
    val car2 = Car(ElectricEngine)
    car2.start()

    val DieselEngine: DieselEngine = DieselEngine()
    val car3 = Car(DieselEngine)
    car3.start()
}


