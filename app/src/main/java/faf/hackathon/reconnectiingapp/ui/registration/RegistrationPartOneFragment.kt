package faf.hackathon.reconnectiingapp.ui.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import faf.hackathon.reconnectiingapp.R
import faf.hackathon.reconnectiingapp.databinding.FragmentRegistrationBinding

class RegistrationPartOneFragment : Fragment() {


    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnContinueBottom.setOnClickListener{
            doNext()
        }

    }

    fun doNext() {
        findNavController().navigate(R.id.action_registrationPartOneFragment_to_registrationPartTwo)
    }
}