package com.flower_tech.structures

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Education(
    val degree: String,
    val educationalInstitution: String,
    val date: String
) : Parcelable
