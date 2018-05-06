package com.krohajah.utils.rx;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Maxim Berezin
 */
public class RxUtils {

    public static <T> ObservableTransformer<T, T> applyUIDefaults() {
        return upstream -> upstream
                .compose(RxUtils.applySchedulers());
    }

    private static final ObservableTransformer schedulersTransformer =
            observable -> observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());

    private static <T> ObservableTransformer<T, T> applySchedulers() {
        return (ObservableTransformer<T, T>) schedulersTransformer;
    }
}
