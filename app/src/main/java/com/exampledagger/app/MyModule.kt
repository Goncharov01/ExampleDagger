package com.exampledagger.app

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyModule {

    @Provides
    fun newMethod(): Cat {

        return Cat("qwerty", 10)
    }

}