package com.example.wo_macro

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class user(
    val username:String,
    val password:String
): Parcelable
