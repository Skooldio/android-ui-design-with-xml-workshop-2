package com.skooldio.android.designlayout.workshop2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.skooldio.android.designlayout.workshop2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = ReviewAdapter()
        binding.recyclerViewReview.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewReview.adapter = adapter
    }
}
