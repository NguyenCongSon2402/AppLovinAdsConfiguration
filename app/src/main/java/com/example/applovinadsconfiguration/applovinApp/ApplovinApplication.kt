package com.example.applovinadsconfiguration.applovinApp

import android.app.Application
import com.applovin.sdk.AppLovinSdk


class ApplovinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLovinSdk.initializeSdk(this)
        AppLovinSdk.getInstance(this).mediationProvider = "max"
    }

}