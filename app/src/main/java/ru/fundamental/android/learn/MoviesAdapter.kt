package ru.fundamental.android.learn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.fundamental.android.learn.data.models.Movie

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

}

class FilmsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image: ImageView = itemView.findViewById(R.id.header_image)
        private val genre: TextView = itemView.findViewById(R.id.genre)
        private val reviews: TextView = itemView.findViewById(R.id.reviews)
        private val title: TextView = itemView.findViewById(R.id.title)
        private val subhead: TextView = itemView.findViewById(R.id.subhead)

        fun onBind(movie: Movie) {
                itemView.apply {
                        title.text = movie.title
                        genre.text = movie.genre
                        reviews.text = resources.getString(R.string.review_count)
                        subhead.text = movie.subhead
                        image.setImageResource(movie.image)
                }
        }
}

private val RecyclerView.ViewHolder.context
        get() = this.itemView.context