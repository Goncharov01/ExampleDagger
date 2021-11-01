package com.exampledagger.app

import dagger.Module
import dagger.Provides

@Module
class MyModuleTiger {

    @TigerScope
    @Provides
    fun newMethod2(): Tiger {
        return Tiger(10, 10)
    }

}