package com.flower_tech.structures

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Education(
    var degree: String = "",
    var educationalInstitution: String = "",
    var specialization: String = "",
    var file: String = "",
    var date: String = ""
) : Parcelable
