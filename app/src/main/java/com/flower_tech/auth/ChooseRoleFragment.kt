package com.flower_tech.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.flower_tech.R

class ChooseRoleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_role, container, false)
        val patientButton = view.findViewById<Button>(R.id.patientButton)
        patientButton.setOnClickListener{
            findNavController().navigate(R.id.action_chooseRoleFragment_to_signInFragment)
        }
        val doctorButton = view.findViewById<Button>(R.id.doctorButton)
        doctorButton.setOnClickListener{
            findNavController().navigate(R.id.action_chooseRoleFragment_to_signInFragment)
        }
        return view
    }
}