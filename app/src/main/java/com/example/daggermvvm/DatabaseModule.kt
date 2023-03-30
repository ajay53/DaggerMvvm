package com.example.daggermvvm

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
//class DatabaseModule(private val context: Context) {
class DatabaseModule {

    @Provides
    fun getCar(): Car {
        return SmallCar()
    }

    /*@Provides
    fun provideUserDao(): UserDao {
        return DatabaseHandler.getDatabase(context).userDao()
    }*/
}