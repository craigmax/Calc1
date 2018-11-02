package com.example.max.calc1

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.security.KeyStore

// Main routine

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calc (view: View) {

        // Get the values of the text views.
        val first = num1.text.toString().toInt()
        val second = num2.text.toString().toInt()

        val result = first * second

        // Display the new value in the text view.
        resultView.text = result.toString()

    }

    fun reset (view: View) {
        //Clear values
        num1.text.clear()

        num2.text.clear()

        //reset to zero
        resultView.text = "0"

        //set focus to first input field
        num1.requestFocus()
    }

}
