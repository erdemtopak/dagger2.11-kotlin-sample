package com.example.topake.dagger2kotlinsample.di

import dagger.Module
import android.app.Activity
import dagger.android.AndroidInjector
import com.example.topake.dagger2kotlinsample.main.MainActivity
import com.example.topake.dagger2kotlinsample.main.MainActivityComponent
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds


/**
 * Created by topake on 29/06/2017.
 */

@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}