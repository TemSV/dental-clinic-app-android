package com.flower_tech.main.doctor.profile.edit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.structures.Education

class EditProfileAdapter(private val educations: MutableList<Education>) :
    RecyclerView.Adapter<EditProfileAdapter.EducationInfoItemViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = EducationInfoItemViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_edit_education, null)
    )

    override fun onBindViewHolder(
        holder: EducationInfoItemViewHolder,
        position: Int
    ) {
        val currentItem = if (educations.size > position) {
            educations[position]
        } else {
            Education()
        }
        holder.bind(currentItem)
    }

    override fun getItemCount() = educations.size + 1

    class EducationInfoItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val documentName = view.findViewById<TextView>(R.id.education_document_name)
        private val specialization = view.findViewById<TextView>(R.id.specialization_input)
        private val educationalInstitution =
            view.findViewById<TextView>(R.id.educational_institution_input)

        fun bind(item: Education) {
            documentName.text = item.file
            specialization.text = item.specialization
            educationalInstitution.text = item.educationalInstitution
        }
    }

}