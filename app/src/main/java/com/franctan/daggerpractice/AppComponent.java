package com.franctan.daggerpractice;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by franciskrueger on 10/21/17.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    ActivityComponent.Builder activityComponentBuilder();
    Application application();
    void inject(MyApp myApp);
}
