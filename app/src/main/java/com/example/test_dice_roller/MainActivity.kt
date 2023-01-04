package com.example.test_dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_touch_to_roll_dice.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {
        val drawableResources = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        when (drawableResources) {
            R.drawable.dice_1 -> score_check.text = "You rolled 1"
            R.drawable.dice_2 -> score_check.text = "You rolled 2"
            R.drawable.dice_3 -> score_check.text = "You rolled 3"
            R.drawable.dice_4 -> score_check.text = "You rolled 4"
            R.drawable.dice_5 -> score_check.text = "You rolled 5"
            R.drawable.dice_6 -> score_check.text = "You rolled 6"
        }

        imageView.setImageResource(drawableResources)

    }
}