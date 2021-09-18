package com.example.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class RowsColumnsActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            // Smooth scroll to specified pixels on first composition
            LaunchedEffect(Unit) { scrollState.animateScrollTo(10000) }
            Column(
                modifier = Modifier
                    .background(Color(0xFFEDEAE0))
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .verticalScroll(scrollState)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription ="",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop

                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            fontSize = 26.sp,
                            color = Color.Red

                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "800 Calories",
                        style = TextStyle(
                        fontSize = 17.sp,
                        color = Color.Green

                    ))
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "$5.99",
                        style = TextStyle(
                            fontSize = 17.sp,
                            color = Color(0xFF85bb65)

                        ))

                }
            }

        }
    }
}