package com.example.android.androidnewsapp.Common;

import com.example.android.androidnewsapp.Interface.IconBetterIdeaService;
import com.example.android.androidnewsapp.Interface.NewsService;
import com.example.android.androidnewsapp.Model.IconBetterIdea;

import com.example.android.androidnewsapp.Remote.IconBetterIdeaClient;
import com.example.android.androidnewsapp.Remote.RetrofitClient;

/**
 * Created by deupadhyay on 2/28/2018.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";
    public static final String API_KEY = "9b069605d31942d2b8f43a2a1a16a003";

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService() {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }
}
