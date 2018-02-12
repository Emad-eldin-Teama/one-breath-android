package com.isscroberto.onebreath.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import com.isscroberto.onebreath.main.BreatheActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, BreatheActivity::class.java)
        startActivity(intent)
        finish()
    }
}
