package com.flower_tech.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flower_tech.R
import com.flower_tech.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        binding = ActivityAuthBinding.inflate(layoutInflater)
    }
}