package com.krohajah.fantalib.data.fantlib.source;

import com.krohajah.api.fantlabapi.model.Authors;

import io.reactivex.Observable;
import retrofit2.Response;

/**
 * @author Maxim Berezin
 */
public interface AuthorsDataSource {

    Observable<Response<Authors>> getAuthors();

}
