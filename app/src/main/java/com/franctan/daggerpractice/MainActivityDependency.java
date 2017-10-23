package com.franctan.daggerpractice;

import android.app.Activity;

import javax.inject.Inject;

public class MainActivityDependency {

    private Activity activity;

    public MainActivityDependency(Activity activity){
        this.activity = activity;
    }

    public String getMsg(){
       return "Testing main activity dependency" ;
    }
}
