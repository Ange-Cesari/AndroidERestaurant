package fr.isen.cesari.androiderestaurant.model

import java.io.Serializable

data class DishRequestResult(
    val data : List<Category>
) : Serializable
