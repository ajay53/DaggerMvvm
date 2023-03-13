package com.example.daggermvvm

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val userId: Long, val username: String, var password: String) : Parcelable
