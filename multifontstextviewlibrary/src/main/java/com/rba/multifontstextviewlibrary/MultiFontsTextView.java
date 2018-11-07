package com.rba.multifontstextviewlibrary;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.util.AttributeSet;

import com.rba.multifontstextviewlibrary.util.MultiFontsTextViewUtil;

/**
 * Created by Ricardo Bravo on 07/11/2018.
 */
public class MultiFontsTextView extends AppCompatTextView {

    public MultiFontsTextView(Context context) {
        super(context);
    }

    public MultiFontsTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MultiFontsTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setText(MultiFontsTextViewModel multiFontsTextViewModel) {
        SpannableString spannableString = new SpannableString(multiFontsTextViewModel.getText());

        for (MultiFontsTextViewItemModel multiFontsTextViewItemModel : multiFontsTextViewModel.getList()) {

            MultiFontsTextViewUtil.setSpannableFontColor(spannableString,
                    multiFontsTextViewModel.getText(), multiFontsTextViewItemModel.getWords(),
                    multiFontsTextViewItemModel.getFont(),
                    multiFontsTextViewItemModel.getColor());
        }

        setText(spannableString);
    }


}
