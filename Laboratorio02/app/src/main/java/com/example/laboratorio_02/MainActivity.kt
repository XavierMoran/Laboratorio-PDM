package com.example.laboratorio_02

import android.os.Bundle
import android.system.Os.bind
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var actionCalculate: Button
    private lateinit var bmiTextView: TextView
    private lateinit var resultTextView: TextView
    private lateinit var infoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind();

        actionCalculate.setOnClickListener {
            var weight = weightEditText.text.toString()
            var height = heightEditText.text.toString()

            if (validateInput(weight, height)) {
                var result = calculateBMI(weight.toFloat(), height.toFloat())

                if (result < 18.5) {
                    bmiTextView.text = result.toString()
                    resultTextView.text = "Underweight"
                    resultTextView.setTextColor(getColor(R.color.under_weight))
                    infoTextView.text = "Be careful! You are underweigt"

                } else if (result >= 18.5 && result <= 24.99) {
                    bmiTextView.text = result.toString()
                    resultTextView.text = "Hewalty"
                    resultTextView.setTextColor(getColor(R.color.under_weight))
                    infoTextView.text = "Normal range is between 18.5 and 24.99"

                } else if (result >= 25 && result <= 24.99) {
                    bmiTextView.text = result.toString()
                    resultTextView.text = "overweight"
                    resultTextView.setTextColor(getColor(R.color.under_weight))
                    infoTextView.text = "Be careful with what you eat"

                } else {
                    bmiTextView.text = result.toString()
                    resultTextView.text = "Obese"
                    resultTextView.setTextColor(getColor(R.color.under_weight))
                    infoTextView.text = "You visit a doctor"
                }

            }
        }
    }

            private fun bind() {
                weightEditText = findViewById(R.id.weight_edit_text)
                heightEditText = findViewById(R.id.height_edit_text)
                actionCalculate = findViewById(R.id.action_calculate)
                bmiTextView = findViewById(R.id.bmi_textview)
                resultTextView = findViewById(R.id.result_textview)
                infoTextView = findViewById(R.id.info_textview)
            }

            private fun calculateBMI(weight: Float, height: Float): Float {
                return weight / ((height / 100) * (height / 100))
            }

            private fun validateInput(weight: String?, height: String?): Boolean {
                return when {
                    weight.isNullOrEmpty() -> {
                        Toast.makeText(this, "Wheight is empty", Toast.LENGTH_SHORT).show()
                        return false;
                    }
                    height.isNullOrEmpty() -> {
                        Toast.makeText(this, "Wheight is empty", Toast.LENGTH_SHORT).show()
                        return false;
                    }
                    else -> true
                }

            }

            private fun displayResult(bmi: Float) {
                bmiTextView.text = bmi.toString()
                infoTextView.text = ("Normal Range")

                var infoactionResult = " "
                var color = 0

                when {
                    bmi < 18.50 -> {
                        infoactionResult = "Under Weight"
                        color = R.color.under_weight
                    }
                    bmi in 18.50..24.99 -> {
                        infoactionResult = "Healthy"
                        color = R.color.normal_weight
                    }
                    bmi in 25.00..29.99 -> {
                        infoactionResult = "Over Weight"
                        color = R.color.over_weight
                    }
                    bmi > 29.99 -> {
                        infoactionResult = "Obese"
                        color = R.color.obese
                    }
                }
                resultTextView.setTextColor(ContextCompat.getColor(this, color))
                resultTextView.text = infoactionResult
            }
        }






