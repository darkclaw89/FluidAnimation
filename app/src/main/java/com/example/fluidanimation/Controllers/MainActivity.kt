package com.example.fluidanimation.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.example.fluidanimation.R
import com.example.fluidanimation.Views.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mMainView:MainView

    private var isFabMenuOpen:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainView = MainView(layoutInflater)
        setContentView(mMainView.getRooView())
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Linear FAB Menu"


        val fab_menu_close = AnimationUtils.loadAnimation(this, R.anim.fab_menu_close1)
        val fab_menu_open = AnimationUtils.loadAnimation(this, R.anim.fab_menu_open1)


        fab_menu.setOnClickListener {
            if(isFabMenuOpen){
                fab_item1.apply {
                    visibility = View.INVISIBLE
                    isClickable = false
                    startAnimation(fab_menu_close)
                }
                fab_item2.apply {
                    visibility = View.INVISIBLE
                    isClickable = false
                    startAnimation(fab_menu_close)
                }
                isFabMenuOpen = false
            }else{
                fab_item1.apply {
                    startAnimation(fab_menu_open)
                    visibility = View.VISIBLE
                    isClickable = true
                }
                fab_item2.apply {
                    startAnimation(fab_menu_open)
                    visibility = View.VISIBLE
                    isClickable = true
                }
                isFabMenuOpen = true
            }
        }
    }
}
