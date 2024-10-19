package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wavesoffood.databinding.ActivityLoginBinding
import com.example.wavesoffood.databinding.ActivityStartBinding

class LoginActivity : AppCompatActivity() {
    // Lazy initialization of the binding object
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Accessing views directly via binding
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
