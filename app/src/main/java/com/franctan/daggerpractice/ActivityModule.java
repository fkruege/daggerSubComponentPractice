package com.franctan.daggerpractice;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by franciskrueger on 10/21/17.
 */

@Module
public class ActivityModule {


    public ActivityModule() {
    }

    @Provides
    @ActivityScope
    public MainActivityDependency provideMainActivityDependency(Activity activity) {
        return new MainActivityDependency(activity);
    }


}
