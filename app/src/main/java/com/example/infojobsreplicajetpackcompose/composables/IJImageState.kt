package com.example.infojobsreplicajetpackcompose.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.example.infojobsreplicajetpackcompose.R

@Composable
fun IJImageState(
    pathImageUrl: Any,
    size: Dp
) {

    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data(pathImageUrl)
            .size(Size.ORIGINAL) // Set the target size to load the image at.
            .build())

    val painterState = painter.state

    if (painterState is AsyncImagePainter.State.Loading) {
        Row{
            CircularProgressIndicator(
                strokeWidth=6.dp,
                color = MaterialTheme.colors.primary)
        }
    }
    else{
        IJImageItem(
            painter = painter,
            size = size
        )
    }
}

@Composable
fun IJImageItem(modifier: Modifier = Modifier,
                painter: AsyncImagePainter,
                size: Dp = 40.dp
) {
    Image(
        painter = painter,
        contentDescription = "Stadium Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(size)
            .clip(RoundedCornerShape(8.dp))
            .then(modifier)
    )
}

@Preview
@Composable
fun BuscadorImageStatePreview() {
    IJImageState(
        pathImageUrl = R.drawable.management_solutions,
        size = 90.dp
    )
}