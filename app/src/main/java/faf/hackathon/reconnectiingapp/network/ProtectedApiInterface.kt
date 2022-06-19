package faf.hackathon.reconnectiingapp.network

import kotlinx.coroutines.CoroutineDispatcher

interface ProtectedApiInterface {
    suspend fun <T> safeApiCall(
        dispatcher: CoroutineDispatcher,
        apiCall: suspend () -> T
    ): Resource<T>
}