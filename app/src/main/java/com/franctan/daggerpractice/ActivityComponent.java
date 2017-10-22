package com.franctan.daggerpractice;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        Builder activityModule(ActivityModule module);
        ActivityComponent build();
    }

    void inject(MainActivity mainActivity);
}
