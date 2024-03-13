package ru.fundamental.android.learn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fundamental.android.learn.data.models.Movie
import java.util.LinkedList

class MoviesAdapter: RecyclerView.Adapter<FilmsHolder>() {

        private var moviesList: List<Movie> = listOf()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsHolder {
                val view: View = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_movie, parent, false)
                return FilmsHolder(view)
        }

        override fun getItemCount(): Int = moviesList.size

        override fun onBindViewHolder(holder: FilmsHolder, position: Int) {
                holder.onBind(moviesList[position])
        }
        fun bindActors(newMovie: LinkedList<Movie>) {
                moviesList = newMovie
                notifyDataSetChanged()
        }

}

class FilmsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image: ImageView = itemView.findViewById(R.id.header_image)
        private val genre: TextView = itemView.findViewById(R.id.genre)
        private val reviews: TextView = itemView.findViewById(R.id.reviews)
        private val title: TextView = itemView.findViewById(R.id.title)
        private val subhead: TextView = itemView.findViewById(R.id.subhead)
        private val rating: RatingBar = itemView.findViewById(R.id.ratingBar)

        fun onBind(movie: Movie) {
                itemView.apply {
                        title.text = movie.title
                        genre.text = movie.genre
                        reviews.text = resources.getString(R.string.review_count)
                        subhead.text = movie.subhead
                        image.setImageResource(movie.image)
                        rating.rating = movie.rating.toFloat()
                }
        }
}

private val RecyclerView.ViewHolder.context
        get() = this.itemView.context