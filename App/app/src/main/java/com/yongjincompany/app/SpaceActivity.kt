package com.yongjincompany.app

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.bumptech.glide.Glide
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivitySpaceBinding

class SpaceActivity : BaseActivity<ActivitySpaceBinding>(
    R.layout.activity_space
) {
    override fun initView() {
        Glide.with(this).load(R.drawable.space).centerCrop().into(binding.ivSpace)
    }

    override fun initClickListener() {



        binding.ivMoon2.setOnClickListener {
            if (binding.ivNuguri.visibility == View.INVISIBLE) {
                with(AnimatorSet()) {
                    play(ObjectAnimator.ofFloat(binding.ivNuguri, View.TRANSLATION_Y, -300f))
                        .with(ObjectAnimator.ofFloat(binding.ivNuguri, View.ALPHA, 1f)).apply {
                            addListener(object : AnimatorListenerAdapter() {
                                override fun onAnimationStart(animation: Animator, isReverse: Boolean) {
                                    super.onAnimationStart(animation, isReverse)
                                    binding.ivNuguri.visibility = View.VISIBLE
                                }
                            })
                            start()
                        }
                }
            } else {
                with(AnimatorSet()) {
                    play(ObjectAnimator.ofFloat(binding.ivNuguri, View.TRANSLATION_Y, 0f))
                        .with(ObjectAnimator.ofFloat(binding.ivNuguri, View.ALPHA, 0f)).apply {
                            addListener(object : AnimatorListenerAdapter() {
                                override fun onAnimationEnd(animation: Animator?) {
                                    super.onAnimationEnd(animation)
                                    binding.ivNuguri.visibility = View.INVISIBLE
                                }
                            })
                            start()
                        }
                }
            }
        }
    }
}
