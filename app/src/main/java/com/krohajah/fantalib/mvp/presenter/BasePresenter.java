package com.krohajah.fantalib.mvp.presenter;

import com.krohajah.fantalib.mvp.view.MvpView;

/**
 * @author Maxim Berezin
 */
public abstract class BasePresenter<V extends MvpView> implements Presenter<V> {

    protected V view;
    private boolean initialized;

    @Override
    public void takeView(V view) {
        this.view = view;
        initialize();
    }

    @Override
    public void dropView() {
        this.view = null;
    }

    private void initialize() {
        if (!initialized) {
            initialized = true;
            onInitialize();
        }
    }

    protected void onInitialize() {

    }

    public boolean isInitialized() {
        return initialized;
    }
}
