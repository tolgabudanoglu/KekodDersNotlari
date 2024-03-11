package Functions

fun main() {

    val awesomeInstance = AwesomeClass()

    awesomeInstance dowloadImage "wafdafa"

    awesomeInstance speacialPlus 5

}

class AwesomeClass{

    infix fun dowloadImage(imageUrl:String){

    }

    infix fun speacialPlus(number: Int):Int{
        return 4
    }
}