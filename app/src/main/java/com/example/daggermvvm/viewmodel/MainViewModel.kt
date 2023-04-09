package com.example.daggermvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggermvvm.dagger.CustomScope
import com.example.daggermvvm.repository.MainRepository
import com.example.daggermvvm.repository.cache.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@CustomScope.ActivityScope
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    companion object {
        private const val TAG = "MainViewModel"
    }

    fun insert(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
//            Log.d(TAG, "insert: $user")
            repository.insertUser(user)
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
