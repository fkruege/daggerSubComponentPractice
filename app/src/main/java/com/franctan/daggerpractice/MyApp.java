package com.franctan.daggerpractice;

import android.app.Application;

import javax.inject.Inject;

/**
 * Created by franciskrueger on 10/21/17.
 */

public class MyApp extends Application {

    public AppComponent appComponent;

    @Inject
    AppDependency appDependency;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }
}
