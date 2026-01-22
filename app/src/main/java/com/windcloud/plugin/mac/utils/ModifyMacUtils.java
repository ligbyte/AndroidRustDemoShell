package com.windcloud.plugin.mac.utils;

import android.content.Context;

public class ModifyMacUtils {
    static {
        System.loadLibrary("modify_mac");
    }

    public static native int init(int info);

    public static native int getAppInfo(Context content);

    public static native int modifyParams(String param);

}
