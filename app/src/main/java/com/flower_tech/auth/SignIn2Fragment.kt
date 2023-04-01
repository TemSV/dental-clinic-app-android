package com.flower_tech.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.flower_tech.R

class SignIn2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_log_in, container, false)
        val entryButton = view.findViewById<Button>(R.id.EntryButtonToMainMenu)
        entryButton.setOnClickListener{
            findNavController().navigate(R.id.action_signIn2Fragment_to_mainActivity)
        }
        return view
    }
}