package com.wilsonevs.kmpcurso

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wilsonevs.kmpcurso.ui.theme.KMPCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KMPCursoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Log.d("start", "Bienvenido")
                    Greeting("Wilson", "Valencia S.")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, lastName: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name $lastName!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KMPCursoTheme {
        Greeting("Wilson", "Valencia")
    }
}