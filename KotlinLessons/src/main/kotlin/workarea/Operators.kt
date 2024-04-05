package workarea

fun main() {
    /*var numberOne = 10

    println("number one : ${numberOne}") // 10
    println("number one : ${numberOne++}") // 10
    println("number one : ${numberOne}") // 11
    println("number one : ${++numberOne}") // 12
    println("number one : ${++numberOne}") //13 */


    var numbertwo = 10
    var numberThree = 5
    var flag = true
    println("+a : " + +numbertwo) // 10

    println("-b : " + +numberThree) // 5
    println("++a : " + ++numbertwo) // 11
    println("a++ : " + +numbertwo++) // 11
    println("a : " + +numbertwo) // 12
    println("--b: " + --numberThree) // 4
    println("!flag : " + !flag ) // false
    println("!flag : " + flag.not() ) // false
}

