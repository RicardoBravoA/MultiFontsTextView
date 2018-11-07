package com.rba.multifontstextviewlibrary;

import android.graphics.Typeface;

/**
 * Created by Ricardo Bravo on 07/11/2018.
 */

public class MultiFontsTextViewItemModel {

    private String words = "";
    private Typeface font = null;
    private String color = "";

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Typeface getFont() {
        return font;
    }

    public void setFont(Typeface font) {
        this.font = font;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
