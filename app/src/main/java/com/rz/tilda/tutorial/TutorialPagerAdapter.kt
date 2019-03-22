package com.rz.tilda.tutorial

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TutorialPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {

    private val PAGE_COUNT = 4 // Defining how many page in this chapter for the Viewpager

    // Defining which fragment at which page
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            TutorOneFragment()
        } else if (position == 1) {
            TutorTwoFragment()
        } else if (position == 2) {
            TutorThreeFragment()
        } else {
            TutorFourFragment()
        }
    }

    override fun getCount(): Int = PAGE_COUNT
}
