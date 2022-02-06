package fr.isen.perucca.androiderestaurant


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import fr.isen.perucca.androiderestaurant.databinding.ActivityConnectionBinding

class ConnectionActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var binding: ActivityConnectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConnectionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        viewPager = binding.pager
        val buttonLogin = binding.buttonLogin
        val buttonRegister = binding.buttonRegister
        val pagerAdapter = ConnectionAdapter(this)
        viewPager.adapter = pagerAdapter

    }
}