package com.example.topake.dagger2kotlinsample.di

import android.app.Application
import com.example.topake.dagger2kotlinsample.helper.DummyContextDependentHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by topake on 28/06/2017.
 */

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideSharedPrefHelper(application: Application): DummyContextDependentHelper {
        return DummyContextDependentHelper(application.applicationContext)
    }

}