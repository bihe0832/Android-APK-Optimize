package com.bihe0832.android.optimize;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by hardyshi on 2017/3/29.
 */

public class FontManager {

    public static final String FONTAWESOME = "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FONTAWESOME);
    }

}
