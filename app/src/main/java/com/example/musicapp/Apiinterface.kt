package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Apiinterface {


    @Headers("X-RapidAPI-Key: 3ca0cfec07msha154a9136e2597fp11cabajsn2762b2256995","X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query:String) : Call<RishiKeGaane>
}
