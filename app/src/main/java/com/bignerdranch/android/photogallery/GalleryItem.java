package com.bignerdranch.android.photogallery;

public class GalleryItem {
    private String mCaption, mId, mUrl;

    public String getmId() {return mId;}
    public void setmId(String mId) {this.mId = mId;}
    public String getmUrl() {return mUrl;}
    public void setmUrl(String mUrl) {this.mUrl = mUrl; }
    public String getmCaption() {return mCaption;}
    public void setmCaption(String mCaption) { this.mCaption = mCaption;}
    @Override public String toString() {return mCaption;}
}
