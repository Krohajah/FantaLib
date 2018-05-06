package com.krohajah.fantalib.ui.activity.books;

import com.krohajah.fantalib.di.ActivityScoped;
import com.krohajah.fantalib.mvp.presenter.Presenter;

import dagger.Binds;
import dagger.Module;

/**
 * @author Maxim Berezin
 */
@Module
public abstract class BooksModule {

    @ActivityScoped
    @Binds
    abstract Presenter booksPresenter(BooksPresenter presenter);
}
