package com.exampledagger.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var myComponent: MyComponent

    @Inject
    lateinit var cat: Cat

    @Inject
    lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (applicationContext as MyApp).myComponent
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("!!!!!!!" + cat.name)
        println("?????" + dog)

    }

}