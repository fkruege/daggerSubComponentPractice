package com.franctan.daggerpractice;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciskrueger on 10/21/17.
 */

@Module(subcomponents = {ActivityComponent.class})
public class AppModule {

    private Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    public AppDependency provideAppDependency() {
        return new AppDependency();
    }


//    @Provides
//    @Singleton
//    public MainActivityDependency provideMainActivityDependency() {
//        return new MainActivityDependency();
//    }
}
