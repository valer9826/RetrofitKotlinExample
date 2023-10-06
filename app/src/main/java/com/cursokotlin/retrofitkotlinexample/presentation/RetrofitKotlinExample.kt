package com.cursokotlin.retrofitkotlinexample.presentation

import android.app.Application
import com.cursokotlin.retrofitkotlinexample.BuildConfig
import timber.log.Timber

class RetrofitKotlinExample: Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }

}