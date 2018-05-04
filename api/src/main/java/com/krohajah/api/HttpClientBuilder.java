package com.krohajah.api;

import com.krohajah.api.interceptor.AppInfoOkHttpInterceptor;
import com.krohajah.api.interceptor.DeviceInfoOkHttpInterceptor;
import com.krohajah.utils.android.ApplicationInfo;
import com.krohajah.utils.android.DeviceInfo;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * @author Maxim Berezin
 */
class HttpClientBuilder {

    /**
     * Таймаут на подключение/чтение/запись (в секундах)
     */
    private static final long TIMEOUT = 15;
    /**
     * Информация о приложении.
     */
    private final ApplicationInfo applicationInfo;
    /**
     * Информация об устройстве.
     */
    private final DeviceInfo deviceInfo;
    /**
     * Http-клиент.
     */
    private final OkHttpClient baseOkHttpClient;

    @Inject
    HttpClientBuilder(ApplicationInfo applicationInfo, DeviceInfo deviceInfo, OkHttpClient baseOkHttpClient) {
        this.applicationInfo = applicationInfo;
        this.deviceInfo = deviceInfo;
        this.baseOkHttpClient = baseOkHttpClient;
    }


    public OkHttpClient build() {
        return baseOkHttpClient.newBuilder()
                .addInterceptor(new AppInfoOkHttpInterceptor(applicationInfo))
                .addInterceptor(new DeviceInfoOkHttpInterceptor(deviceInfo))
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                .build();
    }
}
