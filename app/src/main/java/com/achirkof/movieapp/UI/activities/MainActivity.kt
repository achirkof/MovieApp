package com.achirkof.movieapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.achirkof.movieapp.R
import com.achirkof.movieapp.ui.fragments.MovieDetails
import com.achirkof.movieapp.ui.fragments.MovieList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, MovieList.newInstance())
                .commit()
        }
    }

    private fun onClick() {
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .add(R.id.movie_details, MovieDetails.newInstance())
            .commit()
    }
}