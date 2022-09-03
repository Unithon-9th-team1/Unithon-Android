package com.yongjincompany.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yongjincompany.app.databinding.FragmentMessageBinding
import com.yongjincompany.app.ui.base.BaseDialogFragment

class MessageFragment : BaseDialogFragment<FragmentMessageBinding>(R.layout.fragment_message) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun setBackgroundDialog() {
        super.setBackgroundDialog()
    }

    override fun setOkClickListener() {
        binding.btnOk.setOnClickListener {
        }
    }
}
