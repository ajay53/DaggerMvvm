package com.example.daggermvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainViewModel @Inject constructor() : ViewModel() {

    companion object {
        private const val TAG = "MainViewModel"
    }

    private val userRegistrationComponent: UserRegistrationComponent =
        DaggerUserRegistrationComponent.create()

    private val repository: MainRepository = userRegistrationComponent.getMainRepository()

    fun insert(user: User) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertUser(user)
        }
    }
}