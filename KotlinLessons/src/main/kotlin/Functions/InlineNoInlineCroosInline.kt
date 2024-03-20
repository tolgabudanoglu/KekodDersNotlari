package Functions

fun main() {

    //non locking return
    println("start")
    val list = listOf(1,2,3,4,5,6,7)
    list.forEach{
        if (it == 5){
            return
        }
        println(it)
    }
    println("end")



    println("start")
    val list2 = listOf(1,2,3,4,5,6,7)
    list2.forEach label@{
        if (it == 5){
            return@label
        }
        println(it)
    }
    println("end")


    runAndPrint {
        println(it)
    }

    runAndPrint2({
        message -> println(message)
    },{
        println(it)
    })

}

inline fun runAndPrint(run: (String) -> Unit) {
    //println("message") inline ile böyle oluyormuş gibi
    run("message")

}

inline fun runAndPrint2(run: (String) -> Unit, noinline logger :(String) -> Unit) {
    log(logger)
    run("message")
    logger("end")

}

 fun  log(logger :(String) -> Unit){
    logger("start")

}

