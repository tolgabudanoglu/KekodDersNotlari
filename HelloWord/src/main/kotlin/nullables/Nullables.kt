package nullables

fun main() {

    val number:Int? = 0

    val number3 = null //nothing?

    number!!.plus(25)
    number?.plus(25)

    val number4:Int = 127
    val boxedNumber:Int? = number4
    val anotherBoxedNumber:Int? = number4
    println(boxedNumber === anotherBoxedNumber) // true çünkü değr -128 ile 127 arasında olduğu için hala byte sayılır


    val number5:Int = 128
    val boxedNumber2:Int? = number5
    val anotherBoxedNumber2:Int? = number5
    println(boxedNumber2 === anotherBoxedNumber2) // false

}