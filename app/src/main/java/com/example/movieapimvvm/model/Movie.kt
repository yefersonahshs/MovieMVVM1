package com.example.movieapimvvm.model

import com.google.gson.annotations.SerializedName

data class Movie (@SerializedName("original_title")val name:String) {
}