package com.example.daggermvvm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    companion object {
        private const val TAG = "MainViewModel"
    }

    fun insert(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            Log.d(TAG, "insert: $user")
//            repository.insertUser(user)
        }
    }
}

/*
@Singleton
class MainViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}*/
