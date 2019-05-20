package com.example.cleanmvcjetpack.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cleanmvcjetpack.R
import com.example.cleanmvcjetpack.Views.MainView

class MainActivity : AppCompatActivity() {

    private lateinit var mMainView:MainView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainView = MainView(layoutInflater)
        setContentView(mMainView.getRooView())
    }
}
