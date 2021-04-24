package com.example.andr3lesson4.data.remote;

import com.example.andr3lesson4.data.model.MyWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AndroidApi {
@GET("data/2.5/weather?")
    Call<MyWeather> getWeather(@Query("q") String city,
                               @Query("units") String units,
                               @Query("appid") String appId);
}
