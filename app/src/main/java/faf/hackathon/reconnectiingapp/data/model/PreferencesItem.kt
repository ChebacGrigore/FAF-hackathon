package faf.hackathon.reconnectiingapp.data.model

import com.google.gson.annotations.SerializedName

data class PreferencesItem(

    @field:SerializedName("is_selected")
    val isSelected: Boolean? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
)