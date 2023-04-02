package com.example.daggermvvm

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

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