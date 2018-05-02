package com.krohajah.api;

import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.krohajah.utils.Preconditions;
import com.krohajah.utils.android.ApplicationInfo;
import com.krohajah.utils.android.DeviceInfo;

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
    private ApiConfig apiConfig;
    /**
     * Информация о приложении.
     */
    private ApplicationInfo applicationInfo;
    /**
     * Информация об устройстве.
     */
    private DeviceInfo deviceInfo;

    public RetrofitBuilder apiConfig(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        return this;
    }

    public RetrofitBuilder applicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }

    public RetrofitBuilder deviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }

    /**
     * Создает клиент ретрофит
     */
    public Retrofit build() {

        Preconditions.checkNotNull(apiConfig);
        Preconditions.checkNotNull(applicationInfo);
        Preconditions.checkNotNull(deviceInfo);

        OkHttpClient client = HttpClientBuilder.build(apiConfig, applicationInfo, deviceInfo);

        GsonBuilder gsonBuilder = new GsonBuilder();

        return new Retrofit.Builder()
                .baseUrl(apiConfig.getUrl())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
}
