package com.example.resumescannerapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.resumescannerapp.databinding.ActivityCvBinding
import com.example.resumescannerapp.databinding.ActivityHomeBinding
import com.example.resumescannerapp.databinding.ActivityMainBinding
import com.example.resumescannerapp.databinding.ActivityCourseBinding

class CourseActivity : AppCompatActivity() {

    lateinit var binding: ActivityCourseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCourseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = binding.navbar

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.addcv -> {
                    val intent = Intent(this, CvActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.Course -> {
                    val intent = Intent(this, CourseActivity::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }
    }
}