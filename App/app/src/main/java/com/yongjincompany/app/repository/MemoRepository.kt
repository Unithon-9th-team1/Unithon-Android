package com.yongjincompany.app.repository

import com.yongjincompany.app.data.remote.RetrofitBuilder
import com.yongjincompany.app.data.remote.request.memo.MemoInfoRequest
import com.yongjincompany.app.data.remote.response.memo.CreateMemoResponse
import com.yongjincompany.app.data.remote.response.memo.FetchMemoListResponse
import com.yongjincompany.app.data.remote.response.memo.FilterRandomMemoResponse
import retrofit2.Response

class MemoRepository {
    suspend fun createMemo(memoInfoRequest: MemoInfoRequest): Response<CreateMemoResponse> {
        return RetrofitBuilder.memoApi.createMemo(memoInfoRequest)
    }

    suspend fun fetchMemo(rocket: String, random: Boolean): Response<FetchMemoListResponse> {
        return RetrofitBuilder.memoApi.fetchMemoList(rocket, random)
    }

    suspend fun filterRandomMemo(rocket: String, random: Boolean): Response<FilterRandomMemoResponse> {
        return RetrofitBuilder.memoApi.filterRandomMemo(rocket, random)
    }

}