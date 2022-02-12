package fr.isen.cesari.androiderestaurant.model

import java.io.Serializable

data class LoginRequestResult(
    val data : User,
    val code : Number
) : Serializable
