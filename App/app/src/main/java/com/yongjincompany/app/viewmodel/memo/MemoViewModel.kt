package com.yongjincompany.app.viewmodel.memo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yongjincompany.app.data.remote.request.memo.MemoInfoRequest
import com.yongjincompany.app.data.remote.response.memo.CreateMemoResponse
import com.yongjincompany.app.data.remote.response.memo.FetchMemoListResponse
import com.yongjincompany.app.repository.MemoRepository
import kotlinx.coroutines.launch
import retrofit2.Response


class MemoViewModel(private val memoRepository: MemoRepository) : ViewModel() {
    var createMemoLiveData: MutableLiveData<Response<CreateMemoResponse>> = MutableLiveData()
    var fetchMemoListLiveData: MutableLiveData<Response<FetchMemoListResponse>> = MutableLiveData()

    fun createMemo(request: MemoInfoRequest) {
        viewModelScope.launch {
            val response = memoRepository.createMemo(request)
            createMemoLiveData.value = response
        }
    }

    fun fetchMemoList(rocket: String, random: Boolean) {
        viewModelScope.launch {
            val response = memoRepository.fetchMemo(rocket, random)
            fetchMemoListLiveData.value = response
        }
    }
}
