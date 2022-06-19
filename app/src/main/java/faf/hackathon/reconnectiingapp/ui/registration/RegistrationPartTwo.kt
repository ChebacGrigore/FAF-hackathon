package faf.hackathon.reconnectiingapp.ui.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import faf.hackathon.reconnectiingapp.R
import faf.hackathon.reconnectiingapp.databinding.FragmentRegistrationPartTwoBinding


class RegistrationPartTwo : Fragment() {

    private lateinit var binding: FragmentRegistrationPartTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRegistrationPartTwoBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignInBottom.setOnClickListener {
            endRegistration()
        }
    }

    private fun endRegistration() {
        findNavController().navigate(R.id.action_registrationPartTwo_to_loginFragment)
    }
}