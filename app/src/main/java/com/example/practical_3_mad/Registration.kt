package com.example.practical_3_mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practical_3_mad.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
//        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId){
                R.id.bottom_nav_login -> {
                    Intent(this, MainActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }

    }
}