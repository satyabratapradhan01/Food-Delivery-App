package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivityStartBinding

class SignActivity : AppCompatActivity() {
    // Add necessary code for SignActivity if needed
}

class LoginActivity : AppCompatActivity() {
    private val binding: ActivityStartBinding by lazy {
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val intent = Intent(this, singupActivity::class.java)
            startActivity(intent)
        }
        binding.dontHaveButton.setOnClickListener {
            val intent = Intent(this, singupActivity::class.java)
            startActivity(intent)
        }
    }
}


