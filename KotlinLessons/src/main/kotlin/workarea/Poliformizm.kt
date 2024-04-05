package workarea



//dinamik poliformizm
open class Hayvan {
    open fun makeSound() {
        println("Ses çıkarıyor")
    }
}

class Köpek : Hayvan() {
    override fun makeSound() {
        println("Hav hav!")
    }
}

class Kedi : Hayvan() {
    override fun makeSound() {
        println("Miyav!")



        //statik polimprfizm
        fun call(sahip: Sahip) {

        }

        fun call(sahip2: Sahip2) {

        }

    }

    class Sahip() {

    }

    class Sahip2() {

    }
}