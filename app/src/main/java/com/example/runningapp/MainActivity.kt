package com.example.runningapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.runningapp.ui.theme.RunningAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RunningAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize())
                { padding ->
                    Text(
                        text = "Hello World!",
                        modifier = Modifier.padding(padding)
                    )
                }
            }
        }
    }
}

