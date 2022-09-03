package com.yongjincompany.app.data.remote.request.memo

data class MemoInfoRequest(
    val photo: String,
    val dto: dataer,
) {
    data class dataer(
        val nickname: String,
        val description: String,
    )
}
