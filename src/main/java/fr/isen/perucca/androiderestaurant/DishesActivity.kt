package fr.isen.perucca.androiderestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import fr.isen.perucca.androiderestaurant.databinding.ActivityDishesBinding

class DishesActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDishesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDishesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainDishTitle.text = intent.getStringExtra("category_type")
        binding.dishRecycleView.layoutManager= LinearLayoutManager(this)
        val data= ArrayList<String>()

        for(i in 1..20){
            data.add("Item"+ i )
        }
        val adapter = DishAdapter(data){
            val intent = Intent(this,DetailActivity :: class.java)
            startActivity(intent)
        }
        binding.dishRecycleView.adapter=adapter
    }
}