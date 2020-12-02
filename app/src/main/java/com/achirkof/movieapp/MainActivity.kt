package com.achirkof.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.achirkof.movieapp.UI.MovieDetails
import com.achirkof.movieapp.UI.MovieList

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