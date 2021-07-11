package com.example.listitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listitems.databinding.ActivityMainBinding

import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.button.setOnClickListener {
                Snackbar.make( it, "Hello", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}