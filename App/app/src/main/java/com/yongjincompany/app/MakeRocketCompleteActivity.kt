package com.yongjincompany.app

import android.content.Intent
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityMakeRocketCompleteBinding

class MakeRocketCompleteActivity : BaseActivity<ActivityMakeRocketCompleteBinding>(
    R.layout.activity_make_rocket_complete
) {

    override fun initClickListener() {
        binding.btnNext.setOnClickListener {
            val intent = Intent(this@MakeRocketCompleteActivity, MakeRocketActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun initView() {

    }
}
