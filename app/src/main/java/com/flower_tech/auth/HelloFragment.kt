package com.flower_tech.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.flower_tech.R

class HelloFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hello, container, false)
        val entryButton = view.findViewById<Button>(R.id.EntryButton)
        entryButton.setOnClickListener{
            findNavController().navigate(R.id.action_helloFragment_to_logInFragment)
        }
        val registrationButton = view.findViewById<Button>(R.id.RegistrationButton)
        registrationButton.setOnClickListener{
            findNavController().navigate(R.id.action_helloFragment_to_chooseRoleFragment)
        }
        return view
    }
}