package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * com.coolweather.android.gson
 * Created by kevin on 2017/5/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
