package com.krohajah.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Билдер инстанса Retrofit.
 *
 * @author Maxim Berezin
 */
public class RetrofitBuilder {
    /**
     * Конфигурация API.
     */
    private final ApiConfig apiConfig;
    /**
     * Билдер http-клиента
     */
    private final HttpClientBuilder apiHttpClientBuilder;

    @Inject
    public RetrofitBuilder(ApiConfig apiConfig, HttpClientBuilder apiHttpClientBuilder) {
        this.apiConfig = apiConfig;
        this.apiHttpClientBuilder = apiHttpClientBuilder;
    }

    /**
     * Создает клиент ретрофит
     */
    public Retrofit build() {
        OkHttpClient client = apiHttpClientBuilder.build();
        return new Retrofit.Builder()
                .baseUrl(apiConfig.getUrl())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
