package com.achirkof.movieapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.achirkof.movieapp.R
import com.achirkof.movieapp.domain.entity.Movie

class MovieDetails : Fragment() {

    companion object {
        fun newInstance(movie: Movie): MovieDetails {
            return MovieDetails()
        }
    }

    private lateinit var movie: Movie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fmt_movie_details, container, false)
    }
}