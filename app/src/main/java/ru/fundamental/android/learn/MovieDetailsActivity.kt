package ru.fundamental.android.learn

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.reflect.Type

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

//        val textView = findViewById<TextView>(R.id.age_limit)
//        val typeface = Typeface.createFromAsset(assets, "assets/Roboto-Light.ttf")
//        textView.typeface = typeface
    }
}