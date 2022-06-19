package faf.hackathon.reconnectiingapp.ui.profile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import faf.hackathon.reconnectiingapp.data.model.PreferencesItem
import faf.hackathon.reconnectiingapp.databinding.FragmentProfileBinding
import faf.hackathon.reconnectiingapp.ui.login.LoginViewModel
import faf.hackathon.reconnectiingapp.ui.profile.interests.HobbyAdapter

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private val loginViewModel: ProfileViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.editTextContact.text = "Cristian"
        binding.editTextName.text = "Preguza"

        initAdapter()
    }


    private fun initAdapter() {

        val games = listOf("Dungeons & Dragon", "Chess", "Monopoly")

        binding.recyclerViewInterests.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = HobbyAdapter(games)
        }
    }


}