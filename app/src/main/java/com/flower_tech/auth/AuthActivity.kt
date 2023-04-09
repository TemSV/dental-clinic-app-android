package com.flower_tech.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.flower_tech.R
import com.flower_tech.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var authBinding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(authBinding.root)
        setUpNavigationView()
    }
    private fun setUpNavigationView() {
        val navAuthFragment = supportFragmentManager.findFragmentById(R.id.auth_fragment_container_view) as NavHostFragment
        navController = navAuthFragment.navController
    }
}
