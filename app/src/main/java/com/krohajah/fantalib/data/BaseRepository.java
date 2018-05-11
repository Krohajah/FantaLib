package com.krohajah.fantalib.data;

import android.util.LruCache;

import io.reactivex.Observable;

/**
 * Базовый репозиторий.
 *
 * @author Maxim Berezin
 */
public abstract class BaseRepository {

    private LruCache<String, Observable<?>> observableCache = createLruCache();


    private LruCache<String, Observable<?>> createLruCache() {
        return new LruCache<>(50);
    }

    @SuppressWarnings("unchecked")
    protected <T> Observable<T> cacheObservable(String key, Observable<T> observable) {
        Observable<T> cachedObservable = (Observable<T>) observableCache.get(key);
        if (cachedObservable != null) {
            return cachedObservable;
        }

        cachedObservable = observable;
        updateCache(key, cachedObservable);
        return cachedObservable;
    }

    private <T> void updateCache(String key, Observable<T> observable) {
        observableCache.put(key, observable);
    }

    //remove cache for just one symbol
    public <T> void removeCache(String symbol) {
        observableCache.remove(symbol);
    }

    //clear cache for all symbols
    public void clearCache() {
        observableCache = createLruCache();
    }
}
