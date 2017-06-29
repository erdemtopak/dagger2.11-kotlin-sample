package com.example.topake.dagger2kotlinsample.di

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.example.topake.dagger2kotlinsample.core.PlayGroundApp

/**
 * Created by topake on 28/06/2017.
 */

class AppInjector {

    companion object {
        fun init(application: PlayGroundApp) {
            DaggerAppComponentJava.builder().application(application).build().inject(application)

            application.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle) {
                    handleActivity(activity)
                }

                override fun onActivityStarted(activity: Activity) {

                }

                override fun onActivityResumed(activity: Activity) {

                }

                override fun onActivityPaused(activity: Activity) {

                }

                override fun onActivityStopped(activity: Activity) {

                }

                override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

                }

                override fun onActivityDestroyed(activity: Activity) {

                }
            })
        }

        fun handleActivity(activity: Activity) {}
    }
}