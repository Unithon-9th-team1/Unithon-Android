package com.yongjincompany.app.data.remote.response.rocket

import com.google.gson.annotations.SerializedName

data class RideRocketResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean,
)
