package com.example.topake.dagger2kotlinsample.main


/**
 * Created by topake on 29/06/2017.
 */

@dagger.Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent : dagger.android.AndroidInjector<MainActivity> {

    @dagger.Subcomponent.Builder
    abstract class Builder : dagger.android.AndroidInjector.Builder<MainActivity>()

}