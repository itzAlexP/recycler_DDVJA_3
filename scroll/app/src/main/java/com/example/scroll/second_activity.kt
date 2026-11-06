package com.example.scroll

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import models.Character

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val characters = listOf(
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it),
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it),
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it),
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it),
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it),
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it),
            Character("Hate", "Is a hater, hate him", R.drawable.hate_it),
            Character("Love", "Is a good boy, love him", R.drawable.love_it)
        )
    }
}