package com.example.umc_week6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_week6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.containerFragment.id, HomeFragment())
            .commitAllowingStateLoss()

        viewBinding.naviBottom.run {
            setOnItemSelectedListener {
                when (it.itemId) { //item id에 따라 어떠한 동작을 하겠다
                    R.id.menu_home->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_setting->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, SettingFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_text->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, TextFragment())
                            .commitAllowingStateLoss()
                    }

                }
                true
            }
            selectedItemId = R.id.menu_home //처음 실행할때 menu_home을 가리킴
        }
    }
}