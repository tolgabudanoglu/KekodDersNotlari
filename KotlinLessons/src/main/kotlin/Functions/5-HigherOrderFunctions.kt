package Functions

fun main() {

    calculate(8,5,'+')
    calculate(8,5,'*')
    calculate(8,5,'-')

    //higher order fonk çağırımı
    calculateHighOrder(2,4) { numberOne, numberTwo -> numberOne + numberTwo }
    calculateHighOrder(2,4) { numberOne, numberTwo -> numberOne - numberTwo }
    calculateHighOrder(2,4) { numberOne, numberTwo -> numberOne * numberTwo }
}
//normal fonksiyon
fun calculate(numberOne:Int, numberTwo:Int , opertaion:Char){
    val result = when (opertaion){
        '+' -> {
            numberOne + numberTwo
        }
        '*' -> {
            numberOne * numberTwo
        }
        '-' -> {
            numberOne - numberTwo
        }
        '/' -> {
            numberOne / numberTwo
        }
        else -> {
            numberOne + numberTwo
        }
    }
    println(result)
}
//higher order fonksiyon
fun calculateHighOrder(numberOne: Int,numberTwo: Int,operation:(numberOne:Int,numberTwo:Int)->Int){
    val result = operation(numberOne,numberTwo)
    println("result : $result")
}