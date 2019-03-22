package com.rz.tilda.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rz.tilda.CustomTabs
import com.rz.tilda.R
import com.rz.tilda.conversation.ConvoActivity
import com.rz.tilda.conversation.TutorialActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    lateinit var mPresenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title = "TSCDC UNPAD"

        mPresenter = MainPresenter(this)

        englishbanner.setOnClickListener{
            val isFirstRun = getSharedPreferences("PREF", MODE_PRIVATE)
                .getBoolean("isFirstRun", true)

            if(isFirstRun) {
//                startActivity(Intent(this, TutorialActivity::class.java))
                    CustomTabs.launch(this.applicationContext, getString(R.string.link))

            } else {
                startActivity(Intent(this, ConvoActivity::class.java))
            }
        }
    }
}
