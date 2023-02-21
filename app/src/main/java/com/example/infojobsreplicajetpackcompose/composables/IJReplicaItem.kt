package com.example.infojobsreplicajetpackcompose.composables

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.LockClock
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.twotone.Bookmark
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.infojobsreplicajetpackcompose.features.buscador.model.BuscadorModel
import com.example.infojobsreplicajetpackcompose.ui.theme.Typography

@Composable
fun IJItemNoImage(buscadorModel: BuscadorModel) {

    Column(
        Modifier.padding(4.dp)
    ) {

        Text(text = buscadorModel.typeOfProcess, fontSize = Typography.body2.fontSize)
        Text(text = buscadorModel.position, fontWeight = FontWeight.Bold, fontSize = Typography.body1.fontSize)

        Row{
            IJIcon(icon = Icons.Default.LockClock)
            Text(text = buscadorModel.company, fontSize = 12.sp)
            Spacer(modifier = Modifier.width(4.dp))
            IJIcon(icon = Icons.Default.LockClock)
            Text(text = buscadorModel.date, fontSize = 12.sp)
        }

        Row {
            IJIcon(icon = Icons.Default.LockClock)
            Text(text = buscadorModel.typeWork, fontSize = 12.sp)
        }
        Row {
            IJIcon(icon = Icons.Default.LockClock)
            Text(text = buscadorModel.salary, fontSize = 12.sp)
        }

    }

}

@Composable
fun IJIconSavable(
    active: MutableState<Boolean>,
    size: Dp = 45.dp
) {

    Icon(imageVector =
    if(!active.value) Icons.TwoTone.Bookmark
    else Icons.Filled.Bookmark,
        contentDescription = "Clock Icon",
        modifier = Modifier
            .size(size)
            .clickable {
                active.value = !active.value
                Log.d("clicked", active.value.toString())
            })
}


@Composable
fun IJIcon(
    icon: ImageVector,
    size: Dp = 15.dp,
    contentDescription: String = "Icon"
) {
    Icon(imageVector = icon,
        contentDescription = contentDescription,
        modifier = Modifier.size(size))
}


@Preview
@Composable
fun IJIconPreview() {
    IJIcon(
        icon = Icons.Default.LockClock,
        size = 15.dp
    )
}

@Preview
@Composable
fun IJIcon2Preview() {
    Row{
        IJIcon(
            icon = Icons.Outlined.Bookmark,
            contentDescription = "Outlined Bookmark"
        )

        IJIcon(
            icon = Icons.Filled.Bookmark,
            size = 15.dp,
            contentDescription = "Filled Bookmark"
        )
    }

}

@Preview
@Composable
fun IJIconSavablePreview() {
    val active = rememberSaveable { mutableStateOf(false) }

    IJIconSavable(
        active = active
    )

}

@Preview
@Composable
fun IJItemNoImagePreview() {
    IJItemNoImage(
        buscadorModel = BuscadorModel(
            index = 0,
            image = "",
            position = "afsasfafsasfafsfas",
            company = "afssfaasfsfa",
            date = "fassfa",
            city = "asffassfa",
            typeWork = "fassfa",
            salary = "sfafsa",
            typeOfProcess = "fasfaafsfas"
        )
    )
}