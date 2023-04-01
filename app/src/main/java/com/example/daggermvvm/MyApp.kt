package com.example.daggermvvm

import android.app.Application

class MyApp : Application() {

//    lateinit var appComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerUserRegistrationComponent.factory().create(applicationContext)
    }
}