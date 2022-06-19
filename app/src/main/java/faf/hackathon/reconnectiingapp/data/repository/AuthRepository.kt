package faf.hackathon.reconnectiingapp.data.repository

import faf.hackathon.reconnectiingapp.data.api.AuthApiService
import faf.hackathon.reconnectiingapp.data.model.RegistrationPost
import faf.hackathon.reconnectiingapp.data.model.ResponseUsers
import faf.hackathon.reconnectiingapp.data.model.ResponseUsersItem
import faf.hackathon.reconnectiingapp.data.model.User
import faf.hackathon.reconnectiingapp.di.dispatchers.IoDispatcher
import faf.hackathon.reconnectiingapp.network.ApiCallHandler
import faf.hackathon.reconnectiingapp.network.Resource
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject


class AuthRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val defaultAppApi: AuthApiService,
    private val apiCallHandler: ApiCallHandler,
) : AppUser {

    override suspend fun signUp(authorization: RegistrationPost): Resource<Unit> =
        apiCallHandler.safeApiCall(ioDispatcher) { defaultAppApi.registerUser(authorization) }

    override suspend fun getUser(): Resource<User> {
        return apiCallHandler.safeApiCall(ioDispatcher) {
            defaultAppApi.getUser()
        }
    }

    override suspend fun getUsers(): Resource<ResponseUsers> {
        return apiCallHandler.safeApiCall(ioDispatcher) {
            defaultAppApi.getUsers()
        }
    }
}