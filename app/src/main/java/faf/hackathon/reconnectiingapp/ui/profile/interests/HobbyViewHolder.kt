package faf.hackathon.reconnectiingapp.ui.profile.interests

import androidx.recyclerview.widget.RecyclerView
import faf.hackathon.reconnectiingapp.databinding.ItemGameFragmentBinding


class HobbyViewHolder(
    private val binding: ItemGameFragmentBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBindTransaction(string: String) {
        binding.textHobbyTop.text = string
    }
}
