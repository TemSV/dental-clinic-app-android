package com.flower_tech.structures

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Event (
    val name: String,
    val date: String,
    val description: String
) : Parcelable
