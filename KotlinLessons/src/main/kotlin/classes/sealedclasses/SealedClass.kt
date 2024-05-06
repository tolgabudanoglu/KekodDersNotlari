package classes.sealedclasses

sealed class Errors private constructor(val errorCode:Int):A(),B {

    class NoInternet:Errors(100) {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }
    }

    class ServerError:Errors(50) {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }
    }

    class FieIoError:Errors(60) {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }
    }


}

open class A()

interface B{
    fun someMethod():String
}

fun main(){


}