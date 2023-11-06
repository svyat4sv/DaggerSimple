package com.example.daggersimple

import android.app.Application

class App :Application() {
    lateinit var  myComponent: MyComponent
    override fun onCreate() {
        super.onCreate()
        myComponent= DaggerMyComponent.builder().build()
    }
}