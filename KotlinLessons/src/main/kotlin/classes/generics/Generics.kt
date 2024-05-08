package classes.generics

fun main() {
    val homeFragment = HomeFragment()
    val dashboardFragment = DashboardFragment()

    homeFragment.call()
    dashboardFragment.call()
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