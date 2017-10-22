package com.franctan.daggerpractice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/**
 * A scoping annotation to permit objects whose lifetime should
 * conform to the life of the activity to be memorized in the
 * correct component.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface ActivityScope {
}