package com.flower_tech.main.doctor.appointment.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.databinding.FragmentAppointmentListBinding
import com.flower_tech.databinding.FragmentProfileInformationBinding
import com.flower_tech.main.doctor.appointment.adapter.AppointmentListAdapter
import com.flower_tech.main.doctor.appointment.viewmodel.AppointmentsViewModel
import com.flower_tech.main.doctor.profile.events.EventsAdapter
import com.flower_tech.main.doctor.profile.information.ProfileInformationAdapter
import com.flower_tech.structures.Appointment
import com.flower_tech.structures.Education
import com.flower_tech.structures.User
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import java.time.Month

class AppointmentListFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentListBinding

    companion object {
        fun newInstance() = AppointmentListFragment()
    }

    private lateinit var viewModel: AppointmentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAppointmentListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AppointmentsViewModel::class.java]
        with(binding) {
            appointmentList.apply {
                layoutManager = LinearLayoutManager(context)
                hasFixedSize()
                adapter = AppointmentListAdapter(getAppointment())
            }
            actualAppointment.setOnClickListener {
                appointmentList.apply {
                    adapter = AppointmentListAdapter(getAppointment())
                }
            }
            finishedAppointment.setOnClickListener {
                appointmentList.apply {
                    adapter = AppointmentListAdapter(getCompleteAppointment())
                }
            }
        }
    }

    private fun getAppointment(): List<Appointment> {
        return arrayListOf(
            Appointment(
                startTime = LocalTime(hour = 15, minute = 0),
                endTime = LocalTime(hour = 17, minute = 0),
                date = LocalDate(year = 2023, month = Month.APRIL, dayOfMonth = 9),
                patient = User(lastName = "Иванова", firstName = "Юлия", secondName = "Сергеевна"),
                doctor = User("", "", ""),
                address = "ул. Политехническая д. 29"
            ),
            Appointment(
                startTime = LocalTime(hour = 15, minute = 0),
                endTime = LocalTime(hour = 17, minute = 0),
                date = LocalDate(year = 2023, month = Month.APRIL, dayOfMonth = 9),
                patient = User(lastName = "Иванова", firstName = "Юлия", secondName = "Сергеевна"),
                doctor = User("", "", ""),
                address = "ул. Политехническая д. 29"
            ),
            Appointment(
                startTime = LocalTime(hour = 15, minute = 0),
                endTime = LocalTime(hour = 17, minute = 0),
                date = LocalDate(year = 2023, month = Month.APRIL, dayOfMonth = 9),
                patient = User(lastName = "Иванова", firstName = "Юлия", secondName = "Сергеевна"),
                doctor = User("", "", ""),
                address = "ул. Политехническая д. 29"
            ),
            Appointment(
                startTime = LocalTime(hour = 15, minute = 0),
                endTime = LocalTime(hour = 17, minute = 0),
                date = LocalDate(year = 2023, month = Month.APRIL, dayOfMonth = 9),
                patient = User(lastName = "Иванова", firstName = "Юлия", secondName = "Сергеевна"),
                doctor = User("", "", ""),
                address = "ул. Политехническая д. 29"
            )
        )
    }

    private fun getCompleteAppointment(): List<Appointment> {
        return arrayListOf(
            Appointment(
                startTime = LocalTime(hour = 15, minute = 0),
                endTime = LocalTime(hour = 17, minute = 0),
                date = LocalDate(year = 2023, month = Month.APRIL, dayOfMonth = 9),
                patient = User(lastName = "Иванова", firstName = "Юлия", secondName = "Сергеевна"),
                doctor = User("", "", ""),
                address = "ул. Политехническая д. 29"
            ),
            Appointment(
                startTime = LocalTime(hour = 15, minute = 0),
                endTime = LocalTime(hour = 17, minute = 0),
                date = LocalDate(year = 2023, month = Month.APRIL, dayOfMonth = 9),
                patient = User(lastName = "Иванова", firstName = "Юлия", secondName = "Сергеевна"),
                doctor = User("", "", ""),
                address = "ул. Политехническая д. 29"
            )
        )
    }

}