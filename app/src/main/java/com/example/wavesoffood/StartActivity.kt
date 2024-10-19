package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    // Initialize view binding using lazy initialization
    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using view binding
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for the nextButton
        binding.nextButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
