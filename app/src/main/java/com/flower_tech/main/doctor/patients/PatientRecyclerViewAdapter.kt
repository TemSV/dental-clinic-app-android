package com.flower_tech.main.doctor.patients

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R

class PatientRecyclerViewAdapter(
    private val patientCards: ArrayList<PatientCard>
) : RecyclerView.Adapter<PatientRecyclerViewAdapter.PatientRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatientRecyclerViewHolder {
        return PatientRecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_patient_card, null, false)
        )
    }

    override fun getItemCount(): Int {
        return patientCards.size
    }

    override fun onBindViewHolder(holder: PatientRecyclerViewHolder, position: Int) {
        holder.bindPatientCard(patientCards[position])
    }

    class PatientRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val patientIcon: ImageView = itemView.findViewById(R.id.patient_icon_image_view)
        private val patientName: TextView = itemView.findViewById(R.id.patient_name_text_view)

        fun bindPatientCard(patientCard: PatientCard) {
            patientIcon.setImageResource(patientCard.patientIcon)
            patientName.text = patientCard.patientName
        }
    }

}