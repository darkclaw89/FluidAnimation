package com.example.fluidanimation.Views

import android.view.LayoutInflater
import android.view.View
import com.example.fluidanimation.R

class LinearHoriView(layoutInflater: LayoutInflater) : ViewInterface {

    private var mRootView = layoutInflater.inflate(R.layout.nav_drawer, null)

    override fun getRooView(): View {
        return mRootView
    }

}