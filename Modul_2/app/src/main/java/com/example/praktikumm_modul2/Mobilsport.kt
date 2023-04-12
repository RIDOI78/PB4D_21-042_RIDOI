package com.example.praktikumm_modul2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mobilsport(
    val imgMobilsport: Int,
    val nameMobilsport: String,
    val descMobilsport: String
): Parcelable
