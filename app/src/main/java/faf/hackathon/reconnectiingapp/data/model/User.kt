package faf.hackathon.reconnectiingapp.data.model

import com.google.gson.annotations.SerializedName

data class User(

    @field:SerializedName("preferences")
    val preferences: List<PreferencesItem?>? = null,

    @field:SerializedName("surname")
    val surname: String? = null,

    @field:SerializedName("facebook")
    val facebook: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("telephone")
    val telephone: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("email")
    val email: String? = null
)
