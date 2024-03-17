package ru.fundamental.android.learn.domain

import ru.fundamental.android.learn.R
import ru.fundamental.android.learn.data.models.Actor
import ru.fundamental.android.learn.data.models.Movie
import java.util.LinkedList

class MovieDataSource {
    fun getMovies(): LinkedList<Movie> {
        return LinkedList(
            listOf(
                Movie(
                    id = 1,
                    image = R.drawable.card_background,
                    title = "Avengers: Endgame",
                    genre = "Action, Adventure, Drama",
                    reviews = 250,
                    subhead = "3h 2min",
                    rating = 5.0,
                    ageLimit = "13+",
                    actors = listOf(
                        Actor(
                            avatar = R.drawable.downey,
                            name = "Robert\nDowney Jr."
                        ),
                        Actor(
                            avatar = R.drawable.evans,
                            name = "Chris\nEvans"
                        ),
                        Actor(
                            avatar = R.drawable.hemsworth,
                            name = "Mark\nRuffalo"
                        ),
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )
                    )
                ),
                Movie(
                    id = 2,
                    image = R.drawable.movie2,
                    title = "Joker",
                    genre = "Crime, Drama, Thriller",
                    reviews = 300,
                    subhead = "2h 2min",
                    rating = 4.0,
                    ageLimit = "18+",
                    actors = listOf(
                        Actor(
                            avatar = R.drawable.downey,
                            name = "Robert\nDowney Jr."
                        ),
                        Actor(
                            avatar = R.drawable.evans,
                            name = "Chris\nEvans"
                        ),
                        Actor(
                            avatar = R.drawable.hemsworth,
                            name = "Mark\nRuffalo"
                        ),
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        ),
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )
                        ,
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )
                        ,
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )
                        ,
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )
                        ,
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )

                    )
                ),
                Movie(
                    id = 3,
                    image = R.drawable.movie1,
                    title = "Inception",
                    genre = "Action, Adventure, Sci-Fi",
                    reviews = 200,
                    subhead = "2h 28min",
                    rating = 3.0,
                    ageLimit = "12+",
                    actors = listOf(
                        Actor(
                            avatar = R.drawable.downey,
                            name = "Robert\nDowney Jr."
                        ),
                        Actor(
                            avatar = R.drawable.evans,
                            name = "Chris\nEvans"
                        ),
                    )
                ),
                Movie(
                    id = 4,
                    image = R.drawable.movie3,
                    title = "Добрыня Никитич",
                    genre = "Cartoon",
                    reviews = 500,
                    subhead = "2h 28min",
                    rating = 3.0,
                    ageLimit = "99+",
                    actors = listOf(
                        Actor(
                            avatar = R.drawable.downey,
                            name = "Robert\nDowney Jr."
                        ),
                        Actor(
                            avatar = R.drawable.evans,
                            name = "Chris\nEvans"
                        ),
                        Actor(
                            avatar = R.drawable.ruffalo,
                            name = "Chris\nHemsworth"
                        )
                    )
                ),
            )
        )
    }
}