package com.flower_tech.main.doctor.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.flower_tech.R
import com.flower_tech.databinding.FragmentChatListBinding
import com.flower_tech.main.doctor.patients.PatientRecyclerViewAdapter

class ChatListFragment : Fragment() {

    private lateinit var binding: FragmentChatListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.chatRecyclerView.adapter = ChatRecyclerViewAdapter(getChatCards())
        binding.chatRecyclerView.layoutManager = LinearLayoutManager(this.context)
    }

    private fun getChatCards(): ArrayList<ChatCard> {
        return arrayListOf(
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
            ChatCard(
                patientIcon = R.drawable.ic_empty_profile_pic,
                patientName = "Юлия Иванова",
                text = "текст сообщения текст текст сообщения текст текст сообщения текст текст сообщения текст ",
                date = "Вчера",
            ),
        )

    }

    companion object {
        @JvmStatic
        fun newInstance() = ChatListFragment()
    }
}
