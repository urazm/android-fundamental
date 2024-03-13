package ru.fundamental.android.learn.domain

import ru.fundamental.android.learn.R
import ru.fundamental.android.learn.data.models.Movie
import java.util.LinkedList

class MovieDataSource {
    fun getActors(): LinkedList<Movie> {
        return LinkedList(
            listOf(
                Movie(
                    image = R.drawable.card_background,
                    title = "Avengers: Endgame",
                    genre = "Action, Adventure, Drama",
                    reviews = 250,
                    subhead = "3h 2min",
                    rating = 5.0
                ),
                Movie(
                    image = R.drawable.movie2,
                    title = "Joker",
                    genre = "Crime, Drama, Thriller",
                    reviews = 300,
                    subhead = "2h 2min",
                    rating = 4.0
                ),
                Movie(
                    image = R.drawable.movie1,
                    title = "Inception",
                    genre = "Action, Adventure, Sci-Fi",
                    reviews = 200,
                    subhead = "2h 28min",
                    rating = 3.0
                ),
                Movie(
                    image = R.drawable.movie3,
                    title = "Добрыня никитич",
                    genre = "Жесткий дрифт",
                    reviews = 200,
                    subhead = "2h 28min",
                    rating = 3.0
                ),
            )
        )
    }
}