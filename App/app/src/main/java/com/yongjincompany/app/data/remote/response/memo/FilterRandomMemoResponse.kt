package com.yongjincompany.app.data.remote.response.memo

import com.google.gson.annotations.SerializedName

data class FilterRandomMemoResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Any,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean
) {
    data class Data(
        @SerializedName("dday")
        val dday: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("nickname")
        val nickname: String,
        @SerializedName("photoUrl")
        val photoUrl: String
    )
}