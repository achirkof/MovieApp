package com.achirkof.movieapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.achirkof.movieapp.R
import com.achirkof.movieapp.domain.entity.Movie
import com.achirkof.movieapp.ui.fragments.MovieDetails
import com.achirkof.movieapp.ui.fragments.MovieList
import com.achirkof.movieapp.ui.fragments.MovieListListener

class MainActivity : AppCompatActivity(), MovieListListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                add(R.id.main_container, MovieList.newInstance())
                addToBackStack(null)
                commit()
            }
        }
    }

    override fun onMovieItemClick(movie: Movie) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_container, MovieDetails.newInstance(movie))
            addToBackStack(null)
            commit()
        }
    }
}