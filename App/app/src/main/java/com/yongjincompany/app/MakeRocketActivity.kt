package com.yongjincompany.app

import android.content.Intent
import android.provider.Settings.Secure
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.gun0912.tedpermission.provider.TedPermissionProvider.context
import com.semicolon.walkhub.ui.base.BaseActivity
import com.yongjincompany.app.databinding.ActivityMakeRocketBinding
import com.yongjincompany.app.repository.RocketRepository
import com.yongjincompany.app.viewmodel.rocket.RocketViewModel
import com.yongjincompany.app.viewmodel.rocket.RocketViewModelFactory
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MakeRocketActivity : BaseActivity<ActivityMakeRocketBinding>(
    R.layout.activity_make_rocket
) {
    private lateinit var viewModel: RocketViewModel
    private lateinit var myKey: String
    private var arrival: Int = 0
    override fun initView() {
        val android_id = Secure.getString(
            context.contentResolver,
            Secure.ANDROID_ID
        )

        myKey = android_id

        Log.d("tag", myKey)
        val repository = RocketRepository()
        val viewModelFactory = RocketViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(RocketViewModel::class.java)
    }

    override fun initClickListener() {
        binding.btnNext.setOnClickListener {
            when (binding.rgArrival.checkedRadioButtonId) {
                R.id.rb_3 -> arrival = 3
                R.id.rb_7 -> arrival = 7
                R.id.rb_31 -> arrival = 31
                else -> null
            }

            val intent = Intent(this@MakeRocketActivity, MakeRocketCompleteActivity::class.java)
            intent.putExtra("nickname", binding.etName.text.toString())
            intent.putExtra("arrival", arrival)
            intent.putExtra("rocket", binding.etRocket.text.toString())
            intent.putExtra("uuid", myKey)
            startActivity(intent)
            finish()
        }
    }
}
