package com.flower_tech.main.doctor.appointment.adapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.main.doctor.appointment.presentation.AppointmentFragment
import com.flower_tech.main.doctor.appointment.presentation.AppointmentListFragmentDirections
import com.flower_tech.structures.Appointment


class AppointmentListAdapter(private val appointment: List<Appointment>) :
    RecyclerView.Adapter<AppointmentListAdapter.AppointmentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AppointmentViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_appointment, parent, false)
    )

    override fun getItemCount() = appointment.size

    override fun onBindViewHolder(holder: AppointmentViewHolder, position: Int) {
        holder.bind(appointment[position])
        holder.itemView.setOnClickListener {
            val name = holder.getName().text.toString()
            val data = holder.getData().text.toString()
            val address = holder.getDt()
            val directions =
                AppointmentListFragmentDirections.actionFragmentAppointmentContainerToAppointmentFragment(
                    data, name, address
                )
            val navController = Navigation.findNavController(holder.itemView)
            navController.navigate(directions)
        }
    }

    class AppointmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.item_appointment_name_text)
        private val data: TextView = itemView.findViewById(R.id.item_appointment_time_text)
        private val address: TextView = itemView.findViewById(R.id.item_appointment_address_text)
        private var dt = ""

        @SuppressLint("SetTextI18n")
        fun bind(element: Appointment) {
            name.text = element.patient.lastName + " " +
                    element.patient.firstName + " " +
                    element.patient.secondName
            data.text = element.startTime.toString() + "-" +
                    element.endTime.toString()
            address.text = element.address
            dt = element.date.toString()
        }

        fun getName() = name
        fun getData() = data
        fun getAddress() = address
        fun getDt() = dt
    }
}