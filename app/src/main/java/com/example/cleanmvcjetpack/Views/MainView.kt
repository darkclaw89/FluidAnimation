package com.example.cleanmvcjetpack.Views

import android.view.LayoutInflater
import android.view.View
import com.example.cleanmvcjetpack.R

class MainView(layoutInflater: LayoutInflater):ViewInterface{

    private var mRootView = layoutInflater.inflate(R.layout.activity_main,null)

    override fun getRooView(): View {
        return mRootView
    }



}