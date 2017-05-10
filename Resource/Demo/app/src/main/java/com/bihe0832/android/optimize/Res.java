package com.bihe0832.android.optimize;

import android.content.res.Resources;

public class Res {

    private static int reflectResouce(Resources r,String type, String name,String pkg) {
        if (type == null || name == null) {
            return -1;
        }
        try {
            return r.getIdentifier(name, type, pkg);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int color(Resources r, String name,String pkg) {
        return reflectResouce(r,"color", name,pkg);
    }
}
