package com.flower_tech.main.doctor.profile.events

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter
import com.flower_tech.R
import com.flower_tech.structures.Event

class EventsAdapter(
    private val events: Map<String, List<Event>>,
    private val sectionNamesList: ArrayList<String> = ArrayList()
) : SectionedRecyclerViewAdapter<EventsAdapter.EventsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val layout = if (viewType == VIEW_TYPE_HEADER) {
            R.layout.item_event_date
        } else {
            R.layout.item_events
        }
        return EventsViewHolder(
            LayoutInflater.from(parent.context).inflate(layout, parent, false),
            viewType
        )
    }

    override fun getItemCount(section: Int) = events[sectionNamesList[section]]?.size ?: 0

    override fun getSectionCount() = sectionNamesList.size

    override fun onBindHeaderViewHolder(holder: EventsViewHolder, section: Int) {
        return holder.bindHeader(sectionNamesList[section])
    }

    override fun onBindViewHolder(
        holder: EventsViewHolder,
        section: Int,
        relativePosition: Int,
        absolutePosition: Int
    ) {
        val currentList = events[sectionNamesList[section]] ?: return
        return holder.bind(currentList[relativePosition])
    }

    class EventsViewHolder(itemView: View, private val type: Int) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(event: Event) {
            itemView.findViewById<TextView>(R.id.event_action).text = event.name
            itemView.findViewById<TextView>(R.id.event_date).text = event.date
            itemView.findViewById<TextView>(R.id.event_description).text = event.description
        }

        fun bindHeader(date: String) {
            itemView.findViewById<TextView>(R.id.event_date).text = date
        }
    }

}
