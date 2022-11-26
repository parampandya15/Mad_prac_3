package com.example.practical_3_mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practical_3_mad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
//        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

//        val signup = findViewById<TextView>(R.id.signup)

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId){
                R.id.bottom_nav_reg -> {
                    Intent(this,Registration::class.java).also{startActivity(it)}
                }

            }
            return@setOnItemSelectedListener true
        }



    }
}