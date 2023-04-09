package com.example.daggermvvm.repository

import android.util.Log
import com.example.daggermvvm.dagger.CustomScope
import com.example.daggermvvm.repository.cache.User
import javax.inject.Inject

@CustomScope.ActivityScope
//@Singleton
//class MainRepository @Inject constructor(private val userDao: UserDao) {
class MainRepository @Inject constructor() {

    companion object {
        private const val TAG = "MainRepository"
    }

    suspend fun insertUser(user: User) {
        Log.d(TAG, "insertUser: $user")
//        userDao.insert(user)
    }
}