package com.mangalism.dice

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_id)

        looging()

        button.setOnClickListener(View.OnClickListener { rollDice() })

    }

    private fun looging(){

        Log.i("TAG","information")
        Log.w("TAG","warning")
        Log.e("TAG","error")
        Log.d("TAG","debug")
        Log.wtf("TAG","a serious warning")

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceValue = dice.roll()
        val rollImage: ImageView = findViewById(R.id.image_id)

        val diceImageValue = when (diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        rollImage.setImageResource(diceImageValue)
        rollImage.contentDescription=diceImageValue.toString()


    }
}

class Dice(var numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}