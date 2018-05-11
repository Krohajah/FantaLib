package com.krohajah.fantalib.data.fantlib.source.remote;

import com.krohajah.api.fantlabapi.model.Authors;
import com.krohajah.fantalib.data.fantlib.source.AuthorsDataSource;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author Maxim Berezin
 */
public class AuthorsRemoteDataSource implements AuthorsDataSource {

    private final FantLibApiWorker apiWorker;

    @Inject
    public AuthorsRemoteDataSource(FantLibApiWorker apiWorker) {
        this.apiWorker = apiWorker;
    }

    @Override
    public Observable<Authors> getAuthors() {
        return apiWorker.getAuthors()
                .flatMap(authorsResponse -> Observable.just(authorsResponse.getData()));
    }
}
