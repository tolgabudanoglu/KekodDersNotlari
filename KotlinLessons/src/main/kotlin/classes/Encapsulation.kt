package classes

class Encapsulation {

    private val name:String = "TOLGA"
    private val surname:String = "budanoğlu"
    var secondSurname:String = "budanoğlu"

    fun getFullName():{
        return "$name $surname"
    }

}

fun main() {

    val encapsulation = Encapsulation()
   // encapsulation.name = "asd"   private yaparak get ve set fonksiyonlarını private yaptık arka planda fieldleri hep private zaten
    encapsulation.secondSurname = "dafda" // setine ulaştık fieldi arka planda private zaten
}