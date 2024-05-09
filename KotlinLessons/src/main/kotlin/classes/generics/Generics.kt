package classes.generics

fun main() {
    val homeFragment = HomeFragment()
    val dashboardFragment = DashboardFragment()

    homeFragment.call()
    dashboardFragment.call()

    val box :Box<Int> = Box(1)
    val boz3 =  Box("box") // type inference
}

class Box<T>(t:T){
    var value =t
}
abstract class BaseFragment{
    fun <T> printNParam(param: T){
        println(param)
    }
}

class HomeFragment: BaseFragment(){
    fun call(){
        printNParam(2)
    }
}

class DashboardFragment: BaseFragment(){
    fun call(){
        printNParam("gkag")
    }
}

/*
*
*  declaration site variance
*
*
 */
// out co - variance kullanımlar için (kendisi ve subtypeları (alt sınıf) geçerlı olsun istiyortsak
interface Source<out T>{
    fun next():T
}

fun demo(strs:Source<String>){
    val objects:Source<Any> = strs
}

//in contra variance kullanım (kendisi ve superType(üst sınıf) geçerli)
interface Comparabble<in T>{
    operator fun compareTo(other:T):Int
}

fun demo(x:Comparabble<Number>){

    val y:Comparabble<Double> = x
}