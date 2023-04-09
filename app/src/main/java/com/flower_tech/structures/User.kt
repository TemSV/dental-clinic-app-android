package com.flower_tech.structures

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val surname: String,
    val email: String,
    val phone: String
) : Parcelable
