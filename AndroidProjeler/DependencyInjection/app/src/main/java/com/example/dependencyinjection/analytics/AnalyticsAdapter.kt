package com.example.dependencyinjection.analytics

import javax.inject.Inject
import javax.inject.Singleton


class AnalyticsAdapter @Inject constructor(
     val analyticsService: AnalyticsService

)