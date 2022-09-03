package com.yongjincompany.app.data.remote.response.memo

import com.google.gson.annotations.SerializedName

data class CreateMemoResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Any,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean
)