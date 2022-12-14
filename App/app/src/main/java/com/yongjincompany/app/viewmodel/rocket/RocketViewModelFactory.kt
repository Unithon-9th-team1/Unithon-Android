package com.yongjincompany.app.viewmodel.rocket

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yongjincompany.app.repository.RocketRepository


class RocketViewModelFactory(private val rocketRepository: RocketRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RocketViewModel(rocketRepository) as T
    }
}