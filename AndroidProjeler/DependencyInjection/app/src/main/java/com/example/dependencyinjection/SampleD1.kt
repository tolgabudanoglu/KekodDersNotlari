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
class Car(val engineType: EngineType) {
    val GasEngine: GasEngine = GasEngine()
    val ElectricEngine: ElectricEngine = ElectricEngine()
    val DieselEngine: DieselEngine = DieselEngine()


    fun start() {
        when (engineType) {
            EngineType.GAS -> GasEngine.start()
            EngineType.ELECTRIC -> ElectricEngine.start()
            EngineType.DIESEL -> DieselEngine.start()
        }

    }
}
enum class EngineType {
    GAS, ELECTRIC, DIESEL
}



fun main(){
    val car = Car(EngineType.GAS)
    car.start()

    val car2 = Car(EngineType.ELECTRIC)
    car2.start()

    val car3 = Car(EngineType.DIESEL)
    car3.start()
}


