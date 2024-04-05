package workarea

fun main() {
    val studentNumbers = arrayOf(13,15,456,465,456)


    val array = arrayOf(1, 2, 3, 4, 5)
    array[2] = 10 // Doğru, çünkü içerik değişir, dizi değişmez bu yüzden de arrayler mutable dir

    val anyArray = arrayOf<Any>(1, "hello", 3.14, true) // Evet, Any türü, Kotlin'deki herhangi bir türün ata türüdür ve bu nedenle bir Any tür dizisi (Array<Any>) herhangi bir türdeki değerleri içerebilir.

    // val intArray: Array<Int> = intArrayOf(1, 2, 3, 4, 5) // Hata! Geçersiz atama Arrayler invariant tır. Üst class daki arrarya atanamaz.

    exampleFunction(1, 2, 3, 4, 5)

    val numbers = intArrayOf(1, 2, 3, 4, 5)

// spread operatörü ile dizinin elemanlarını fonksiyona geçirme
    exampleFunction(*numbers)


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
    //contentEquals: Tek boyutlu dizilerde içerik karşılaştırması için kullanılır. İki dizinin içeriği aynı ise true döner.
    val array5 = intArrayOf(1, 2, 3)
    val array6 = intArrayOf(1, 2, 3)

    println(array5.contentEquals(array6)) // true


    val array8 = intArrayOf(1,2,3)
    val array9 = intArrayOf(1,2,3)

    if (array8 == array9){
        println(true)
    }else{
        println(false) // false
    }
}

fun exampleFunction(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

