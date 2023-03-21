package com.flower_tech.main.doctor.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.structures.Education

class ProfileInformationAdapter(private val education: List<Education>) : RecyclerView.Adapter<ProfileInformationAdapter.EducationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = EducationViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.education_item, null)
    )

    override fun getItemCount() = education.size

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        holder.bind(education[position])
    }

    class EducationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val degree: TextView = itemView.findViewById(R.id.degree)
        private val place: TextView = itemView.findViewById(R.id.educational_institution)
        private val date: TextView = itemView.findViewById(R.id.years)

        fun bind(element: Education) {
            degree.text = element.degree
            place.text = element.educationalInstitution
            date.text = element.date
        }
    }
}
