package com.example.topake.dagger2kotlinsample.ui.main

import com.example.topake.dagger2kotlinsample.helper.DummyHelper
import dagger.Module
import dagger.Provides

/**
 * Created by topake on 29/06/2017.
 */

@Module
class MainActivityModule {

    @Provides
    fun provideDummyHelper(): DummyHelper = DummyHelper()
}