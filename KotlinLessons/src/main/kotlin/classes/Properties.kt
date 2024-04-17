package classes

fun main() {
    
}

class Rectangle2(val width: Int, val height: Int) {
    val area: Int
        get() = this.width * this.height
}
//var değişkeni val değişkene dönüştürme
var setterVisibility: String = "abc"
    private set // the setter is private and has the default implementation

var setterWithAnnotation: Any? = null
     set // annotate the setter with Inject

// backing fieldi yok çünkü değeri yok
val isEmpty: Boolean
    get() = this.size == 0