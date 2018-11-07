package com.rba.multifontstextviewlibrary.util;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;

/**
 * Created by Ricardo Bravo on 07/11/2018.
 */

public class MultiFontsTextViewUtil {

    public static void setSpannableFontColor(SpannableString textSpannable, String message,
                                             String text, Typeface typeface, String color) {
        if (typeface != null) {
            setSpannableFont(textSpannable, message, text, typeface);
        }

        if (color != null && !color.isEmpty()) {
            setSpannableColor(message, textSpannable, text, color);
        }
    }

    private static void setSpannableFont(SpannableString textSpannable, String message,
                                         String text, Typeface typeface) {
        try {
            textSpannable.setSpan(new MultiFontsTextViewTypefaceSpan(typeface), message.indexOf(text),
                    message.indexOf(text) + text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        } catch (Exception e) {
            Log.e("MultiFontsTextView", "Font type doesn't exist");
        }

    }

    private static void setSpannableColor(String message, SpannableString textSpannable, String text, String color) {
        try {
            textSpannable.setSpan(new ForegroundColorSpan(Color.parseColor(color)), message.indexOf(text),
                    message.indexOf(text) + text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        } catch (Exception e) {
            Log.e("MultiFontsTextView", "Color doesn't exist");
        }
    }

}
