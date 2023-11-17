package com.example.myfirstjetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstjetpackcomposeapp.ui.theme.MyFirstJetpackComposeAppTheme
import com.example.myfirstjetpackcomposeapp.ui.theme.Pink40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstJetpackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("John Bond")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Hello $name!",
            modifier = modifier.padding(top = 16.dp),
            fontSize = 50.sp,
            textDecoration = TextDecoration.Underline,
            fontFamily = FontFamily.Cursive,
            color = Color.Blue,
            fontWeight = FontWeight.Bold

        )
        Text(
            text = "Welcome home",
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
            color = Color.Red,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp
        )
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta,
                contentColor = Color.Yellow),
            shape = RoundedCornerShape(10.dp)
            ){
            Text(text = "Register")
        }
        var count by remember{ mutableStateOf(0) }

        Button(onClick = {
            count ++
        }) {
            Text(text = "Click me $count")
        }
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstJetpackComposeAppTheme {
        Greeting("John Bond")
    }
}

