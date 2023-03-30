package com.example.daggermvvm

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UserDao {

    @Insert
    suspend fun insert(user: User)
}