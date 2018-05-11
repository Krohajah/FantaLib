package com.krohajah.fantalib.data.fantlib.repository;

import com.krohajah.api.fantlabapi.model.Authors;
import com.krohajah.fantalib.data.BaseRepository;
import com.krohajah.fantalib.data.Remote;
import com.krohajah.fantalib.data.fantlib.source.AuthorsDataSource;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Репозиторий авторов.
 *
 * @author Maxim Berezin
 */
public class AuthorsRepository extends BaseRepository implements AuthorsDataSource {

    private static final String CAHCE_AUTHORS_OBSERVABLE = "CAHCE_AUTHORS_OBSERVABLE";

    private final AuthorsDataSource authorsRemoteDataSource;

    @Inject
    public AuthorsRepository(@Remote AuthorsDataSource authorsRemoteDataSource) {
        this.authorsRemoteDataSource = authorsRemoteDataSource;
    }

    @Override
    public Observable<Authors> getAuthors() {
        Observable<Authors> authorsObservable = authorsRemoteDataSource.getAuthors();
        return cacheObservable(CAHCE_AUTHORS_OBSERVABLE, authorsObservable);
    }
}
