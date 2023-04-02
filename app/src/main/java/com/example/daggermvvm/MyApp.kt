package com.example.daggermvvm

import android.app.Application


class MyApp : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory().create(applicationContext)
    }
}