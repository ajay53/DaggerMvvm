package com.example.daggermvvm

interface Car {
    fun getWheel(): String
}

class SmallCar : Car {
    override fun getWheel(): String {
        return "4 wheel"
    }
}

class BigCar : Car {
    override fun getWheel(): String {
        return "8 wheel"
    }
}