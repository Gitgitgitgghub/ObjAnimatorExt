package com.xsg.objanimatorext;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

public class SizeUtil {
    public static int parseDp2Px(int dp,Context context){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,(float) dp,context.getResources().getDisplayMetrics());
    }

    public static int getDisplayWidth(Context context){
        DisplayMetrics metric = new DisplayMetrics();
        ((WindowManager)context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(metric);
        return  metric.widthPixels;
    }
}
