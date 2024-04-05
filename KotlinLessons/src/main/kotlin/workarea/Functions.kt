package workarea

fun main() {

    //default argument
    fun greet(name: String = "World") {
        println("Hello, $name!")
    }

// Fonksiyon çağrıları
    greet() // Hello, World!
    greet("Alice") // Hello, Alice!

    //name argument
    fun greet2(name: String, age: Int) {
        println("Hello, $name! You are $age years old.")
    }

// Named arguments kullanımı
    greet2(name = "Bob", age = 25)

    //fonksiyon overload
    // İki tamsayının toplamını hesaplayan fonksiyon
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Üç tamsayının toplamını hesaplayan fonksiyon
    fun sum(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    //Vararg tek ya da son parametre olarak yazılırsa javadaki "String…" gibi kod derlenir.
//Vararg ortada ya da başta ise arraye dönüşür.
//Bu yüzden performans farkı oluşur.
//aynı fonksiyon içinde birden fazla vararg tanımına izin verilmez.
    fun getUSserInfo(vararg userInfo:String,key:Int){

    }
    fun getUSserInfo2(vararg userInfo:String){

    }
    fun getUSserInfo(key:Int,number:Int,vararg userInfo:String){

    }
}