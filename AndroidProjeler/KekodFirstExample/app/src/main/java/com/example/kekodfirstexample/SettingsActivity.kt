package com.example.kekodfirstexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

class SettingsActivity : AppCompatActivity() {

    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //geriye gitme
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                counter++
                if (counter <= 1) {
                    Toast.makeText(this@SettingsActivity, "iki kere tıkla", Toast.LENGTH_LONG)
                        .show()
                    isEnabled = false
                }
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }


}

