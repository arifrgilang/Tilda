package com.rz.tilda.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.rz.tilda.CustomTabs
import com.rz.tilda.R
import com.rz.tilda.conversation.ConvoActivity
import com.rz.tilda.tutorial.TutorialActivity
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
                startActivity(Intent(this, TutorialActivity::class.java))
//                    CustomTabs.launch(this.applicationContext, getString(R.string.link))
        }

        resultbanner.setOnClickListener{
            val builder = AlertDialog.Builder(this@MainActivity)

            // Set the alert dialog title
            builder.setTitle("Fitur belum terbuka")

            // Display a message on alert dialog
            builder.setMessage("Selesaikan '5 minute challenge' 10 kali lagi untuk membuka")

            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }
    }
}
