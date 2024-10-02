package com.example.appnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getNavControllerViaFragment()
        //getNavControllerViaView()
       // getNavControllerViaFragment2()
       //getNavControllerViaView2() //çalışmaz on create de

        //getNavControllerViaFragment3()
       // getNavControllerViaView3()//çalışmaz on create de
    }

    // birinci yol en az hatalı yöntem
    fun getNavControllerViaFragment(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
    }
    //ikinci yol
    fun getNavControllerViaFragment2(){
        val navHostFragment = findViewById<View>(R.id.navHostFragment)
        val navController = navHostFragment.findNavController() //extension fonk
    }
    //3. yol
    fun getNavControllerViaFragment3(){
        findNavController(R.id.navHostFragment)
    }
    // birinci yol en az hatalı yöntem bunu tercih et
    fun getNavControllerViaView(){
        val navHostFragmentView = supportFragmentManager.findFragmentById(R.id.navHostFragmentView) as NavHostFragment
        val navControllerView = navHostFragmentView.navController
    }
    //ikinci yol
    //fragment contaienr viewi findViewById ile çağrıırm yaparsak bunu onCreate de kullanmayız on resume da kullanabiliriz
    fun getNavControllerViaView2(){
        val navHostFragment = findViewById<View>(R.id.navHostFragmentView)
        val navController = navHostFragment.findNavController() //extension fonk
    }
    //3. yol
    // yine onCreate de çalışmaz
    fun getNavControllerViaView3(){
        findNavController(R.id.navHostFragmentView)
    }

    override fun onResume() {
        super.onResume()
        //getNavControllerViaView2() on resume da çalışır
        //getNavControllerViaView3() on resume da çalışır

    }
}