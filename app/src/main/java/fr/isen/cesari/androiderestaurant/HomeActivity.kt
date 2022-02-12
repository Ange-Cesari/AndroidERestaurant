package fr.isen.cesari.androiderestaurant


import android.content.Intent
import android.os.Bundle
import fr.isen.cesari.androiderestaurant.databinding.ActivityHomeBinding

class HomeActivity : MenuActivity() {
    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homeButtonStarter.setOnClickListener {
            changeActivity(getString(R.string.starter))
        }

        binding.homeButtonMainDish.setOnClickListener {
            changeActivity(getString(R.string.mainDish))
        }

        binding.homeButtonDessert.setOnClickListener {
            changeActivity(getString(R.string.dessert))
        }

        binding.homeToMaps.setOnClickListener(){
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

    }

    private fun changeActivity(category : String) {
        val intent = Intent(this, CategoryActivity::class.java).apply {
            putExtra(getString(R.string.ExtraCategoryTitle), category)
        }
        startActivity(intent)
    }


}
