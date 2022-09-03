package com.yongjincompany.app.view

import android.view.animation.AnimationUtils
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityIntroBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroActivity : BaseActivity<ActivityIntroBinding>(
    R.layout.activity_intro
) {
    override fun initView() {
        val fadeInAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        fadeInAnim.setAnimationListener {}
        binding.ivTitle.startAnimation(fadeInAnim)
        binding.tvSub.startAnimation(fadeInAnim)
    }
}
