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

    A().calculate()
}
class A(){

    //val neden immutable değilde read only açıklaması
    var age2 = 25
    var age3 = 4
    val age4:Int
        get(){
            return age2*age3
        }

    fun calculate(){
        val a = A()
        a.age2 = 10
        a.age3 = 5
        println(a.age4)

        a.age2 = 12
        a.age3 = 4
        println(a.age4)

    }



    var isMale = true
        private set



    var isStudent:Boolean = false
}