package com.example.topake.dagger2kotlinsample.ui.detail

import dagger.Module
import dagger.Provides

/**
 * Created by topake on 29/06/2017.
 */

@Module
class DetailActivityModule {

    @Provides
    fun provideDetailDataSource() : DetailDataSource = DetailDataSource()
}