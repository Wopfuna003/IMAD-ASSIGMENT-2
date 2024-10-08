package com.example.imadassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class imadMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imad_main2)

        //function for changing the imagewhen the image when the buttons are clicked private fun animtedImageChange(imageView: ImageView, newImageResource: Int){
        val animation.duration=500
        animation.fillAfter=true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImgeResorce)
    }
}