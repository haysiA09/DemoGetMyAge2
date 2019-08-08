package com.example.demogetmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGetAge
        buttonGetAge.setOnClickListener {
            val userDOB=editTextDOB.text.toString()
            if(userDOB.isNotEmpty()) {


                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                textViewShowAge.text = "Your age is $age"
                var output = ""
                //if statement
//                if(age<18){
//                    output="underage"
//                }else if(age in 18..65){
//                    output="Young people"
//                }else if(66 ..79{
//                    output="Middle-age"
//                }else if(age in 80..99){
//                    output="Elderly"
//                }else{
//                    output="Long-Lived elderly"
//                }

                //when statement
                when(age) {
                    in 0..17 -> output = "underage"
                    in 18..65 -> output = "young people"
                    in 66..79 -> output = "Middle -aged"
                    in 80..99 -> output = "Elderly"
                    else -> {
                        output = "long-lived elderly"
                    }
                }


                textViewShowAge.text = "Your age is $age \n $output"
            }else{
                Toast.makeText(this,"Please enter your birth year", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
