package com.krohajah.fantalib.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * @author Maxim Berezin
 */
@Module
public abstract class AppModule {

    @Binds
    abstract Context bindContext(Application application);
}
