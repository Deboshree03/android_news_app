package com.example.android.androidnewsapp.Interface;

//import android.telecom.Call;


import com.example.android.androidnewsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by deupadhyay on 2/28/2018.
 */

public interface NewsService {
    @GET("v2/top-headlines?country=us&apiKey=9b069605d31942d2b8f43a2a1a16a003")
    Call<WebSite> getSources();
}
