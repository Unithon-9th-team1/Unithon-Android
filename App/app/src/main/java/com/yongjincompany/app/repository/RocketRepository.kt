package com.yongjincompany.app.repository

import com.yongjincompany.app.data.remote.RetrofitBuilder
import com.yongjincompany.app.data.remote.request.memo.MemoInfoRequest
import com.yongjincompany.app.data.remote.response.memo.CreateMemoResponse
import com.yongjincompany.app.data.remote.response.rocket.FetchRocketListResponse
import retrofit2.Response

class RocketRepository {
    suspend fun fetchRocketList(nickname: String): Response<FetchRocketListResponse> {
        return  RetrofitBuilder.rocketApi.fetchRocketList(nickname)
    }
}