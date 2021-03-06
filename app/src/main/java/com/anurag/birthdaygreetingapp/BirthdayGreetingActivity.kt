package com.anurag.birthdaygreetingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

//        Next lines can be added before setContentView as well but might not
//        be good
        val name = intent.getStringExtra(NAME_EXTRA)
        val greet = "Happy Birthday\n${name}!"
        binding.greetingMessage.text = greet
    }
}