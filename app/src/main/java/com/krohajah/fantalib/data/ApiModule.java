package com.krohajah.fantalib.data;

import com.krohajah.api.fantlabapi.FantLibApi;
import com.krohajah.api.fantlabapi.FantLibRetrofitBuilder;
import com.krohajah.fantalib.data.fantlib.source.remote.FantLibApiWorker;
import com.krohajah.fantalib.data.fantlib.source.remote.FantLibApiWorkerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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

    @Provides
    @Singleton
    FantLibApiWorker fantLibApiWorker(FantLibRetrofitBuilder fantLibRetrofitBuilder) {
        Retrofit retrofit = fantLibRetrofitBuilder.build();
        FantLibApi api = retrofit.create(FantLibApi.class);
        return new FantLibApiWorkerImpl(api);
    }
}
