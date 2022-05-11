package com.example.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.presentation.R

class AppInfoFragment : Fragment() {
    companion object {
        fun newInstance(): AppInfoFragment{
            val args = Bundle()
            val fragment = AppInfoFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.app_info_layout, container, false)
    }
}