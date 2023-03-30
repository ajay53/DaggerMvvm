package com.example.daggermvvm

import android.app.Application
import android.content.Context
import androidx.room.Room
import javax.inject.Singleton

class App : Application() {

    val databaseHandler: DatabaseHandler by lazy {
        DatabaseHandler.getDatabase(this)
    }

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: App? = null

        fun getApp(): App {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = App()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}