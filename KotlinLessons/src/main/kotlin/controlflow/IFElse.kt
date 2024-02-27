package controlflow

fun main() {

    var answer = readln()

    //expression kullanımı {} içerisindeki son satir değer olarak değişkene atanır.
    val result :String = if (answer == "evet"){
        "oğrenci"
    }else{
        "değil"
    }

    /*if (10 == 10L){ // çalışmaz kotlin önce tipleri karşılaştırı.
        println("eşit")
    }*/
}