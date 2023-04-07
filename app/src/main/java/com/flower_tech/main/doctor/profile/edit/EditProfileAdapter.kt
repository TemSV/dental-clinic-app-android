package com.flower_tech.main.doctor.profile.edit

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.structures.Education

class EditProfileAdapter(
    private val educations: MutableList<Education>,
    private val context: Context
) :
    RecyclerView.Adapter<EditProfileAdapter.EducationInfoItemViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = EducationInfoItemViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_edit_education, null),
        context
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
        holder.bind(currentItem, position)
    }

    override fun getItemCount() = educations.size + 1

    class EducationInfoItemViewHolder(view: View, private val context: Context) :
        RecyclerView.ViewHolder(view) {
        private val counter = view.findViewById<TextView>(R.id.education_list_counter)
        private val documentName = view.findViewById<TextView>(R.id.education_document_name)
        private val specialization =
            view.findViewById<AutoCompleteTextView>(R.id.specialization_input)
        private val educationalInstitution =
            view.findViewById<AutoCompleteTextView>(R.id.educational_institution_input)
        private val yearsOfEducation = view.findViewById<EditText>(R.id.years_of_education_input)

        @SuppressLint("SetTextI18n")
        fun bind(item: Education, position: Int) {
            yearsOfEducation.setText(item.date)
            counter.text = (position + 1).toString()
            documentName.text = item.file
            educationalInstitution.setText(item.educationalInstitution)
            specialization.setText(item.specialization)
            specialization.setAdapter(
                ArrayAdapter(
                    context,
                    R.layout.item_autocomplete_list,
                    R.id.text_view_list_item,
                    getSpecializations()
                )
            )
            educationalInstitution.setAdapter(
                ArrayAdapter(
                    context,
                    R.layout.item_autocomplete_list,
                    R.id.text_view_list_item,
                    getEducationalInstitutions()
                )
            )
        }

        private fun getSpecializations(): MutableList<String> {
            return arrayListOf(
                "Стоматолог-терапевт",
                "Стоматолог-хирург",
                "Стоматолог-ортопед",
                "Стоматолог-парадонтолог",
                "Ортодонт",
            )
        }

        private fun getEducationalInstitutions(): List<String> {
            return arrayListOf(
                "Северо-Западный институт управления РАНХиГС",
                "Санкт-Петербургский государственный электротехнический университет «ЛЭТИ» им. В.И. Ульянова (Ленина)",
                "Санкт-Петербургский Гуманитарный университет профсоюзов",
                "Санкт-Петербургский государственный экономический университет",
                "Национальный исследовательский университет «Высшая школа экономики» — Санкт-Петербург",
                "Балтийский государственный технический университет «ВОЕНМЕХ» имени Д. Ф. Устинова",
                "Санкт-Петербургский Горный университет",
                "Государственный университет морского и речного флота имени адмирала С. О. Макарова",
            )
        }
    }

}