package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rolldice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {
        var value = Random.nextInt(6)+1
        val drawableResource = when(value){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.randomNumberText.text = value.toString()
        binding.diceImage.setImageResource(drawableResource)
    }
}