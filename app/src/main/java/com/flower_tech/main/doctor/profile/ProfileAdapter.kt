package com.flower_tech.main.doctor.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.structures.Event

class ProfileAdapter(private val events: List<Event>) : RecyclerView.Adapter<ProfileAdapter.EventItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = EventItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.events_item, null)
        )

    override fun getItemCount() = events.size

    override fun onBindViewHolder(holder: EventItemViewHolder, position: Int) {
        holder.bind(events[position])
    }

    class EventItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val action: TextView = itemView.findViewById(R.id.event_action)
        private val date: TextView = itemView.findViewById(R.id.event_date)
        private val description: TextView = itemView.findViewById(R.id.event_description)

        fun bind(event: Event) {
            action.text = event.name
            date.text = event.date
            description.text = event.description
        }
    }
}