package com.krohajah.fantalib;

import android.app.Application;
import android.content.Context;

import com.krohajah.api.ApiConfig;
import com.krohajah.utils.android.ApplicationInfo;
import com.krohajah.utils.android.DeviceInfo;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author Maxim Berezin
 */
@Module
public abstract class AppModule {

    @Binds
    abstract Context bindContext(Application application);

    @Provides
    static DeviceInfo deviceInfo() {
        return new DeviceInfo();
    }

    @Provides
    static ApiConfig apiConfig() {
        return new ApiConfig(
                BuildConfig.API_FANTLAB
        );
    }

    @Provides
    static ApplicationInfo applicationInfo() {
        return new ApplicationInfo(
                BuildConfig.DEBUG,
                BuildConfig.APPLICATION_ID,
                BuildConfig.BUILD_TYPE,
                BuildConfig.FLAVOR,
                BuildConfig.VERSION_CODE,
                BuildConfig.VERSION_NAME
        );
    }
}
