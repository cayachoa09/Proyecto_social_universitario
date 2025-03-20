package com.safedoor.controlesdeacceso.asc_prueba_firebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Sección para el video: 80% de la pantalla
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(8f)
                .background(Color.Black),  // Placeholder para el video; en la integración real se reemplazará por el video en streaming
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Video en tiempo real", color = Color.White)
        }
        // Sección para Sensor 1: 10% de la pantalla
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Sensor 1: datos", color = Color.Black)
        }
        // Sección para Sensor 2: 10% de la pantalla
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Sensor 2: datos", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
