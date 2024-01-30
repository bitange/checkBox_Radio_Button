package com.example.checkboxradiobutton


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question = findViewById<TextView>(R.id.tvQuestion)
        val foodGroup = findViewById<RadioGroup>(R.id.rgFood)
        val wali = findViewById<RadioButton>(R.id.rbWali)
        val ugali = findViewById<RadioButton>(R.id.rbUgali)
        val githeri = findViewById<RadioButton>(R.id.rbGitheri)
        val chapati = findViewById<RadioButton>(R.id.rbChapati)
        val matoke = findViewById<RadioButton>(R.id.rbMatoke)

        val maharagwe = findViewById<CheckBox>(R.id.cbMaharagwe)
        val dengu = findViewById<CheckBox>(R.id.cbDengu)
        val managu = findViewById<CheckBox>(R.id.cbManagu)
        val nyama = findViewById<CheckBox>(R.id.cbNyama)

        val orderButton = findViewById<Button>(R.id.btnButton)
        val displayTextView = findViewById<TextView>(R.id.tvDisplay)







        orderButton.setOnClickListener {


            // Get the ID of the checked radio button from the foodGroup RadioGroup
            val checkedFoodGroupButton = foodGroup.checkedRadioButtonId

            // Find the selected radio button using its ID
            val selectedCheckedRadioButton = findViewById<RadioButton>(checkedFoodGroupButton)

            // Check if selectedCheckedRadioButton is not null before accessing its text property
            val selectedFoodText = selectedCheckedRadioButton?.text ?: "No food selected"

            // This part of the code is checking the status of individual CheckBox views to determine whether certain toppings are selected.
            val isMaharagweChecked = maharagwe.isChecked
            val isDenguChecked = dengu.isChecked
            val isManaguChecked = managu.isChecked
            val isNyamaChecked = nyama.isChecked

            // Create a display string with the selected food and optional toppings
            val displayString = "You selected   \n${selectedFoodText}" +
                    (if (isMaharagweChecked) "\nMaharagwe" else "") +
                    (if (isDenguChecked) "\nDengu" else "") +
                    (if (isManaguChecked) "\nManagu" else "") +
                    (if (isNyamaChecked) "\nNyama" else " ")+
                    Toast.makeText(applicationContext,"success", Toast.LENGTH_LONG).show()

            // Set the display strin to the displayTextView
            displayTextView.text = displayString
        }


        }}














































                            // or


//        orderButton.setOnClickListener {
//            val checkedFoodRadioButtonId = foodGroup.checkedRadioButtonId
//            val selectedFood = findViewById<RadioButton>(checkedFoodRadioButtonId)
//
//            val checkboxes = listOf(maharagwe, dengu, managu, nyama)
//            val selectedItems = checkboxes
//                .filter { it.isChecked }
//                .joinToString("\n") { it.text.toString() }
//
//            val displayString = "You ordered:\n${selectedFood.text}" +
//                    if (selectedItems.isNotEmpty()) "\n$selectedItems" else ""
//
//            displayTextView.text = displayString
   //     }
//    }
//}//