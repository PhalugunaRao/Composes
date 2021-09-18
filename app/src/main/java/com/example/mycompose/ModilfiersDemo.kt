package com.example.mycompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

class ModilfiersDemo:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    //.width(300.dp)
                    //.requiredWidth(300.dp)
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .border(6.dp, Color.Red)
                    .padding(6.dp)
                    .border(6.dp,Color.Yellow)
                    .padding(6.dp)
                    .border(6.dp,Color.Blue)
                    .padding(6.dp)
                    .border(6.dp,Color.Black)
            ) {
                Text(
                    text = "Hello",
                    modifier = Modifier
                        .offset(50.dp,20.dp)

                )
                Text(text = "World")
            }

        }
    }
}