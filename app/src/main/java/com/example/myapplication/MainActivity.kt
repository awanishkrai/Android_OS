package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    EventRegistration()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun EventRegistration() {

    Column(


        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TechFest",
            modifier = Modifier.padding(50.dp)

        )
        Text(
            text = "Awanish Kumar Rai",
            modifier = Modifier.padding(20.dp)
        )
        Text(
            text = "12307068",
            modifier = Modifier.padding(20.dp)
        )
        OutlinedTextField(
            value = "Enter Date",
            onValueChange = {},
            modifier = Modifier.padding(20.dp)
        )
        OutlinedTextField(
            value = "Enter Event Catogory",
            onValueChange = {},
        )
        Button(onClick = {  }) {
            Text(text = "Register")
        }
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {

        EventRegistration()
    }
}
