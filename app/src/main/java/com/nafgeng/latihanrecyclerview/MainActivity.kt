package com.nafgeng.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nafgeng.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val flowerList = DataSource(this).getFlowerList()
        binding.recyclerView.adapter = FlowerAdapter(flowerList)
    }
}