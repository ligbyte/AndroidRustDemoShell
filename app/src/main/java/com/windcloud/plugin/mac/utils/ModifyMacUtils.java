package com.windcloud.plugin.mac.utils;

import android.content.Context;

public class ModifyMacUtils {
    static {
        System.loadLibrary("modify_mac");
    }


    public static native int getAppSignature(Context content);

    public static native int modifyParams(String param);

}
