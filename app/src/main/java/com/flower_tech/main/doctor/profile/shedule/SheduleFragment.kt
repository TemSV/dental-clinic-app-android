package com.flower_tech.main.doctor.profile.shedule

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.children
import androidx.fragment.app.Fragment
import com.flower_tech.databinding.CalendarDayLayoutBinding
import com.flower_tech.databinding.SheduleFragmentBinding
import com.kizitonwose.calendar.core.*
import com.kizitonwose.calendar.view.MonthDayBinder
import com.kizitonwose.calendar.view.MonthHeaderFooterBinder
import com.kizitonwose.calendar.view.ViewContainer
import java.time.DayOfWeek
import java.time.YearMonth

class SheduleFragment : Fragment() {

    private lateinit var binding: SheduleFragmentBinding
    private val daysOfTheWeek = daysOfWeek(firstDayOfWeek = DayOfWeek.MONDAY)


    private val daysMap = mapOf(
        DayOfWeek.MONDAY to "Пн",
        DayOfWeek.TUESDAY to "Вт",
        DayOfWeek.WEDNESDAY to "Ср",
        DayOfWeek.THURSDAY to "Чт",
        DayOfWeek.FRIDAY to "Пт",
        DayOfWeek.SATURDAY to "Сб",
        DayOfWeek.SUNDAY to "Вс"
    )

    var monthNames = arrayOf(
        "Недрочабрь",
        "Январь",
        "Февраль",
        "Март",
        "Апрель",
        "Май",
        "Июнь",
        "Июль",
        "Август",
        "Сентябрь",
        "Октябрь",
        "Ноябрь",
        "Декабрь"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SheduleFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val currentMonth = YearMonth.now()
        val startMonth = currentMonth.minusMonths(100) // Adjust as needed
        val endMonth = currentMonth.plusMonths(100) // Adjust as needed
        binding.calendarView.setup(startMonth, endMonth, daysOfTheWeek.first())
        binding.calendarView.monthScrollListener = { updateTitle() }
        binding.calendarView.scrollToMonth(currentMonth)
        configureBinders()

        binding.titlesContainer.nextMonth.setOnClickListener {
            binding.calendarView.findFirstVisibleMonth()?.let {
                binding.calendarView.scrollToMonth(it.yearMonth.nextMonth)
            }
        }

        binding.titlesContainer.prevMonth.setOnClickListener {
            binding.calendarView.findFirstVisibleMonth()?.let {
                binding.calendarView.scrollToMonth(it.yearMonth.previousMonth)
            }
        }
    }

    private fun updateTitle() {
        val currentDate = binding.calendarView.findFirstVisibleMonth()?.yearMonth ?: return
        binding.titlesContainer.date.text = convertMonth(currentDate)
    }

    private fun convertMonth(date: YearMonth): String =
        "${monthNames[date.monthValue]} ${date.year}"

    private fun configureBinders() {

        class DayViewContainer(view: View) : ViewContainer(view) {
            lateinit var day: CalendarDay
            val textView = CalendarDayLayoutBinding.bind(view).calendarDayText

            init {
                view.setOnClickListener {
                    Log.d("day", day.toString())
                }
            }
        }

        binding.calendarView.dayBinder = object : MonthDayBinder<DayViewContainer> {
            override fun create(view: View): DayViewContainer {
                return DayViewContainer(view)
            }

            override fun bind(container: DayViewContainer, data: CalendarDay) {
                container.day = data
                container.textView.text = data.date.dayOfMonth.toString()
                if (data.position != DayPosition.MonthDate) {
                    container.textView.setTextColor(Color.WHITE)
                } else {
                    container.textView.setTextColor(Color.BLACK)
                }
            }
        }

        class MonthViewContainer(view: View) : ViewContainer(view) {
            val weekDaysContainer = view as ViewGroup;
            lateinit var currentMonth: CalendarMonth;
        }

        binding.calendarView.monthHeaderBinder =
            object :
                MonthHeaderFooterBinder<MonthViewContainer> {
                override fun create(view: View): MonthViewContainer {
                    return MonthViewContainer(view)
                }

                override fun bind(container: MonthViewContainer, data: CalendarMonth) {
                    container.currentMonth = data
                    if (container.weekDaysContainer.tag == null) {
                        Log.d("monthViewContainer", data.yearMonth.month.toString())
                        container.weekDaysContainer.tag = data.yearMonth
                        container.weekDaysContainer.children.map { it as TextView }
                            .forEachIndexed { index, textView ->
                                val dayOfWeek = daysOfTheWeek[index]
                                textView.text = daysMap[dayOfWeek]
                            }
                    }
                }
            }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SheduleFragment()
    }

}
