package com.example.dependencyinjection

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dependencyinjection.analytics.AnalyticsAdapter
import com.example.dependencyinjection.analytics.AnalyticsService
import com.example.dependencyinjection.di.AuthInterceptorRetrofit
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsAdapter: AnalyticsAdapter

    @AuthInterceptorRetrofit
    @Inject
    lateinit var retrofit: Retrofit


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        defaultActivityCode()



        /*manual dependency injection
        analyticsAdapter = AnalyticsAdapter(object : AnalyticsService {
            override fun analyticsMethods() {
                Log.i("analitisc adapter", "analyticsMethods:")
            }
        })*/
        analyticsAdapter.analyticsService.analyticsMethods()

    }


    private fun defaultActivityCode(){

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}