package com.example.daggermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.daggermvvm.databinding.ActivityMainBinding
import dagger.internal.DaggerCollections

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userRegistrationComponent: UserRegistrationComponent =
            DaggerUserRegistrationComponent.create()
        viewModel = userRegistrationComponent.getMainViewModel()

        binding.btnSave.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            binding.btnSave.id -> {
                viewModel.insert(User(0, "T-Rex", "DinoMan"))
            }
        }
    }
}