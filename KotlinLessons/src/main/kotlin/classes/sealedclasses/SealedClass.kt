package classes.sealedclasses

sealed class Errors private constructor(val errorCode:Int):A(),B {
    object RuntimeError :Errors(400) {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }
    }

    class NoInternet(val num:Int):Errors(100) ,Y{
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

        fun adaf(){

        }
    }


}

interface Y{}

open class A()

interface B{
    fun someMethod():String
}

fun main(){

    val error = Errors.NoInternet(1)
    val error1 = Errors.NoInternet(1)
    val error3 =Errors.NoInternet(1)
}