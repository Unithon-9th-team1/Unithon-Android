package com.yongjincompany.app.viewmodel.rocket

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yongjincompany.app.data.remote.request.rocket.ReservationRocketRequest
import com.yongjincompany.app.data.remote.response.rocket.FetchRocketListResponse
import com.yongjincompany.app.data.remote.response.rocket.ReservationRocketResponse
import com.yongjincompany.app.repository.RocketRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class RocketViewModel(private val rocketRepository: RocketRepository): ViewModel() {
    var fetchRocketListLiveData: MutableLiveData<Response<FetchRocketListResponse>> = MutableLiveData()
    var reservationRocketLiveData: MutableLiveData<Response<ReservationRocketResponse>> = MutableLiveData()

    fun fetchRocketList(nickname: String) {
        viewModelScope.launch {
            val response = rocketRepository.fetchRocketList(nickname)
            fetchRocketListLiveData.value = response
        }
    }

   fun reservationRocket(reservationRocketRequest: ReservationRocketRequest) {
       viewModelScope.launch {
           val response = rocketRepository.reservationRocket(reservationRocketRequest)
           reservationRocketLiveData.value = response
       }
   }
}
