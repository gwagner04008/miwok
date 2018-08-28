/**
 * Created by gwagn on 10/8/2017.
 */
package com.example.android.miwok;

public class Word {
    private String mDefaultWord;
    private String mMiwokWord;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String dWord, String mWord, int audioID) {
        mDefaultWord = dWord;
        mMiwokWord = mWord;
        mAudioResourceId = audioID;
    }

    public Word(String dWord, String mWord, int imageID, int audioID) {
        mDefaultWord = dWord;
        mMiwokWord = mWord;
        mImageResourceId = imageID;
        mAudioResourceId = audioID;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getmImageID() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultWord='" + mDefaultWord + '\'' +
                ", mMiwokWord='" + mMiwokWord + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
