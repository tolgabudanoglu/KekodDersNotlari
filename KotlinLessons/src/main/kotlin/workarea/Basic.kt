package workarea

fun main() {
    var aa = null // nothing tipinde


    var str1:Int? = 12
    val str2 = 156
    val str3 = str1

    println(str1 == str2) // true, içerik karşılaştırması
    println(str1 === str2) // true, aynı bellek adresine işaret ediyor

    println(str1 == str3) // true, içerik karşılaştırması
    println(str1 === str3) // true, aynı bellek adresine işaret ediyor

    val numbersValue:String="Value"+(4+2+8)
    println(numbersValue)


}