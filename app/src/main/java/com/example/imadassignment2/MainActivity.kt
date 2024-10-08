package com.example.imadassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn=findViewById<Button>(R.id.startBtn)
        //code for linking the two activities
        startBtn.setOnCreateListener{
            startActivitity(intent)

            //fucction for changing the images when buttons are clicked private fun animalImageChange(imageView: ImageView,newImageView:Int){
            animation.duration=500
            animation.fillafter=true
            imageView.startAnimation(animation)
            imageView.setImageResource(newImageResource)

            //Pet attributes
            private var petHealth=100
            private var petHunger=50
            private var petCleanliness=50
            private var petHappiness=50

            //Constants for attribute change
            private val hungerChange=10
            private val cleanLinessChange=10
            private val healthChange=10
            private val hungerAfterPlay=5
            private val  cleanLinessAfterplay=-5
            private val happinessChanges=10

            //Declaring variables
            val feedBtn=findViewById<Button>(R.id.feed_Btn)
            val cleaBtn=findViewById<Button>(R.id.clean_Btn)
            val playBtn=findViewById<Button>(R.id.play_Btn)
            val hungeryEditTxt=findViewById<EditText>(R.id.hungry_edit_txt)
            val cleanEditTxt=findViewById<EditText>(R.id.clean_edit_txt)
            val happyEditTxt=findViewById<EditText>(R.id.happy_edit_txt)
            val petImage=findViewBy<ImageView>(R.id.pet_image)

            //Display intial values
            hungry EditTxt.setText(petHunger.toString())
            cleanEditTxt=setText(petCleanliness.toString())
            happyEditTxt.setText(petCleanliness.toString())

            // code for what must happen when the feed buttonis clicked feedBtn.setOnClickListener{
            petHunger +=hungerChange
            petHealth +=healthChange
            //Ensure attributesstay within bounds
            petHunger =petHunger.coerceIn(0,100)
            petHealth=petHealth.coerceIn(0,100)
            petCleanliness=petCleanliness.coerceIn(0,100)
            hungryEditTxt.setText(petHunger.toString())
            cleanEditTxt.setText(petCleanliness.toString)
            animatedImageChange(petimage, R.drawable.eating_pet)


    }
        //code for what happens when the clean button is clicked cleanBtn.setOnClick{
        petCleanliness += cleanlinessChange
        petHealth +=healthChanges

        //Ensure attributesstay within bounds
        petCleanliness =petCleanliness.coerceIn(0,100)
        petHealth = petHealth.coerceIn(0,100)
        cleanEditTxt.setText(petCleanLiness.toString())
        animaltedImageChange(petImage, R.drawable.clean_pet)

    }

    //code for what happens when the play button is clicked playBtn.setOnClicklister{
    petHunger -=hungerAfterPlay
    petCleanliness += cleanlinessafterPlay
    petHappiness +=happinessChange
    petHealth +=healthChange
    //Ensure attributes stay within bounds
    pethealth= petHealth. coerceIn(0,100)
    petHunger = petHunger.coerce(0,100)
    petCleans=petCleanliness. coerce(0,100)
    petHapppiness= petHappiness. coerce(0,100)
    happyEditTxt.set(pethappiness.toString())
    hungryEditTxt.setText(petHunger.toString())
    cleanEditTxt.set

    private fun startActivitity(intent: Intent?) {

    }
}

private fun Any.setOnCreateListener(function: () -> Unit) {

}


}
