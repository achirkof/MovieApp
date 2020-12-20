package com.achirkof.movieapp.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Actor(
    val photoId: Int,
    val firstName: String?,
    val lastName: String?
) : Parcelable