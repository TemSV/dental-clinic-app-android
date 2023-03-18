package com.flower_tech.main.doctor.patients

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.flower_tech.R

class PacientListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_patients, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = PacientListFragment()
    }
}
