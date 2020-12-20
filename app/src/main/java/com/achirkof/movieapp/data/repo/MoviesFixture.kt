package com.achirkof.movieapp.data.repo

import com.achirkof.movieapp.R
import com.achirkof.movieapp.data.repo.ActorsFixture.Companion.getActors
import com.achirkof.movieapp.domain.entity.Movie

class MoviesFixture {

    companion object {
        fun getMovies(): List<Movie> {
            return listOf(
                Movie(
                    R.drawable.avengers_cover,
                    R.drawable.avengers_cover_small,
                    "Avengers: Endgame",
                    12,
                    listOf("Action", "Adventure", "Fantasy"),
                    4.35,
                    788,
                    181,
                    "After the devastating events of Avengers:" +
                            "Infinity War, the universe is in ruins. With the help of remaining allies," +
                            "the Avengers assemble once more in order to reverse Thanos'" +
                            "actions and restore balance to the universe.",
                    getActors(),
                    false,
                ),
                Movie(
                    R.drawable.tenet_cover,
                    R.drawable.tenet_cover_small,
                    "Tenet",
                    16,
                    listOf("Action", "Sci-Fi"),
                    4.75,
                    210,
                    150,
                    "Armed with only one word, Tenet, and fighting for the survival of the entire world," +
                            "a Protagonist journeys through a twilight world of international espionage on a mission" +
                            "that will unfold in something beyond real time.",
                    getActors(),
                    false,
                ),
                Movie(
                    R.drawable.monster_hunter_cover,
                    R.drawable.monster_hunter_cover_small,
                    "Monster Hunter",
                    12,
                    listOf("Action", "Adventure", "Fantasy"),
                    3.9,
                    160,
                    99,
                    "When Lt. Artemis and her loyal soldiers are transported to a new world," +
                            "they engage in a desperate battle for survival against enormous enemies" +
                            "with incredible powers. Feature film based on the video game by Capcom.",
                    getActors(),
                    false,
                )
            )
        }
    }
}