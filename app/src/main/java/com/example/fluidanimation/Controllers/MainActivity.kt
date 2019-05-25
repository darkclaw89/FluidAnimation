package com.example.fluidanimation.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fluidanimation.Views.MainView

class MainActivity : AppCompatActivity() {

    private lateinit var mMainView:MainView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainView = MainView(layoutInflater)
        setContentView(mMainView.getRooView())
    }
}
