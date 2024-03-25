package classes

open class Hayvan {
    open fun sesCikar() {
        println("Bilinmeyen ses")
    }
}

class Kedi : Hayvan() {
    override fun sesCikar() {
        println("Miyav!")
    }
}

class Köpek : Hayvan() {
    override fun sesCikar() {
        println("Hav hav!")
    }
}
fun main() {
    val kedi = Kedi()
    val köpek = Köpek()

    kedi.sesCikar() // Çıktı: Miyav!
    köpek.sesCikar() // Çıktı: Hav hav!


    val hayvan1: Hayvan = Kedi()
    val hayvan2: Hayvan = Köpek()

    hayvan1.sesCikar() // Çıktı: Miyav!
    hayvan2.sesCikar() // Çıktı: Hav hav!
}
