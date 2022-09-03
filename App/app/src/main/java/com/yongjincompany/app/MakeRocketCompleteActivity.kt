package com.yongjincompany.app

import androidx.lifecycle.ViewModelProvider
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.data.remote.request.rocket.ReservationRocketRequest
import com.yongjincompany.app.databinding.ActivityMakeRocketCompleteBinding
import com.yongjincompany.app.repository.RocketRepository
import com.yongjincompany.app.viewmodel.rocket.RocketViewModel
import com.yongjincompany.app.viewmodel.rocket.RocketViewModelFactory
import java.util.*

class MakeRocketCompleteActivity : BaseActivity<ActivityMakeRocketCompleteBinding>(
    R.layout.activity_make_rocket_complete
) {
    var uniqueId = UUID.randomUUID().toString()
    private lateinit var viewModel: RocketViewModel

    override fun initClickListener() {
        val rocket = this.intent.getStringExtra("rocket") ?: "하"
        val uuid = this.intent.getStringExtra("uuid") ?: "하"
        val arrival = this.intent.getIntExtra("arrival", 0)
        val nickname = this.intent.getStringExtra("nickname") ?: "하"

        binding.tvRocketName.text = rocket ?: "로켓뽕"

        binding.ivDocument.setOnClickListener {
            uniqueId = UUID.randomUUID().toString()
            binding.etName.setText(uniqueId)
        }
        val reservationRocketRequest: ReservationRocketRequest = ReservationRocketRequest(
            arrivalEnd = arrival,
            nickname = nickname,
            rocketName = rocket,
            uuid = uuid,
            code = uniqueId
        )

        binding.btnNext.setOnClickListener {
            viewModel.reservationRocket(reservationRocketRequest)
        }
    }

    override fun initView() {
        val repository = RocketRepository()
        val viewModelFactory = RocketViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(RocketViewModel::class.java)
    }
}
