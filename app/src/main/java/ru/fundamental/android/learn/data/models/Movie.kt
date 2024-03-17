package ru.fundamental.android.learn.data.models

import java.util.LinkedList
import android.os.Parcelable

data class Movie(
    val id: Int,
    val title: String,
    val image: Int,
    val genre: String,
    val ageLimit: String,
    val reviews: Int,
    val subhead: String,
    val rating: Double,
    val actors: List<Actor>
)