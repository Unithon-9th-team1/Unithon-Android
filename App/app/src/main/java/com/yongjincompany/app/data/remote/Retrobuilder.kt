package com.yongjincompany.app.data.remote

import com.yongjincompany.app.data.remote.api.MemoApi
import com.yongjincompany.app.data.remote.api.RocketApi
import com.yongjincompany.app.data.remote.util.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val memoApi: MemoApi = retrofit.create(MemoApi::class.java)
    val rocketApi: RocketApi = retrofit.create(RocketApi::class.java)
}