package ru.fundamental.android.learn.data.models

data class Movie(
    val image: Int,
    val title: String,
    val genre: String,
    val ageLimit: String,
    val reviews: Int,
    val subhead: String,
    val rating: Double,
)