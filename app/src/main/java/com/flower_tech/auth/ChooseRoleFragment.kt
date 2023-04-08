package com.flower_tech.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.flower_tech.R
import com.flower_tech.databinding.FragmentChooseRoleBinding

class ChooseRoleFragment : Fragment() {
    private lateinit var binding: FragmentChooseRoleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseRoleBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            patientBtn.setOnClickListener{
                findNavController().navigate(R.id.action_fragment_choose_role_container_to_fragment_user_data_container)
            }
            doctorBtn.setOnClickListener{
                findNavController().navigate(R.id.action_fragment_choose_role_container_to_fragment_user_data_container)
            }
        }
    }
}
