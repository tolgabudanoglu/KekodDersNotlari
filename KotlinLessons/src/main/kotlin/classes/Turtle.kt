package classes

class Turtle constructor(mName:String = "tosbik",mFeetCount:Int = 5) { // primary constructor
    //class Turtle constructor(var Name:String = "tosbik",var FeetCount:Int = 5) var veya val olarak tanımladığında değişken gibi kullanılabilir init bloğu dışarıdan erişilebilir
    var feetCount = 2
    val feetColor = "browm"
    val headCount = 1
    val headColor = "green"
    val tailColor = "brown"
    var name = "brown"
    val tailCount = 1


    init { // init bloğu primary constructorun body si
        name = mName
        feetCount = mFeetCount
        println("primary cons")
    }

    constructor(mName:String = "tosbik",mFeetCount:Int = 5,tailColor:String = "brown"):this(mName, mFeetCount){ //secondry constructor
        // init bloğu her türlü çalışır dikkat et
        println("second cons")
    }
    fun makeAsıund():String{
        return "dafaf"
    }

    fun eatMeal(){

    }

    fun walk(){

    }


}

fun main() {

    //nesne oluşturma
    val turtleOne : Turtle = Turtle()
    val turtleTwo : Turtle = Turtle("murtle")
    val turtleThree : Turtle = Turtle("murtle",4)
    val turtleFour : Turtle = Turtle("murtle",4,"blue")

    turtleOne.walk()

}