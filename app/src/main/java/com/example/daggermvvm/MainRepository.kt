package com.example.daggermvvm

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor() {

    companion object {
        private const val TAG = "MainRepository"
    }

    fun insertUser(user: User) {
        Log.d(TAG, "insertUser: $user")
    }
}