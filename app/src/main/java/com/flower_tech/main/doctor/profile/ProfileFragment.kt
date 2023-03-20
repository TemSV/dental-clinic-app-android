package com.flower_tech.main.doctor.profile

import android.content.Context
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flower_tech.R
import com.flower_tech.databinding.FragmentProfileBinding
import com.flower_tech.structures.Event

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            setUpRecyclerView(eventsList)
            seeMoreEvents.text = underLineText(seeMoreEvents.text)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }

    private fun underLineText(text: CharSequence): SpannableString {
        val underlinedText = SpannableString(text)
        underlinedText.setSpan(UnderlineSpan(), 0, underlinedText.length, 0)
        return underlinedText
    }

    private fun setUpRecyclerView(eventsList: RecyclerView) {
        val manager = LinearLayoutManager(context)
        manager.orientation = RecyclerView.VERTICAL
        eventsList.apply {
            adapter = ProfileAdapter(getEvents())
            layoutManager = manager
            addItemDecoration(getRecyclerViewDivider(context))
        }
    }

    private fun getRecyclerViewDivider(context: Context): DividerItemDecoration {
        val decoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        decoration.setDrawable(
            ContextCompat.getDrawable(
                context,
                R.drawable.divider
            )!!
        )
        return decoration
    }

    private fun getEvents() = arrayListOf(
        Event(
            name = "Отзыв",
            date = "25.03.2023",
            description = "О вас оставлен новый отзыв"
        ),
        Event(
            name = "Отзыв",
            date = "12.03.2023",
            description = "О вас оставлен новый отзыв"
        ),
        Event(
            name = "Отзыв",
            date = "05.03.2023",
            description = "О вас оставлен новый отзыв"
        ),
        Event(
            name = "Отзыв",
            date = "25.12.2022",
            description = "О вас оставлен новый отзыв"
        )
    )
}
