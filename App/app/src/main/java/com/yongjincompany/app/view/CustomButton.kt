package com.yongjincompany.app.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.yongjincompany.app.R
import com.yongjincompany.app.databinding.CustomButtonMainBinding

class CustomButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding: CustomButtonMainBinding

    init {
        binding = CustomButtonMainBinding.inflate(LayoutInflater.from(context), this, true)

        attrs?.run {
            val typedArr = context.obtainStyledAttributes(attrs, R.styleable.Button)
            setMainText(typedArr.getString(R.styleable.Button_first_text) ?: "값없음")
            setSubText(typedArr.getString(R.styleable.Button_second_text) ?: "값없음")
            if (!isInEditMode) {
                typedArr.recycle()
            }
        }
    }

    fun setMainText(text_string: String) {
        binding.tvMain.text = text_string
    }

    fun setSubText(text_string: String) {
        binding.tvSub.text = text_string
    }
}
