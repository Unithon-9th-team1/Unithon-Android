package com.yongjincompany.app.viewmodel.rocket

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yongjincompany.app.data.remote.response.memo.FetchMemoListResponse
import com.yongjincompany.app.repository.RocketRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class RocketViewModel(private val rocketRepository: RocketRepository): ViewModel() {
    var fetchRocketListLiveData: MutableLiveData<Response<FetchMemoListResponse>> = MutableLiveData()

    fun fetchRocketList(nickname: String) {
        viewModelScope.launch {
            val response = rocketRepository.fetchRocketList(nickname)
            fetchRocketListLiveData.value = response
        }
    }
}
