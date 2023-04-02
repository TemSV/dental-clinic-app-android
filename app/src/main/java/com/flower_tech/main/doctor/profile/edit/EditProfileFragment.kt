package com.flower_tech.main.doctor.profile.edit

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.databinding.FragmentEditProfileBinding
import com.flower_tech.structures.Education

class EditProfileFragment : Fragment() {
    private lateinit var binding: FragmentEditProfileBinding
    private val data: MutableList<Education> = getEducation()

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
            context?.let {
                cityInput.setAdapter(ArrayAdapter(it, R.layout.item_autocomplete_list, R.id.text_view_list_item, getCountries()))
                districtList.setAdapter(ArrayAdapter(it, R.layout.item_autocomplete_list, R.id.text_view_list_item, getSaintPetersburgCountries()))
                clinicAddressInput.setAdapter(ArrayAdapter(it, R.layout.item_autocomplete_list, R.id.text_view_list_item, getAddresses()))
            }
            personalDataBtn.setOnClickListener{
                val isShown = personalDataContainer.isVisible
                personalDataContainer.visibility = if (isShown) View.GONE else View.VISIBLE
            }
            educationDataBtn.setOnClickListener{
                val isShown = educationContainer.isVisible
                educationContainer.visibility = if (isShown) View.GONE else View.VISIBLE
            }
            documentsDataBtn.setOnClickListener{
                val isShown = documentsContainer.isVisible
                documentsContainer.visibility = if (isShown) View.GONE else View.VISIBLE
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
            adapter = EditProfileAdapter(data, context)
            layoutManager = LinearLayoutManager(context)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = EditProfileFragment()
    }

    private fun getAddresses() : MutableList<String> {
        return arrayListOf(
            "Политехническая 29",
            "Большой проспект Васильевского острова, 15",
            "улица Лизы Чайкиной, 19",
            "улица Ленина, 48"
        )
    }

    private fun getCountries(): MutableList<String>{
        return arrayListOf(
            "Санкт-Петербург",
            "Абакан",
            "Брянск",
            "Вологда",
            "Грозный",
            "Екатеринбург",
            "Ейск",
            "Кемерово",
            "Курск",
            "Комсомольск-на-Амуре",
        )
    }
    private fun getSaintPetersburgCountries(): MutableList<String>{
        return arrayListOf(
            "Адмиралтейский район",
            "Василеостровский район",
            "Выборгский район",
            "Калининский район",
            "Кировский район",
            "Колпинский район",
            "Колпинский район",
            "Красносельский район",
            "Кронштадтский район",
            "Курортный район",
            "Московский район",
            "Московский район",
            "Петроградский район",
            "Петродворцовый район",
            "Приморский район",
            "Пушкинский район",
            "Фрунзенский район",
            "Центральный район"
        )
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