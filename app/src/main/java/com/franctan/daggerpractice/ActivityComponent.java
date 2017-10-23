package com.franctan.daggerpractice;

import android.app.Activity;

import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        Builder activityModule(ActivityModule module);

        @BindsInstance
        Builder bindActivity(Activity activity);

        ActivityComponent build();
    }

    void inject(MainActivity mainActivity);
}
