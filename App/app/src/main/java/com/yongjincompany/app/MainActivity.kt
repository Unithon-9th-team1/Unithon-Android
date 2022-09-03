package com.yongjincompany.app

import android.content.Intent
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {
    override fun initClickListener() {
        binding.cvReservation.setOnClickListener {
            val intent = Intent(this@MainActivity , RecruitActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun initView() {
    }
}
