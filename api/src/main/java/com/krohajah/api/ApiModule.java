package com.krohajah.api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * DI-модуль для API.
 *
 * @author Maxim Berezin
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    OkHttpClient httpClient() {
        return new OkHttpClient();
    }
}
