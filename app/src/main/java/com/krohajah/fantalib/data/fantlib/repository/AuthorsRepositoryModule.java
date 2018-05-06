package com.krohajah.fantalib.data.fantlib.repository;

import com.krohajah.fantalib.data.Remote;
import com.krohajah.fantalib.data.fantlib.source.AuthorsDataSource;
import com.krohajah.fantalib.data.fantlib.source.remote.AuthorsRemoteDataSource;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Модуль репозитория авторов
 *
 * @author Maxim Berezin
 */
@Module
public abstract class AuthorsRepositoryModule {

    @Singleton
    @Binds
    @Remote
    abstract AuthorsDataSource provideAuthorsRemoteDataSource(AuthorsRemoteDataSource dataSource);
}
