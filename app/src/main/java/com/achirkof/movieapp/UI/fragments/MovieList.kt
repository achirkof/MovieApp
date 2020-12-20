package com.achirkof.movieapp.ui.fragments

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.achirkof.movieapp.R
import com.achirkof.movieapp.data.repo.MoviesFixture
import com.achirkof.movieapp.ui.adapters.MovieAdapter
import com.achirkof.movieapp.ui.adapters.MovieItemDecorator

class MovieList : Fragment() {

    companion object {
        fun newInstance(): MovieList {
            return MovieList()
        }
    }

    private val movies = MoviesFixture.getMovies()
    private var numberOfColumns = 2

    private lateinit var recycler: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fmt_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler = view.findViewById(R.id.movies_recycler)
        initRecycler()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        val currentOrientation = resources.configuration.orientation
        numberOfColumns = if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            resources.getInteger(R.integer.grid_column_landscape)
        } else {
            resources.getInteger(R.integer.grid_column_portrait)
        }
    }

    private fun initRecycler() {
        recycler.apply {
            layoutManager = GridLayoutManager(context, numberOfColumns)
            adapter = MovieAdapter(movies)
            addItemDecoration(MovieItemDecorator(8))
        }
    }
}