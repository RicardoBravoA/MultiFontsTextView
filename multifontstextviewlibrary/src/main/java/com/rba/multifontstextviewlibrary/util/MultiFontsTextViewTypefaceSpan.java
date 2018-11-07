package com.rba.multifontstextviewlibrary.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/**
 * Created by Ricardo Bravo on 07/11/2018.
 */

public class MultiFontsTextViewTypefaceSpan extends MetricAffectingSpan {

    private final Typeface typeface;

    public MultiFontsTextViewTypefaceSpan(Typeface typeface) {
        this.typeface = typeface;
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(typeface);
        textPaint.setFlags(textPaint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(typeface);
        textPaint.setFlags(textPaint.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
    }
}
