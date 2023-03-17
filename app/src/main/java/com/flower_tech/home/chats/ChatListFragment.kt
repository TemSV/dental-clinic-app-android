package com.flower_tech.home.chats

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.flower_tech.R

class ChatListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("hehe", "vsvsr")
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ChatListFragment()
    }
}
