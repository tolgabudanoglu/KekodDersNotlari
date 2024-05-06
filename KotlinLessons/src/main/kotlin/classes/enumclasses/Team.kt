package classes.enumclasses

enum class Team private constructor(val starCount:Int){
    GENERBAHCE(3) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },GALATASARAY(4) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },BESIKTAS(3) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    };

    init{

    }


    abstract fun boo()
}

fun main(){

    Team.values() //entries aynı
    Team.valueOf("GALATASARAY")
    Team.BESIKTAS.starCount

    println(Team.GENERBAHCE.name) //enum sabitinin ismi
    println(Team.GENERBAHCE.ordinal) // sabitin sırasını
}