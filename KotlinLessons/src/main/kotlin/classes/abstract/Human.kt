package classes.abstract

abstract class Human (val name:String){
    constructor(name: String,age:Int):this(name)

    abstract val surName:String
    abstract val middleName:String
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

abstract class Turk(override val surName: String):Human("turk"){
    final override val middleName: String = "adsfad"
    override fun display() {
        TODO("Not yet implemented")
    }

    override val age: Int
        get() = super.age

    override fun getEvent() {
        super.getEvent()
    }
}
class ChildTurk(surName: String):Turk(surName){
   /* override val middleName: String
        get() = super.middleName*/
}

fun main() {

}