package faf.hackathon.reconnectiingapp.data.repository

import faf.hackathon.reconnectiingapp.data.model.RegistrationPost
import faf.hackathon.reconnectiingapp.data.model.ResponseUsers
import faf.hackathon.reconnectiingapp.data.model.ResponseUsersItem
import faf.hackathon.reconnectiingapp.data.model.User
import faf.hackathon.reconnectiingapp.network.Resource

interface AppUser {

    suspend fun signUp(authorization: RegistrationPost): Resource<Unit>

    suspend fun getUsers(): Resource<ResponseUsers>

    suspend fun getUser(): Resource<User>

}