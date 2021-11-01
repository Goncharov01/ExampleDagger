package com.exampledagger.app

import dagger.Subcomponent

@TigerScope
@Subcomponent(modules = [MyModuleTiger::class])
interface TigerSubComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): TigerSubComponent
    }

    fun injectFragment(blankFragment: BlankFragment)

}