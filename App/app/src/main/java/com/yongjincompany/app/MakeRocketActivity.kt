package com.yongjincompany.app

import android.content.Intent
import android.os.Build
import android.provider.Settings.Secure
import android.util.Log
import com.gun0912.tedpermission.provider.TedPermissionProvider.context
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityMakeRocketBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MakeRocketActivity : BaseActivity<ActivityMakeRocketBinding>(
    R.layout.activity_make_rocket
) {

    override fun initView() {
        val serial: String = Build.SERIAL
        val android_id = Secure.getString(
            context.contentResolver,
            Secure.ANDROID_ID
        )

        val myKey = android_id


        Log.d("tag", myKey)
    }

    override fun initClickListener() {
        binding.btnNext.setOnClickListener {
            val intent = Intent(this@MakeRocketActivity, MakeRocketCompleteActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
