package com.yongjincompany.app

import android.animation.ObjectAnimator
import android.content.Intent
import android.view.View
import android.view.animation.Animation
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityRecruitBinding

class RecruitActivity : BaseActivity<ActivityRecruitBinding>(
    R.layout.activity_recruit
) {
    override fun initView() {
        ObjectAnimator.ofFloat(binding.ivMoon, View.ROTATION, 0f, 30000f)
            .apply {
                duration = 360000
                repeatCount = Animation.INFINITE
                start()
            }
    }

    override fun initClickListener() {
     binding.tcRecruit.setOnClickListener {
         val intent = Intent(this@RecruitActivity , MakeRocketActivity::class.java)
         startActivity(intent)
         finish()
     }
    }
}
