package com.example.daggermvvm.dagger

import javax.inject.Scope

class CustomScope {

    @Scope
    @MustBeDocumented
    @Retention(AnnotationRetention.RUNTIME)
    annotation class ActivityScope()
}