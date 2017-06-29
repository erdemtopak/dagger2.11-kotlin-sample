package com.example.topake.dagger2kotlinsample.di

import android.app.Application
import com.example.topake.dagger2kotlinsample.core.DaggerKotlinSampleApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by topake on 28/06/2017.
 */

@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(application: DaggerKotlinSampleApp)

}