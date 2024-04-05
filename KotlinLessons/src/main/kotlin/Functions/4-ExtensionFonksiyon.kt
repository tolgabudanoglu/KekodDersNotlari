package Functions

import java.awt.Shape

fun main() {

    val pi:Double = 3.14
    log2(pi)
    val number:Long = 3456465465
    log2(number)
    val number2 :Int = 56
    log2(number2)


    //extension fonk çağrımı
    pi.log("double number")
    number.log("long number")
    number2.log("int number")


    val myString = "Hello"
    println(myString.customLength) // Çıktı: 10

}

//normal fonksiyon
fun log2(number : Number){
    when(number){
        is Long -> {
            println("long number : $number")
        }
        is Double -> {
            println("double number : $number")
        }
        is Int -> {
            println("int number : $number")
        }
    }
}
//extension fonksiyon
infix fun Number.log(emptyParam:String){
        println(emptyParam+this)
}

//extension property
val String.customLength: Int
    get() = this.length * 2


//extension property aslında alttaki extend fonksiyonlarla aynı
/*var Shape.type:String
    get() = type
    set(value){
        type = value
    }

//bu hata veriyor
//var Shape.type2 :String "456"

fun Shape.getType():String{
    return type
}
fun Shape.setType(value: String){
    type = value
}
*/
