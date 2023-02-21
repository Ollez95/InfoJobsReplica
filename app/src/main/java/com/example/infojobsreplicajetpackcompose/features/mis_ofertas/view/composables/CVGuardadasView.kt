package com.example.infojobsreplicajetpackcompose.features.mis_ofertas.view.composables

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.infojobsreplicajetpackcompose.R
import com.example.infojobsreplicajetpackcompose.features.mis_ofertas.model.CVNoGuardadosCompact
import com.example.infojobsreplicajetpackcompose.features.mis_ofertas.model.CVNoGuardadosExpanded
import com.example.infojobsreplicajetpackcompose.features.mis_ofertas.model.CVNoGuardadosMedium
import com.example.infojobsreplicajetpackcompose.utils.WindowInfo
import com.example.infojobsreplicajetpackcompose.utils.getWindowSizes
import com.example.infojobsreplicajetpackcompose.utils.rememberWindowInfo


@Composable
fun CVGuardadasView() {

}



@Composable
fun NoGuardadasView(
    windowInfo: WindowInfo,
    image: Int) {

    val sealedClassHeight = getWindowSizes(
        Compact = CVNoGuardadosCompact(),
        Medium = CVNoGuardadosMedium(),
        Expanded = CVNoGuardadosExpanded(),
        windowInfo = windowInfo.screenHeightInfo
    )

    val sealedClassWidth = getWindowSizes(
        Compact = CVNoGuardadosCompact(),
        Medium = CVNoGuardadosMedium(),
        Expanded = CVNoGuardadosExpanded(),
        windowInfo = windowInfo.screenWidthInfo
    )


    Log.d("windowtest", windowInfo.toString())
    Log.d("sealedClassWidth", sealedClassWidth.toString())
    Log.d("sealedClassHeight", sealedClassHeight.toString())


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = "image",
            modifier = Modifier
                .size(sealedClassWidth.imageSize)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "No tiene ofertas guardadas",
            fontSize = sealedClassWidth.firstText,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Aafssfaasf fsa fasfasfsafsasfasafasf",
            fontSize = sealedClassWidth.secondText,
            fontWeight = FontWeight.Light
        )
    }
}

@Preview(name = "Small Size", device = Devices.PIXEL_3)
@Preview(name = "Medium Size", device = Devices.NEXUS_6)
@Preview(name = "Large Size", device = Devices.NEXUS_10)
@Preview(name = "Tablet", device = Devices.TABLET)
@Composable
fun NoGuardadasViewPreview() {

    val window = rememberWindowInfo()

    NoGuardadasView(
        windowInfo = window,
        image = R.drawable.management_solutions)
}