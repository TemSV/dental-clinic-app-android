package com.flower_tech.main.doctor.profile.edit

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.databinding.FragmentEditProfileBinding
import com.flower_tech.structures.Education

class EditProfileFragment : Fragment() {
    private lateinit var binding: FragmentEditProfileBinding
    private val data: MutableList<Education> = ArrayList<Education>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditProfileBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            setUpRecyclerView(educationList)
            setUpAddButton(addDocumentBtn)
            profileEditAppBar.setNavigationOnClickListener {
                findNavController().navigate(R.id.action_fragment_edit_profile_container_to_fragment_profile_information_container)
            }
        }

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setUpAddButton(button: Button) {
        button.setOnClickListener {
            if (allIsRight()) {
                data.add(Education())
                binding.educationList.adapter?.notifyDataSetChanged()
            }
        }
    }

    private fun allIsRight(): Boolean {
        return isCorrectEducationalInstitution() && isCorrectSpecialization() && isCorrectEducationDocumentName()
    }

    private fun isCorrectEducationDocumentName(): Boolean {
        return true
    }

    private fun isCorrectSpecialization(): Boolean {
        return true
    }

    private fun isCorrectEducationalInstitution(): Boolean {
        return true
    }

    private fun setUpRecyclerView(recyclerView: RecyclerView) {
        recyclerView.apply {
            setHasFixedSize(true)
            isNestedScrollingEnabled = false
            adapter = EditProfileAdapter(data)
            layoutManager = LinearLayoutManager(context)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = EditProfileFragment()
    }

    private fun getEducation(): MutableList<Education> {
        return arrayListOf(
            Education(
                degree = "Бакалавриат",
                educationalInstitution = "Санкт-Петербургский политехнический университет Петра Великого (СПбПУ)",
                date = "2000-2010",
                specialization = "Bac"
            ),
            Education(
                degree = "Бакалавриат",
                educationalInstitution = "Санкт-Петербургский политехнический университет Петра Великого (СПбПУ)",
                date = "2000-2010",
                specialization = "Bac"
            ),
            Education(
                degree = "Бакалавриат",
                educationalInstitution = "Санкт-Петербургский политехнический университет Петра Великого (СПбПУ)",
                date = "2000-2010",
                specialization = "Bac"
            ),
            Education(
                degree = "Бакалавриат",
                educationalInstitution = "Санкт-Петербургский политехнический университет Петра Великого (СПбПУ)",
                date = "2000-2010",
                specialization = "Bac"
            )
        )
    }
}