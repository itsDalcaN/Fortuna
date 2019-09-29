package com.example.fortunaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        var p1SpaceCount: Int = 50
        val maxP1SpaceCount: Int = 50

        var p2SpaceCount: Int = 50
        val maxP2SpaceCount: Int = 50

        // Get All View Reference
        val p1TextView: TextView = findViewById(R.id.p1_space_count)
        val p2TextView: TextView = findViewById(R.id.p2_space_count)

        val p1Button: Button = findViewById(R.id.p1Button)
        val p2Button: Button = findViewById(R.id.p2Button)

        // Initial Displays
        p1TextView.text = p1SpaceCount.toString() + "/" + maxP1SpaceCount.toString()
        p2TextView.text = p2SpaceCount.toString() + "/" + maxP2SpaceCount.toString()


        // Button click listeners

        p1Button.setOnClickListener {
            if (p1SpaceCount > 0) {
                p1SpaceCount = p1SpaceCount - 1
            }

            p1TextView.text = p1SpaceCount.toString() + "/" + maxP1SpaceCount.toString()


        }

        p2Button.setOnClickListener {
            if (p2SpaceCount > 0) {
                p2SpaceCount = p2SpaceCount - 1
            }

            p2TextView.text = p2SpaceCount.toString() + "/" + maxP2SpaceCount.toString()
        }
    }
}
