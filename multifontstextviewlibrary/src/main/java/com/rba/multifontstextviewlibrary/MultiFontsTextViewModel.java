package com.rba.multifontstextviewlibrary;

import java.util.List;

/**
 * Created by Ricardo Bravo on 07/11/2018.
 */

public class MultiFontsTextViewModel {

    private String text;
    private List<MultiFontsTextViewItemModel> list;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MultiFontsTextViewItemModel> getList() {
        return list;
    }

    public void setList(List<MultiFontsTextViewItemModel> list) {
        this.list = list;
    }
}
