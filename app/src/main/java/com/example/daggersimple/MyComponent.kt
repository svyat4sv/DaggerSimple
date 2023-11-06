package com.example.daggersimple

import dagger.Component

@Component(modules = [EnjineModule::class])
interface MyComponent {
    @Component.Builder
    interface Builder{
        fun build():MyComponent
    }
    fun inject(mainActivity: MainActivity)
}