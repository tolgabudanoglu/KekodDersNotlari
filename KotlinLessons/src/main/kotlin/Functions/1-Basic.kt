package Functions

fun main() {

    repeat(10)
    repeat(10,5)

    //name argument
    takeSquare3(number2 = 5, number4 = 6)
    takeSquare3(number = 6,number2 = 5, number3 = 5, number4 = 6)
    takeSquare3(number3 = 6,number4 = 5, number = 5, number2 = 6)

    getUSserInfo("to","aa","daf","daf",key = 3)

    //arrayof kullanılmak istenirse * operatoru eklenir. (spread operatoru)
    getUSserInfo(*arrayOf("to","aa","daf","daf"),key = 5)
}

fun takeSquare(number:Int):Int{


    return 2* number
}

//default argument(name argument) fonksiyon overload
fun takeSquare2(number:Int = 4):Int{


    return 2* number
}
////default argument(name argument) fonksiyon overload başlangıç değeri opsiyonel
fun repeat(times:Int,startedValue:Int = 0){
    for (index in startedValue .. times){

    }
}

fun takeSquare3(number:Int = 4,number2:Int,number3:Int = 6,number4:Int):Int{


    return 2* number *number2*number3*number4
}

//Vararg tek ya da son parametre olarak yazılırsa javadaki "String…" gibi kod derlenir.
//Vararg ortada ya da başta ise arraye dönüşür.
//Bu yüzden performans farkı oluşur.
fun getUSserInfo(vararg userInfo:String,key:Int){

}
fun getUSserInfo2(vararg userInfo:String){

}
fun getUSserInfo(key:Int,number:Int,vararg userInfo:String){

}