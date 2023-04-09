package com.example.daggermvvm.dagger

import com.example.daggermvvm.view.MainActivity
import dagger.Component

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