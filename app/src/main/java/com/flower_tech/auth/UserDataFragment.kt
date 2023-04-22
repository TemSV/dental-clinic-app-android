package com.flower_tech.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.flower_tech.R
import com.flower_tech.databinding.FragmentUserDataBinding
import com.google.android.material.color.MaterialColors


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
            btnSwitch.setOnClickListener {
                findNavController().navigate(R.id.action_fragment_user_data_container_to_fragment_account_registration_container)
            }
        }
        setUpAutoCompleteText()
        setUpGenderButton(view)
    }

    private fun setUpGenderButton(view: View) {
        with(binding) {
            btnFemale.isEnabled = true
            btnMale.isEnabled = false
            btnFemale.setTextColor(MaterialColors.getColor(view, R.attr.text_color_primary))
            btnMale.setTextColor(MaterialColors.getColor(view, R.attr.text_color_tertiary))
            btnFemale.setOnClickListener {
                btnFemale.isEnabled = false
                btnMale.isEnabled = true
                btnFemale.setTextColor(MaterialColors.getColor(view, R.attr.text_color_tertiary))
                btnMale.setTextColor(MaterialColors.getColor(view, R.attr.text_color_primary))
            }
            btnMale.setOnClickListener {
                btnFemale.isEnabled = true
                btnMale.isEnabled = false
                btnFemale.setTextColor(MaterialColors.getColor(view, R.attr.text_color_primary))
                btnMale.setTextColor(MaterialColors.getColor(view, R.attr.text_color_tertiary))
            }
        }
    }

    private fun setUpAutoCompleteText() {
        with(binding) {
            context?.let {
                editCityRegData.setAdapter(
                    ArrayAdapter(
                        it,
                        R.layout.item_autocomplete_list,
                        R.id.text_view_list_item,
                        getCountries()
                    )
                )
            }
        }
    }

    private fun getCountries(): MutableList<String> {
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
}
