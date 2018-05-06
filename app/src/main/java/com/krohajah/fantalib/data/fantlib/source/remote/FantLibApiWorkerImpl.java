package com.krohajah.fantalib.data.fantlib.source.remote;

import com.krohajah.api.fantlabapi.FantLibApi;
import com.krohajah.api.fantlabapi.model.Authors;

import io.reactivex.Observable;
import retrofit2.Response;

/**
 * @author Maxim Berezin
 */
public class FantLibApiWorkerImpl implements FantLibApiWorker {

    private final FantLibApi api;

    public FantLibApiWorkerImpl(FantLibApi api) {
        this.api = api;
    }

    @Override
    public Observable<Response<Authors>> getAuthors() {
        return api.getAuthors();
    }
}
