package com.yongjincompany.app.data.remote.response.rocket

import com.google.gson.annotations.SerializedName

data class FetchRocketDriverResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: List<FetchRocketListResponse.Data>,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean
)
