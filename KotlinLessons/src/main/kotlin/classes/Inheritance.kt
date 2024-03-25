package classes


open class Animal(open val name : String = ""){

    val feetCount = 4
    var origin = ""

   open fun makeASound():String{
        return ""
    }

    fun attackToWofl(){

    }

    fun eat(){

    }

    fun walk(){

    }
}
//polimorfizim name
class Dog(override val name : String) : Animal("adf") {

    //dinamik polimorfiizm
    override fun makeASound():String{
        return "havhav"
    }

    //statik polimprfizm
    fun call(sahip:Sahip){

    }
    fun call(sahip2: Sahip2){

    }

}

class Sahip(){

}

class Sahip2(){

}

class Cat() : Animal("adfad"){
    //polimorfizm
    override fun makeASound():String{
        return "miyav"
    }
}

fun main() {

    val animal = Animal()
    val dog = Dog("sdaaf")
    val cat = Cat()

    dog.attackToWofl()
    cat.attackToWofl()
}