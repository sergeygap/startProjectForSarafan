package com.sergey_gap.startprojectforsarafan.data.api

import com.sergey_gap.startprojectforsarafan.utils.Constans.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/business.json")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY

    )

}