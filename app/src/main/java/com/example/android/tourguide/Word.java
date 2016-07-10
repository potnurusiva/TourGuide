package com.example.android.tourguide;

/**
 * Created by PotnuruSiva on 01-07-2016.
 */
public class Word {

    private static final int NO_PROVIDED_IMAGE = -1;
    private int mName;
    private int mAddress;
    private int mImageResourceId = NO_PROVIDED_IMAGE;

    public Word(int name, int address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;

    }

    public Word(int name, int address) {
        mName = name;
        mAddress = address;
    }


    public int getName() {
        return mName;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_PROVIDED_IMAGE;
    }

}