package fr.isen.cesari.androiderestaurant.model

import java.io.Serializable

data class DishBasket(
    val dish : Dish,
    var quantity : Int
) : Serializable
