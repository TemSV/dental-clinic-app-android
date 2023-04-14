package com.flower_tech.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.flower_tech.R
import com.flower_tech.databinding.FragmentUserDataBinding

class UserDataFragment : Fragment() {
    private lateinit var binding: FragmentUserDataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserDataBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnMale.isEnabled = true
            btnFemale.isEnabled = false
            btnFemale.setOnClickListener {
                btnFemale.isEnabled = false
                btnFemale.setTextColor(resources.getColor(R.color.white, null))
                btnMale.isEnabled = true
            }
            btnMale.setOnClickListener {
                btnFemale.isEnabled = true
                btnMale.isEnabled = false
            }
            btnSwitch.setOnClickListener {
                findNavController().navigate(R.id.action_fragment_user_data_container_to_fragment_account_registration_container)
            }
        }

    }
}
