package com.example.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/* My name is Harshdeep Bedi and my student number is N01358063. I wrote the code because it was part of my practice lab,
I wrote this code on September 21 and this code should be using a checkbox where you can either agree to the terms and conditions
or disagree and it will show you a Toast with Agree or Not Agree.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // access checkbox using it's id
        val checkbox = findViewById<CheckBox>(R.id.checkBox)
        // add a listener to show a message when checked/unchecked checkbox is changed
        checkbox.setOnCheckedChangeListener { compoundButton, b ->

            if (checkbox.isChecked) {
                Toast.makeText(this, "Agree", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Not Agree", Toast.LENGTH_SHORT).show()
            }
        }
    }
}