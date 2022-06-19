package faf.hackathon.reconnectiingapp.data.api

import faf.hackathon.reconnectiingapp.data.model.RegistrationPost
import faf.hackathon.reconnectiingapp.data.model.ResponseUsers
import faf.hackathon.reconnectiingapp.data.model.ResponseUsersItem
import faf.hackathon.reconnectiingapp.data.model.User
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthApiService {

    @GET("get-user")
    suspend fun authoriseUser(
        @Query("") login: String,
        @Query("") password: String
    )

    @POST("add-user/")
    suspend fun registerUser(@Body body: RegistrationPost)

    @GET("/api/get-users/")
    suspend fun  getUsers(): ResponseUsers

    @GET("/api/get-user/1")
    suspend fun  getUser(): User
}