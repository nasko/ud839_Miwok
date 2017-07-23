package com.example.android.miwok;

public class Word {

    public static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word (String d, String m, int a) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
        mAudioResourceId = a;
    }

    public Word (String d, String m, int i, int a) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
        mImageResourceId = i;
        mAudioResourceId = a;
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

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
