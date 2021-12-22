package com.xsg.objanimatorext

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xsg.objanimatorext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.btnZoomIn.setOnClickListener(this)
        mainBinding.btnZoomOut.setOnClickListener(this)
        mainBinding.btnReset.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v){
            mainBinding.btnZoomIn -> zoomIn()
            mainBinding.btnZoomOut -> zoomOut()
            mainBinding.btnReset -> reset()
        }
    }

    @SuppressLint("ObjectAnimatorBinding")
    private fun zoomIn(){
        ObjectAnimator.ofInt(mainBinding.ivPic, "dynamicHeight", SizeUtil.parseDp2Px(300, this))
            .apply {
                duration = 1000
            }.start()
        ObjectAnimator.ofInt(mainBinding.ivPic,"dynamicWidth",SizeUtil.parseDp2Px(300,this))
            .apply {
                duration = 1000
            }.start()
    }

    @SuppressLint("ObjectAnimatorBinding")
    private fun zoomOut(){
        ObjectAnimator.ofInt(mainBinding.ivPic,"dynamicHeight",SizeUtil.parseDp2Px(75,this))
            .apply {
                duration = 1000
            }.start()
        ObjectAnimator.ofInt(mainBinding.ivPic,"dynamicWidth",SizeUtil.parseDp2Px(75,this))
            .apply {
                duration = 1000
            }.start()
    }

    @SuppressLint("ObjectAnimatorBinding")
    private fun reset(){
        ObjectAnimator.ofInt(mainBinding.ivPic,"dynamicHeight",SizeUtil.parseDp2Px(150,this))
            .apply {
                duration = 1000
            }.start()
        ObjectAnimator.ofInt(mainBinding.ivPic,"dynamicWidth",SizeUtil.parseDp2Px(150,this))
            .apply {
                duration = 1000
            }.start()
    }
}