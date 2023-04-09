package com.flower_tech.main.doctor.appointment.presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.flower_tech.databinding.FragmentDentalFormulaBinding
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
    }

}