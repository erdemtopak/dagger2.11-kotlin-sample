package com.example.topake.dagger2kotlinsample.di

import com.example.topake.dagger2kotlinsample.ui.detail.DetailActivity
import com.example.topake.dagger2kotlinsample.ui.detail.DetailActivityModule
import com.example.topake.dagger2kotlinsample.ui.main.MainActivity
import com.example.topake.dagger2kotlinsample.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by topake on 29/06/2017.
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = arrayOf(DetailActivityModule::class))
    abstract fun bindDetailActivity(): DetailActivity

}