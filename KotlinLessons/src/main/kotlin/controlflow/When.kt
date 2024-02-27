package controlflow

fun main() {

    val countryCode = readLine()!!
    when(countryCode.lowercase()){
        "tr" -> println("türk")
        "uk" -> println("ingliz")
        "ru" -> println("rus")
    }

    val number :Long = 123156465465
    when(number){
        is Long -> {
            println("long")
        }
        !is Long -> {
            println("long değil")
        }
    }

    val number2 = 3
    when(number2){
        in 0..10 ->{
            println("0-10")
        }
        in 11..20 ->{
            println("11-20")
        }
    }
}