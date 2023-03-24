package com.flower_tech.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.flower_tech.main.doctor.appointment.AppointmentInformationFragment
import com.flower_tech.main.doctor.chats.ChatListFragment
import com.flower_tech.main.doctor.patients.PacientListFragment
import com.flower_tech.main.doctor.profile.EventsFragment
import com.flower_tech.main.doctor.profile.ProfileFragment
import com.flower_tech.main.doctor.profile.ProfileInformationFragment
import com.flower_tech.structures.MainNavigation

class MainPageAdapter(
    activity: FragmentActivity,
    private val itemCount: Int
) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = itemCount

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            MainNavigation.PATIENTS.position -> {
                PacientListFragment.newInstance()
            }

            MainNavigation.TIMETABLE.position -> {
                AppointmentInformationFragment.newInstance()
            }

            MainNavigation.CHATS.position -> {
                ChatListFragment.newInstance()
            }

            else -> {
                ProfileInformationFragment.newInstance()
            }
        }
    }
}
