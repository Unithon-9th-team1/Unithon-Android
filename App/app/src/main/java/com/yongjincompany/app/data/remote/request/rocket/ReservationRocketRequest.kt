package com.yongjincompany.app.data.remote.request.rocket

data class ReservationRocketRequest(
    val arrivalEnd: Int,
    val nickname: String,
    val rocketName: String,
    val uuid: String,
    val code: String
)
