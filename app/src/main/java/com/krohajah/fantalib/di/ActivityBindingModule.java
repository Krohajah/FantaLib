package com.krohajah.fantalib.di;

import com.krohajah.fantalib.ui.activity.books.BooksActivity;
import com.krohajah.fantalib.ui.activity.books.BooksModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Maxim Berezin
 */
@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = BooksModule.class)
    abstract BooksActivity mainActivity();
}
