package com.xsg.objanimatorext

import android.util.Log
import android.view.View

/**
 * Created by Brant on 2021/12/22.  行不通拉別用
 */
fun View.setDynamicHeight(height :Int){
    layoutParams.height = height
    requestLayout()
}

fun View.getDynamicHeight() = layoutParams.height

fun View.setDynamicWidth(width :Int){
    layoutParams.width = width
    requestLayout()
}

fun View.getDynamicWidth() = layoutParams.width