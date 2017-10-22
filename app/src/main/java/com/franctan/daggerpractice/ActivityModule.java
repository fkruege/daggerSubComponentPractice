package com.franctan.daggerpractice;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciskrueger on 10/21/17.
 */

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    public Activity provideActivity() {
        return activity;
    }

    @ActivityScope
    @Provides
    public MainActivityDependency provideMainActivityDependency() {
        return new MainActivityDependency();
    }


}
