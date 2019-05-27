package com.example.fluidanimation.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.example.fluidanimation.R
import com.example.fluidanimation.Views.LinearVertView
import kotlinx.android.synthetic.main.activity_linearvert.*

class LinearVertActivity : AppCompatActivity() {

    private lateinit var mLinearVertView: LinearVertView

    private var isFabMenuOpen: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mLinearVertView = LinearVertView(layoutInflater)
        setContentView(mLinearVertView.getRooView())
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Linear FAB Menu"
        supportActionBar?.setHomeButtonEnabled(true)


        val fab_menu_close = AnimationUtils.loadAnimation(this, R.anim.fab_menu_close2)
        val fab_menu_open = AnimationUtils.loadAnimation(this, R.anim.fab_menu_open2)


        fab_menu.setOnClickListener {
            if (isFabMenuOpen) {
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
            } else {
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
