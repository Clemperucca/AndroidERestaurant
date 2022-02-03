package fr.isen.perucca.androiderestaurant
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.isen.perucca.androiderestaurant.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val buttonEntries = binding.buttonStarters
        val buttonDishes = binding.buttonDishes
        val buttonDeserts = binding.buttonDesert


        buttonEntries.setOnClickListener {
            changeActivity(getString(R.string.home_starters))
        }
        buttonDishes.setOnClickListener {
            changeActivity(getString(R.string.home_dish))
        }
        buttonDeserts.setOnClickListener {
            changeActivity(getString(R.string.home_dessert))
        }

    }

    private fun changeActivity(category:String) {
        val changePage: Intent = Intent(this, DishesActivity::class.java)
        changePage.putExtra("category_type",category)
        Log.i("INFO","End of HomeActivity")
        startActivity(changePage)
    }
}


