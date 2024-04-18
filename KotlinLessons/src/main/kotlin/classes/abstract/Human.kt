package classes.abstract

abstract class Human (val name:String){
    constructor(name: String,age:Int):this(name)

    abstract val surName:String
    open val age:Int = 34
    val eyeColor :String = "blue"

    //override opsiyonel
    open fun getEvent(){}

    //override edilmeli
    abstract fun display()

    //override edilemez
    fun sendEvent(){

    }

}

class Turk

fun main() {

}