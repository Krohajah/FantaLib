package com.krohajah.fantalib.mvp.presenter;

import com.krohajah.fantalib.mvp.view.MvpView;

/**
 * @author Maxim Berezin
 */
public interface Presenter<V extends MvpView> {

    public void takeView(V view);

    public void dropView();
}
