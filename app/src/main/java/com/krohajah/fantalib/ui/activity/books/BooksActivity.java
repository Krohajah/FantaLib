package com.krohajah.fantalib.ui.activity.books;

import android.os.Bundle;

import com.krohajah.fantalib.R;
import com.krohajah.fantalib.ui.activity.base.BaseActivity;

import javax.inject.Inject;

public class BooksActivity extends BaseActivity implements BooksView {

    @Inject
    BooksPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.takeView(this);
    }

    @Override
    protected void onDestroy() {
        presenter.dropView();
        super.onDestroy();
    }
}
