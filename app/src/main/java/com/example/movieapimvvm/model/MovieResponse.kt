package com.example.movieapimvvm.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class MovieResponse(movies: ArrayList<Movie>) {
        @SerializedName("results")
        @Expose
        var movies = ArrayList<Movie>()

        init {
            this.movies = movies
        }
    }
