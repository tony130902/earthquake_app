package com.example.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String mUrl;

    public Earthquake(double magnitude , String location , long date , String url){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    public double getmMagnitude(){
        return mMagnitude;
    }

    public String getmLocation(){
        return mLocation;
    }

    public long getTimeInMilliseconds(){
        return mDate;
    }

    public String getmUrl(){
        return mUrl;
    }

}
