package com.example.imadassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//Pet attributes
        private var petHealth=100
        private var petHunger=50
        private var petCleanliness=50
        private var petHappiness=50

        //Constants for attributes changes
        private val hunderChanges=10
        private val cleanlinessChange=10
        private val healthchange=10
        private val hungerAfterPlay=5
        private val cleanlinessAfterPlay=-5
        private val happinessChange=10

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState:Bundle?){
            super.oncreate(savedInStanceState)
            setContentView(R.layout.activity_main2)

            //Declaring variables



        }

    }
}