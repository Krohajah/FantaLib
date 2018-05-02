package com.krohajah.api;

import com.krohajah.api.interceptor.AppInfoOkHttpInterceptor;
import com.krohajah.api.interceptor.DeviceInfoOkHttpInterceptor;
import com.krohajah.utils.android.ApplicationInfo;
import com.krohajah.utils.android.DeviceInfo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * @author Maxim Berezin
 */
class HttpClientBuilder {

    /**
     * Таймаут на подключение/чтение/запись (в секундах)
     */
    private static final long TIMEOUT = 15;

    public static OkHttpClient build(ApiConfig apiConfig,
                                     ApplicationInfo applicationInfo,
                                     DeviceInfo deviceInfo) {
        return new OkHttpClient.Builder()
                .addInterceptor(new AppInfoOkHttpInterceptor(applicationInfo))
                .addInterceptor(new DeviceInfoOkHttpInterceptor(deviceInfo))
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                .build();
    }
}
