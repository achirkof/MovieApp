package com.achirkof.movieapp.ui.adapters

import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.achirkof.movieapp.R
import com.achirkof.movieapp.domain.entity.Movie

class MovieAdapter(
    private val movies: List<Movie>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val coverImage = view.findViewById<ImageView>(R.id.iv_movie_list_cover)
        private val title = view.findViewById<TextView>(R.id.tv_movie_list_title)
        private val reviews = view.findViewById<TextView>(R.id.tv_movie_list_reviews)
        private val genre = view.findViewById<TextView>(R.id.tv_movie_list_genre)
        private val duration = view.findViewById<TextView>(R.id.tv_movie_list_duration)

        fun bind(movie: Movie) {
            coverImage.setImageResource(movie.coverSmallImageId)
            title.text = movie.title
            reviews.text = movie.numberOfReviews.toString()
            genre.text = movie.genre.joinToString()
            duration.text = movie.durationInMinutes.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fmt_movie_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MovieViewHolder -> holder.bind(movies[position])
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}

class MovieItemDecorator(private val padding: Int): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.top = padding
        outRect.left = padding
        outRect.bottom = padding
        outRect.right = padding
    }
}