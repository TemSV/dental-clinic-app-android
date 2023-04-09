package com.flower_tech.main.doctor.appointment.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.flower_tech.R
import com.flower_tech.databinding.FragmentAppointmentListBinding
import com.flower_tech.databinding.FragmentDentalFormulaBinding
import com.flower_tech.databinding.FragmentPatientCardBinding
import com.flower_tech.main.doctor.appointment.viewmodel.DentalFormulaViewModel

class DentalFormulaFragment : Fragment() {
    private lateinit var binding: FragmentDentalFormulaBinding

    companion object {
        fun newInstance() = DentalFormulaFragment()
    }

    private lateinit var viewModel: DentalFormulaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDentalFormulaBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[DentalFormulaViewModel::class.java]
        with(binding) {
            dentalFormulaAppBar.setNavigationOnClickListener {
                findNavController().navigate(R.id.action_dentalFormulaFragment_to_fragment_appointment_container)
            }
        }
    }

}