package com.example.daggermvvm

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class])
interface UserRegistrationComponent {

    @Component.Factory
    interface Factory {
        fun create(): UserRegistrationComponent
    }

    fun getMainViewModel(): MainViewModel
//    fun getMainRepository(): MainRepository


}