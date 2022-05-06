package edu.uw.ischool.talin16.activityspy

import android.os.Bundle
import android.util.EventLog
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        Log.e("Current", "going down,Captain!")
        super.onDestroy()
    }
}