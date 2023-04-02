package com.example.daggermvvm

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
//    @CustomScope.ActivityScope
    @Provides
    fun provideUserDao(context: Context): UserDao {
        return DatabaseHandler.getDatabase(context).userDao()
    }
}