package com.yongjincompany.app.view

import android.content.Intent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.MainActivity
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityIntroBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroActivity : BaseActivity<ActivityIntroBinding>(
    R.layout.activity_intro
) {
    override fun initView() {
        val fadeInAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val fadeInAnim2 = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val fadeOutAnim2 = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        fadeInAnim2.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

                binding.tvIntroduce.visibility = View.VISIBLE
                binding.ivTop.visibility = View.VISIBLE
                binding.tvFooter.visibility = View.VISIBLE


            }

            override fun onAnimationEnd(p0: Animation?) {
                Thread.sleep(1000)
                binding.tvIntroduce.startAnimation(fadeOutAnim2)
                binding.ivTop.startAnimation(fadeOutAnim2)
                binding.tvFooter.startAnimation(fadeOutAnim2)
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }
        })
        fadeOutAnim2.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                binding.tvIntroduce.visibility = View.INVISIBLE
                binding.ivTop.visibility = View.INVISIBLE
                binding.tvFooter.visibility = View.INVISIBLE
                Thread.sleep(500)

                val intent = Intent(this@IntroActivity , MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }
        })

        fadeInAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(anim: Animation?) {
            }

            override fun onAnimationEnd(anim: Animation?) {
                Thread.sleep(1000)
                val fadeOutAnim = AnimationUtils.loadAnimation(this@IntroActivity, R.anim.fade_out)
                fadeOutAnim.setAnimationListener(object : Animation.AnimationListener{
                    override fun onAnimationStart(p0: Animation?) {}

                    override fun onAnimationEnd(p0: Animation?) {
                        binding.ivTitle.visibility = View.INVISIBLE
                        binding.tvSub.visibility = View.INVISIBLE
                        Thread.sleep(500)
                        binding.tvIntroduce.startAnimation(fadeInAnim2)
                        binding.ivTop.startAnimation(fadeInAnim2)
                        binding.tvFooter.startAnimation(fadeInAnim2)
                    }

                    override fun onAnimationRepeat(p0: Animation?) {
                        TODO("Not yet implemented")
                    }
                })

                binding.ivTitle.startAnimation(fadeOutAnim)
                binding.tvSub.startAnimation(fadeOutAnim)

            }

            override fun onAnimationStart(p0: Animation?) {
            }
        })
        binding.ivTitle.startAnimation(fadeInAnim)
        binding.tvSub.startAnimation(fadeInAnim)
    }



}
