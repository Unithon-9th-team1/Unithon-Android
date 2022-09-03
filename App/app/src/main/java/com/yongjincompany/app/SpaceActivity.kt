package com.yongjincompany.app

import com.bumptech.glide.Glide
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivitySpaceBinding

class SpaceActivity : BaseActivity<ActivitySpaceBinding>(
    R.layout.activity_space
) {
    override fun initView() {
        Glide.with(this).load(R.drawable.space).centerCrop().into(binding.ivSpace)

    }
}
