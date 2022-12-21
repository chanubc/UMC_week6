package com.example.umc_week6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc_week6.databinding.FragmentTextBinding
import com.google.android.material.tabs.TabLayoutMediator

class TextFragment : Fragment() {

    lateinit var viewBinding: FragmentTextBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentTextBinding.inflate(layoutInflater)

        val mainVPAdapter = MainVPAdapter(this)
        viewBinding.vpMain.adapter = mainVPAdapter //viewpager연동완료

        val tabTitleArray = arrayOf(
            "One",
            "Two",
            "Three",
        )

        TabLayoutMediator(viewBinding.tabMain,viewBinding.vpMain){tab,position->
            tab.text = tabTitleArray[position]
        }.attach()


        return viewBinding.root

    }


}