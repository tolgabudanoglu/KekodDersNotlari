fun main() {

    val ageByte:Byte = 45
    val ageShort:Short = 45
    val ageInt:Int = 45

    val age:Number = 45

    


    when(age){
        is Byte ->{

            println("byte")
            age.byteSepeicalFun() // = age.toByte.byteSepeicalFun()
        }
        is Short ->{
            println("short")
            age.shorteSepeicalFun()
        }
        is Int ->{
            println("int")
            age.intSepeicalFun()
        }
    }

}

fun Byte.byteSepeicalFun(){

}
fun Short.shorteSepeicalFun(){

}
fun Int.intSepeicalFun(){

}