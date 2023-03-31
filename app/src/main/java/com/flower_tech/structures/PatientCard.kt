package com.flower_tech.structures

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class PatientCard(
    @DrawableRes
    val patientIcon: Int,
    val patientName: String,
): Parcelable
