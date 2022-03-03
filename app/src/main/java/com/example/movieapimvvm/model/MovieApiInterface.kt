package com.example.movieapimvvm.model

import retrofit2.Response
import retrofit2.http.GET

interface MovieApiInterface {

        @GET("movie/popular?api_key=09963e300150f9831c46a1828a82a984&language=en-US")
        suspend fun getAllMovies(): Response<MovieResponse>

}