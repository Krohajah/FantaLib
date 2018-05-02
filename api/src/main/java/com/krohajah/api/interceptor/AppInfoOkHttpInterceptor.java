package com.krohajah.api.interceptor;

import android.support.annotation.NonNull;

import com.krohajah.utils.android.ApplicationInfo;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Интерсептор для добавления в заголовок информации о приложении.
 *
 * @author Maxim Berezin
 */
public class AppInfoOkHttpInterceptor implements Interceptor {

    private final String appInfo;

    public AppInfoOkHttpInterceptor(ApplicationInfo applicationInfo) {
        appInfo = "AppVersionName: " + applicationInfo.getVersionName() + ", " +
                "AppVersionCode: " + applicationInfo.getVersionCode() + ", " +
                "BuildType: " + applicationInfo.getBuildType() + " ";
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request().newBuilder()
                .addHeader("Application-Info", appInfo)
                .build();
        return chain.proceed(request);
    }
}
