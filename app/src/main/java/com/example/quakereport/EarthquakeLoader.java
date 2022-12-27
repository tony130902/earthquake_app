package com.example.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String mUrl;

    @Override
    protected void onStartLoading(){
        Log.i("LOG_TAG" , "Test : onStartLoading called....");
        forceLoad();
    }

    public EarthquakeLoader(Context context , String url) {
        super(context);
        mUrl = url;

    }

    @Override
    public List<Earthquake> loadInBackground() {
        Log.i("LOG_TAG" , "Test : loadInBackground called....");
        if (mUrl == null){
            return null;
        }
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
