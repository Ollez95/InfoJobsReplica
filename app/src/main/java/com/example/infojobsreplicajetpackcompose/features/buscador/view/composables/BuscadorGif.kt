package com.example.infojobsreplicajetpackcompose.features.buscador.view.composables

import android.os.Build.VERSION.SDK_INT
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.R

@Composable
fun BuscadorGif() {

    val context = LocalContext.current

    val imageLoader = ImageLoader.Builder(context)
        .components {
            if (SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()

    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(context)
            .data(data = R.drawable.sunflower)
            .size(Size.ORIGINAL) // Set the target size to load the image at.
            .build(),
            imageLoader = imageLoader)


   Image(
       painter = painter,
       contentDescription = "Gif Image"
   )

}

@Preview
@Composable
fun BuscadorGifPreview() {
    BuscadorGif()
}