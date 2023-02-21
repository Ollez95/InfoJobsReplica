package com.example.infojobsreplicajetpackcompose.features.mis_ofertas.view.composables

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.twotone.Bookmark
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.R
import com.example.infojobsreplicajetpackcompose.composables.IJIconSavable
import com.example.infojobsreplicajetpackcompose.composables.IJImageState
import com.example.infojobsreplicajetpackcompose.composables.IJItemNoImage
import com.example.infojobsreplicajetpackcompose.features.buscador.model.BuscadorModel
import com.example.infojobsreplicajetpackcompose.features.buscador.view.composables.BuscadorItem

@Composable
fun CVItem(
    buscadorModel: BuscadorModel
) {

    val active = rememberSaveable { mutableStateOf(false) }

    Column{
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {

            Spacer(modifier = Modifier.width(8.dp))
            IJImageState(
                pathImageUrl = buscadorModel.image,
                size = 60.dp
            )
            IJItemNoImage(buscadorModel)
            CVIcon(
                process = buscadorModel.inProcess,
                active = active
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
        Divider(color = Color.Black, thickness = 1.dp)
    }
}


@Composable
fun CVIcon(
    process: Boolean,
    active: MutableState<Boolean>,
    size: Dp = 45.dp
) {

    if(process){
        IJIconSettings(size = size)
    }else{
        IJIconSavable(
            active = active,
            size = size)
    }


}

@Composable
fun IJIconSettings(
    size: Dp = 45.dp
) {

    Icon(imageVector =
    Icons.Default.MoreVert,
        contentDescription = "Settings button",
        modifier = Modifier
            .size(size)
            .clickable {
            })
}

@Preview
@Composable
fun IJIconSettingsPreview() {
    IJIconSettings()
}

@Preview
@Composable
fun CVIconPreview() {

    val active = rememberSaveable { mutableStateOf(false) }

    CVIcon(
        process = true,
        active = active
    )
}

@Preview(name = "Small Size", )
@Composable
fun CVItemPreview() {

    CVItem(buscadorModel = BuscadorModel(
        index = 0,
        image = R.drawable.management_solutions,
        position = "afsasfafsasfafsfas",
        company = "afssfaasfsfa",
        date = "fassfa",
        city = "asffassfa",
        typeWork = "fassfa",
        salary = "sfafsa",
        typeOfProcess = "fasfaafsfas",
        inProcess = true))
}