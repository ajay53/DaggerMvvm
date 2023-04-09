package com.example.daggermvvm.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.daggermvvm.DaggerUserRegistrationComponent
import com.example.daggermvvm.MyApp
import com.example.daggermvvm.repository.cache.User
import com.example.daggermvvm.dagger.UserRegistrationComponent
import com.example.daggermvvm.databinding.ActivityMainBinding
import com.example.daggermvvm.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var binding: ActivityMainBinding
    @Inject lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val appComponent = (applicationContext as MyApp).appComponent
        val userRegistrationComponent: UserRegistrationComponent = DaggerUserRegistrationComponent.factory()
            .create(appComponent)
        userRegistrationComponent.inject(this)

//
        /*val userRegistrationComponent: UserRegistrationComponent =
            DaggerUserRegistrationComponent.create()*/

//        viewModel = userRegistrationComponent.getMainViewModel()

        binding.btnSave.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            binding.btnSave.id -> {
                viewModel.insert(User(5, "T-Rex", "DinoMan"))
            }
        }
    }
}