package com.flower_tech.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flower_tech.R
import com.flower_tech.databinding.ActivityMainBinding
import com.flower_tech.structures.MainNavigation

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        setUpNavigationView()
    }

    private fun setUpNavigationView() {
        val currentFragmentActivity = this
        with(mainBinding) {
            mainContent.apply {
                isUserInputEnabled = false // delete scroll
                adapter = MainPageAdapter(currentFragmentActivity, mainBottomNavView.menu.size())
            }
            mainBottomNavView.itemIconTintList = null // use active and inactive icon
            mainBottomNavView.setOnItemSelectedListener {

                when (it.itemId) {
                    R.id.home_nav -> {
                        mainContent.currentItem = MainNavigation.PROFILE.position
                        true
                    }
                    R.id.record_to_doctor_nav -> {
                        mainContent.currentItem = MainNavigation.TIMETABLE.position
                        true
                    }
                    R.id.patient_list_nav -> {
                        mainContent.currentItem = MainNavigation.PATIENTS.position
                        true
                    }
                    R.id.chat_nav -> {
                        mainContent.currentItem = MainNavigation.CHATS.position
                        true
                    }
                    else -> false
                }
            }
        }
    }
}
