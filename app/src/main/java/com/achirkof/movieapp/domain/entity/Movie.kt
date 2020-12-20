package com.achirkof.movieapp.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val coverImageId: Int,
    val coverSmallImageId: Int,
    val title: String?,
    val pg: Int,
    val genre: List<String>,
    val rating: Double,
    val numberOfReviews: Int,
    val durationInMinutes: Int,
    val storyline: String?,
    val cast: List<Actor>,
    var isFavorite: Boolean
) : Parcelable