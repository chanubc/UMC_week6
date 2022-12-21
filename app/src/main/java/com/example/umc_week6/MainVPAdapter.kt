package com.example.umc_week6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.umc_week6_viewpager2.OneFragment
import com.example.umc_week6_viewpager2.ThreeFragment
import com.example.umc_week6_viewpager2.TwoFragment


class MainVPAdapter(fr: Fragment):FragmentStateAdapter(fr) {
    override fun getItemCount(): Int=3

    override fun createFragment(position: Int): Fragment { //포지션에 따라 어떤 프레그먼트를 보여줄것인지
        return when(position){
            0-> OneFragment()
            1-> TwoFragment()
            2-> ThreeFragment()
            else -> OneFragment()
        }
    }
}