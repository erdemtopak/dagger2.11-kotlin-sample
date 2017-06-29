package com.example.topake.dagger2kotlinsample.core

import android.app.Activity
import android.app.Application
import com.example.topake.dagger2kotlinsample.BuildConfig
import com.example.topake.dagger2kotlinsample.di.DaggerAppComponentJava
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject


/**
 * Created by topake on 28/06/2017.
 */

class PlayGroundApp : Application(), HasActivityInjector {

    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
//        AppInjector.init(this)
        DaggerAppComponentJava
                .builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }
}