package com.flower_tech.main.doctor.profile.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.databinding.FragmentProfileInformationBinding
import com.flower_tech.structures.Education

class ProfileInformationFragment : Fragment() {
    private lateinit var binding: FragmentProfileInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileInformationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            setUpRecyclerView(educationContainer)
        }
    }

    private fun setUpRecyclerView(recyclerView: RecyclerView) {
        val manager = object : LinearLayoutManager(context) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
        recyclerView.apply {
            adapter = ProfileInformationAdapter(getEducation())
            layoutManager = manager
        }
    }

    private fun getEducation(): List<Education> {
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

    companion object {
        @JvmStatic
        fun newInstance() =
            ProfileInformationFragment()
    }


}