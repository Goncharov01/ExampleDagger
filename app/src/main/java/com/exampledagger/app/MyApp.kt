package com.exampledagger.app

import android.app.Application

class MyApp : Application() {

    lateinit var myComponent: MyComponent

    override fun onCreate() {
        super.onCreate()
        myComponent = DaggerMyComponent.builder().context(this).build()
    }

}