package com.krohajah.fantalib.data.fantlib.source.remote;

import com.krohajah.api.fantlabapi.model.Authors;

import io.reactivex.Observable;
import retrofit2.Response;

/**
 * @author Maxim Berezin
 */
public interface FantLibApiWorker {
    /**
     * Список авторов.
     *
     * @return список авторов.
     */
    Observable<Response<Authors>> getAuthors();
}
