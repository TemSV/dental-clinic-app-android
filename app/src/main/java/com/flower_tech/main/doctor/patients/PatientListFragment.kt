package com.flower_tech.main.doctor.patients

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.flower_tech.R
import com.flower_tech.databinding.FragmentPatientsBinding

class PatientListFragment : Fragment() {

    private lateinit var binding: FragmentPatientsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPatientsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.patientRecyclerView.adapter = PatientRecyclerViewAdapter(getPatientCards())
        binding.patientRecyclerView.layoutManager = LinearLayoutManager(this.context)
    }


    private fun getPatientCards(): ArrayList<PatientCard> {
        return arrayListOf(
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
            PatientCard(
                R.drawable.ic_empty_profile_pic,
                "Юлия Сергеевна\n" +
                        "Иванова",
            ),
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() = PatientListFragment()
    }
}
