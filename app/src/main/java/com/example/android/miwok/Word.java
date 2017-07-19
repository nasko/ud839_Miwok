package com.example.android.miwok;

public class Word {

    public static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word (String d, String m) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
    }

    public Word (String d, String m, int i) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
        mImageResourceId = i;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
