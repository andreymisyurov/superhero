package test.task.superhero.Interface

import retrofit2.Call
import retrofit2.http.*
import test.task.superhero.Model.Movie

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>

}