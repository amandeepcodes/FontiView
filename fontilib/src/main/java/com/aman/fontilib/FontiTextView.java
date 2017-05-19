package com.aman.fontilib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;


/**
 * Created by amandeep on 14/10/15.
 */
public class FontiTextView extends AppCompatTextView {

    private String mFont;
    private boolean htmlText;


    public FontiTextView(Context context) {
        super(context, null);
        init(context);
    }


    public FontiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontiTextView,
                0, 0);
        try {
            mFont = a.getString(R.styleable.FontiTextView_font);
            htmlText = a.getBoolean(R.styleable.FontiTextView_html,false);
        } finally {
            a.recycle();
        }
        init(context);
    }

    public FontiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontiTextView,
                0, 0);

        try {
            mFont = a.getString(R.styleable.FontiTextView_font);
            htmlText = a.getBoolean(R.styleable.FontiTextView_html,false);
        } finally {
            a.recycle();
        }
        init(context);
    }

    private void init(Context context) {
        if (mFont != null) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + mFont);
            setTypeface(tf);
        }

        if (htmlText) {

            Spanned result;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                result = Html.fromHtml(getText().toString(), Html.FROM_HTML_MODE_LEGACY);
            } else {
                result = Html.fromHtml(getText().toString());
            }

            setText(result);
        }
    }


}
