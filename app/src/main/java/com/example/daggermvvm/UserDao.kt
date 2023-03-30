package com.example.daggermvvm

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import dagger.Module
import dagger.Provides

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user:User)
}