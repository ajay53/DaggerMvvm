package com.example.daggermvvm

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface UserRegistrationComponent {

    fun getMainViewModel(): MainViewModel
    fun getMainRepository(): MainRepository
}