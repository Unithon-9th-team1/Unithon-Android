package com.yongjincompany.app.viewmodel.rocket

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yongjincompany.app.data.remote.request.rocket.ReservationRocketRequest
import com.yongjincompany.app.data.remote.request.rocket.RideRocketRequest
import com.yongjincompany.app.data.remote.response.rocket.*
import com.yongjincompany.app.repository.RocketRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class RocketViewModel(private val rocketRepository: RocketRepository) : ViewModel() {
    var fetchRocketListLiveData: MutableLiveData<Response<FetchRocketListResponse>> =
        MutableLiveData()
    var reservationRocketLiveData: MutableLiveData<Response<ReservationRocketResponse>> =
        MutableLiveData()
    var rideRocketLiveData: MutableLiveData<Response<RideRocketResponse>> = MutableLiveData()
    var fetchRocketDriverLiveData: MutableLiveData<Response<FetchRocketDriverResponse>> =
        MutableLiveData()
    var startRocketLiveData: MutableLiveData<Response<StartRocketResponse>> = MutableLiveData()

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

    fun rideRocket(rideRocketRequest: RideRocketRequest) {
        viewModelScope.launch {
            val response = rocketRepository.rideRocket(rideRocketRequest)
            rideRocketLiveData.value = response
        }
    }

    fun fetchRocketRider(rocketId: Long) {
        viewModelScope.launch {
            val response = rocketRepository.fetchRocketRider(rocketId)
            fetchRocketDriverLiveData.value = response
        }
    }

    fun startRocket(rocketId: Long) {
        viewModelScope.launch {
            val response = rocketRepository.startRocket(rocketId)
            startRocketLiveData.value = response
        }
    }
}
