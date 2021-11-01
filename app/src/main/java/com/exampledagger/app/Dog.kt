package com.exampledagger.app

import javax.inject.Inject

class Dog @Inject constructor() {

    init {
        println("Dog Dog Dog")
    }

}