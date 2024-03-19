package Functions

fun main() {

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