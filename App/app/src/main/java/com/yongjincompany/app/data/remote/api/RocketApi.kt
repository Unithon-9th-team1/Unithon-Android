package com.yongjincompany.app.data.remote.api

import com.yongjincompany.app.data.remote.response.rocket.FetchRocketListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RocketApi {
    @GET("rocket")
    suspend fun fetchRocketList(
        @Query("nickname") nickname: String,
    ): Response<FetchRocketListResponse>
}