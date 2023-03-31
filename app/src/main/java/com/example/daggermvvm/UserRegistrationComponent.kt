package com.example.daggermvvm

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class])
interface UserRegistrationComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): UserRegistrationComponent
    }

    fun getMainViewModel(): MainViewModel
//    fun getMainRepository(): MainRepository


}