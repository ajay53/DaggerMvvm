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

    fun inject(mainActivity: MainActivity)
//    fun getMainViewModel(): MainViewModel
}