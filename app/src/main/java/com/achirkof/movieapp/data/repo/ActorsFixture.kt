package com.achirkof.movieapp.data.repo

import com.achirkof.movieapp.R
import com.achirkof.movieapp.domain.entity.Actor

class ActorsFixture {

    companion object {
        fun getActors(): List<Actor> {
            return listOf(
                Actor(R.drawable.robert_downey_jr, "Robert", "Dawney Jr."),
                Actor(R.drawable.chris_hemsworth, "Chris", "Hemsworth"),
                Actor(R.drawable.chris_evans, "Chris", "Evans"),
                Actor(R.drawable.mark_ruffalo, "Mark", "Ruffalo")
            )
        }
    }
}