package com.example.topake.dagger2kotlinsample.main

/**
 * Created by topake on 29/06/2017.
 */

@dagger.Module
class MainActivityModule {

    @dagger.Provides
    fun provideDummyHelper(): com.example.topake.dagger2kotlinsample.helper.DummyHelper = com.example.topake.dagger2kotlinsample.helper.DummyHelper()
}