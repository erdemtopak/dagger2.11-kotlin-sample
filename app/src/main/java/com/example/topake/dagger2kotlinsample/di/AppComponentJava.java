package com.example.topake.dagger2kotlinsample.di;

/**
 * Created by topake on 29/06/2017.
 */

import android.app.Application;

import com.example.topake.dagger2kotlinsample.core.PlayGroundApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponentJava {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponentJava build();
    }

    void inject(PlayGroundApp app);
}
