package com.krohajah.utils.android;

import android.os.Build;

/**
 * Информация об устройстве.
 *
 * @author Maxim Berezin
 */
public final class DeviceInfo {

    public DeviceInfo() {

    }

    public String getAndroidDisplayedVersion() {
        return Build.VERSION.RELEASE;
    }

    public int getAndroidSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public String getBuildDisplayedVersion() {
        return Build.DISPLAY;
    }

    public String getDeviceBrand() {
        return Build.BRAND;
    }

    public String getDeviceModel() {
        return Build.MODEL;
    }
}
