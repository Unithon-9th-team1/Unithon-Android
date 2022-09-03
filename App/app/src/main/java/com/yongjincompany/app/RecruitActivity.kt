package com.yongjincompany.app

import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.Animation
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityRecruitBinding

class RecruitActivity : BaseActivity<ActivityRecruitBinding>(
    R.layout.activity_recruit
) {
    override fun initView() {
        ObjectAnimator.ofFloat(binding.ivMoon, View.ROTATION, 0f , 360f)
            .apply {
                duration = 1000
                repeatCount = Animation.INFINITE
                start()
            }
    }

    override fun initClickListener() {
        super.initClickListener()
    }
}
