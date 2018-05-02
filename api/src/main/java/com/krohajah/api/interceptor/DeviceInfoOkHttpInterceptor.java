package com.krohajah.api.interceptor;

import android.support.annotation.NonNull;

import com.krohajah.utils.android.DeviceInfo;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Интерсептор для добавления в заголовок информации об устройстве.
 *
 * @author Maxim Berezin
 */
public class DeviceInfoOkHttpInterceptor implements Interceptor {

    private final String deviceInfo;

    public DeviceInfoOkHttpInterceptor(DeviceInfo deviceInfo) {
        this.deviceInfo = "AndroidVersion: " + deviceInfo.getAndroidDisplayedVersion() + ", " +
                "SdkVersion: " + deviceInfo.getAndroidSDKVersion() + ", " +
                "SystemVersion: " + deviceInfo.getBuildDisplayedVersion() + ", " +
                "Brand: " + deviceInfo.getDeviceBrand() + ", " +
                "Model: " + deviceInfo.getDeviceModel();
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request().newBuilder()
                .addHeader("Device-Info", deviceInfo)
                .build();
        return chain.proceed(request);
    }
}
