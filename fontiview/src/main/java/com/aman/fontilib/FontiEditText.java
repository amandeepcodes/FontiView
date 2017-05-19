package com.aman.fontilib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;


/**
 * Created by amandeep on 14/10/15.
 */
public class FontiEditText extends AppCompatEditText {

    private String mFont;


    public FontiEditText(Context context) {
        super(context, null);
        init(context);
    }


    public FontiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontiEditText,
                0, 0);
        try {
            mFont = a.getString(R.styleable.FontiEditText_font);
        } finally {
            a.recycle();
        }
        init(context);
    }

    public FontiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontiEditText,
                0, 0);

        try {
            mFont = a.getString(R.styleable.FontiEditText_font);
        } finally {
            a.recycle();
        }
        init(context);
    }

    private void init(Context context) {
        try {

            if (mFont != null) {
                Typeface tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + mFont);
                setTypeface(tf);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
