package com.yongjincompany.app.data.remote.response.memo

import com.google.gson.annotations.SerializedName

data class FetchMemoListResponse(
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
        @SerializedName("endAt")
        val endAt: String,
        @SerializedName("memos")
        val memos: List<Memo>,
        @SerializedName("rocketName")
        val rocketName: String,
        @SerializedName("staredAt")
        val startedAt: Any
    )

    data class Memo(
        @SerializedName("description")
        val description: String,
        @SerializedName("nickname")
        val nickname: String,
        @SerializedName("photoUrl")
        val photoUrl: String
    )
}