package com.flower_tech.main.doctor.appointment.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.flower_tech.R
import com.flower_tech.databinding.FragmentAppointmentListBinding
import com.flower_tech.databinding.FragmentPatientCardBinding
import com.flower_tech.main.doctor.appointment.viewmodel.PatientCardViewModel

class PatientCardFragment : Fragment() {
    private lateinit var binding: FragmentPatientCardBinding

    companion object {
        fun newInstance() = PatientCardFragment()
    }

    private lateinit var viewModel: PatientCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPatientCardBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatientCardViewModel::class.java)
        with(binding) {
            patientCardAppBar.setNavigationOnClickListener {
                findNavController().navigate(R.id.action_patientCardFragment_to_fragment_appointment_container)
            }
        }

    }

}