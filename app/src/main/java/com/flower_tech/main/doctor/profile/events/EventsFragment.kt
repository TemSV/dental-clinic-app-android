package com.flower_tech.main.doctor.profile.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.flower_tech.R
import com.flower_tech.databinding.FragmentEventsBinding
import com.flower_tech.structures.Event

class EventsFragment : Fragment() {
    private lateinit var binding: FragmentEventsBinding
    private val sectionNamesList: ArrayList<String> = ArrayList()
    private val itemList: HashMap<String, List<Event>> = HashMap()

    init {
        sectionNamesList.add("Сегодня")
        sectionNamesList.add("Вчера")
        sectionNamesList.add("На этой неделе")
        sectionNamesList.add("В этом месяце")
        sectionNamesList.add("Ранее")

        itemList[sectionNamesList[0]] = getTodayEvents()
        itemList[sectionNamesList[1]] = getYesterdayEvents()
        itemList[sectionNamesList[2]] = getWeekEvents()
        itemList[sectionNamesList[2]] = getMonthEvents()
        itemList[sectionNamesList[4]] = getLastEvents()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEventsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpNavigation()
        binding.allEventsContainer.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = EventsAdapter(itemList, sectionNamesList)
        }
    }

    private fun setUpNavigation() {
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        binding.eventAppBar.setupWithNavController(navController, appBarConfiguration)
    }

    companion object {
        @JvmStatic
        fun newInstance() = EventsFragment()
    }

    private fun getTodayEvents() = arrayListOf(
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

    private fun getYesterdayEvents() = arrayListOf(
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

    private fun getWeekEvents() = arrayListOf(
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

    private fun getLastEvents() = arrayListOf(
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

    private fun getMonthEvents() = arrayListOf(
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