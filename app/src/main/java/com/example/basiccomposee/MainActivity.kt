package com.example.basiccomposee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposee.ui.theme.BasicComposeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposeeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingPreview(

                        elwin = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview(elwin: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "LOGIN", modifier = elwin,
            fontSize = 40.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "King Madrid",
            fontSize = 25.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Serif
        )


        Image(
            painter = painterResource(id = R.drawable.real),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )

        Text(
            text = "Nama",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Elwins Pranata N",
            fontSize = 25.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Default
        )

        Text(
            text = "20220140022",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Image(
            painter = painterResource(id = R.drawable.alkatiri),
            contentDescription = null,
            modifier = Modifier.size(350.dp)
        )
    }
}


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicComposeeTheme {
        GreetingPreview()
    }
}

