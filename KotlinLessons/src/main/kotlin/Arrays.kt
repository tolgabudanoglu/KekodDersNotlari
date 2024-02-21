fun main() {

    val studentNumbers = arrayOf(13,15,456,465,456)
    val mizedArray= arrayOf<Any>(13,"ahmet",'v',true)
    var emptyArray :Array<String> = emptyArray()
    var emptyArray2 = emptyArray<String>()


    //high order func
    val carNames=Array<Double>(5){
        //pseudo code
        //pseudo code
        //pseudo code
        3.14*it
    }

    val lettersArray = arrayOf("c","d")
    printAllStrings("a","b","c")
    printAllStrings("a","b",*lettersArray,"c") // * spread operatoru ismi

   //== ile arraylerin referans object lerini kontrol ederiz.
    val array1 = intArrayOf(1,2,3)
    val array2 = intArrayOf(1,2,3)

    if (array1 == array2){
        println(true)
    }else{
        println(false) // false
    }

    val array3 = array1
    val array4 = array1

    if (array3 == array4){
        println(true) // true
    }else{
        println(false)
    }

}

fun printAllStrings(vararg string: String){
    for (stringg in string){
        println(stringg)
    }
}