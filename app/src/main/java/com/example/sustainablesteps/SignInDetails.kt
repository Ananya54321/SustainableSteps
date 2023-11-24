package com.example.sustainablesteps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sustainablesteps.databinding.ActivitySignInDetailsBinding

class SignInDetails : AppCompatActivity() {

    private val binding : ActivitySignInDetailsBinding by lazy {
        ActivitySignInDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.saveAndNextButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}