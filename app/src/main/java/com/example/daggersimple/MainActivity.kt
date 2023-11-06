package com.example.daggersimple

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var  myComponent: MyComponent
    @Inject
    lateinit var car:Car
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (application as App).myComponent
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("!!!!!!!!!!!!!!!!!!!!!!!${car}")
        findViewById<TextView>(R.id.text).text=car.engine.toString()
    }
}