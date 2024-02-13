fun main() {
    println("hello worlda")
    val name:String = "tolga"
    val age = 34 // type inference = değişken tipini kendi anlaması = tip çıkarımı = bir değişkene eşittir ile verdiysek ide nin değişken tipini kendi çıkarması

    val surname:String

    surname = readLine()!! // kullanıcıdan isteme

    var isMale = true
    var isStudent:Boolean = false


}

fun main(args: Array<String>) {
    for (lang in args) println(lang)
}
class A(){

    var isMale = true
        private set



    var isStudent:Boolean = false
}