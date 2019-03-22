package com.rz.tilda.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rz.tilda.R

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title = "TSCDC UNPAD"


    }
}
