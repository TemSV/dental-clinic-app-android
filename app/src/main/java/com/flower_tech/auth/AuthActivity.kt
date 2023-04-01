package com.flower_tech.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.flower_tech.R
import com.flower_tech.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        setUpNavigationView()
    }
    private fun setUpNavigationView() {
        val navAuthFragment = supportFragmentManager.findFragmentById(R.id.AuthFragmentContainerView) as NavHostFragment
        navController = navAuthFragment.navController
    }
}