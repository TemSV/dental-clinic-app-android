package com.flower_tech.main.doctor.chats

import androidx.annotation.DrawableRes

data class ChatCard (
    @DrawableRes val patientIcon: Int,
    val patientName: String,
    val text: String,
    val date: String,
)
