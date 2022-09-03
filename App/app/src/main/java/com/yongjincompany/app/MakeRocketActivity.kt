package com.yongjincompany.app

import android.content.Intent
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityMakeRocketBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MakeRocketActivity : BaseActivity<ActivityMakeRocketBinding>(
    R.layout.activity_make_rocket
) {

    override fun initView() {
    }

    override fun initClickListener() {
        binding.btnNext.setOnClickListener {
            val intent = Intent(this@MakeRocketActivity, MakeRocketCompleteActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
