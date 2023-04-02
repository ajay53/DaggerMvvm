package com.example.daggermvvm

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

//@Component(modules = [DatabaseModule::class])
@Component(dependencies = [AppComponent::class])
@CustomScope.ActivityScope
interface UserRegistrationComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): UserRegistrationComponent
    }

    fun inject(mainActivity: MainActivity)
//    fun getMainViewModel(): MainViewModel
}