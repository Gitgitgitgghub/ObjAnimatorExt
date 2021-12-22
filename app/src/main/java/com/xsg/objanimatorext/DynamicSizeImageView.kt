package com.xsg.objanimatorext

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView

/**
 * Created by Brant on 2021/12/22.
 */
class DynamicSizeImageView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null)
    : androidx.appcompat.widget.AppCompatImageView(context, attrs) {



    fun setDynamicHeight(height :Int){
        layoutParams.height = height
        requestLayout()
    }

    //其實就是回傳既有的東西，可以不用實做
    fun getDynamicHeight() = layoutParams.height

    fun setDynamicWidth(width :Int){
        layoutParams.width = width
        requestLayout()
    }

    //其實就是回傳既有的東西，可以不用實做
    fun getDynamicWidth() = layoutParams.width
}