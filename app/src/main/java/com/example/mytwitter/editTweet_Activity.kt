package com.example.mytwitter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mytwitter.databinding.ActivityComposeTweetBinding
import com.facebook.drawee.backends.pipeline.Fresco

class ComposeTweetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityComposeTweetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)

        binding = ActivityComposeTweetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }


    }
}





