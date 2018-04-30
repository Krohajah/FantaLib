package com.krohajah.fantalib.ui.activity.base;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * @author Maxim Berezin
 */
public class BaseActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawableResource(android.R.color.white);
    }
}
