package com.hayde117.artspacecompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hayde117.artspacecompose.ui.theme.ArtSpaceComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceComposeTheme {
        ArtSpaceScreen()
    }
}

@Composable
fun ArtSpaceScreen(modifier: Modifier = Modifier) {

//    val listOfArt = mutableStateListOf<ArtSpace>(
//        ArtSpace(R.drawable.aaa, "Pop Smoke", "Bashar (2021)"),
//        ArtSpace(R.drawable.aaa, "Lexy", "Lexy (201)"),
//        ArtSpace(R.drawable.aaa, "Lexy 2", "Lexy (202)"),
//        ArtSpace(R.drawable.aaa, "Lexy 3", "Lexy (204)"),
//        ArtSpace(R.drawable.aaa, "Lexy 4", "Lexy (203)")
//    )

    val context = LocalContext.current


    var current_artwork by remember {
        mutableStateOf(R.drawable.aaa)
    }

//    val mutableArtList =
//        mutableStateListOf<ArtSpace>()


    var artImage by remember {
        mutableStateOf(R.drawable.aaa)
    }

    var artTitle by remember {
        mutableStateOf("Ordinary")
    }

    var artist by remember {
        mutableStateOf("Pop Smoke")
    }

    var artYear by remember {
        mutableStateOf(2000)
    }

    Column(
        modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        Image(
            modifier = modifier
                .weight(0.75f),
            painter = painterResource(id = artImage),
            contentDescription = null
        )

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()

        ) {
            Text(
                text = artTitle,
                fontFamily = FontFamily.SansSerif,

                fontSize = 36.sp, modifier = modifier

            )
        }

        Spacer(modifier = modifier.height(12.dp))


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif,
                text = artist, modifier = modifier

            )

            Spacer(modifier = modifier.width(12.dp))


            Text(
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif,
                text = artYear.toString(), modifier = modifier

            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(70.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {
                    when (current_artwork) {
                    R.drawable.aaa -> {
                        Toast.makeText(context, "No More Previous Images", Toast.LENGTH_SHORT).show()
                    }
                        R.drawable.bbb -> {
                            artImage = R.drawable.aaa
                            artist = "Pop Smoke"
                            artTitle = "Ordinary"
                            artYear = 2000

                            current_artwork = artImage

                        }

                        R.drawable.ccc -> {
                            artImage = R.drawable.bbb
                            artist = "Imagine Dragons"
                            artTitle = "Birds"
                            artYear = 2001

                            current_artwork = artImage

                        }

                        R.drawable.ddd -> {
                            artImage = R.drawable.ccc
                            artist = "Riri"
                            artTitle = "Man Down"
                            artYear = 2002

                            current_artwork = artImage

                        }
                    }
                }

            ) {

                Text(text = "Previous")
            }


            Button(
                onClick = {

                    when (current_artwork) {
                        R.drawable.ddd -> {
                            Toast.makeText(context, "No More Previous Images", Toast.LENGTH_SHORT).show()
                        }
                        R.drawable.ccc -> {
                            artImage = R.drawable.ddd
                            artist = "Sia"
                            artTitle = "Confetti"
                            artYear = 2003

                            current_artwork = artImage

                        }

                        R.drawable.aaa -> {
                            artImage = R.drawable.bbb
                            artist = "Imagine Dragons"
                            artTitle = "Birds"
                            artYear = 2001

                            current_artwork = artImage
                        }

                        R.drawable.bbb -> {
                            artImage = R.drawable.ccc
                            artist = "Riri"
                            artTitle = "Man Down"
                            artYear = 2002

                            current_artwork = artImage
                        }
                    }


                }
            ) {
                Text(text = "Next")
            }

        }
    }
}

@Composable
fun ArtDescription(modifier: Modifier, artTitle: String, artist: String, artYear: Int) {

}


@Composable
fun ButtonControls(modifier: Modifier) {

}


