package controlflow


data class PairNumber (val numberOne:Int,val numberTwo:Int){
    operator fun minus(pairNumber: PairNumber):PairNumber{
        val localNumberOne = numberOne - pairNumber.numberOne
        val localNumberTwo = numberTwo - pairNumber.numberTwo

        val pairNumber:PairNumber = PairNumber(localNumberOne,localNumberTwo)

        println("numberone : $localNumberOne, numberTwo: $localNumberTwo")

        return pairNumber
    }
}
fun main() {

    val pairNumberOne = PairNumber(2,4)
    val pairNumberTwo = PairNumber(-8,11)
    val pairNumberThree = PairNumber(2,4)

    pairNumberOne - pairNumberTwo

}