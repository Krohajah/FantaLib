package com.krohajah.fantalib.data.fantlib.repository;

import com.krohajah.api.fantlabapi.model.Authors;
import com.krohajah.fantalib.data.Remote;
import com.krohajah.fantalib.data.fantlib.source.AuthorsDataSource;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Response;

/**
 * Репозиторий авторов.
 *
 * @author Maxim Berezin
 */
public class AuthorsRepository implements AuthorsDataSource {

    private final AuthorsDataSource authorsRemoteDataSource;

    @Inject
    public AuthorsRepository(@Remote AuthorsDataSource authorsRemoteDataSource) {
        this.authorsRemoteDataSource = authorsRemoteDataSource;
    }

    @Override
    public Observable<Response<Authors>> getAuthors() {
        return authorsRemoteDataSource.getAuthors();
    }
}
