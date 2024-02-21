
@OptIn(ExperimentalStdlibApi::class)
fun main() {

    //sonlu sayılı liste

    val numbers = 1..100 //[1,100]
    val numbers2 = 1.rangeTo(100)

    val numbers3= 1..<100 //[1,100)
    val number4 = 1.rangeUntil(100)

    //büyükten küçüğe icin
    val reversedNumbers = 100.downTo(1)

    val steppedNumber=1..101 step (6)


    val numberList:IntRange = 10..100
}