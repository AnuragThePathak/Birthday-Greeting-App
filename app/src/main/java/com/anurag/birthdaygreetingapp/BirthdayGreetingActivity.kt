package com.anurag.birthdaygreetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anurag.birthdaygreetingapp.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name"
    }

    private lateinit var binding: ActivityBirthdayGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra(NAME_EXTRA)
        val greet = "Happy Birthday $name"
        binding.greetingMessage.text = greet
    }
}