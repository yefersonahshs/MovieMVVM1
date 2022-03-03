package com.example.movieapimvvm.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapimvvm.core.RetrofitClient.getRetrofit
import com.example.movieapimvvm.model.MovieApiInterface
import com.example.movieapimvvm.model.MovieResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {

    fun loadingMovie() {
        viewModelScope.launch{
            val call = getRetrofit().create(MovieApiInterface::class.java).getAllMovies()
            val bodyR = call.body() as MovieResponse
            if (call.isSuccessful) {


                val movie= bodyR.movies
                println(movie)
                println(call.body().toString())
                Log.d("MainViewModel", call.body().toString())

            } else {
                // error
            }

        }

    }
}