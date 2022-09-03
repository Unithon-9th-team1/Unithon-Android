package com.yongjincompany.app.ui.memo

import android.net.Uri
import android.os.Bundle
import com.bumptech.glide.Glide
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.ActivityMemoBinding
import gun0912.tedimagepicker.builder.TedImagePicker

class MemoActivity: BaseActivity<ActivityMemoBinding>(
    R.layout.activity_memo
)  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun initView() {

    }
    private fun setNormalSingleButton() {
        binding.ivPicture.setOnClickListener {
            TedImagePicker.with(this)
                .start { uri -> showSingleImage(uri) }
        }
    }

    private fun showSingleImage(uri: Uri) {
        Glide.with(this).load(uri).into(binding.ivPicture)

    }
}