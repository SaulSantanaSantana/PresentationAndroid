package com.example.mitarjetadepresentacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mitarjetadepresentacin.ui.theme.MiTarjetaDePresentaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiTarjetaDePresentaciónTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PresentationCard("Android", "+00 123 456 789","example@example.com")
                }
            }
        }
    }
}

@Composable
fun PresentationCard(name: String,phone: String,mail: String, modifier: Modifier = Modifier) {
    Surface(color = Color(0xaa96ba4a9)){
        Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = modifier){
            Presentation(name)
            ContactInfo(phone,mail)
        }
    }
}

@Composable
fun Presentation(name: String, modifier: Modifier = Modifier){
    Column( horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(top = 50.dp)) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.size(180.dp)
        )
        Text(
            text = name,
            fontSize = 30.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Android Developer",
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ContactInfo(phone: String, mail:String, modifier: Modifier = Modifier){
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 300.dp)){
        Row {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier.size(20.dp)
            )
            Text(
                text = phone,
                fontSize = 20.sp,
                lineHeight = 30.sp,
                textAlign = TextAlign.Center
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier.size(20.dp)
            )
            Text(
                text = mail,
                fontSize = 20.sp,
                lineHeight = 30.sp,textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiTarjetaDePresentaciónTheme {
        PresentationCard("Saúl Santana Santana","+34674010118","@saulsantanas")
    }
}