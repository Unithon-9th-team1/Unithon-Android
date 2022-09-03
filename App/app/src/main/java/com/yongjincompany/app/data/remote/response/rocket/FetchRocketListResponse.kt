package com.yongjincompany.app.data.remote.response.rocket

import com.google.gson.annotations.SerializedName

data class FetchRocketListResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean
) {
    data class Data(
        @SerializedName("arrivalEnd")
        val arrivalEnd: String,
        @SerializedName("boardingStatus")
        val boardingStatus: String,
        @SerializedName("rocketId")
        val rocketId: Int,
        @SerializedName("rocketName")
        val rocketName: String
    )
}