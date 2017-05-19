package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * com.coolweather.android.gson
 * Created by kevin on 2017/5/18.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("text_d")
        public String info;
    }
}
