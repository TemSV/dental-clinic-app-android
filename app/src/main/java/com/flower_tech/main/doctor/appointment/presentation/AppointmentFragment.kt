package com.flower_tech.main.doctor.appointment.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.flower_tech.R
import com.flower_tech.main.doctor.appointment.viewmodel.AppointmentViewModel

class AppointmentFragment : Fragment() {

    companion object {
        fun newInstance() = AppointmentFragment()
    }

    private lateinit var viewModel: AppointmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_appointment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AppointmentViewModel::class.java]
        // TODO: Use the ViewModel
    }

}