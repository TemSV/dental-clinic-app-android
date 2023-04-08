package com.flower_tech.main.doctor.chats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R

class ChatRecyclerViewAdapter(
    private val chatCards: ArrayList<ChatCard>
): RecyclerView.Adapter<ChatRecyclerViewAdapter.ChatRecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatRecyclerViewHolder {
        return ChatRecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_chat_card, null, false)
        )
    }

    override fun getItemCount(): Int {
        return chatCards.size
    }

    override fun onBindViewHolder(holder: ChatRecyclerViewHolder, position: Int) {
        holder.bindChatCard(chatCards[position])
    }

    class ChatRecyclerViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

        private val chatPatientIcon : ImageView = itemView.findViewById(R.id.chat_patient_icon_image_view)
        private val chatPatientName : TextView = itemView.findViewById(R.id.chat_patient_name_text_view)
        private val chatText : TextView = itemView.findViewById(R.id.chat_text_text_view)
        private val chatDate : TextView = itemView.findViewById(R.id.chat_date_text_view)

        fun bindChatCard(chatCard: ChatCard) {
            chatPatientIcon.setImageResource(chatCard.patientIcon)
            chatPatientName.text = chatCard.patientName
            chatText.text = chatCard.text
            chatDate.text = chatCard.date
        }
    }
}
