package com.yongjincompany.app.data.remote.api

import com.yongjincompany.app.data.remote.request.rocket.ReservationRocketRequest
import com.yongjincompany.app.data.remote.request.rocket.RideRocketRequest
import com.yongjincompany.app.data.remote.response.rocket.FetchRocketDriverResponse
import com.yongjincompany.app.data.remote.response.rocket.FetchRocketListResponse
import com.yongjincompany.app.data.remote.response.rocket.ReservationRocketResponse
import com.yongjincompany.app.data.remote.response.rocket.RideRocketResponse
import retrofit2.Response
import retrofit2.http.*

interface RocketApi {
    @GET("rocket")
    suspend fun fetchRocketList(
        @Query("nickname") nickname: String,
    ): Response<FetchRocketListResponse>

    @POST("rocket")
    suspend fun reservationRocket(
        @Body reservationRocketRequest: ReservationRocketRequest,
    ): Response<ReservationRocketResponse>

    @POST("rocket-boarding")
    suspend fun rideRocket(
        @Body rideRocketRequest: RideRocketRequest,
    ): Response<RideRocketResponse>

    @GET("rocket/{rocketId}")
    suspend fun fetchRocketDriver(
        @Path("rocketId") rocketId: Long,
    ): Response<FetchRocketDriverResponse>
}