package com.m1m2.layoutsdemo.model;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vinayreddypolati on 2/11/17.
 */

public class Preferences {
    public  static String FONT_STYLE = "fonts/sportify.ttf";
    public static void setAllTextView(ViewGroup parent, Context context) {
        for (int i = parent.getChildCount() - 1; i >= 0; i--) {
            final View child = parent.getChildAt(i);
            if (child instanceof ViewGroup) {
                setAllTextView((ViewGroup) child,context);
            } else if (child instanceof TextView) {
                ((TextView) child).setTypeface(Typeface.createFromAsset(context.getAssets(),FONT_STYLE));
            }
        }
    }

}
