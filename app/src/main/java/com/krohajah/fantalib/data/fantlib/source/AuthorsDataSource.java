package com.krohajah.fantalib.data.fantlib.source;

import com.krohajah.api.fantlabapi.model.Authors;

import io.reactivex.Observable;

/**
 * @author Maxim Berezin
 */
public interface AuthorsDataSource {

    Observable<Authors> getAuthors();

}
