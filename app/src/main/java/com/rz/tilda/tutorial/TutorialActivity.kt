package com.rz.tilda.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.rz.tilda.R
import kotlinx.android.synthetic.main.activity_tutorial.*

class TutorialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        val adapter = TutorialPagerAdapter(supportFragmentManager, this)

        tutorViewPager.adapter = adapter
        worm_dots_indicator.setViewPager(tutorViewPager)
    }
}
