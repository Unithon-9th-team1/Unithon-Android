package com.yongjincompany.app.data.remote.api

import com.yongjincompany.app.data.remote.request.memo.MemoInfoRequest
import com.yongjincompany.app.data.remote.response.memo.CreateMemoResponse
import com.yongjincompany.app.data.remote.response.memo.FetchMemoListResponse
import com.yongjincompany.app.data.remote.response.memo.FilterRandomMemoResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface MemoApi {
    @POST("memo")
    suspend fun createMemo(
        @Body memoInfoRequest: MemoInfoRequest
    ): Response<CreateMemoResponse>

    @GET("memo")
    suspend fun fetchMemoList(
        @Query ("rocket") rocket: String,
        @Query ("random") random: Boolean
    ): Response<FetchMemoListResponse>

    @GET("memo")
    suspend fun filterRandomMemo(
        @Query ("rocket") rocket: String,
        @Query ("random") random: Boolean
    ): Response<FilterRandomMemoResponse>
}