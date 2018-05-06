package com.krohajah.fantalib;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * @author Maxim Berezin
 */
public class App extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
