package classes.interfaces

import classes.interfaces.TextWatcher.Companion.name

interface TextWatcher {
    fun onTextChanged()
    fun beforeTextChanged()
    fun afterTextChanged()

    //Body si olan bir fonksiyon yazarsak override zorunluluğu yok. static bir class tanımlanıyor arka planda static fonk ile birlikte
    fun funWithBody(){

    }
    val text :String
    var text3 :String
    //backing fiedl yok state tutamazlar
    //val text2 :String = "adfadf"

    companion object{
        val name:String = "afsd"
    }
}

interface ChildInterface:TextWatcher{
    override fun afterTextChanged() {
        TODO("Not yet implemented")
    }
    override fun onTextChanged() {
        TODO("Not yet implemented")
    }

    override fun beforeTextChanged() {
        TODO("Not yet implemented")
    }

    fun adsf(){
        name
    }
}

//üst sınıf implement ettiği için child in etmesine gerek yok
class InterfaceSample:ChildInterface{
    override fun beforeTextChanged() {
        TODO("Not yet implemented")
    }

    override val text: String
        get() = TODO("Not yet implemented")
    override var text3: String
        get() = TODO("Not yet implemented")
        set(value) {}

}

fun main() {
    //Object expression ile interface arka planda normal bir sınıf gibi davranıyor. Nesnesi oluşmuş gibi.
    val textWatcher = object :TextWatcher{
        override fun onTextChanged() {
            TODO("Not yet implemented")
        }

        override fun beforeTextChanged() {
            TODO("Not yet implemented")
        }

        override fun afterTextChanged() {
            TODO("Not yet implemented")
        }

        override val text: String
            get() = TODO("Not yet implemented")
        override var text3: String
            get() = TODO("Not yet implemented")
            set(value) {}



    }
}