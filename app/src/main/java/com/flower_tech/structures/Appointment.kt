package com.flower_tech.structures

import kotlinx.datetime.LocalTime
import kotlinx.datetime.LocalDate

data class Appointment(
    val startTime: LocalTime,
    val endTime: LocalTime,
    val date: LocalDate,
    val patient: User,
    val doctor: User,
    val address: String
)
