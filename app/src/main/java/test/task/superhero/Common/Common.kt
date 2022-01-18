package test.task.superhero.Common

import test.task.superhero.Interface.RetrofitServices
import test.task.superhero.Retrofit.RetrofitClient

object Common {
    val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    //val BASE_URL = "https://superheroapi.com/api/642003827235271/"
    val retrofitServices: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}