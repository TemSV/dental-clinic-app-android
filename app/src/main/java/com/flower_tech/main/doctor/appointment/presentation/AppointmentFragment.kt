package com.flower_tech.main.doctor.appointment.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.flower_tech.R
import com.flower_tech.databinding.FragmentAppointmentBinding
import com.flower_tech.databinding.FragmentAppointmentListBinding
import com.flower_tech.main.doctor.appointment.viewmodel.AppointmentViewModel

class AppointmentFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentBinding

    private val args: AppointmentFragmentArgs by navArgs()

    companion object {
        fun newInstance() = AppointmentFragment()
    }

    private lateinit var viewModel: AppointmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppointmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AppointmentViewModel::class.java]

        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        binding.appointmentAppBar.setupWithNavController(navController, appBarConfiguration)

        with(binding) {
            appointmentTimeText.text = args.data
            appointmentNameText.text = args.name
            appointmentAppBar.title = args.time
        }
    }

}