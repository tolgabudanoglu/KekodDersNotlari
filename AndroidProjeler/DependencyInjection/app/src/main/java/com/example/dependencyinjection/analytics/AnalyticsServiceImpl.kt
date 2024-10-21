package com.example.dependencyinjection.analytics

import android.util.Log
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor(): AnalyticsService  {
    override fun analyticsMethods(){
        Log.i("analitisc service", "analyticsMethods:")
    }
}