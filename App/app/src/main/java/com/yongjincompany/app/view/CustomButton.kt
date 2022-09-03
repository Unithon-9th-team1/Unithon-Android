package com.yongjincompany.app.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.getColorOrThrow
import androidx.core.content.res.getDrawableOrThrow
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
            setCustomBackground(typedArr.getDrawableOrThrow(R.styleable.Button_custom_background))
            setCustomColorText(typedArr.getColorOrThrow(R.styleable.Button_custom_color_text))
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

    fun setCustomBackground(@DrawableRes text_int: Drawable) {
        binding.view2.background = text_int
    }

    fun setCustomColorText(@ColorRes text_int: Int) {
        binding.tvSub.setTextColor(text_int)
        binding.tvMain.setTextColor(text_int)
    }
}
