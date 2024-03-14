package Functions

fun main() {
    qoo(::wooFun, ::rooFun, yoo = ::yooFun, poo = ::pooFun, doo = ::dooFun)

    qoo(::wooFun, ::rooFun, ::tooFun, ::yooFun, ::pooFun, ::dooFun)
}

private fun wooFun() {
    println("woo fun called")
}

private fun rooFun(number: Int): String {
    println("roo fun called")
    return number.toString()
}

private fun tooFun(number: Int): String {
    println("too fun called")
    return number.toString()
}

private fun yooFun(message: String, number: Int): String {
    println("yoo fun called")
    return "$message $number"
}

private fun pooFun(soo: () -> Unit) {
    println("poo fun called")
    soo()
}

private fun dooFun(foo: () -> Unit): () -> Unit {
    foo()
    return {
        println("redultDoFunc called")
    }
}

fun qoo(
    woo: () -> Unit,
    roo: (Int) -> String,
    too: (Int) -> String = ::defaultToo,
    yoo: String.(Int) -> String,
    poo: (soo: () -> Unit) -> Unit,
    doo: (foo: () -> Unit) -> () -> Unit

) {

    woo()
    val resultRoo: String = roo(5)
    val resultToo: String = too(6)
    val yooResult: String = yoo("message", 5)

    poo(::sooFun)

    val resultDooFuncitons = doo(::fooFun)
    resultDooFuncitons.invoke()
}


private fun defaultToo(number: Int): String {
    return number.toString()
}

private fun sooFun() {
    println("soo called")
}

private fun fooFun() {
    println("doo fun called")
}
