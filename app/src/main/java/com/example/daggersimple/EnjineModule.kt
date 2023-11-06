package com.example.daggersimple

import dagger.Module
import dagger.Provides

@Module
class EnjineModule {
    @Provides
    fun engine():Engine {
        return Engine()
    }
}