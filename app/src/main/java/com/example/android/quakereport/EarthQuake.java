package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Fahmi on 7/24/2017.
 */

public class EarthQuake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMiliSecond;
    private String url;

    public EarthQuake (double mMagnitude, String mLocation, long mTimeInMiliSecond, String url) {
        this.mMagnitude=mMagnitude;
        this.mLocation=mLocation;
        this.mTimeInMiliSecond=mTimeInMiliSecond;
        this.url=url;
    }



    public long getmTimeInMiliSecond() {

        return mTimeInMiliSecond;
    }

    public String getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getUrl() {
        return url;
    }


}
