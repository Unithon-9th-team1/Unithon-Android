package com.yongjincompany.app.repository

import com.yongjincompany.app.data.remote.RetrofitBuilder
import com.yongjincompany.app.data.remote.request.memo.MemoInfoRequest
import com.yongjincompany.app.data.remote.request.rocket.ReservationRocketRequest
import com.yongjincompany.app.data.remote.request.rocket.RideRocketRequest
import com.yongjincompany.app.data.remote.response.memo.CreateMemoResponse
import com.yongjincompany.app.data.remote.response.rocket.FetchRocketListResponse
import com.yongjincompany.app.data.remote.response.rocket.ReservationRocketResponse
import com.yongjincompany.app.data.remote.response.rocket.RideRocketResponse
import retrofit2.Response

class RocketRepository {
    suspend fun fetchRocketList(nickname: String): Response<FetchRocketListResponse> {
        return  RetrofitBuilder.rocketApi.fetchRocketList(nickname)
    }

    suspend fun reservationRocket(reservationRocketRequest: ReservationRocketRequest): Response<ReservationRocketResponse> {
        return RetrofitBuilder.rocketApi.reservationRocket(reservationRocketRequest)
    }

    suspend fun rideRocket(rideRocketRequest: RideRocketRequest): Response<RideRocketResponse> {
        return RetrofitBuilder.rocketApi.rideRocket(rideRocketRequest)
    }
}