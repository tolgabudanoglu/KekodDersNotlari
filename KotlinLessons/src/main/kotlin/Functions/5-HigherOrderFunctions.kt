package Functions

fun main() {

    calculate(8,5,'+')
    calculate(8,5,'*')
    calculate(8,5,'-')



    //higher order fonk çağırımı
    calculateHighOrder(2,4) { numberOne, numberTwo -> numberOne + numberTwo }
    calculateHighOrder(2,4) { numberOne, numberTwo -> numberOne - numberTwo }
    calculateHighOrder(2,4) { numberOne, numberTwo -> numberOne * numberTwo }

    //başka bir çağırım şekli
    val sumFuction = {numberOne:Int, numberTwo:Int ->
        numberOne - numberTwo
    }
    calculateHighOrder(2,4 , sumFuction)

    //başka bir çağrım şekli daha
    val minusFunction = fun(numberOne:Int,numberTwo:Int):Int{
        return numberOne - numberTwo
    }
    calculateHighOrder(2,4 , minusFunction)



    calculateHighOrder(2,4 , ::divFunction)


    calculateHighOrder3(3,5)

    //tek parametre alıyorsa isim vereyebiliriz
    calculateHighOrder5(2,5,{
        4
    })

    //extension fonk ile kullanımı
    calculateHighOrder6(2,6,{numberOne,numberTwo ->
        println("$this: $numberOne,$numberTwo" )
        35
    })



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
    //nullable olma durumlarında invoke ile
    //val result2 = operation.invoke(numberOne,numberTwo)
    println("result : $result")
}

//başka bir çağrım şekli daha böyle kullanabilmek için higher order fonk ile paramtre sayısı aynı olmalı ve geri dönüş tipi aynı olmalı
fun divFunction(numberOne: Int,numberTwo: Int):Int{
    return numberOne / numberTwo
}

// normalde kullanımı böyle
fun calculateHighOrder2(numberOne: Int,numberTwo: Int,operation:(Int,Int)->Int){
    val result = operation(numberOne,numberTwo)
    println("result : $result")
}

//default değer verme
fun calculateHighOrder3(numberOne: Int = 4 ,numberTwo: Int = 3 ,operation:(Int,Int)->Int = {numberOne , numbertTwo -> numberOne + numberTwo}){
    val result = operation(numberOne,numberTwo)
    println("result : $result")
}

fun calculateHighOrder4(numberOne: Int = 4 ,numberTwo: Int = 3 ,operation:(Int,Int)->Int = ::privateSum){
    val result = operation(numberOne,numberTwo)
    println("result : $result")
}

fun privateSum (numberOne :Int , numberTwo: Int):Int{
    return numberOne +numberTwo
}

fun calculateHighOrder5(numberOne: Int = 4 ,numberTwo: Int = 3 ,operation:(Int)->Int ){
    val result = operation(numberOne)
    println("result : $result")
}


fun calculateHighOrder6(numberOne: Int = 4 ,numberTwo: Int = 3 ,operation:String.(Int,Int)->Int ){
    val result = operation("sayılar ",numberOne,numberTwo)
    println("result : $result")
}

