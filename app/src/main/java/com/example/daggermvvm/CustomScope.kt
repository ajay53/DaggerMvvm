package com.example.daggermvvm

import javax.inject.Scope

class CustomScope {

    @Scope
    @MustBeDocumented
    @Retention(AnnotationRetention.RUNTIME)
    annotation class ActivityScope()
}