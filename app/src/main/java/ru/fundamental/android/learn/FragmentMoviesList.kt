package ru.fundamental.android.learn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment() {

    private var movieCardView: CardView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()
        movieCardView = view.findViewById<CardView?>(R.id.movie_card).apply {
            setOnClickListener{
                activity.supportFragmentManager.beginTransaction()
                    .add(R.id.main_container, FragmentMoviesDetails())
                    .addToBackStack("movie_details")
                    .commit()
            }
        }
    }
}