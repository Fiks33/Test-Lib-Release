package com.android.fik.libs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.fik.lib.toast.SimpleToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SimpleToast.longToast(applicationContext,12345)
    }
}
