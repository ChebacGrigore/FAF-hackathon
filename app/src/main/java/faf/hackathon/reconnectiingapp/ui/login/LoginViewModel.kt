package faf.hackathon.reconnectiingapp.ui.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import faf.hackathon.reconnectiingapp.data.model.ResponseUsers
import faf.hackathon.reconnectiingapp.data.model.User
import faf.hackathon.reconnectiingapp.data.repository.AuthRepository
import faf.hackathon.reconnectiingapp.network.Resource
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
): ViewModel() {

    private val _isReg = MutableLiveData<Boolean>()
    val isReg: LiveData<Boolean> = _isReg

    private val _users = MutableLiveData<ResponseUsers?>()
    val users: LiveData<ResponseUsers?> = _users

    fun getUsers() {
        viewModelScope.launch {
            val isLog = authRepository.getUsers()
            if (isLog is Resource.Success) {
                _users.value = isLog.value
                _isReg.value = true
                Log.e("test", "yes")
            } else {
                _isReg.value = false
                Log.e("test", isLog.toString())
            }
        }
    }

}