package com.exampledagger.app

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): MyComponent
    }

    fun inject(mainActivity: MainActivity)

    fun tigerComponent() : TigerSubComponent.Builder

//    fun injectFragment(blankFragment: BlankFragment)

}