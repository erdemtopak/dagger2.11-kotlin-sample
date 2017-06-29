package com.example.topake.dagger2kotlinsample.di

import com.example.topake.dagger2kotlinsample.main.MainActivity
import com.example.topake.dagger2kotlinsample.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by topake on 29/06/2017.
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

}