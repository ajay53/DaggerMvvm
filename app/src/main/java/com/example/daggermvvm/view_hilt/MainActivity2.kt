package com.example.daggermvvm.view_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggermvvm.databinding.ActivityMain2Binding
import com.example.daggermvvm.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity2"
    }

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}