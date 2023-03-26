package com.flower_tech.main.doctor.appointment.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.flower_tech.R
import com.flower_tech.main.doctor.appointment.viewmodel.PatientCardViewModel

class PatientCardFragment : Fragment() {

    companion object {
        fun newInstance() = PatientCardFragment()
    }

    private lateinit var viewModel: PatientCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_patient_card, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PatientCardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}