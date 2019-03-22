package com.rz.tilda.tutorial

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rz.tilda.CustomTabs

import com.rz.tilda.R
import kotlinx.android.synthetic.main.fragment_tutor_four.*

class TutorFourFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_tutor_four, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        startbtn.setOnClickListener{
            CustomTabs.launch(context!!, getString(R.string.link))
            activity?.finish()
        }
    }
}
