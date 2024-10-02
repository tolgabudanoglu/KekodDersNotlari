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

        //getNavControllerViaFragment()
        //getNavControllerViaView()
       // getNavControllerViaFragment2()
       //getNavControllerViaView2() //çalışmaz on create de

    }

    // supportFragmentManager üzerinde ikisnde de çalışır
    fun getNavControllerViaFragment(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
    }

    fun getNavControllerViaView(){
        val navHostFragmentView = supportFragmentManager.findFragmentById(R.id.navHostFragmentView) as NavHostFragment
        val navControllerView = navHostFragmentView.navController
    }

    fun getNavControllerViaFragment2(){
        val navHostFragment = findViewById<View>(R.id.navHostFragment)
        val navController = navHostFragment.findNavController() //extension fonk
    }
    //fragment contaienr viewi findViewById ile çağrıırm yaparsak bunu onCreate de kullanmayız on resume da kullanabiliriz
    fun getNavControllerViaView2(){
        val navHostFragment = findViewById<View>(R.id.navHostFragmentView)
        val navController = navHostFragment.findNavController() //extension fonk
    }

    override fun onResume() {
        super.onResume()
        //getNavControllerViaView2() on resume da çalışır

    }
}