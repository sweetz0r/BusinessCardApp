package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardApp()
                }
            }
        }
    }
}

@Composable
fun CardApp() {
    CardTitle(
        name = "sweetz0r",
        title = "android developer",
        imagePainter = painterResource(R.drawable.android_logo)
    )
    CardDescription(
        phonenumb = "+7(999)-999-99-99",
        socMedia = "@Sucker",
        emailId = "Sucker@gmail.com")
}

@Composable
fun CardTitle(name: String, title: String, imagePainter: Painter, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = colorResource(R.color.lowgreen))
            .fillMaxSize()

    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier
                .background(color = colorResource(R.color.blueandroid))
                .height(100.dp)
                .width(100.dp)
        )
        Text(
            text = name,
            fontSize = 46.sp,

        )
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.androidgreen)


        )
    }
}
@Composable
fun CardDescription(phonenumb: String, socMedia: String, emailId: String,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Text(
                text = phonenumb,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(bottom = 12.dp)

            )
            Text(
                text = socMedia,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(bottom = 12.dp)

            )
            Text(
                text = emailId,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(bottom = 45.dp)
            )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        CardApp()
    }
}