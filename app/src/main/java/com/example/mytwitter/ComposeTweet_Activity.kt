package com.example.mytwitter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mytwitter.databinding.ActivityComposeTweetBinding

class ComposeTweet_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityComposeTweetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbar
        val et_tweet_text = binding.etTweetText
        val btn_tweet = binding.btnTweet

        // Set toolbar as the action bar
        setSupportActionBar(toolbar)

        // Set the navigation icon listener
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        // Set the Tweet button click listener
        binding.btnTweet.setOnClickListener {
            // Get the tweet text
            val tweetText = binding.etTweetText.text.toString()

            // Post the tweet
            postTweet(tweetText)
        }
    }

    private fun postTweet(tweetText: String) {
        // TODO: Implement the logic to post the tweet

        // Display a toast message to confirm the tweet was posted
        Toast.makeText(this, "Tweet posted: $tweetText", Toast.LENGTH_SHORT).show()
    }
}