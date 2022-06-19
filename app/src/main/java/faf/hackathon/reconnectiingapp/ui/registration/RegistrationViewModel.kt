package faf.hackathon.reconnectiingapp.ui.registration

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import faf.hackathon.reconnectiingapp.data.model.RegistrationPost
import faf.hackathon.reconnectiingapp.data.repository.AuthRepository
import faf.hackathon.reconnectiingapp.network.Resource
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val authRepository: AuthRepository
): ViewModel() {
    private suspend fun signUp() {

        val test = RegistrationPost("name", "surName", "email", "21412412", "passsword")

        viewModelScope.run {
            val isReg = authRepository.signUp(test)

            if (isReg is Resource.Success) {
                Log.e("test", "successfully")
            } else {
                Log.e("test", "unsuccessfully")
            }
        }

    }
}