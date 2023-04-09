package com.example.daggermvvm.repository_hilt

import com.example.daggermvvm.repository.cache.User
import javax.inject.Inject

class MainRepository2 @Inject constructor() {

    suspend fun insertUser(user: User) {
        println(user)
    }
}