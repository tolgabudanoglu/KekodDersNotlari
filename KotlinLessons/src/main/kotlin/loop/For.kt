package loop

fun main() {
    for (value:Int in 1..10){
        println("$value")
    }

    val number = intArrayOf(1,3,5,64,67,87)

    for (value in number){
        println("$value")
    }

    for (index in number.indices){
        print("\n$index . değeri : ${number[index]}")
    }

    //destructuring declarations
    for ((index,value) in number.withIndex()){
        print("\n$index . değeri : $value")
    }

    val phoneNumber :String? = readlnOrNull()?.toString()
    phoneNumber?.toInt() ?: 0 // elvis operatoru null değilse  sol kısmı al null ise sağ kısmı al

    // iç içe döngülerde break ve coniune de üsteki for döngüsüne dönebilmek için returnlabe@ kullanılır.
    returnLabel@ for (value in 1..50){
        for (value2 in 0..50 ){
            if (value2 == 15){
                continue@returnLabel
            }
            print("contiune2 : $value2 |")
        }
    }
}