package com.example.mytwitter

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.mytwitter.databinding.IntroActivityBinding

class IntroActivity : AppCompatActivity() {

    private val binding get() = _binding!!
    private var _binding: IntroActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = IntroActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // set up the intro UI elements and animations

        Handler(Looper.getMainLooper()).postDelayed({
            // start the LoginActivity after a delay of 2 seconds
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}