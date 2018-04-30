package com.krohajah.fantalib.di;

import com.krohajah.fantalib.ui.main.MainActivity;
import com.krohajah.fantalib.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Maxim Berezin
 */
@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();
}
