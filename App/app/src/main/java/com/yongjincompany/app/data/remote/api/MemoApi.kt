package com.yongjincompany.app.data.remote.api

import com.yongjincompany.app.data.remote.request.memo.memoInfoRequest
import com.yongjincompany.app.data.remote.response.memo.CreateMemoResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface MemoApi {
    @POST("memo")
    suspend fun createMemo(
        @Body memoInfoRequest: memoInfoRequest
    ): CreateMemoResponse
}