package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                    CalculacorDeViagens()
            }
        }
    }
}

@Preview
@Composable
fun CalculacorDeViagens() {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QtdPassagens(
    passagenstrue: Int
):Double{
    var valorIda by remember { mutableStateOf("")}
    var valorVolta by remember { mutableStateOf("") }

    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        textAlign = TextAlign.Center,
        text = "Viagem",
        fontSize = 15.dp
    )

    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
            )
    {
        TextField(
            modifier = Modifier.width(150.dp),
             value = valorIda,
             onValueChange =(valorIda = it) ,
             label = {Text(text = "Valor de Ida")}
        )
    }
}

