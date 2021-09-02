package com.anurag.birthdaygreetingapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anurag.birthdaygreetingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    val view = binding.root
    fun createBirthCard(view: View) {
        val name = binding.personName.text.toString()
        Toast.makeText(this, "The name is $name", Toast.LENGTH_LONG).show()
    }
}