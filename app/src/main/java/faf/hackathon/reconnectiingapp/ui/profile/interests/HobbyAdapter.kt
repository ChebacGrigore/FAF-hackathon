package faf.hackathon.reconnectiingapp.ui.profile.interests

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import faf.hackathon.reconnectiingapp.R
import faf.hackathon.reconnectiingapp.data.model.PreferencesItem

class HobbyAdapter(
    private val list: List<String> = mutableListOf()
) : RecyclerView.Adapter<HobbyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {

        return HobbyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_game_fragment,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {

        holder.onBindTransaction(list[position])
    }

    override fun getItemCount(): Int = 3
}
