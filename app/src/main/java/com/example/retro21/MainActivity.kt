package com.example.retro21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.retro21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btnStart.setOnClickListener {
            mViewModel.getNumberDescription()
            binding.tvResult.text =
                mViewModel.liveNumberDescription.value?.body()?.numberDescription ?: "no data"
        }
    }
}