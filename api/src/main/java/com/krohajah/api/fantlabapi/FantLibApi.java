package com.krohajah.api.fantlabapi;

import com.krohajah.api.fantlabapi.model.Author;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * АПИ fantlib.
 *
 * @author Maxim Berezin
 */
public interface FantLibApi {
    /**
     * Список авторов.
     *
     * @return список авторов.
     */
    @GET("autorsall")
    Observable<Response<Author>> getAuthors();
}
